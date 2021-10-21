package com.tec.curso.CusroTecnologico.dao;

import com.tec.curso.CusroTecnologico.entity.Student;
import com.tec.curso.CusroTecnologico.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {

    @Autowired
    private StudentRepository studentRepository;

    public Student save(Student student){
        return this.studentRepository.save(student);
    }

    public Student update(Student student){
        return this.studentRepository.save(student);
    }

    public List<Student> get(){ return this.studentRepository.findAll();}

    public void delete(int id){
        this.studentRepository.deleteById(id);
    }

}
