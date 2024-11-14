package br.ufac.sgcmapi.controller.dto;

public record UsuarioDto(
    Long id,
    String nomeCompleto,
    String nomeUsuario,
    String papel,
    boolean ativo
) {
    
}
