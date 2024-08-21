package com.harolrodriguez.JovenesSGF.Service;

import java.util.List;

import com.harolrodriguez.JovenesSGF.Bean.Joven;

public interface IJovenService {
    public List<Joven> listarJovenes();
    public Joven guardarJoven(Joven joven);
}
