package boletin15;

/**
 *
 * @author mmartinezcosta
 */
public class Academica {

    public static int numReferencia=2020;
    private String nome;
    private int nota;
    private String persoalAlumn;
    
    public Academica(){
        
    }
    public Academica(String nome, String persoalAlumn){
    this.nome=nome;
    this.persoalAlumn=persoalAlumn;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPersoalAlumn() {
        return persoalAlumn;
    }

    public void setPersoalAlumn(String persoalAlumn) {
        this.persoalAlumn = persoalAlumn;
    }
    
    public void Acceso(){
        System.out.println("Dime que nota obtuvo");
    if (nota>=0 || nota<=10)
            System.out.println("Número de referencia:"+numReferencia+"\nNome:"+nome+"\nNota:"+nota+"\nPersoal Alumno:"+persoalAlumn);
    }
    
    
    
    
}

