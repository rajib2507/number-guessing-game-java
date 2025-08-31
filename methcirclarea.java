public class methcirclarea{
    static double circlearea(double radius){
        double area= Math.PI * (radius*radius);
        return area;


    }
    public static void main(String args[]){
        double radius =8;
        double ar = circlearea(radius);
        System.out.println(ar);

    }
}