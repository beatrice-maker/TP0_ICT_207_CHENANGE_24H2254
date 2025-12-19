public class Division {
    public double diviser(double a, double b){
        if (b == 0) {
            System.out.println("division par zero!!");
            return 0;
        }
        return a/b;
    }
    public static double diviserStatic(double a, double b){
        if (b == 0) {
            System.out.println("division par zero!!!");
            return 0;
        }
        return a/b;
    }
}
