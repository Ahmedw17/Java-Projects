public class Lab19 {

    public static int pos_divide(int n1, int n2) throws ArithmeticException {
        if (n2 == 0) {
            throw new ArithmeticException("n2 not by zero");
        } else if (n2 < 0 || n1 < 0) {
            throw new ArithmeticException("only postive number");
        }
        return n1 / n2;
    }

    public static void main(String[] args) {
        try {
            pos_divide(10, -3);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
