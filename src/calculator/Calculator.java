package calculator;

public class Calculator {
    double calculateAreaCircle(double ratio) {
        return Math.PI * ratio * ratio;
    }

    double calculateVolumePrism(double height, double width, double depth) {
        return height * width * depth;
    }

    double calculateAvg(double ...numbers) {
        if(numbers.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum / numbers.length;
    }
}
