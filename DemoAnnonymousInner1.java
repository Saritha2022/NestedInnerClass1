package DemoPack;
interface Eatable{
    void eat();
}
class DemoAnnonymousInner1{
    public static void main(String args[]){
        Eatable e=new Eatable(){
            public void eat(){System.out.println("Fruits are Healthy to eat");}
        };
        e.eat();
    }
}

