package com.dtpineiro.spring.mockito.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dtpineiro.spring.mockito.api.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}
