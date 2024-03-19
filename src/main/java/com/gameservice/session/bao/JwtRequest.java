package com.gameservice.session.bao;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequest
{
    private String email;
    private String password;
}
