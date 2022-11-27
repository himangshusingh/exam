class testthrow{
    public static void mul(int m,int n){

    if(m < 0){
        throw new ArithmeticException("the number is negative");
    }
    else if(n < 0){
        throw new ArithmeticException("the number is negative");
    }
    else{
        System.out.println("the multiplication is:"+(m*n));
}
    }


public static void main(String[] args){
    testthrow obj = new testthrow();

    obj.mul(4,-3);

}
}