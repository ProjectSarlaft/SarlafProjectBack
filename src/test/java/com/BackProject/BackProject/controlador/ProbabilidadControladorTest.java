package com.BackProject.BackProject.controlador;

import com.BackProject.BackProject.dominio.dto.ProbabilidadDTO;
import com.BackProject.BackProject.servicios.ServicioProbabilidad;
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
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class ProbabilidadControladorTest {

//    private MockMvc mockMvc;
//    private ProbabilidadControlador  probabilidadControlador;
//
//    @Mock
//    private ServicioProbabilidad serviceProbabilidadMock;
//
//    @Before
//    public void setUp() throws Exception {
//        MockitoAnnotations.initMocks(this);
//        probabilidadControlador = new ProbabilidadControlador(serviceProbabilidadMock);
//        mockMvc = MockMvcBuilders.standaloneSetup(probabilidadControlador).build();
//
//    }
//
//    @Test
//    public void guardarProbabilidadControladorTest() throws Exception {
//        //given
//        ProbabilidadDTO probabilidadDTO = crearProbabilidadDto();
//        String jsonBody = crearProbabilidadDtoRequest();
//
//        when(serviceProbabilidadMock.guardarProbabilidad(any(ProbabilidadDTO.class))).thenReturn(probabilidadDTO);
//
//        //when then
//        mockMvc.perform(post("/probabilidad")
//                .content(jsonBody)
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isCreated())
//                .andExpect(jsonPath("$.escala", is(probabilidadDTO.getEscala())))
//                .andExpect(jsonPath("$.nivel", is(probabilidadDTO.getNivel())))
//                .andExpect(jsonPath("$.posibilidadAnual", is(probabilidadDTO.getPosibilidadAnual())));
//
//        verify(serviceProbabilidadMock, times(1)).guardarProbabilidad(any(ProbabilidadDTO.class));
//    }
//
//    @Test
//    public void obtenerProbabilidadControladorTest() throws Exception {
//        //given
//        List<ProbabilidadDTO> probabilidad = Arrays.asList(crearProbabilidadDto(), crearProbabilidadDto());
//        when(serviceProbabilidadMock.retornarProbabilidades()).thenReturn(probabilidad);
//
//        //when then
//        mockMvc.perform(get("/probabilidad")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", hasSize(probabilidad.size())));
//
//        verify(serviceProbabilidadMock, times(1)).retornarProbabilidades();
//    }
//
//    @Test
//    public void borrarProbabilidadTest() throws Exception {
//        //given
//        doNothing().when(serviceProbabilidadMock).borrarProbabilidad(any(Long.class));
//
//        //when then
//        mockMvc.perform(delete("/probabilidad/{id}", 3l))
//                .andExpect(status().isOk());
//
//        verify(serviceProbabilidadMock, times(1)).borrarProbabilidad(any(Long.class));
//
//    }
//
//    @Test
//    public void actualizarProbabilidadTest() throws Exception {
//        //given
//        ProbabilidadDTO probabilidadDTO = crearProbabilidadDto();
//        String jsonBody = crearProbabilidadDtoRequest();
//
//        when(serviceProbabilidadMock.actualizarProbabilidad(any(ProbabilidadDTO.class))).thenReturn(probabilidadDTO);
//
//        //when then
//        mockMvc.perform(put("/probabilidad")
//                .content(jsonBody)
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.escala", is(probabilidadDTO.getEscala())))
//                .andExpect(jsonPath("$.nivel", is(probabilidadDTO.getNivel())))
//                .andExpect(jsonPath("$.posibilidadAnual", is(probabilidadDTO.getPosibilidadAnual())));
//
//        verify(serviceProbabilidadMock, times(1)).actualizarProbabilidad(any(ProbabilidadDTO.class));
//    }
//
//    private String crearProbabilidadDtoRequest() {
//        return "{ \"id\" : \"\", \n" +
//                "    \"escala\": \"escala\",\n" +
//                "    \"nivel\": \"1\",\n" +
//                "    \"posibilidadAnual\": \"posibilidad\",\n" +
//                "}";
//    }
//
//    private ProbabilidadDTO crearProbabilidadDto() {
//        ProbabilidadDTO probabilidadDto = new ProbabilidadDTO();
//        probabilidadDto.setId(3l);
//        probabilidadDto.setEscala("ESCALA_TEST");
//        probabilidadDto.setNivel("NIVEL_TEST");
//        probabilidadDto.setPosibilidadAnual("POSIBILIDAD_TEST");
//
//        return probabilidadDto;
//    }
}