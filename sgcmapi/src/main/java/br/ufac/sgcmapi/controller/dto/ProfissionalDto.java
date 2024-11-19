package br.ufac.sgcmapi.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProfissionalDto(
    Long id,
    @NotBlank
    String nome,
    @NotBlank
    @Email(message = "deve estar no formato usuario@dominio.com",
    regexp= "^(.+)@(sou\\.)?ufac\\.br$")
    String email,
    @NotBlank
    String registroConselho,
    @NotBlank
    String telefone,
    @NotNull
    Long especialidade_id,
    String especialidade_nome,
    @NotNull
    Long unidade_id,
    String unidade_nome
) {
    
}
