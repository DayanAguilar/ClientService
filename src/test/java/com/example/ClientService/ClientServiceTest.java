package com.example.ClientService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientServiceTest {
    private ClientService clientService = new ClientService();

    @Test
    @DisplayName("It should create a User")
    void createUser() {
        User user = new User("Juan", "Pérez", "González", "12345678");
        UserResponseDto response = clientService.createUser(user);
        assertEquals("Usuario creado con éxito", response.getMessage());
        assertEquals("Juan", response.getUser().getFirstName());
    }
}