package uaslp.objetos.figuras;


public class PoligonoRegular extends Figura {

    private double lados;
    private int numDeLados;
    private double area;
    private double apotema;
    private double angulo;

    public PoligonoRegular(int numLados) throws NumeroInvalidoDeLados{
        super("Poligono Regular");
        if(numDeLados<5){
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }
        this.numDeLados = numLados;
    }
    public PoligonoRegular(int numLados, double lados){
        super("Poligono Regular");
        this.numDeLados = numLados;
        this.lados = lados;
    }

    public void setLado(double lados){
        this.lados = lados;
    }

    public double getLado (){
        return lados;
    }

    public double getArea(){
        angulo = Math.toRadians(180/numDeLados);
        angulo = Math.tan(angulo);

        area = (lados * lados * numDeLados)/(4 * angulo);
        return area;
    }
}