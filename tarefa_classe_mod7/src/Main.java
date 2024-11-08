//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Jogadora jogadora = new Jogadora();
        jogadora.nomeDaJogadora("Julia");
        jogadora.derbyName("AMAZONAS");
        jogadora.numeroDaJogadora(74);
        jogadora.posicaoDaJogadora("Blocker");
        jogadora.timeDaJogadora("Sugar Loathe Roller Derby");
        System.out.println(jogadora.getNome());
        System.out.println(jogadora.getDerbyName());
        System.out.println(jogadora.getNumero());
        System.out.println(jogadora.getPosicao());
        System.out.println(jogadora.getLiga());
    }
}