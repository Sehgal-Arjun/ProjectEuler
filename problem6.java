class problem6{
    public static void main(String[] args) {

        int sum = 0;
        int square = 0;

        for (int i = 1; i <= 100; i++){
            sum += i*i;
        }

        for (int i = 1; i <= 100; i++){
            square += i;
        }
        square = square * square;

        System.out.println(square-sum);
    }
}