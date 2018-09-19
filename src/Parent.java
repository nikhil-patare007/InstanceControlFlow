public class Parent {
    int x=10;{
        m1();
        System.out.println("Parent");
    }
    Parent(){
        System.out.println("Parent Construction");
    }

    public static void main(String[] args) {
        Parent p=new Parent();
        System.out.println("Parent Main");
    }

public void m1(){
    System.out.println(y);
    }
    int y=20;
}
   class Child extends Parent{
    int i=100;
       {
           m2();
           System.out.println("CIIB");
       }
    Child(){
        System.out.println("Child Constructor");
    }

       public static void main(String[] args) {
           Child c = new Child();
           System.out.println("Child main");
       }
       public void   m2() {


           System.out.println(j);
       }
       {
           System.out.println("Csiib");
       }
        int j=200;
}