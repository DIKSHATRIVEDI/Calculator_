public class Largest {
    public static int large(int a, int b, int c){
        if(a>b){
            if(a>c) return a;
            else return c;
        }
        else return c;
    }
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        System.out.println(large(a, b, c));
    }
}
