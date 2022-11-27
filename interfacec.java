interface drawable{
    int draw();
}

class book implements drawable{
    int n;
    public int draw() {
        int n;
        n=9;
        System.out.println("draw in book");
        return n;
    }
}

class interfacec{
    public static void main(String[] args){
        drawable obj = new book();
        System.out.println("Calling an object"+obj.draw());
        
    }
}