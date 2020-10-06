
package claselibreriaperimetrofiguras;

public class libreriaperimetrofiguras {
    
    public int Perimetrotriangulorectangulo (int lado1, int lado2, int lado3)
    {
        Integer perimetro= 0;
        perimetro= (lado1 + lado2 + lado3);
        return perimetro;
    }
    public int Perimetrocuadrado (int lado1)
    {
        Integer perimetro= 0;
        perimetro= (lado1 * 4);
        return perimetro;
    }
    public int Perimetrorectangulo (int base, int altura)
    {
        Integer perimetro= 0;
        perimetro= (base *2)+(altura*2);
        return perimetro;
    }
    public int Perimetrorombo (int lado1)
    {
        Integer perimetro= 0;
        perimetro= (lado1*4);
        return perimetro;
    }
    public int Perimetroromboide (int base, int altura)
    {
        Integer perimetro;
        perimetro= (base + base+ altura+ altura);
        return perimetro;
    }
    public int Perimetrotrapecio (int lado1, int lado2, int lado3, int lado4)
    {
       Integer perimetro=0;
       perimetro = (lado1+lado2+lado3+lado4);
       return perimetro;
    }
}
