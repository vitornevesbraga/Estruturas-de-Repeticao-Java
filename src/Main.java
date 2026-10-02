import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Algoritmo12();
    }


    private static void Algoritmo1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        double a = scanner.nextDouble();

        System.out.print("Informe o valor: ");
        double b = scanner.nextDouble();

        System.out.println("Selecione a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - multiplicação");
        System.out.println("4 - divisão");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println(" O resultado é: " + (a + b));
                break;

            case 2:
                System.out.print("O resultado é: " + (a - b));
                break;

            case 3:
                System.out.print("O resultado é: " + (a * b));
                break;

            case 4:
                System.out.print("O resultado é: " + (a / b));

            default:
                System.out.print("Valor inválido");
        }
    }


    private static void Algoritmo2() {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int numero = 1; numero <= 500; numero++) {

            if (numero % 2 != 0 && numero % 3 == 0) {
                soma = soma + numero;
            }
        }
        System.out.println("O resultado da soma é: " + soma);
    }


    private static void Algoritmo3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número do funcionario: ");
        int funcionario = scanner.nextInt();
        System.out.print("Informe os meses trabalhados: ");
        int mes = scanner.nextInt();

        int contador = 1;

        int maiorMes = mes;
        int menorMes = mes;
        int funcionarioMaior = funcionario;
        int funcionarioMenor = funcionario;

        while (contador < 300 && (funcionario !=0 || mes != 0)){

            System.out.print("Informe o número do funcionario: ");
            funcionario = scanner.nextInt();
            System.out.print("Informe os meses trabalhados: ");
            mes = scanner.nextInt();

            if (mes != 0 && funcionario != 0) {
                contador++;
            }

            if (mes > maiorMes){
                maiorMes = mes;
                funcionarioMaior = funcionario;
            }
            if (mes < menorMes && mes != 0){
                menorMes = mes;
                funcionarioMenor = funcionario;
            }
        }
        System.out.println("O funcionario mais antigo é o: " + funcionarioMaior);
        System.out.print("O funcionario mais recente é o: " + funcionarioMenor);

    }


    private static void Algoritmo4() {
        Scanner scanner = new Scanner(System.in);

        int contadoHomens = 0;
        int contadorMulheres = 0;
        double menorAltura = 100;
        double alturaTotalF = 0;
        double mediaAlturaTotalF = 0;
        double maiorAltura = 0;
        int generoMaior = 0;

        for (int i = 1; i <= 15; i++) {

            System.out.println("Informe a altura: ");
            double altura = scanner.nextDouble();
            System.out.println("Informe o gênero Masculino ou Feminino");
            System.out.println("1 - Masculino");
            System.out.println("2 - Feminino");
            int genero = scanner.nextInt();

            if (menorAltura > altura) {
                menorAltura = altura;
            }

            if (maiorAltura < altura) {
                maiorAltura = altura;
                generoMaior = genero;
            }
            // contando os gêneros //
            if (genero == 1) {
                contadoHomens++;
            } else if (genero == 2) {
                contadorMulheres++;

                alturaTotalF = altura + alturaTotalF;
                mediaAlturaTotalF = alturaTotalF / contadorMulheres;
            } else {
                System.out.println("Informe uma resposta válida");
            }
        }
        System.out.println("Quantidade de homens: " + contadoHomens);
        System.out.println("A menor altura é: " + menorAltura);
        System.out.println("A média da altura das mulheres é: " + mediaAlturaTotalF);
        if (generoMaior == 1){
            System.out.println("O gênero da maior altura é: M");
        }else if (generoMaior == 2){
            System.out.println("O gênero da maior altura é: F");
        }
    }


    private static void Algoritmo5() {

            Scanner scanner = new Scanner(System.in);

            // variáveis do salário //
            double salario = 0;
            int contadorSalario = 0;
            int contadorSalarioMenor = 0;
            double somaSalarioMenor = 0;
            double maiorSalario = 0;
            double mediaSalario = 0;
            double mediaSalarioMenor = 0;
            double somaSalario = 0;

            // variáveis do filho //
            int filhos = 0;
            int contadorFilhos = 0;
            int somaFilhos = 0;
            double mediaFilhos = 0;


            while (salario >= 0) {

                System.out.print("Informe o salário: ");
                salario = scanner.nextDouble();

                // encontrando o maior salário informado//
                if (salario > maiorSalario) {
                    maiorSalario = salario;
                }

                // média do valor dos salários //
                if (salario >= 0) {
                    // qtd de salário //
                    contadorSalario = contadorSalario + 1;
                    // total salário //
                    somaSalario = somaSalario + salario;
                    mediaSalario = somaSalario / contadorSalario;

                    // Media filhos //
                    System.out.print("Informe a quantidade de filhos: ");
                    filhos = scanner.nextInt();
                    contadorFilhos = contadorFilhos + 1;
                    somaFilhos = somaFilhos + filhos;
                    mediaFilhos = somaFilhos / contadorFilhos;

                }

                // média do valor dos menores salários //
                if (salario <= 250 && salario >= 0) {

                    // qtd de salário //
                    contadorSalarioMenor = contadorSalarioMenor + 1;
                    // total salário //
                    somaSalarioMenor = somaSalarioMenor + salario;
                    mediaSalarioMenor = somaSalarioMenor / contadorSalarioMenor;
                }
            }

            System.out.println("A média dos salários é: " + mediaSalario);
            System.out.println("O maior salário é: " + maiorSalario);
            System.out.println("A média dos salários menores que 250 é: " + mediaSalarioMenor);
            System.out.println("A média de filhos é: " + mediaFilhos);
        }


    private static void Algoritmo6 (){
        Scanner scanner = new Scanner(System.in);

        int numero;
        double media = 0;
        double contador = 0;
        double soma = 0;
        int contadorNegativo = 0;
        int contadorPositivo = 0;
        double percentualPositivo = 0;
        double percentualNegativo = 0;

        do {
            System.out.print("Informe o valor: ");
            numero = scanner.nextInt();

            if (numero != 0) {
                contador++;
                soma = soma + numero;
                media = (soma / contador);
            }
            if (numero > 0){
                contadorPositivo++;
            }else if (numero < 0){
                contadorNegativo++;
            }


        }while (numero != 0);
        percentualPositivo = (contadorPositivo / contador) * 100;
        percentualNegativo = (contadorNegativo / contador) * 100;

        System.out.println("A média dos valores é de: " + media);
        System.out.println("Numeros positivos: " + contadorPositivo);
        System.out.println("Percentual positivo: " + percentualPositivo + "%");
        System.out.println("Numeros negativos: " + contadorNegativo);
        System.out.println("Percentual de negativos: " + percentualNegativo + "%");

    }


    private static void Algoritmo7 () {
        Scanner scanner = new Scanner(System.in);

        double media = 0;
        double soma = 0;
        int contador = 0;

        for (int valor = 1; valor <=75; valor++ ){

            System.out.println("Informe o valor: ");
            int numero = scanner.nextInt();
            contador++;

            soma = soma + numero;
        }
        media = soma / contador;
        System.out.println("A média é: " + media);
        System.out.println("Quantidade de valores informados" + contador);
    }


    private static void Algoritmo8 (){
        Scanner scanner = new Scanner(System.in);

        String nomeMaior = "" ;
        String nomeMenor = "";
        String nome;
        double alturaMaior = 0;
        double alturaMenor = 0;
        double altura = 0;
        double alturaSoma = 0;
        double alturaHomens = 0;
        double alturaMulheres = 0;
        int contadorHomens = 0;
        int contadorMulheres = 0;
        int sexo = 0;

        for (int pessoa = 1; pessoa <= 15; pessoa++){
            System.out.print("Informe seu nome: ");
            nome = scanner.next();

            System.out.print("Informe sua altura: ");
            altura = scanner.nextDouble();

            System.out.println("Informe o sexo: ");
            System.out.println("1 - Masculino");
            System.out.println("2 - Feminino");
            sexo = scanner.nextInt();

            if (alturaMaior < altura){
                alturaMaior = altura;
                nomeMaior = nome;
            }
            if (pessoa == 1){
                alturaMenor = altura;
                nomeMenor = nome;
            } else if (alturaMenor > altura){
                alturaMenor = altura;
                nomeMenor = nome;
            }
            if (sexo == 1){
                contadorHomens++;
                alturaHomens = alturaHomens + altura;
            }else if (sexo == 2){
                contadorMulheres++;
                alturaMulheres = alturaMulheres + altura;
            }else {
                System.out.println("Informe um valor válido");
            }
        }
         alturaSoma = alturaSoma + altura;
         double mediaHomens = alturaHomens / contadorHomens;
         double mediaMulheres = alturaMulheres / contadorMulheres;
         double mediaAltura = alturaSoma / 15;


        System.out.println("A maior altura do grupo é do(a): " + nomeMaior + " com " + alturaMaior + "m de altura");
        System.out.println("A menor altura do grupo é do(a): " + nomeMenor + " com " + alturaMenor + "m de altura");
        System.out.println("A média da altura entre as mulheres é de: " + mediaMulheres);
        System.out.println("A média de altura entre os homens é de: " + mediaHomens);
        System.out.println("A média de altura entre o grupo é de: " + mediaAltura);
    }


    private static void Algoritmo9 (){
        Scanner scanner = new Scanner(System.in);

        double maiorNota = 0;
        double menorNota = 0;

        System.out.println("Informe a quantidade de alunos: ");
        int n = scanner.nextInt();

        for (int alunos = 1; alunos <= n; alunos++){

            System.out.println("Informe a nota do aluno: ");
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <=15){

                if (maiorNota < nota){
                    maiorNota = nota;
                }
                if (alunos == 1){
                    menorNota = nota;
                }else if (menorNota > nota){
                    menorNota = nota;
                }

            }else {
                System.out.println("Informe um valor válido");
            }
        }
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A maior note é: " + maiorNota);
    }


    private static void Algoritmo10(){

        int centimetro = 0;

        for(int i = 1; i <= 20; i++){

            centimetro++;
           double polegada = centimetro * 2.54;
            System.out.println(centimetro + " centimetros = " + polegada);
        }
    }


    private static void Algoritmo11(){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o limite inicial: ");
        int limiteInicial = scanner.nextInt();
        System.out.println("Informe o limite final: ");
        int limiteFinal = scanner.nextInt();

        int soma = 0;

        for (limiteInicial = limiteInicial; limiteInicial <= limiteFinal; limiteInicial++){

            if ( limiteInicial % 2 == 0){
                soma = limiteInicial + soma;
            }

        }
        System.out.println(soma);
    }


    private static void Algoritmo12(){
        Scanner scanner = new Scanner(System.in);

        int matricula = 0;
        double maiorNota = 0;
        double segundaMaiorNota = 0;
        double nota = 0;
        int maiorMatricula = 0;
        int segundaMaiorMatricula = 0;

        for (int aluno = 1; aluno <=100; aluno++){

            System.out.print("Informe a matricula: ");
            matricula = scanner.nextInt();

            System.out.print("Informe sua nota: ");
            nota = scanner.nextDouble();

            if (maiorNota < nota){
                segundaMaiorNota = maiorNota;
                segundaMaiorMatricula = maiorMatricula;
                maiorNota = nota;
                maiorMatricula = matricula;
            }else if (segundaMaiorNota < nota){
                segundaMaiorNota = nota;
                segundaMaiorMatricula = matricula;
            }
        }
        System.out.println("A maior nota foi " + maiorNota + " da matrícula: " + maiorMatricula);
        System.out.print("A segunda maior nota foi " + segundaMaiorNota + " da matrícula: " + segundaMaiorMatricula);

    }
}