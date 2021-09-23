import java.util.Random;

public class UrlApp {
    public static void main(String[] args) {
        int limit = 1000;
        StringBuilder[] URL = new StringBuilder[limit];
        String domena1 = "wp.pl/";
        String domena2 = "wirtualnapolska.pl/";
        Random generator = new Random();
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z
        int targetStringLength = 10;

        for (int i = 0; i < limit; i++) {
            StringBuilder buffer = new StringBuilder(targetStringLength);
            for (int j = 0; j < targetStringLength; j++) {
                int randomLimitedInt = leftLimit + (int) (generator.nextFloat() * (rightLimit - leftLimit + 1));
                buffer.append((char) randomLimitedInt);
            }
            URL[i] = new StringBuilder(domena1).append(buffer);
            System.out.println(URL[i]);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < URL.length && URL[i] != null; i++) {
            URL[i] = URL[i].delete(0, domena1.length()).insert(0, domena2);
            System.out.println(URL[i]);
        }
        System.out.println(System.currentTimeMillis() - startTime + "ms");

    }
}


