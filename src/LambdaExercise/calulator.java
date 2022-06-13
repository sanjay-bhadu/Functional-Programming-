package LambdaExercise;


import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public  class calulator {
    private final Map<String,BinaryOperator<Integer>> operators=new HashMap<>();


    //here we are basically adding functional interface with the operator sign
    public void reserveOperation(String symbol,BinaryOperator<Integer> operator) {
        operators.put(symbol.strip(),operator);
    }

    // here we are calling back functionalInterface with the help of operator sign
    public int calculate(int a,String s,int b){
        return operators.get(s).apply(a,b);

    }
}
