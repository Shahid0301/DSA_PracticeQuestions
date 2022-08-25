public class DeciToBin  {
    public static String DtoB(int n){
        if(n==0){
            return "";
        }
        return DtoB(n/2)+(String.valueOf(n%2));
    }
    public static void main(String[] args) {
        String a = DtoB(45);
        System.out.println(a);
    }
}