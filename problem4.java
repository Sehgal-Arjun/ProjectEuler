import java.io.Console;

class problem4{
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 100;
        int sum = 0;
        int largest = 0;
        while (sum < 1998){
            int num = num1*num2;
            int reversedNum = 0;
            int remainder;
    
            // store the number to originalNum
            int originalNum = num;
            
            // get the reverse of originalNum
            // store it in variable
            while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
            }
            
            // check if reversedNum and originalNum are equal
            if (originalNum == reversedNum) {
                if (originalNum > largest){
                    largest = originalNum;
                }
            }

            if (num1 != 999){
                num1++;
            }
            else{
                num2++;
                num1=100;
                System.out.println(num2);
            }

            sum = num1 + num2;

        }

        System.out.println(largest);
    }
}