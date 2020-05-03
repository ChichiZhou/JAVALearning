package TryAndCatchException;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> testInteger = new LinkedList<>(Arrays.asList(0,2,4,5,6,6,7));

//        for(Integer element : testInteger) {
//            int retryTime = 0;
//            while(true){
//                try{
//                    Integer divideResult = 1/element;
//                    break;
//                } catch (Exception e){
//                    System.out.println(format("Retry time is %d", retryTime));
//                    Thread.sleep(3000);
//                    if(++retryTime == 3){
//                        throw e;
//                    }
//
//                }
//            }
//        }
        try {
            throw new AssertionError();
        } catch (Error e) {
            System.out.println("CATCH ERROR HERE!!!");
            // caught! -> test pass
        }

        try {
            throw new NullPointerException();
        } catch (IllegalStateException e) {
            System.out.println("抛出 IllegalStateException");
            // caught! -> test pass
        }





    }
}
