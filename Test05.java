public class Test05 {
    public static void main(String[] args) {
        int counter = 1;
        int rows = 5;        
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(counter);
                counter++;                
                if (j < i - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
