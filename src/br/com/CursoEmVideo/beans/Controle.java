package br.com.CursoEmVideo.beans;

public interface Controle {
	
	public abstract boolean ligar();
	public abstract boolean desligar();
	public abstract void abrirMenu();
	public abstract void fecharMenu();
	public abstract void upVolume();
	public abstract void downVolume();
	public abstract void onMudo();
	public abstract void offMudo();
	public abstract void play();
	public abstract void pause();
	
}
