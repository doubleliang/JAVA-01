package my.zll.mystarterserver;

import my.exercise.Score;
import my.exercise.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TestBean {
    @Autowired
    Student student;
//    @Autowired
//    Score score;

    @PostConstruct
    public void init(){
        System.out.println(student.getName()+"=========");
//        score.s();
    }
}
