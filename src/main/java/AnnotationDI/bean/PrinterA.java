package AnnotationDI.bean;

import org.springframework.stereotype.Component;

@Component("printerA")
public class PrinterA implements Printer {

    @Override
    public void Print() {
        System.out.print("Printer A : ");
    }
}
