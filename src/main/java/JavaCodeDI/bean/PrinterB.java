package JavaCodeDI.bean;

public class PrinterB implements Printer{

    @Override
    public void Print() {
        System.out.print("Printer B : ");
    }
}
