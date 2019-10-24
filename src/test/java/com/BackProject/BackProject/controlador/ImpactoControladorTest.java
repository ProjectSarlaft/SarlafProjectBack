package com.BackProject.BackProject.controlador;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;
import com.BackProject.BackProject.servicios.ServiceImpacto;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



public class ImpactoControladorTest {

    private MockMvc mockMvc;

    private ImpactoControlador  impactoControlador;

    @Mock
    private ServiceImpacto serviceImpactoMock;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        impactoControlador = new ImpactoControlador(serviceImpactoMock);
        mockMvc = MockMvcBuilders.standaloneSetup(impactoControlador).build();

    }

    @Test
    public void guardarImpactoControladorTest() throws Exception {
        //given
        ImpactoDTO impactoDTO = crearImpactoDto();
        String jsonBody = crearImpactoDtoRequest();

        when(serviceImpactoMock.guardarImpacto(any(ImpactoDTO.class))).thenReturn(impactoDTO);

        //when then
        mockMvc.perform(post("/impacto")
                .content(jsonBody)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.escala", is(impactoDTO.getEscala())))
                .andExpect(jsonPath("$.nivel", is(impactoDTO.getNivel())))
                .andExpect(jsonPath("$.afectacionEconomica", is(impactoDTO.getAfectacionEconomica())));

        verify(serviceImpactoMock, times(1)).guardarImpacto(any(ImpactoDTO.class));
    }

    @Test
    public void obtenerImpactoControladorTest() throws Exception {
        //given
        List<ImpactoDTO> impactos = Arrays.asList(crearImpactoDto(), crearImpactoDto());
        when(serviceImpactoMock.retornarImpactos()).thenReturn(impactos);

        //when then
        mockMvc.perform(get("/impacto")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(impactos.size())));

        verify(serviceImpactoMock, times(1)).retornarImpactos();
    }

    @Test
    public void borrarImpactoTest() throws Exception {
        //given
        doNothing().when(serviceImpactoMock).borrarImpacto(any(Long.class));

        //when then
        mockMvc.perform(delete("/impacto/{id}", 1l))
                .andExpect(status().isOk());

        verify(serviceImpactoMock, times(1)).borrarImpacto(any(Long.class));

    }

    @Test
    public void actualizarImpactoTest() throws Exception {
        //given
        ImpactoDTO impactoDTO = crearImpactoDto();
        String jsonBody = crearImpactoDtoRequest();

        when(serviceImpactoMock.actualizarImpacto(any(ImpactoDTO.class))).thenReturn(impactoDTO);

        //when then
        mockMvc.perform(put("/impacto")
                .content(jsonBody)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.escala", is(impactoDTO.getEscala())))
                .andExpect(jsonPath("$.nivel", is(impactoDTO.getNivel())))
                .andExpect(jsonPath("$.afectacionEconomica", is(impactoDTO.getAfectacionEconomica())));

        verify(serviceImpactoMock, times(1)).actualizarImpacto(any(ImpactoDTO.class));
    }

    private String crearImpactoDtoRequest() {
        return "{ \"id\" : \"\", \n" +
                "    \"escala\": \"escala_ejemplo\",\n" +
                "    \"nivel\": \"1\",\n" +
                "    \"afectacionEconomica\": \"afectacion_ejemplo\",\n" +
                "    \"riesgoLegal\": null,\n" +
                "    \"riesgoOperativo\": null,\n" +
                "    \"riesgoReputacional\": null,\n" +
                "    \"riesgoContagio\": null\n" +
                "}";
    }

    private ImpactoDTO crearImpactoDto() {
        ImpactoDTO impactoDTO = new ImpactoDTO();
        impactoDTO.setId(1l);
        impactoDTO.setAfectacionEconomica("AFECTACION_TEST");
        impactoDTO.setNivel("NIVEL_TEST");
        impactoDTO.setEscala("ESCALA_TEST");
        return impactoDTO;
    }
}