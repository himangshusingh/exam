//all constructor programs
class constructor {
    int i;
    public constructor(){
        i=99;
        System.out.println("Value of i is: "+i)
    }
    private constructor(){
        i=100;
        System.out.println("Value of i is: "+i);
    }

    public static void main(String[] args){
        constructor obj = new constructor();
        System.out.println("Value of i is: "+obj.i);
    }
}
