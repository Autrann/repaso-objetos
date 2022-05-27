package uaslp.objetos.figuras;


public class PoligonoRegular {

    private double lados;
    private int numDeLados;
    private double area;
    private double apotema;
    private double angulo;

    public PoligonoRegular(int numLados){
        this.numDeLados = numLados;
    }
    public PoligonoRegular(int numLados, double lados){
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