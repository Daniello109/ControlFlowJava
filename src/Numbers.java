public class Numbers {


    public static void getNumbers (){
        int firstNumber = 1;
        int maxNumber = 0;
            while (firstNumber <= 10) {
                maxNumber++;
                int result = firstNumber * maxNumber;
                System.out.println(firstNumber + " " + maxNumber + " " + result);

                if (maxNumber==10){
                    firstNumber++;
                    result=firstNumber;
                    maxNumber=1;
                }


            }
    }

}
