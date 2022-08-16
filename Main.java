public class Main {
    public static void main(String[] args) {

                for (int i=0; i<=5; i++) {

                    for (int a=5; a>i; a-=1) {
                        System.out.print(" ");
                    }
                    for (int b=1; b<=i; b++) {
                        System.out.print(" *");
                    }
                    System.out.println();
                }
            }
        }
