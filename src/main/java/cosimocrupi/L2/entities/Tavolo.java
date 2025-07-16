package cosimocrupi.L2.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tavolo {
    protected int numeroTavolo;
    protected int copertiMax;
    protected boolean eLibero;
    protected int coperti;
    protected int costoCoperto;

    public Tavolo(int numeroTavolo, int copertiMax, boolean eLibero, int coperti, int costoCoperto) {
        this.numeroTavolo = numeroTavolo;
        this.copertiMax = copertiMax;
        this.eLibero=eLibero;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numeroTavolo=" + numeroTavolo +
                ", copertiMax=" + copertiMax +
                ", statoOccupazione=" + eLibero +
                '}';
    }
}
