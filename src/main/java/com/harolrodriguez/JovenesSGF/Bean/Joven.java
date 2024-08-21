package com.harolrodriguez.JovenesSGF.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// Entity crea la base de datos
@Entity
//Data Get and Set
@Data
//Habilita el constructor vacio
@NoArgsConstructor
//Habilita el constructor vacio
@AllArgsConstructor
//Sobrecarga
@ToString

public class Joven {
    //La notacion @id define la primary key de la DB
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer IdJoven;
    String nombre;
    String apellido;
    String numeroTelefono;
    String edad;
    String descripcion;


    
}
