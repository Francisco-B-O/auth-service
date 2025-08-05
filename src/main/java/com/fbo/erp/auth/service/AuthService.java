package com.fbo.erp.auth.service;

import com.fbo.erp.auth.payload.JwtResponse;
import com.fbo.erp.auth.payload.LoginRequest;
import com.fbo.erp.auth.security.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * The type Auth service.
 */
@Service
@RequiredArgsConstructor
public class AuthService {

    /**
     * The Authentication manager.
     */
    private final AuthenticationManager authenticationManager;
    /**
     * The Jwt utils.
     */
    private final JwtUtils jwtUtils;

    /**
     * Authenticate user jwt response.
     *
     * @param loginRequest the login request
     * @return the jwt response
     */
    public JwtResponse authenticateUser(LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
        );

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String jwt = jwtUtils.generateJwtToken(userDetails.getUsername());
        return new JwtResponse(jwt);
    }
}
