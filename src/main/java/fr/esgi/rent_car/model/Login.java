package fr.esgi.rent_car.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Login {
    private final String email;
    private final String password;
}
