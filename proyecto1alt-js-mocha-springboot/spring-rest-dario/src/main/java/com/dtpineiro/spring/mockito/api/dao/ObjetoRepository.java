package com.dtpineiro.spring.mockito.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dtpineiro.spring.mockito.api.model.Objeto;

public interface ObjetoRepository extends JpaRepository<Objeto,Integer>{

}
