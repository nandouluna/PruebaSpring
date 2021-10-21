package com.tec.curso.CusroTecnologico.service;

import com.tec.curso.CusroTecnologico.dao.StudentDao;
import com.tec.curso.CusroTecnologico.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    public StudentDao studentDao;
    //otros daos
    //otros services

    public Student save(Student student){
        //Toda la logica denegocio
        return this.studentDao.save(student);
    }
    public Student update(Student student){
        //Toda la logica denegocio
        return this.studentDao.update(student);
    }

    public List<Student> get(){
        //Toda la logica denegocio
        return this.studentDao.get();
    }

    public void delete(int id){
        //Toda la logica denegocio
        this.studentDao.delete(id);
    }

}
