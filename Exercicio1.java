// Exercício 1.
// a. Crie as classes solicitadas.
// b. Faça o relacionamento (herança) entre as classes.
// c. Defina a saída dos dados (toString()) nas classes indicadas. A classe onde tem a indicação
// é onde estará a saída – toString().
// d. Faça a classe de teste e execute.


public class Exercicio1 {

    public static class Animal {
        private String nome;
        private double peso;

        public Animal(String nome, double peso) {
            this.nome = nome;
            this.peso = peso;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }
    }

    public static class Peixe extends Animal {
        private String habitatNatural;

        public Peixe(String nome, double peso, String habitatNatural) {
            super(nome, peso);
            this.habitatNatural = habitatNatural;
        }

        public String getHabitatNatural() {
            return habitatNatural;
        }

        public void setHabitatNatural(String habitatNatural) {
            this.habitatNatural = habitatNatural;
        }

        @Override
        public String toString() {
            return "Nome: " + getNome() + ", peso: " + getPeso() + ", habitat: " + getHabitatNatural();
        }
    }

    public static class Cachorro extends Animal {
        private String raca;

        public Cachorro(String nome, double peso, String raca) {
            super(nome, peso);
            this.raca = raca;
        }

        public String getRaca() {
            return raca;
        }

        public void setRaca(String raca) {
            this.raca = raca;
        }

        @Override
        public String toString() {
            return "Nome: " + getNome() + ", peso: " + getPeso() + ", raça: " + getRaca();
        }
    }

    public static void main(String[] args) {
        Peixe pirarucu = new Peixe("Pirarucu", 6.7, "Agua doce");
        Cachorro viralata = new Cachorro("Vira-lata", 12.0, "Mista");

        System.out.println(pirarucu.toString());
        System.out.println(viralata.toString());
    }
}
