class problem7{
    public static void main(String[] args) {

        int num = 0;
        int prime = 0;
        int count = 0;
        boolean isprime = false;

        while (num != 10003){
            count ++;
            isprime = true;
            for (int i = 2; i < count/2; i++){
                if (count % i == 0){
                    isprime = false;
                }
            }
            if (isprime){
                System.out.println(num+1 + ": " + count);
                prime = count;
                num++;
            }
        }
        System.out.println(prime);
    }
}