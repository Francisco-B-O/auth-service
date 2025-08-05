package com.fbo.erp.auth.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The type Jwt response.
 */
@Data
@AllArgsConstructor
public class JwtResponse {
    /**
     * The Token.
     */
    private String token;
}
