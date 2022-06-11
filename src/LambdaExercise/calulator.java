package LambdaExercise;


import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public  class calulator {
    private final Map<String,BinaryOperator<Integer>> operators=new HashMap<>();

    public void reserveOperation(String symbol,BinaryOperator<Integer> operator) {
        operators.put(symbol.strip(),operator);
    }
    public int calculate(int a,String s,int b){
        return operators.get(s).apply(a,b);

    }
}
