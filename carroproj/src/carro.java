public class carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.ano = ano; 
        this.velocidadeAtual = 0;
        this.modelo = modelo;
    }

    public int getAno(){
        return ano; 

    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
        public double getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public void acelerar(double velocidade){
        this.velocidadeAtual += velocidade;

    }

    public void frear(double velocidade){
        this.velocidadeAtual -= velocidade;
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
    }





}
