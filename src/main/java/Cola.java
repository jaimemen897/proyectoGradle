import java.util.List;
import java.util.function.Function;

public interface Cola<T> {

    void add(T t);

    void remove(T t);

    /*Devuelve una lista de los T que cumplan la condicion*/
    List<T> filter(Function<T, Boolean> f);

    /*Devuelve una lista con los elementos transformado a traves de la función*/
    List<T> map(Function<T, T> f);

    /*Devuelve el elemento que cumple con una condición, si no null*/
    T find(Function<T, Boolean> f);

    /*Devuelve el índice del elemento que cumple una condición, si no -1*/
    int findIndex(Function<T, Boolean> f);

    /*Devuelve el último elemento que cumple una condición, si no null*/
    T findLast(Function<T, Boolean> f);

    /*devuelve el último elemento que cumple una condición, si no -1*/
    int findLastIndex(Function<T, Boolean> f);

    /*Ejecuta una función por cada elemento de la lista*/
    void forEach(Function<T, Void> f);

    /*Devuelve la lista ordenada en base a una condición*/
    List<T> sort(Function<T, T> f);
}
