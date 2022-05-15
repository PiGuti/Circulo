package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulo
 * @author profesor
 */
public class Circulito {
    private int coordenadaX;
    private int coordenadaY;
    private double radio;
    private static final double LIMITERADIO = 0.0;    
    
    /**
     * Constructor por defecto
     */
    public Circulito() {
    }

    /**
     * Constructor con 3 parametros que genera un circulo con unas
     * determinadas dimensiones
     * @param valorX Coordenada X
     * @param valorY Coordenada Y
     * @param valorRadio Tamaño del radio
     */
    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }
    
    /**
     * @return Coordenada X
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX Establece la coordenada X
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return Coordenada Y
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY Establece la coordenada Y
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return Radio del circulo
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio Establece el tamaño del radio del circulo
     */
    public void setRadio(double radio) {
        this.radio=(radio < LIMITERADIO ? LIMITERADIO : radio);
    }

    /**
     * Devuelve el diametro del circulo
     * @return Diametro
     */
    public double obtenerDiametro() {
        return getRadio() * 2;
    }

    /**
     * Devuelve la medida de la circunferencia
     * @return Circunferencia
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Devuelve el area del circulo
     * @return Area del circulo
     */
    public double obtenerAreaCirculo() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     * Devuelve un String con las coordenada X e Y, y el tamaño del radio
     * @return 
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Modifica el centro del circulo con los parametros que se le pasan
     * @param trasladarX Distancia a mover el centro en X
     * @param trasladarY Distancia a mover el centro en Y
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}
