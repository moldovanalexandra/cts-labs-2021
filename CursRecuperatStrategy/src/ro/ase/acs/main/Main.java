package ro.ase.acs.main;

import ro.ase.acs.classes.Calculator;
import ro.ase.acs.classes.Multiply;
import ro.ase.acs.classes.Sum;

//vezi poate repeti lambda expression
//injectez strategia
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addValue(3);
        calculator.addValue(4);
        calculator.addValue(5);

        //calculator.setOperation(null); -> imi arunca exceptie ce trebuie tratata in calculator
        calculator.setOperation(new Sum());
        System.out.println(calculator.operate());

        calculator.setOperation(new Multiply());
        System.out.println(calculator.operate());

        calculator.setOperation(array -> {
            long sum = 0;
            for(int i =0; i < array.length; i++){
                sum += array[i];
            }
            return sum/array.length;
        });
        System.out.println(calculator.operate());
    }
}
