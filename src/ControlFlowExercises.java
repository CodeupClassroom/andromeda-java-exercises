public class ControlFlowExercises {
    public static void main(String[] args) {
//        count 5 - 15
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

//        count evens 2 - 100
        int evens = 0;
        do {
            if (evens % 2 == 0) {
                System.out.println(evens);
            }
            evens++;
        }while(evens <= 100);

//        count backwards by 5's from 100 - -10
        int j = 100;

        do {
            System.out.println(j);
            j-=5;
        }while(j >= -10);

//        square numbers from 2 - 1,000,000
        long start = 2;
        do {
            System.out.println(start);
            start*=start;
        }while(start < 1000000);

//        refactor previous 2 exercises to use a for-loop
        for(int x = 100; x >= -10; x -= 5){
            System.out.println(x);
        }

        for(long y = 2; y < 1000000; y*=y){
            System.out.println(y);
        }

//        FizzBuzz
        for(int a = 1; a <= 100; a++){
            if(a % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(a % 5 == 0){
                System.out.println("Buzz");
            }else if(a % 3 == 0){
                System.out.println("Fizz");
            }else {
                System.out.println(a);
            }
        }

    }
}

