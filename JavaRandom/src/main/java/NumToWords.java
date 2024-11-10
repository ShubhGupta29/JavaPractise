import java.util.Arrays;
import java.util.concurrent.*;

public class NumToWords {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exe = Executors.newFixedThreadPool(9);

        Future<String> fut = exe.submit(new NumWords(423));

        System.out.println(fut.get());
    }

    static class NumWords implements Callable<String> {

        Integer num;

        public NumWords(Integer num) {
            this.num = num;
        }

        @Override
        public String call() throws Exception {
            String result = "";
            String[] wordArray = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            while(num>0){
                result=wordArray[num%10]+" "+result;
                num=num/10;
            }
            return result;
        }
    }
}
