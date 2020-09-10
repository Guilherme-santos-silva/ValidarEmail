package Modelo;

public class Validacao 
{
    // definindo astributos
    String email;
    // String Nome;
    int posicao;

    // construtor da nossa classe 
    public Validacao(String email) 
    {
        this.email = email;
        validarArroba();
        validarFinal();
    }
    
    public boolean validarArroba()
    {
        // Verifica se o email possui o @.
        posicao = email.indexOf('@');
        
        // se o numero da posicao do arroba for maior que 5
        if(posicao > 5)
        {
            // se sim retorna verdadeiro
            return true;
        }  
        else
        {
            // se nao retorna falso
            return false; 
        }
             
    }

    public boolean validarFinal()
    {
        // verifica se existem a string ".com"
        if(email.contains(".com"))
        {
            //se sim retorna verdadeiro
            return true;
        }   
        else
        {
            //se nao retorna falso
            return false; 
        }
    }

/*
    //obter nome antes do @
    //so funciona com os atributos do tipo static
    public static String obterNome()
    {
        if (posicao > 0)
        {
           return Nome = email.substring(0, posicao); 
        } 
        else
        {
            return("Erro!");
        }

    } 
*/

}
