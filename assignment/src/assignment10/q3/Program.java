package assignments.assignment10.q3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {
    public static void display(){
        IntStream.iterate(1, n -> n + 1).limit(10).forEach(System.out::println);
        System.out.println();
        System.out.println(IntStream.iterate(1, n -> n + 1).limit(10).summaryStatistics());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        display();
    }
}
