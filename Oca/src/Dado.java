import java.util.ArrayList;

public class Dado {
    public static int tirarDado(int rango) {
        int resultado;
        resultado=(int) (Math.random() * 6) + 1; // Se le suma 1 si el valor del 0 es 10.
        return resultado;
    }


    public ArrayList tirarDado() {//sacado de internet, seguro algo hay mas facil
        ArrayList resultados=new ArrayList();
        int numero=0;
        int rango = 0;
        for (int i=0; i<numero; i++) {
            resultados.add(tirarDado(rango));
        }
        return resultados;
    }
}