package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.CalculatorApplication;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return calculatorService.sayHello();
    }

    @GetMapping("/plus")
    public String calculateSum(@RequestParam(value = "num1", required = false) Integer num1,
                               @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не передан параметр";
        }
        return "Сумма: [%s]".formatted(calculatorService.calculateSum(num1,num2));
    }

    @GetMapping("/minus")
    public String calculateSubstraction(@RequestParam(value = "num1", required = false) Integer num1,
                               @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не передан параметр";
        }
        return "Разница: [%s]".formatted(calculatorService.calculateSubstraction(num1,num2));
    }

    @GetMapping("/multiply")
    public String calculateMultiplication(@RequestParam(value = "num1", required = false) Integer num1,
                               @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не передан параметр";
        }
        return "Умножение: [%s]".formatted(calculatorService.calculateMultiplication(num1,num2));
    }

    @GetMapping("/divide")
    public String calculateDivision(@RequestParam(value = "num1", required = false) Integer num1,
                               @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не передан параметр";
        }
        if (num2 == 0) {
            return "Деление на 0 запрещено";
        }
        return "Деление: [%s]".formatted(calculatorService.calculateDivision(num1,num2));
    }
}
