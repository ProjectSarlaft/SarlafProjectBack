package com.BackProject.BackProject.servicios;

import com.BackProject.BackProject.dominio.dto.ImpactoDTO;
import com.BackProject.BackProject.dominio.entidades.Impacto;
import com.BackProject.BackProject.dominio.mapper.ImpactoMapper;
import com.BackProject.BackProject.exceptions.InsercionImpactoException;
import com.BackProject.BackProject.repositorios.ImpactoRepositorio;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ServiceImpactoImplTest {

    private ServiceImpacto serviceImpacto;

    @Mock
    private ImpactoRepositorio impactoRepositorio;
    private ImpactoMapper impactoMapper;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        impactoMapper = new ImpactoMapper();
        serviceImpacto = new ServiceImpactoImpl(impactoRepositorio, impactoMapper);
    }

    @Test
    public void guardarImpactoServiceTest() {
        //given
        ImpactoDTO impactoDTO = crearImpactoDto();
        when(impactoRepositorio.save(any(Impacto.class)))
                .thenReturn(impactoMapper.impactoDTOToEntity(impactoDTO));

        //When
        ImpactoDTO impactoDTOGuardado = serviceImpacto.guardarImpacto(impactoDTO);

        //then
        verify(impactoRepositorio, times(1)).save(any(Impacto.class));
        assertEquals(impactoDTO.getId(), impactoDTOGuardado.getId());
        assertEquals(impactoDTO.getEscala(), impactoDTOGuardado.getEscala());
        assertEquals(impactoDTO.getNivel(), impactoDTOGuardado.getNivel());
        assertEquals(impactoDTO.getAfectacionEconomica(), impactoDTOGuardado.getAfectacionEconomica());
    }

    @Test(expected = InsercionImpactoException.class)
    public void InsercionImpactoException() {
        List<Impacto> impactos = crearImpactos();
        ImpactoDTO impactoDTO = crearImpactoDto();
        when(impactoRepositorio.findAll()).thenReturn(impactos);

        //When
        serviceImpacto.guardarImpacto(impactoDTO);
    }

    @Test
    public void obtenerImpactosTest() {
        //given
        List<Impacto> impactos = crearImpactos();
        when(impactoRepositorio.findAll()).thenReturn(impactos);


        //when
        List<ImpactoDTO> impactoRetornados = serviceImpacto.retornarImpactos();

        //then
        verify(impactoRepositorio, times(1)).findAll();
        assertEquals(impactos.size(), impactoRetornados.size());

    }

    private List<Impacto> crearImpactos() {
        Impacto impactoConMismaEscala = impactoMapper.impactoDTOToEntity(crearImpactoDto());
        impactoConMismaEscala.setId(2l);
        Impacto impactoConMismaEscalaYID = impactoMapper.impactoDTOToEntity(crearImpactoDto());
        return Arrays.asList(impactoConMismaEscala, impactoConMismaEscalaYID);
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