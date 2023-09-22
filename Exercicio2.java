// Exercício 2.
// a. Crie as classes solicitadas.
// b. Faça o relacionamento (herança) entre as classes.
// c. Defina a saída dos dados (toString()) nas classes indicadas. A classe onde tem a indicação
// é onde estará a saída – toString().
// d. Faça a classe de teste e execute.
// e. O método valorInss() tem a fórmula (salário * 11%). Veja exemplo do vídeo


public class Exercicio2 {

    public static class Pessoa {
        private String nome;
        private int idade;
        private String sexo;

        public Pessoa(String nome, int idade, String sexo) {
            this.nome = nome;
            this.idade = idade;
            this.sexo = sexo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }
    }

    public static class Empregado extends Pessoa {
        private double salario;
        private String matricula;

        public Empregado(String nome, int idade, String sexo, double salario, String matricula) {
            super(nome, idade, sexo);
            this.salario = salario;
            this.matricula = matricula;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public double ValorINSS() {
            return salario * 0.11;
        }
    }

    public static class Cliente extends Pessoa {
        private double valorDivida;
        private int anoNascimento;

        public Cliente(String nome, int idade, String sexo, double valorDivida, int anoNascimento) {
            super(nome, idade, sexo);
            this.valorDivida = valorDivida;
            this.anoNascimento = anoNascimento;
        }

        public double getValorDivida() {
            return valorDivida;
        }

        public void setValorDivida(double valorDivida) {
            this.valorDivida = valorDivida;
        }

        public int getAnoNascimento() {
            return anoNascimento;
        }

        public void setAnoNascimento(int anoNascimento) {
            this.anoNascimento = anoNascimento;
        }
        
        @Override
        public String toString() {
            return "Nome: " + getNome() + ", idade: " + getIdade() + ", sexo: " + getSexo() + ", valor da divida: " + getValorDivida() + ", Ano de nascimento: " + getAnoNascimento();
        }
    }

    public static class Gerente extends Empregado {
        private String nomeGerencia;

        public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
            super(nome, idade, sexo, salario, matricula);
            this.nomeGerencia = nomeGerencia;
        }

        public String getNomeGerencia() {
            return nomeGerencia;
        }

        public void setNomeGerencia(String nomeGerencia) {
            this.nomeGerencia = nomeGerencia;
        }
        
        @Override
        public String toString() {
            return "Nome: " + getNome() + ", idade: " + getIdade() + ", matricula: " + getMatricula() + ", nome da Gerencia: " + nomeGerencia + ", valor INSS: " + ValorINSS();
        }
    }

    public static class Vendedor extends Empregado {
        private double valorVendas;
        private int qntVendas;

        public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendas, int qntVendas) {
            super(nome, idade, sexo, salario, matricula);
            this.valorVendas = valorVendas;
            this.qntVendas = qntVendas;
        }

        public double getValorVendas() {
            return valorVendas;
        }

        public void setValorVendas(double valorVendas) {
            this.valorVendas = valorVendas;
        }

        public int getQntVendas() {
            return qntVendas;
        }

        public void setQntVendas(int qntVendas) {
            this.qntVendas = qntVendas;
        }

        @Override
        public String toString() {
            return "Nome: " + getNome() + ", salario: " + getSalario() + ", valor das vendas: " + valorVendas + ", quantidade de vendas: " + qntVendas;
            
        }

    }

    public static void main(String[] args) {
        
        Vendedor caue = new Vendedor("Vinicius", 19, "Masculino", 1500.00, "F123", 1000.0, 50);
        Gerente lucas = new Gerente("Marcos", 50, "Masculino", 1200.00, "F124", "Marcos");
        Cliente helena = new Cliente("Paulo", 60, "Masculino", 20000.00, 2003);

        System.out.println(caue.toString());
        System.out.println(lucas.toString());
        System.out.println(helena.toString());
    }
}
