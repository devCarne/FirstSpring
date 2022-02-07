package AnnotationDI.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Member {

    @Value("홍길동")
    String name;
    @Value("도사")
    String nickname;
    @Autowired
    @Qualifier("printerA")
    Printer printer;

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void print() {
        printer.Print();
        System.out.println("Hello " + name + " : " + nickname);
    }
}
