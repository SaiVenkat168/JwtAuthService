package com.gameservice.session.bao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class UserRequest
{
    private String username;
    private String email;
    private String password;

}
