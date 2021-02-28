package my.exercise;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

//@Service
public class Score {
    @PostConstruct
    public void init(){
        System.out.println("score 111111");
    }
    public void s(){
        System.out.println("ssssss");
    }
}
