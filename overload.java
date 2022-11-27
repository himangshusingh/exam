class overload{


    static int add(int a, int b){
        System.out.println("The name of two cities are: "+a+b);
        return 0;
    }

    static int add(int a, int b, int c){
        System.out.println("The name of three cities are: "+a+b+c);
        return 0;
}

    public static void main(String[] args) {
        System.out.println("Tw cities"+add(4,6));
    }
}