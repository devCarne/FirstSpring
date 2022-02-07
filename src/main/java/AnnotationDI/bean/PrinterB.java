package AnnotationDI.bean;

import org.springframework.stereotype.Component;

@Component("printerB")
public class PrinterB implements Printer {

    @Override
    public void Print() {
        System.out.print("Printer B : ");
    }
}
