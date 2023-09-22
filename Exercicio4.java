public class quatro {
    public static class Veiculo {
        private String marca;
        private String modelo;
        private int anoFabricacao;

        public Veiculo(String marca, String modelo, int anoFabricacao) {
            this.marca = marca;
            this.modelo = modelo;
            this.anoFabricacao = anoFabricacao;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public int getAnoFabricacao() {
            return anoFabricacao;
        }
    }

    public static class Carro extends Veiculo {
        private int numeroPortas;

        public Carro(String marca, String modelo, int anoFabricacao, int numeroPortas) {
            super(marca, modelo, anoFabricacao);
            this.numeroPortas = numeroPortas;
        }

        public int getNumeroPortas() {
            return numeroPortas;
        }
    }

    public static class Moto extends Veiculo {
        private int cilindradas;

        public Moto(String marca, String modelo, int anoFabricacao, int cilindradas) {
            super(marca, modelo, anoFabricacao);
            this.cilindradas = cilindradas;
        }

        public int getCilindradas() {
            return cilindradas;
        }
    }

    public static class TesteVeiculos {
        public static void main(String[] args) {
            Carro meuCarro = new Carro("Toyota", "Corolla", 2022, 4);
            Moto minhaMoto = new Moto("Honda", "CBR 1000RR", 2021, 1000);

            System.out.println("Carro: " + meuCarro.getMarca() + " " + meuCarro.getModelo());
            System.out.println("Ano de Fabricação: " + meuCarro.getAnoFabricacao());
            System.out.println("Número de Portas: " + meuCarro.getNumeroPortas());

            System.out.println("\nMoto: " + minhaMoto.getMarca() + " " + minhaMoto.getModelo());
            System.out.println("Ano de Fabricação: " + minhaMoto.getAnoFabricacao());
            System.out.println("Cilindradas: " + minhaMoto.getCilindradas());
        }
    }
}
