
package eduardo;
public class Pessoa {
    String nome;
    int idade;
    String sexo;
    public String imprime(){
        String texto = "O nome é: "+nome+" | A idade é: "+idade+ " | O sexo é: "+sexo;
        return texto;
    }
    public boolean isMaior(){
        if(idade >= 18){
            return true;
        }else{
            return false;
        }
    }
    public String imprimeMaior(){
        if(idade >= 18){
            String texto = "É maior!";
            return texto;
        }else{
            String texto = "É menor!";
            return texto;
        }
    }
    public String parImpar(){
        if(idade % 2 == 0){
            String texto = "A idade é par!";
            return texto;
        }else{
            String texto = " A idade é impar!";
            return texto;
        }
    }
}
