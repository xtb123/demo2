package com.example.demo.controller;

import com.example.demo.mapper.StudentRepository;
import com.example.demo.pojo.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    private Logger logger=LoggerFactory.getLogger(StudentController.class);

    @Autowired
    StudentRepository studentRepository;

    @ResponseBody
    @RequestMapping("/")
    public String root(){
        Student student= new Student("姓名", 15);
        studentRepository.save(student);
        System.out.println(student.toString());
        return student.toString();
    }

    /**
     * 添加学生
     * @param name
     * @param old
     * @return
     */
    @ResponseBody
//    @RequestMapping("/add/{name}/{old}")
    @RequestMapping("add.action")
    public String add(@PathVariable String name,@PathVariable Integer old){
        logger.info("StudentController-add添加学生{姓名:"+name+"年龄:"+old+"}");
        Student student=new Student(name,old);
        studentRepository.save(student);
//        logger.info("StudentController-add添加学生{姓名:"+student.getName()+"年龄:"+student.getOld()+"}");
        logger.info("添加学生完成");
        return student.toString()+"已经被添加";
    }

    /**
     * 通过Id删除学生
     * @param id
     * @return
     */
    @ResponseBody
//    @RequestMapping("/delete/{id}")
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable Integer id){
        logger.info("StudentController-delete删除学生{ID:"+id+"}");
        Optional<Student> s = studentRepository.findById(id);
        studentRepository.deleteById(id);
        logger.info("删除学生完成");
        return s.get().toString() + "已经被删除";
    }

    /**
     * 通过Id更新学生的姓名
     * @param id
     * @param name
     * @return
     */
    @ResponseBody
    @RequestMapping("/update/{id}/{name}")
    public String update(@PathVariable Integer id, @PathVariable String name){
        /*获取以后，再重新赋值 其实有其他更好的办法*/
        logger.info("StudentController-update修改学生{ID:"+id+"姓名:"+name+"}");
        Student student = studentRepository.findById(id).get();
        student.setName(name);
        studentRepository.save(student);
        logger.info("修改学生完成");
        return student.toString();
    }

    /**
     * 通过Id查询学生信息
     * @param id
     * @return
     */
    @ResponseBody
//    @RequestMapping("/{id}")
    @RequestMapping("select")
    public String find(@PathVariable Integer id){
        logger.info("StudentController-find根据ID查询学生{ID:"+id+"}");
        Optional<Student> s = studentRepository.findById(id);
        logger.info("查询学生完成");
        return s.get().toString();
    }

    /**
     * 查询所有的学生信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/all")
    public List<Student> all(){
        logger.info("StudentController-all查询所有学生");
        List<Student> students=studentRepository.findAll();
        logger.info("查询所有学生完成");
        return students;
    }
}

