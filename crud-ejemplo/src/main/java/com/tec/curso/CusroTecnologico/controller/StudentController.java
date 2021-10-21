package com.tec.curso.CusroTecnologico.controller;

import com.tec.curso.CusroTecnologico.entity.Student;
import com.tec.curso.CusroTecnologico.model.Response;
import com.tec.curso.CusroTecnologico.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Response> save(@RequestBody Student student){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new Response(this.studentService.save(student),new Date()));
    }

    @PatchMapping
    public ResponseEntity<Response> update(@RequestBody Student student){
        return ResponseEntity.status(HttpStatus.OK)
                .body(new Response(this.studentService.update(student),new Date()));
    }

    @GetMapping
    public ResponseEntity<Response> get(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(new Response(this.studentService.get(), new Date()));
    }

    @DeleteMapping
    public ResponseEntity<Response> delete(@RequestParam("id") int id){
        studentService.delete(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(new Response(true, new Date()));
    }

}
//crud
// persistir POST -> localhost:8080/api/student

//POST -> require body
//DELETE - > id
//GET -> id o filtros
//PATCH o PUT -> require body
