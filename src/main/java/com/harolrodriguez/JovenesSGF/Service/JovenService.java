package com.harolrodriguez.JovenesSGF.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harolrodriguez.JovenesSGF.Bean.Joven;
import com.harolrodriguez.JovenesSGF.Repository.JovenRepository;

@Service

public class JovenService implements IJovenService{

    @Autowired

    private JovenRepository jovenRepository;

    @Override
    public List<Joven> listarJovenes() {
       return jovenRepository.findAll();
    }

    @Override
    public Joven guardarJoven(Joven joven) {
       return jovenRepository.save(joven);
    }

}
