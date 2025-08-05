package com.fbo.erp.auth.payload;

import lombok.Data;

/**
 * The type Login request.
 */
@Data
public class LoginRequest {
    /**
     * The Username.
     */
    private String username;
    /**
     * The Password.
     */
    private String password;
}
