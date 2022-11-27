public class tthrows{

    public static int div(int m,int n)throws ArithmeticException{
        int div = m/n;
        return div;
    }

    public static void main(String[] args){
        tthrows o = new tthrows();

        try{
            System.out.println("Dividing: "+div(4,4));
        }
        catch (ArithmeticException e){
            System.out.println("Number cannot be divided by zero");
        }
    }
}