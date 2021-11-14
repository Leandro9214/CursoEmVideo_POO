package br.com.CursoEmVideo.beans;

public class ControleRemoto implements Controle {
	// Definição dos atributos 
	private int volume;
	private boolean ligado;
	private boolean tocando;
	private int ultimoVolume;
	
	//Definição dos métodos Construtores
	public ControleRemoto(int volume, boolean ligado, boolean tocando) {
		this.volume = volume;
		this.ligado = ligado;
		this.tocando = tocando;
	}

	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;	
	}
	
	//Definição dos métodos acessores e modificadores
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getUltimoVolume() {
		return ultimoVolume;
	}

	public void setUltimoVolume(int ultimoVolume) {
		this.ultimoVolume = ultimoVolume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	// Métodos das interfaces do Controle

	@Override
	public boolean ligar() {
		
		this.setLigado(true);
		System.out.println("Ligando o equipamento");
		return this.isLigado();
	}

	@Override
	public boolean desligar() {
		
		this.setLigado(false);
		System.out.println("Desligando o equipamento");
		return this.isLigado();
	}

	@Override
	public void abrirMenu() {
		
		if(this.isLigado()) {
			System.out.println("----------------------------");
			System.out.println("---------- MENU ------------");
			System.out.println("Status Ligado: " + this.isLigado());
			System.out.println("Em execução: " + this.isTocando());
			System.out.println("Volume Atual: " + this.getVolume() + "%");
			/*
			for (int i =0; i >= this.getVolume(); i+=5 ) {
				System.out.println("/");
			}
			*/
		}
		
	}

	@Override
	public void fecharMenu() {
	
		System.out.println("Fechando o MENU");
		
	}

	@Override
	public void upVolume() {
		
		if (this.isLigado()) {
			System.out.println("Aumentando o volume");
			this.setVolume(this.getVolume() + 1);
		}else {
			System.out.println("É preciso ligar o equipamento para aumentar o volume");
		}
	}

	@Override
	public void downVolume() {
		System.out.println("Diminuindo o volume");
	
		if (this.isLigado() && this.getVolume() > 0) {
			this.setVolume(this.getVolume() - 1);
		}else {
			System.out.println("É preciso ligar o equipamento para diminuir o volume");
		}
	}

	@Override
	public void onMudo() {
		System.out.println("Habilitando a função mudo");

		if (this.isLigado()) {
			this.setUltimoVolume(this.getVolume());
			this.setVolume(0);
		}else {
			System.out.println("É preciso ligar o equipamento executar a função");
		}
	}

	@Override
	public void offMudo() {
		System.out.println("Desabilitando a função mudo");
		if (this.isLigado()) {
			this.setVolume(this.getUltimoVolume());
		}else {
			System.out.println("É preciso ligar o equipamento para executar a função");
		}
	}
	
	@Override
	public void play() {
		System.out.println("Iniciando a execução");
		
		if (this.isLigado() && this.isTocando() == false) {
			this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		System.out.println("Interrompendo a execução");
		
		if (this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		}
		
	}
	
}
