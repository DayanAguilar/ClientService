package com.example.ClientService;

import org.springframework.stereotype.Service;

@Service
public class ClientService {
    public UserResponseDto createUser(User user) {
        return new UserResponseDto("Usuario creado con éxito", user);
    }
}
