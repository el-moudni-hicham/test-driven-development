package dev.moudni;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.equals(""))
            return 0;
        else if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        } else {
            String[] split = numbers.split(",");

            int sum = 0;
            int sum2 = 0;
            for (String n : split) {
                if (n.contains("\n")) {
                    for (String n2 : n.split("\n")) {
                        if (n2.equals(""))
                            n2 = String.valueOf(0);
                        sum2 += Integer.parseInt(n2);
                    }
                }
                else{
                        int nb = Integer.parseInt(n);
                        sum += nb;
                    }
                }
                return sum + sum2;
            }
        }
}
