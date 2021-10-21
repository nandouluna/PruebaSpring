package com.tec.curso.CusroTecnologico.repository;

import com.tec.curso.CusroTecnologico.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
