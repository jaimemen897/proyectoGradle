import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ColaGenerica<T> implements Cola<T> {
    private final List<T> lista = new ArrayList<>();

    public void add(T t) {
        this.lista.add(t);
    }

    public void remove(T t) {
        this.lista.remove(t);
    }

    /*Devuelve una lista de los T que cumplan la condicion*/
    public List<T> filter(Function<T, Boolean> f) {
        List<T> listAux = new ArrayList<T>();
        for (T s : this.lista) {
            if (f.apply(s)) {
                listAux.add(s);
            }
        }
        return listAux;
    }

    /*Devuelve una lista con los elementos transformado a traves de la función*/
    public List<T> map(Function<T, T> f) {
        List<T> listAux = new ArrayList<>();
        for (T s : this.lista) {
            listAux.add(f.apply(s));
        }
        return listAux;
    }

    /*Devuelve el elemento que cumple con una condición, si no null*/
    public T find(Function<T, Boolean> f) {
        for (T s : this.lista) {
            if (f.apply(s)) {
                return s;
            }
        }
        return null;
    }

    /*Devuelve el índice del elemento que cumple una condición, si no -1*/
    public int findIndex(Function<T, Boolean> f) {
        int index = 0;
        for (T s : this.lista) {
            if (f.apply(s)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    /*Devuelve el último elemento que cumple una condición, si no null*/
    public T findLast(Function<T, Boolean> f) {
        T ultElemento = null;
        for (T s : this.lista) {
            if (f.apply(s)) {
                ultElemento = s;
            }
        }
        return ultElemento;
    }

    /*devuelve el último elemento que cumple una condición, si no -1*/
    public int findLastIndex(Function<T, Boolean> f) {
        int index = 0;
        int ultimo = -1;
        for (T s : this.lista) {
            if (f.apply(s)) {
                ultimo = index;
            }
            index++;
        }
        return ultimo;
    }

    /*Ejecuta una función por cada elemento de la lista*/
    public void forEach(Function<T, Void> f) {
        for (T s : this.lista) {
            f.apply(s);
        }
    }

    /*Devuelve la lista ordenada en base a una condición*/
    public List<T> sort(Function<T, T> f) {
        List<T> listAux = new ArrayList<T>();

        return listAux;
    }

    public static void main(String[] args) {
        ColaGenerica<Integer> cola = new ColaGenerica<>();
        System.out.println("LISTA NUMEROS ENTEROS");
        for (int i = 0; i < 5; i++) {
            cola.add(i);
        }

        System.out.println("Cola original: " + cola.lista);
        System.out.println("Filter: " + cola.filter(s -> s > 2));
        System.out.println("Map: " + cola.map(s -> s * 2));
        System.out.println("Find: " + cola.find(s -> s == 3));
        System.out.println("FindIndex: " + cola.findIndex(s -> s == 2));
        System.out.println("FindLast: " + cola.findLast(s -> s == 3));
        System.out.println("FindLastIndex: " + cola.findLastIndex(s -> s == 3));
/*
        System.out.println("Sort: " + cola.sort(s -> s));
*/
        System.out.println(" ------------------------------------ ");

        ColaGenerica<String> cola2 = new ColaGenerica<>();
        System.out.println("LISTA CADENAS");
        cola2.lista.add("esto");
        cola2.lista.add("es");
        cola2.lista.add("una");
        cola2.lista.add("prueba");
        cola2.lista.add("cadenas");
        System.out.println("Cola original: " + cola2.lista);
        System.out.println("Filter: " + cola2.filter(s -> s.length() > 3));
        System.out.println("Map: " + cola2.map(s -> s.toUpperCase()));
        System.out.println("Find: " + cola2.find(s -> s.equals("es")));
        System.out.println("FindIndex: " + cola2.findIndex(s -> s.equals("cadenas")));
        System.out.println("FindLast: " + cola2.findLast(s -> s.equals("prueba")));
        System.out.println("FindLastIndex: " + cola2.findLastIndex(s -> s.equals("prueba")));
/*
        System.out.println("Sort: " + cola2.sort(s -> s));
*/
        System.out.println(" ------------------------------------ ");

        ColaGenerica<Proceso> cola3 = new ColaGenerica<>();
        System.out.println("LISTA PROCESOS");
        for (int i = 0; i < 5; i++) {
            Proceso p = new Proceso("P" + i);
            cola3.lista.add(p);
        }
        System.out.println("Cola original: " + cola3.lista);
        System.out.println("Filter: " + cola3.filter(s -> s.getQuantum() > 50));
        System.out.println("Map: " + cola3.map(s -> {
            s.setQuantum(s.getQuantum() + 10);
            return s;
        }));
        System.out.println("Find: " + cola3.find(s -> s.getNombre().equals("P3")));
        System.out.println("FindIndex: " + cola3.findIndex(s -> s.getNombre().equals("P3")));
        System.out.println("FindLast: " + cola3.findLast(s -> s.getNombre().equals("P3")));
        System.out.println("FindLastIndex: " + cola3.findLastIndex(s -> s.getNombre().equals("P3")));
/*
        System.out.println("Sort: " + cola3.sort(s -> s.getQuantum()));
*/
        System.out.println(" ------------------------------------ ");
    }

}






























