import javax.swing.plaf.synth.SynthOptionPaneUI;

/* Write a Java program to create a class called "Rectangle" with width and height attributes.
Calculate the area and perimeter of the rectangle. */
public class rectangle {
    double h;
    double w;
    public rectangle(double h,double w){
        this.h=h;
        this.w=w;
    }
    public double geth(double h){
        return h;
    }
    public void seth(double h){
        this.h=h;  }
    public double getW(double w){
        return w;}
    public void setw(double w){
        this.w=w;
    }public double getarea(){
        return h*w;
    }public double getperimeter(){
        return 2+(h+w);
    }

    public static void main(String[] args) {
        rectangle R1=new rectangle(7,4);
        System.out.println("area = "+R1.getarea());
        System.out.println("perimeter "+R1.getperimeter());
        R1.seth(46);
        R1.setw(43);
        System.out.println("area = "+R1.getarea());
        System.out.println("perimeter "+R1.getperimeter());

    }
}
