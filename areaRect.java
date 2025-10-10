
class Rectangle {
 
    
    void Area(int S, int T)
    {
        System.out.println("Area of the rectangle: "
                           + S * T);
    }
}

class areaRect{
    
    public static void main(String[] args)
    {
 
        // Creating object of Rectangle class
        Rectangle obj = new Rectangle();
 
        // Calling function
       obj.Area(20, 10);
    }
}