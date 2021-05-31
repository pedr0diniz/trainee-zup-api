package com.zup.trainee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zup.trainee.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{

}
