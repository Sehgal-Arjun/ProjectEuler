import java.util.ArrayList;

class problem3{
    
    public static void main(String[] args) {

        long num = 600851475143L;

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i < num/2; i++){
            if (num % i != 0){
                list.add(i);
            }
        }

        long bignum = 1L;

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) > bignum){
                bignum = list.get(i);
            }
        }

        System.out.println(bignum);
    }
}