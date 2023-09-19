import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class Proceso {
    private final UUID uuid = UUID.randomUUID();
    private String nombre;
    private final LocalDateTime fecCreacion = LocalDateTime.now();
    private LocalDateTime fecModificacion = LocalDateTime.now();
    private int quantum = (int) (Math.random() * 100) + 1;
    private int prioridad = (int) (Math.random() * 9);

    public Proceso(String nombre) {
        this.nombre = nombre;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFecCreacion() {
        return fecCreacion;
    }

    public LocalDateTime getFecModificacion() {
        return fecModificacion;
    }

    public void setFecModificacion(LocalDateTime fecModificacion) {
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

    @Override
    public String toString() {
        return "Proceso{" +
                "uuid=" + uuid +
                ", nombre='" + nombre + '\'' +
                ", fecCreacion=" + fecCreacion +
                ", fecModificacion=" + fecModificacion +
                ", quantum=" + quantum +
                ", prioridad=" + prioridad +
                '}';
    }
}
