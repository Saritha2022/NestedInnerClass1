package DemoPack;

    abstract class Person{
        abstract void looks();
    }
    class DemoAnonymousInner{
        public static void main(String args[]){
            Person p=new Person(){
                void looks(){System.out.println("tall to look");}
            };
            p.looks();
        }
    }
