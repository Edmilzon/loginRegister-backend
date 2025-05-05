package com.example.demo_login.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //metodos geter y seter de forma automatica
@Builder //constructor de la clase
@NoArgsConstructor //constructor sin atributos
@AllArgsConstructor //constructor con todos los atributos
public class RegisterRequest {
    String username;
    String password;
    String firstname;
    String lastname;
    String country;
}
