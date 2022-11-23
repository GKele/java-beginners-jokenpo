package br.com.me.dio;

public class Player {
	//Atributos do objeto Player
	private String name;
	private Integer score;
	
	//Construtor
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}
