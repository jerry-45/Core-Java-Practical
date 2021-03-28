abstract class Prog4{
    abstract int sqr(int n1);
    abstract int cube(int n1);
    void show(){
        System.out.println("Hello");
    }
}

class Program4C extends Prog4{
    int sqr(int n1){
        return n1*n1;
    }
    int cube(int n1){
        return n1*n1*n1;
    }
    public static void main(String args[]){
        Program4C p1=new Program4C();
        System.out.println(p1.sqr(333));
        System.out.println(p1.cube(444));
        p1.show();
    }
}