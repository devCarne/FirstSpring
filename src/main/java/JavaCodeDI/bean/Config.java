package JavaCodeDI.bean;

import org.springframework.context.annotation.Bean;

public class Config {

//    Bean : Spring이 제어의 역전(IoC, Inverson of Control)방식으로 관리하는 객체
//    Bean Factory : 제어의 역전 담당 핵심 컨테이너
//    ApplicatoinContext :  빈 팩토리를 확장한 컨테이너
    @Bean
    public Member member1() {
        return new Member("홍길동", "도사", new PrinterA());
    }

    @Bean(name = "hello")
    public Member member2() {
        return new Member("전우치", "도사", new PrinterA());
    }

    @Bean
    public PrinterA printerA() {
        return new PrinterA();
    }

    @Bean
    public PrinterB printerB() {
        return new PrinterB();
    }
}
