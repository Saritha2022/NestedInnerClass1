package DemoPack;

public class DemoStaticInner {
     static int i=100;
    static String st="Static Demo";
    static class inner{
        void display(){
            System.out.println("Number :"+i);
            System.out.println("String Declared  :"+st);
        }
    }

    public static void main(String[] args) {
        DemoStaticInner.inner dsi=new DemoStaticInner.inner();
        dsi.display();
    }

}
