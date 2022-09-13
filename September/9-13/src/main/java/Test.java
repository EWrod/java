public class Test {
    public static void main(String[] args) {
        int num=0;
        for(int i=1;i<=1000;i++){
            if(i%5==0){
                num+=i;
            }
        }
        System.out.print(num);
    }
}
