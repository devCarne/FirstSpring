package JavaCodeDI;

import JavaCodeDI.bean.Config;
import JavaCodeDI.bean.Member;
import JavaCodeDI.bean.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCodeDiApplication {

    public static void main(String[] args) {
//        SpringApplication.run(JavaCodeDiApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Member member1 = (Member) context.getBean("member1");
        member1.print();

        Member member2 = context.getBean("hello", Member.class);
        member2.print();

        Printer printer = context.getBean("printerB", Printer.class);
        member1.setPrinter(printer);
        member1.print();
    }
}
