package ru.sfu.waffflezz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml"
    );

    Zoo zoo = context.getBean("zooBean", Zoo.class);
    zoo.getZooInfo();
  }
}
