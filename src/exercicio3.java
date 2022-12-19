public class exercicio3 {
    int[] idade = {19, 20, 17, 25, 4};
    String[] nome = {"José", "Jair", "Jaíne", "Julia", "Jordan"};
    int menorIdade = 0;
    int maiorIdade = 0;
    int media = 0;
    String nomeIdadeMenor = "";
    String nomeIdadeMaior = "";
    public static void mostrarPessoas (String[] funcaoNome, int[] funcaoIdade){
        System.out.println("As pessoas desse grupo são: \n");
        for(int i = 0; i < 5; i ++){
            System.out.println(funcaoNome[i] + " tem " + funcaoIdade[i] + " anos.");
        }
    }
    public static int descobrirMaior (int[] idade, String nomeIdadeMaior, String[] nome) {
        int maiorIdade = idade[0];
        int temporaria = 0;
        for (int i = 0; i < 5; i++) {
            temporaria = idade[i];
            if (temporaria > maiorIdade) {
                maiorIdade = i;
            }
        }
        return temporaria;
    }
    public static void descobrirMenor (int[] idade, int menorIdade, String nomeIdadeMenor, String[] nome) {
        for(int i = 0; i < 5; i++){
            int temporaria = idade[i];
            if (temporaria > menorIdade) {
                menorIdade = temporaria;
                nomeIdadeMenor = nome[i];
            }
        }
    }
}
