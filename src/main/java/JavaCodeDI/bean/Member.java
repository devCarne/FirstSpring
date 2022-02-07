package JavaCodeDI.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {

    String name;
    String nickname;
    Printer printer;

    public void print() {
        printer.Print();
        System.out.println("Hello " + name + " : " + nickname);
    }
}
