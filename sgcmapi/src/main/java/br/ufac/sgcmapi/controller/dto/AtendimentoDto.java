package br.ufac.sgcmapi.controller.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AtendimentoDto(
    Long id,
    @NotNull
    @FutureOrPresent
    LocalDate data,
    @NotBlank
    String hora,
    String status,
    @NotNull
    Long profissional_id,
    String profissional_nome,
    @NotNull
    Long paciente_id,
    String paciente_nome,
    Long convenio_id,
    String convenio_nome,
    String unidade_nome
) {
    
}
