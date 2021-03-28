class Program4B{
    Program4B(){
        System.out.println("Hello");
    }
    public static void main(String args[]){
        Program4B c1=new Program4B();
        c1=null;
        System.gc();
    }
    
    public void finalize(){
        System.out.println("Destroyed");
    }
}