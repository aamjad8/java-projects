public class HomeWorkTwo {
    public static void main(String[] args){
        greaterNum(0, -5, 78);
    }
    static void greaterNum(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is greatest ");
        }else if(num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is greatest");
        }else if(num1 == num2 && num1 == num3){
            System.out.println("All the numbers are equal");
        }else{
            System.out.println(num3 + " is greatest.");
        }
    }
}
