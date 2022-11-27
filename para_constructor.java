class construc{
    String name;

    public construc(String name){
        this.name= name;
        System.out.println("The name of the city is: "+name);
    }
}

class para_constructor{
    public static void main(String[] args){
        construc obj = new construc("kolkata");

    }
}