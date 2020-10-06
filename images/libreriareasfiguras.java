/*Librería con 6 metodos (funciones) para calcular 
el area de cada una de 6 diferentes figuras
 */
package claselibreriaareasfiguras;

public class libreriareasfiguras {
    
    public int Areatriangulorectangulo (int ladobase, int ladoaltura)
    {
        Integer area= 0;
        area= (ladobase * ladoaltura)/2;
        return area;
    }
    public int Areacuadrado (int ladobase)
    {
        Integer area= 0;
        area= (ladobase * ladobase);
        return area;
    }
    public int Arearectangulo (int ladobase, int ladoaltura)
    {
        Integer area= 0;
        area= (ladobase * ladoaltura);
        return area;
    }
    public int Arearombo (int diagonalmayor, int diagonalmenor)
    {
        Integer area= 0;
        area= (diagonalmayor * diagonalmenor)/2;
        return area;
    }
    public int Arearomboide (int ladobase, int ladoaltura)
    {
        Integer area= 0;
        area= (ladobase * ladoaltura);
        return area;
    }
    public int Areatrapecio (int ladoaltura, int basemayor, int basemenor)
    {
       int area=0;
       area = ((basemayor+basemenor)*ladoaltura)/2;
       return area;
    }
    
    
}
