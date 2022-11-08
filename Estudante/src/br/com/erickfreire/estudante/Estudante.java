package br.com.erickfreire.estudante;

public class Estudante {
	
	private String nome;
	private double media;
	
	public Estudante(String nome, double media) {
		
		this.nome = nome;
		
		if(media > 0.0)
			if(media <= 100.00)
				this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		if(media > 0.0)
			if(media <= 100.00)
				this.media = media;
	}
	
	public String letraNota() {
		String letra = "";
		
		if(media >= 90.00)
			letra = "A";
		else if(media >= 80.00)
			letra = "B";
		else if(media >= 70.00)
			letra = "C";
		else if(media >= 60.00)
			letra = "D";
		else 
			letra = "F";		
		
		return letra;
	}
	
	

}
