class Printer {
    static void printNumbersWithWhileLoop(double min, double max){
        System.out.println("Pętla while:");
        while (min <= max) {
            System.out.println(min);
            min += 0.5;
        }
    }

    static void printNumbersWithDoWhileLoop(double min, double max){
        System.out.println("Pętla do...while:");
        do {
            System.out.println(min);
            min += 0.5;
        } while (min <= max);
    }

}
