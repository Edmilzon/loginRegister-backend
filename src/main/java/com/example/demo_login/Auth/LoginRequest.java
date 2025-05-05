package com.example.demo_login.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//metodos geter y seter de forma automatica
@Builder//constructor de la clase
@AllArgsConstructor//constructor con todos los atributos
@NoArgsConstructor//constructor sin atributos
public class LoginRequest {
    String username;
    String password;
}
