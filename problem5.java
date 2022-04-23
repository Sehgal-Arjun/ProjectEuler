class problem5{
    public static void main(String[] args) {

        boolean finished = false;
        int curnum = 2520;

        while (!finished){
            for (int i = 1; i < 21; i++){
                if (curnum % i != 0){
                    curnum++;
                    finished = false;
                    break;
                }
                else{
                    finished = true;
                }
            }
        }
        System.out.println(curnum);
    }
}