package org.spring.SpeL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("pl.xml");
        Demo d = (Demo) ap.getBean("demo");
        System.out.println(d.toString());

        SpelExpressionParser p = new SpelExpressionParser();
        Expression c = p.parseExpression("10+9");
        System.out.println(c.getValue());
    }
}
