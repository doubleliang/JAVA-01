package my.exercise;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyStarter {
    @Bean("student100")
    public Student student() {
        return Student.create();
    }

    @Bean
    public Klass klass() {
        return new Klass();
    }

    @ConditionalOnBean(Klass.class)
    @Bean
    public School school(Klass klass, Student student100) {
        School school = new School();
        school.setClass1(klass);
        school.setStudent100(student100);
        return school;
    }
}
