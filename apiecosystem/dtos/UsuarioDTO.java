package com.ecosystem.apiecosystem.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsuarioDTO(
        @NotBlank String nome,
        @NotBlank @Email (message = "O e-mail deve estar em um formato válido") String email,
        String genero,
        @NotBlank String cpf,
        @NotBlank String cnpj,
        @NotBlank String senha,
        String telefone
) {
}
