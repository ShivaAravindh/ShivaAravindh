class Chain1{
    public static void add(int a , int b)
    {
        System.out.println("ADDITION STARTED");
        sub (100,50);
        System.out.println(a+b);
        System.out.println("ADDITION ENDED");
    }
    public static void sub (int a ,int b)
    {
        System.out.println("SUB STARTED");
        multi(10,2);
        System.out.println(a-b);
        System.out.println("SUB ENDED  ");
    }
    public static void multi(int a ,int b)
    {
        System.out.println("MULTI STARTED");
        div(10,5);
        System.out.println(a*b);
        System.out.println("MULTI ENDED");
    }
    public static void div(int a ,int b)
    {
        System.out.println("div started");
        System.out.println(a/b);
        System.out.println("DIV ENDED");
        
    }
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        add (10,20);
        System.out.println("MAIN ENDED");
    }
    }
