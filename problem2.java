class problem2{
    public static void main(String[] args) {

        int val = 0;
        int curnum = 2;
        int prevnum = 1;
        while (val <= 4000000){
            int temp = curnum;
            curnum = temp + prevnum;
            prevnum = temp;

            if  (curnum % 2 ==0){
                val += curnum;
            }
            if (curnum <= 89){
                System.out.println(curnum);
            }
        }
        val += 2; // because curnum starts at 3, so the fibonacci sequence is missing 1 and 2, but 2 is the only number that matters because it's even
        System.out.println(val);
    }
}