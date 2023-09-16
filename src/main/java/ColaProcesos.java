import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ColaProcesos {
    List<Proceso> procesos = new ArrayList<>();

    /*Agrega un proceso a la lista*/
    void agregarProceso(Proceso p) {
        procesos.add(p);
    }

    /*Ordena primero por prioridad y luego por fecha de creacion*/
    void ordenarPorPrioridad() {
        procesos.sort(Comparator.comparingInt(Proceso::getPrioridad).thenComparing(Proceso::getFecCreacion));
    }

    /*Resta 1 al quantum de los procesos si la prioridad es la menor de la lista*/
    void ejecutar() {
        while (!procesos.isEmpty()) {
            /*Se crea una lista auxiliar en la que meter los procesos a eliminar de la lista procesos*/
            List<Proceso> listaAux = new ArrayList<>();
            for (Proceso proceso : procesos) {
                if (proceso.getPrioridad() == minPrioridad(procesos)) {
                    if (proceso.getQuantum() > 0) {
                        proceso.setQuantum(proceso.getQuantum() - 1);
                        proceso.setFecModificacion(System.currentTimeMillis());
                    } else {
                        listaAux.add(proceso);
                    }
                }
            }
            /*Terminado de iterar la lista procesos eliminamos aquellos que hayamos anadido a la lista*/
            procesos.removeAll(listaAux);
        }
    }

    /*Devuelve la prioridad minima de la lista*/
    int minPrioridad(List<Proceso> l) {
        int min = l.get(0).getPrioridad();
        for (Proceso proceso : l) {
            if (proceso.getPrioridad() < min) {
                min = proceso.getPrioridad();
            }
        }
        return min;
    }

    public static void main(String[] args) {
        ColaProcesos cp = new ColaProcesos();
        for (int i = 0; i < 50; i++) {
            Proceso p = new Proceso("P" + i);
            cp.agregarProceso(p);
        }
        cp.ordenarPorPrioridad();
        cp.ejecutar();
    }
}
