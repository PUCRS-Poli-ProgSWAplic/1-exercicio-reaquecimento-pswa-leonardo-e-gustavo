package exercicio3;

public class StrategyDemo {
    public static void main(String[] args) {
        int dia = 2;

        switch(dia){
            case 1:
                var segunda= new Segunda();
                System.out.println(segunda.retornaDia());
                break;
            case 2:
                var terca= new Terca();
                System.out.println(terca.retornaDia());
                break;
        }
    }
}
