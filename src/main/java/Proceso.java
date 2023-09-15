import java.util.UUID;

public class Proceso {
    private UUID uuid;
    private String nombre;
    private long fecCreacion;
    private long fecModificacion;
    private int quantum;
    private int prioridad;

    public Proceso(String nombre) {
        this.uuid = UUID.randomUUID();
        this.nombre = nombre;
        this.fecCreacion = System.currentTimeMillis();
        this.fecModificacion = System.currentTimeMillis();
        /*this.quantum = (int) (Math.random() * 100) + 1;*/
        this.quantum = 1;
        this.prioridad = (int) (Math.random() * 9);
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(long fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    public long getFecModificacion() {
        return fecModificacion;
    }

    public void setFecModificacion(long fecModificacion) {
        this.fecModificacion = fecModificacion;
    }

    public int getQuantum() {
        return quantum;
    }

    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    /*public String toString() {
        return "Proceso: " + this.uuid + " " + this.nombre + " " + this.fecCreacion + " " + this.fecModificacion + " " + this.quantum + " " + this.prioridad;
    }*/

    public String toString() {
        return "Proceso: " + this.nombre + " " + this.prioridad + " Quantum: " + this.quantum + "\n";
    }
}
