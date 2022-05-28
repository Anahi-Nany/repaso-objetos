package uaslp.objetos.figuras;

import static java.lang.Math.tan;
import static java.lang.Math.tanh;

public class PoligonoRegular extends Figura{
    private int noLados;
    private double lado;
    private double ap;

    public PoligonoRegular(int noLados){
        super("Poligono Regular");
        this.noLados = noLados;
    }
    public PoligonoRegular(int noLados, double lado){
        super("Poligono Regular");
        this.noLados = noLados;
        this.lado = lado;
    }

    //setter
    public void setLado(double lado){
        this.lado = lado;
    }
    //getters
    public double getArea(){
        double grados;
        double radio;
        grados = 360/(noLados*2);
        radio=Math.toRadians(grados);
        ap = lado/(2*tan(radio));
        return ((noLados*lado)*ap)/2;
    }

    public double getLado(){
        return lado;
    }
}
