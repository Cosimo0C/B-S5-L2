package cosimocrupi.L2.entities;

import cosimocrupi.L2.enums.StatoOrdine;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class Ordine extends Tavolo {
    protected List<Elemento> elementi;
    protected int numeroOrdine;
    protected StatoOrdine statoOrdine;
    protected LocalDate oraOrdine;
    protected double totale;


    public Ordine(List<Elemento> elementi, int numeroOrdine, StatoOrdine statoOrdine, LocalDate oraOrdine, double totale, int numeroTavolo, int copertiMax, boolean eLibero,int coperti, int costoCoperto) {
        super(numeroTavolo, copertiMax, eLibero, coperti, costoCoperto);
        Random rnd = new Random();
        this.elementi=new ArrayList<>();
        this.numeroOrdine=rnd.nextInt(25, 200);
        this.statoOrdine=statoOrdine;
        this.oraOrdine=oraOrdine;
        this.totale=totale;
    }
    public void ordine(Elemento elemento){
        this.elementi.add(elemento);
    }

    public double totale(){
        return this.elementi.stream().mapToDouble(elemento->elemento.getPrezzo()).sum()+ (this.coperti * this.costoCoperto);
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "elementi=" + elementi +
                ", numeroOrdine=" + numeroOrdine +
                ", statoOrdine=" + statoOrdine +
                ", oraOrdine=" + oraOrdine +
                ", totale=" + totale +
                ", numeroTavolo=" + numeroTavolo +
                ", copertiMax=" + copertiMax +
                ", eLibero=" + eLibero +
                ", coperti=" + coperti +
                ", costoCoperto=" + costoCoperto +
                '}';
    }
}
