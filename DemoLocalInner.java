package DemoPack;

public class DemoLocalInner {
    private int data=10;//instance variable
    private String str="My Name ";
    void display(){
        class Local{
            void msg(){
                System.out.println(data);
                System.out.println("loacl String  :"+str);
            }
        }
        Local l=new Local();
        l.msg();
    }
    public static void main(String args[]){
        DemoLocalInner obj=new DemoLocalInner();
        obj.display();
    }
}
