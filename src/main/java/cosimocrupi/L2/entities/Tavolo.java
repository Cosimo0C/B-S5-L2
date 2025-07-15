package cosimocrupi.L2.entities;

import cosimocrupi.L2.enums.StatoOccupazione;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tavolo {
    protected int numeroTavolo;
    protected int copertiMax;
    protected StatoOccupazione statoOccupazione;

    public Tavolo(int numeroTavolo, int copertiMax, StatoOccupazione statoOccupazione) {
        this.numeroTavolo = numeroTavolo;
        this.copertiMax = copertiMax;
        this.statoOccupazione = statoOccupazione;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numeroTavolo=" + numeroTavolo +
                ", copertiMax=" + copertiMax +
                ", statoOccupazione=" + statoOccupazione +
                '}';
    }
}
