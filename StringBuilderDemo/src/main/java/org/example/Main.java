package org.example;

public class Main {
    public static void main(String[] args) {
        //2007000100000000-2007000200000000: сто миллионов панов в ренже
        String testCard = "2007000100000000";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("2007000100000000");;
        Runtime runtime = Runtime.getRuntime();
        long maxFreeMemory = 999999999;

     for(int i = 0; i < 50; i++) {
            testCard += testCard;
            long freeMemory = runtime.freeMemory();
            if(freeMemory < maxFreeMemory) {
                maxFreeMemory = freeMemory;
            }
            System.out.println(freeMemory + " " + maxFreeMemory);
        }

       /* for(int i = 0; i < 50; i++) {
            stringBuilder.append("2007000100000000");
            long freeMemory = runtime.freeMemory();
            if(freeMemory < maxFreeMemory) {
                maxFreeMemory = freeMemory;
            }
            System.out.println(freeMemory + " " + maxFreeMemory);
        }*/
      /*  while (!testCard.equals("2007000200000000")) {
            testCard = String.valueOf((Long.parseLong(testCard) + 1));
            long freeMemory = runtime.freeMemory();
            if(freeMemory < maxFreeMemory) {
                maxFreeMemory = freeMemory;
            }
            System.out.println(testCard + " " + freeMemory + " " + maxFreeMemory);
        }
*/
        //164799264 - lowest free memory using String concatenate 50 strings 16-digits
        //269642608 - lowest free memory using StringBuilder concatenate 50 strings 16-digits
        System.out.println(maxFreeMemory);

    }
}