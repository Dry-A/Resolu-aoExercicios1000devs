package tipoEnum;

public class PedidoPizza {

    public static void main(String[] args) {
        TamanhoPizza tamanho = TamanhoPizza.GRANDE;

        // Verificar o tamanho
        switch (tamanho) {
            case PEQUENO:
                System.out.println("Você escolheu uma pizza pequena.");
                break;
            case MEDIO:
                System.out.println("Você escolheu uma pizza média.");
                break;
            case GRANDE:
                System.out.println("Você escolheu uma pizza grande.");
                break;
        }

    }
}
