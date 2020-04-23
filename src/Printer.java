class Printer {
    static void printNumbersWithWhileLoop(double min, double max){
        System.out.println("Pętla while:");
        while (min <= max) {
            System.out.println(min);
            min++;
        }
    }

    static void printNumbersWithDoWhileLoop(double min, double max){
        System.out.println("Pętla do...while:");
        do {
            System.out.println(min);
            min++;
        } while (min <= max);
    }

}
