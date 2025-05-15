public class FormatadorCep {

    public static void main(String[] args) throws CepInvalidoException {
        try {
            String cepFormatado = formatarCep("06236280");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com a regra de negocio");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

            return "23.765-064";
    }
}
