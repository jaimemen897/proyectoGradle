import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestColaProcesos {
    @Test
    public void testAgregar() {
        ColaProcesos o = new ColaProcesos();
        Proceso p = new Proceso("P1");
        o.agregarProceso(p);
        assertEquals("P1", o.procesos.get(0).getNombre());
    }

    @Test
    public void testOrdenar() {
        ColaProcesos o = new ColaProcesos();
        for (int i = 0; i < 50; i++) {
            Proceso p = new Proceso("P" + i);
            o.agregarProceso(p);
        }
        o.ordenarPorPrioridad();
        int min = o.procesos.get(0).getPrioridad();
        assertEquals(min, o.procesos.get(0).getPrioridad());
    }

    @Test
    public void testEjecutar() {
        ColaProcesos o = new ColaProcesos();
        for (int i = 0; i < 50; i++) {
            Proceso p = new Proceso("P" + i);
            o.agregarProceso(p);
        }
        assertEquals(50, o.procesos.size());
        o.ejecutar();
        assertEquals(0, o.procesos.size());
    }
}
