import java.util.ArrayList;
import java.util.List;

public class ColaProcesos {
    List<Proceso> procesos = new ArrayList<>();

    void agregarProceso(Proceso p) {
        procesos.add(p);
    }

    void ordenarPorPrioridad() {
        procesos.sort((p1, p2) -> p1.getPrioridad() - p2.getPrioridad());
    }

    void ejecutar() {
        /**/
        List<Proceso> listaAux = new ArrayList<>(procesos);
        while (!listaAux.isEmpty()) {
            for (Proceso proceso : listaAux) {
                if (proceso.getQuantum() > 0) {
                    proceso.setQuantum(proceso.getQuantum() - 1);
                } else {

                    listaAux.remove(proceso);
                }
            }
        }
        System.out.println(listaAux);
    }

    public static void main(String[] args) {
        ColaProcesos cp = new ColaProcesos();
        for (int i = 0; i < 3; i++) {
            Proceso p = new Proceso("P" + i);
            cp.agregarProceso(p);
        }
        cp.ordenarPorPrioridad();
        cp.ejecutar();
    }
}
