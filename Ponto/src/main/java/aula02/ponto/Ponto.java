
/*Crie uma classe Ponto para representar pontos no plano cartesiano, que deverá conter como
atributos dois valores numéricos, que representam as coordenadas no espaço bidimensional (R²).
Implemente também os seguintes métodos:
• public Ponto (float x, float y): método construtor da classe, responsável por inicializar as
coordenadas de cada objeto declarado;
• public float getModulo(): método que devolve a distância do ponto até a origem (pode ser
calculado utilizando fórmula que deriva do Teorema de Pitágoras;
• public String getQuadrante(): método que devolve o quadrante em que o ponto está localizado
(estabeleça notação caso o ponto esteja localizado nos eixos coordenados ou na origem).
*/

package aula02.ponto;

public class Ponto {
    //atributos
    float x;
    float y;
    
    
    //método
    public Ponto (float x, float y){//construtor da classe, responsável por inicializar as coordenadas de cada objeto declarado
    x = 2;
    y = 5;
    }
    

    public float getModulo(){//devolve a distancia
        float Distancia = 0;
        Distancia = (float) Math.sqrt (x * 5 + y * y);
        return Distancia;
    }
    
    public String getQuadrante(){
        String Quadrante = "";
        if (x < 0 && y < 0){
            Quadrante = "3º Quadrante!";//QIII → quadrante(-,-)
            return Quadrante;
        }
        else if(x > 0 && y > 0){//QI → 1º quadrante(+,+)
            Quadrante = "1º Quadrante";
            return Quadrante;   
        }
        else if(x < 0 && y > 0){
            Quadrante = "2º Quadrante";//QI → quadrante (-,+)
            return Quadrante;
        }
        else if(x > 0 && y < 0){
                Quadrante = "4º Quadrante";//QI → quadrante (+,-)
                return Quadrante;
            }
      return null;
    }
    /*main*/
    public static void main(String[] args) {}
}
