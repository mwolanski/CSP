package Interpreter;

import CSP.Variable;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Maciej Wola�ski
 * maciekwski@gmail.com
 * on 2015-04-25.
 */
public interface Expression {
    public Integer interpret(ArrayList<Variable> variables);
}
