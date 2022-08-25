public class fibo {
    public static void main(String[] args) {
        int n = 8;
        int pre = 0;
        int num = 1;
        int fib = 0;
        if (n == 1) {
            System.out.println(0);

        }
        else if (n == 2) {
            System.out.println(1);

        }
        else{
        for (int i = 2; i <n; i++) {

            if (n == 1) {
                System.out.println(1);
                break;
            } else {
                fib = pre + num;
                pre = num;
                num = fib;
            }}
            System.out.println(fib);
        }
    }}

