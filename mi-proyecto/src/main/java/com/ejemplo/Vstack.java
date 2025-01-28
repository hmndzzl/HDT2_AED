import java.util.ArrayList;

public class VectorStack<E> implements Stack<E> {
    private ArrayList<E> elementos;

    //Constructor para iniciar stack
    public VectorStack() {
        this.elementos = new ArrayList<>();
    }

    //Override de los metodos de Stack

    //Override del metodo push
    @Override
    public void push(E item) {
        elementos.add(item);
    }

    //Override del metodo pop
    @Override
    public E pop() {
        if (empty()) {
            throw new IllegalStateException("Stack está vacío");
        }
        return elementos.remove(elementos.size() - 1);
    }
    
    //Override del metodo peak
    @Override
    public E peek() {
        if (empty()) {
            throw new IllegalStateException("Stack está vacío");
        }
        return elementos.get(elementos.size() - 1);
    }
    
    //Override del metodo isEmpty
    @Override
    public boolean empty() {
        return elementos.isEmpty();
    }

    //Override del metodo size
    @Override
    public int size() {
        return elementos.size();
    }

}
