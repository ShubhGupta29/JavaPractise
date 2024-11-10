import java.util.concurrent.*;

public class BasicThreading {
    public static void main(String[] args) {
        System.out.println("=============");
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        try{
            Future<String> f1 = executorService.submit(new AlphaNumSequence(1,'a','f'));
            Future<String> f2 = executorService.submit(new AlphaNumSequence(7,'g','l'));
            Future<String> f3 = executorService.submit(new AlphaNumSequence(13,'m','r'));
            Future<String> f4 = executorService.submit(new AlphaNumSequence(19,'s','z'));

            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            executorService.shutdown();
        }
    }

    static class AlphaNumSequence implements Callable<String> {
        int startNum;
        char startChar;
        char endChar;

        public AlphaNumSequence(int startNum, char startChar, char endChar) {
            this.startNum = startNum;
            this.startChar = startChar;
            this.endChar = endChar;
        }

        @Override
        public String call() throws Exception {

            int num= startNum;
            StringBuilder result = new StringBuilder();
            for(char i = startChar; i <= endChar; i++) {
                result.append(i).append(num).append(" ");
                num++;
            }
            return result.toString();
        }
    }
}
