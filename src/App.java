public class App {
    public static void main(String[] args) throws Exception {
        
        String primeiroNome = "Marlon Lobato";
        String simbol = "& ";
        String SegundoNome = "Gabriela Rosa";

        String nomeCompleto = nomeCompleto (primeiroNome, simbol, SegundoNome);

        System.out.println(nomeCompleto);
        }

        
    public static String nomeCompleto (String primeiroNome, String SegundoNome, String simbol){
            return primeiroNome.concat(" ").concat(SegundoNome).concat(simbol);
            
        }
    
}
