package org.spring;

import org.spring.StandAloneCollections.Temp;
import org.spring.SterioType.Student;
import org.spring.SterioType.Teacher;
import org.spring.entities.Addition;
import org.spring.entities.Employes;
//import org.spring.entities.Person;
import org.spring.Anotation.Person;
import org.spring.lifeCycle.Mithai;
import org.spring.lifeCycle.Pepsi;
import org.spring.lifeCycle.samosa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main( String[] args ) {
//        System.out.println( "Hello World!" );
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Student student1 = (Student) context.getBean("student1");
//        Student student2 = (Student) context.getBean("student2");
//        Student student3 = (Student) context.getBean("student3");
//        System.out.println(student3);
//        System.out.println(student2);
//        System.out.println(student1);
//        ApplicationContext context1 = new ClassPathXmlApplicationContext("collectionConfig.xml");
//        Employes employes = (Employes) context1.getBean("employee1");
//        System.out.println(employes.getName());
//        System.out.println(employes.getAddress());
//        System.out.println(employes.getPhones());
//        System.out.println(employes.getRoll_No());
//        ApplicationContext context2 = new ClassPathXmlApplicationContext("ciConfig.xml");
//        Person hh = (Person) context2.getBean("person");
//        System.out.println(hh.toString());
//        Addition sum = (Addition) context2.getBean("addition");
//        sum.doSum();

//        Bean Declaration in init,destroy
//        AbstractApplicationContext samos = new ClassPathXmlApplicationContext("scon.xml");
//        samosa s = (samosa) samos.getBean("samosa");
//        System.out.println(s.getPrice());
//        samos.registerShutdownHook();
//
//        System.out.println("========================");

//        Bean Declaration in InitializingBean, DisposableBean
        AbstractApplicationContext pep = new ClassPathXmlApplicationContext("pcon.xml");
//        Pepsi p = (Pepsi) pep.getBean("Pepsi");
//        System.out.println(p.toString());

        Mithai m = (Mithai) pep.getBean("mithai");
        System.out.println(m.toString());
        m.destroy();
//        pep.registerShutdownHook();
//        ApplicationContext person = new ClassPathXmlApplicationContext("autoCon.xml");
//        Person a = person.getBean("person",Person.class);
//        System.out.println(a);
        ApplicationContext person = new ClassPathXmlApplicationContext("anotCon.xml");
        Person a = person.getBean("person",Person.class);
        System.out.println(a);
        ApplicationContext te = new ClassPathXmlApplicationContext("ppl.xml");
        Student s = te.getBean("OB",Student.class);
        System.out.println(s);
        Teacher t = te.getBean("teacher", Teacher.class);
        Teacher teacher = (Teacher) te.getBean("teacher");
        Teacher t2 = (Teacher) te.getBean("teacher");
        System.out.println(t.hashCode());
        System.out.println(t2.hashCode());
    }
}
