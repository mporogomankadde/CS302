package labs;

public interface Shapes {
        public double area();
        public static void showArea( Shapes s){
            double area= s.area();
            System.out.println("The area of s is "+ area);

        }
}
