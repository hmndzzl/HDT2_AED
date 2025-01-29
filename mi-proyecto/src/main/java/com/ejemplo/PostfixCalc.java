import java.util.StringTokenizer; //Biblioteca que funciona para separar los Strings.

public class PostfixCalc {
    private Stack<Integer> stack;


    /**Constructor de implementacion de stack.
    @param stack que se utilizara para evaluar.
    */
    public PostfixCalc(Stack<Integer> stack) {
        this.stack = stack;
    }

    
    /** Metodo para comprobar si el valor es numerico
    @param comprueba si el valor es str.
    @return se cumple si el valor es numerico.
    */
    private boolean Numerico(String str){
        //Ciclo try-catch
        try{
            Integer.parseInt(str); //Convierte un valor String a Integer.
            return true;
        } catch(NumberFormatException e) { //Si no es numerico, pasa por catch e identifica el error con NumberFormatException.
            return false; 
        }
    }

    /**Metodo de las operaciones aritmeticas
    @param Operadores (+, -, *, /, %).
    @param OperandoA primer operando
    @param Operando B segundo operando.
    @return retorna el resultado de la operacion.
    @throws No se cumple la expresion si el operador es invalido.
    */
    private int Operaciones(String operator, int OperandoA, int OperandoB){
        switch(operator){
            case "+": //operacionsuma.
                return OperandoA + OperandoB;
            case "-": //operacion resta.
                return OperandoA - OperandoB;
            case "*": //operacion multiplicacion.
                return OperandoA * OperandoB;
            case "/": //operacion division.
                if(OperandoB == 0){ //Si el segundo operando es 0, no se puede dividir.
                    throw new IllegalArgumentException("Sintaxis error");
                }
                return OperandoA / OperandoB;
            case "%": //operacion modular.
            return OperandoA % OperandoB;
            
            default:
                throw new IllegalArgumentException("Operador invalido: ");

        }
    }

    /**Metodo para evaluar las expresiones Postfix 
    @param evaluar las expresiones Postfix.
    @return retorna el resultado de la expresion.
    @throws No se cumple la expresion si el operador es invalido.
    */
    public int evaluar(String expression){
        //Instancia de token.
        StringTokenizer tokenizer = new StringTokenizer(expression, " "); //Utiliza la funcion de la biblioteca StringTokenizer para dividir la expresion en tokens o valores individuales.

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            if(Numerico(token)){
                stack.push(Integer.parseInt(token)); //Introduce el numero a la pila, convirtiendolo a Integer.
            } else {
                if(stack.size()<2){ //evalua si los operandos son suficientes para realizar operaciones.
                    throw new IllegalArgumentException("Faltan operandos para poder realizar una operacion");
                }
                int OperandoA = stack.pop(); //Obtiene el valor del OperandoA con .pop
                int OperandoB = stack.pop(); //Obtiene el valor del OperandoB con .pop
                int Resultado = Operaciones (token, OperandoA, OperandoB); //Utiliza el metodo operaciones, trabajando con los parametros d etoken, OperandoA y OperandoB.
                stack.push(Resultado); //Despliega el resultado.
            }
        }

            if(stack.size() !=1){ //Expresion invalida.
                throw new IllegalArgumentException("La expresion es invalida");
            }
            return stack.pop();
        }
}
