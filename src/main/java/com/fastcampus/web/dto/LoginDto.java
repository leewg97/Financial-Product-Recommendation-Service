package com.fastcampus.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class LoginDto {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class loginRequest
    {
        private String email;
        private String password;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Response {
        private String email;
        private String Authorization;
    }

}
