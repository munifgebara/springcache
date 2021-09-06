/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 *
 * @author munif
 */
@Service
public class OlaService {
    
    @Cacheable(value = "aaa",key = "#nome")
    public String negociao(String nome){
        System.out.println("OLA !!!!!"+nome);
        return "ola "+nome;
    }
    
}
