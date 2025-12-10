package com.virgilebodin.beta_lecteur.authentication;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegistrationRequest {


    @NotEmpty(message = "Un prénom est nécessaire")
    @NotBlank(message = "Un prénom est nécessaire")
    private String firstName;
    @NotEmpty(message = "Un nom est nécessaire")
    @NotBlank(message = "Un nom est nécessaire")
    private String lastName;
    @Email(message = "L'email est mal formatté")
    @NotEmpty(message = "Un email est nécessaire")
    @NotBlank(message = "Un email est nécessaire")
    private String email;
    @Size(min = 10, message = "Le mot de passe doit être de 10 caractère minimum")
    @NotEmpty(message = "Un mot de passe est nécessaire")
    @NotBlank(message = "Un mot de passe est nécessaire")
    private String password;

}
