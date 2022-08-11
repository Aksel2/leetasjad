public class P1_3 {

    public static void findFourDigits(){
        for (int i = 1000; i <= 9999 ; i++) {
            if (i == Math.pow((i/100 + i%100),2)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {

        findFourDigits();
       // System.out.println(1013%100);
       // System.out.println(1013/100);
    }
}
