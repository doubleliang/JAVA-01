package my.exercise.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo01 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AutoAssemble1 assemble1 = context.getBean(AutoAssemble1.class);
        System.out.println(assemble1.getStudent().getName());

        AutoAssemble2 assemble2 = context.getBean(AutoAssemble2.class);
        System.out.println(assemble2.getStudent2().getName());
    }
}
