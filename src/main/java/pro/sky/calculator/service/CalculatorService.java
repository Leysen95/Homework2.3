package pro.sky.calculator.service;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public String sayHello() {
        return "Добро пожаловать в калькулятор";
    }

    public int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    public int calculateSubstraction(int num1, int num2) {
        return num1 - num2;
    }

    public int calculateMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    public int calculateDivision(int num1, int num2) {
        return num1 / num2;
    }
}
