package java.main.zoo;

/**Clase Tiburon @author Manuel García Castilla */

public class Tiburon extends Pez {
    private String especie;
    private boolean peligroso;
    private static int numTiburones = 0;

/**Constructor base de Tiburon */
    public Tiburon () {
        super(20, Tipo.CARTILAGINOSO, Animal.Habitat.ARTICO, "focas", 100);
        this.especie = "Tiburón blanco";
        this.peligroso = true;
        this.numTiburones ++;
    }

/**Constructor de Tiburon para definir la especie, si es peligroso, la velocidad Maxima y el tipo*/
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo) {
        super(velocidadMaxNatacion, tipo);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }

/**Constructor de Tiburon para definir la especie, si es peligroso, la velocidad Maxima, el tipo, el habitat, la comida y la longevidad*/
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(velocidadMaxNatacion, tipo, habitat, comida, longevidad);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }

/**Método para obtener la velocidad máxima de natación del Tiburon*/
    public void desplazar() {
        System.out.println("Estoy nadando a " + this.getVelocidadMaxNatacion() + " km/h.");
    }

/**Método para obtener la comida del Tiburon*/
    public void comer() {
        System.out.println("Estoy comiendo " + this.comida);    
    }

/**Método para saber si un Tiburon es peligroso*/
    public void peligro() {
        System.out.println("¿El tiburón es peligroso?: " + this.peligroso);
    }

/**Método para borrar un Tiburon*/
    @Override
    protected void finalize() throws Throwable {
        numTiburones--;
        super.finalize();
    }
}
