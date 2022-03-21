package DemoPack;

public class DemoNestedInnerClass {
    private int data=30;
    private String s="Nested class Variable";
    class Inner{
        void msg(){System.out.println("data : "+data);
            System.out.println("String:   "+s);}
    }
    public static void main(String args[]){
        DemoNestedInnerClass obj=new DemoNestedInnerClass();
        DemoNestedInnerClass.Inner in=obj.new Inner();
        in.msg();
    }
}
