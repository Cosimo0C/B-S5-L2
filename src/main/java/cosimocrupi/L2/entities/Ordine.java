package cosimocrupi.L2.entities;

import cosimocrupi.L2.enums.StatoOccupazione;
import cosimocrupi.L2.enums.StatoOrdine;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
public class Ordine extends Tavolo {
    protected List<Menu>  menu;
    protected int numeroOrdine;
    protected StatoOrdine statoOrdine;
    protected LocalDate oraOrdine;
    protected double totale;


    public Ordine(List<Menu> menu, int numeroOrdine, StatoOrdine statoOrdine, LocalDate oraOrdine, double totale,int numeroTavolo, int copertiMax, StatoOccupazione statoOccupazione) {
        super(numeroTavolo, copertiMax, statoOccupazione);
        this.menu=menu;
        this.numeroOrdine=numeroOrdine;
        this.statoOrdine=statoOrdine;
        this.oraOrdine=oraOrdine;
        this.totale=totale;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "menu=" + menu +
                ", numeroOrdine=" + numeroOrdine +
                ", statoOrdine=" + statoOrdine +
                ", oraOrdine=" + oraOrdine +
                ", totale=" + totale +
                ", numeroTavolo=" + numeroTavolo +
                ", copertiMax=" + copertiMax +
                ", statoOccupazione=" + statoOccupazione +
                '}';
    }
}
