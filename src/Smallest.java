public class Smallest {
    public static int small(int a, int b, int c){
        if(a<b){
            if(a<c) return a;
            else return c;
        }
        else return b;
    }
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        System.out.println(small(a, b, c));
    }
}
