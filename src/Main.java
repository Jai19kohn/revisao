public class Main {
    public static void main(String[] args) {
        int[] idade = {19, 20, 17, 25, 4};
        String[] nome = {"José", "Jair", "Jaíne", "Julia", "Jordan"};
        int menorIdade = 1000;
        int maiorIdade = 0;
        int media = 0;
        String nomeIdadeMenor = "";
        String nomeIdadeMaior = "";

        exercicio3 ex3 = new exercicio3();

        ex3.mostrarPessoas(nome, idade);
        ex3.descobrirMenor(idade, maiorIdade, nomeIdadeMenor, nome);
        ex3.descobrirMaior(idade,nomeIdadeMaior,nome);
        System.out.printf("\n Quem tem a menor idade é %s com %d anos e quem tem a maior idade é %s com %d anos." +
                nomeIdadeMenor, menorIdade, nomeIdadeMaior, maiorIdade);
    }

}