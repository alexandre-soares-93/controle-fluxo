import java.util.Locale;

public class SistemaMedida {

    public static void main(String[] args) {
        String sigla =  "M";

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno".toUpperCase());
                break;
            }
            case "M": {
                System.out.println("Medio".toUpperCase());
                break;
            }
            case "G": {
                System.out.println("Grande".toUpperCase());
                break;
            }
            default:
                System.out.println("Indefinido".toUpperCase());
        }
    }
}
