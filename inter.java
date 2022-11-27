interface drawable{
    void draw();
}

class book implements drawable{
    public void draw() {
        System.out.println("draw in book");
    }
}

class inter{
    public static void main(String[] args){
        drawable obj = new book();
        System.out.println("Calling an object");
        obj.draw();
    }
}