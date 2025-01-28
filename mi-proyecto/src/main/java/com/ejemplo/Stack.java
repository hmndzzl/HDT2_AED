/**@param*/ 
public interface Stack<E>{

    /**metodo para agregar los valores al stack.
    @param*/
    public void push(E item);

    /**Metodo para eliminar los valores del stack.
    @return
    @throws*/
    public E pop();

    /**Obtiene el valor mas reciente del stack sin eliminarlo.
    @return
    @throws*/
    public E peek();

    /**Hace revision si el stack se encuentra vacio.
    @return*/
    public boolean empty();

    /**Obtiene la cantidad de elementos en el stack.
    @return*/
    public int size();

    
}
