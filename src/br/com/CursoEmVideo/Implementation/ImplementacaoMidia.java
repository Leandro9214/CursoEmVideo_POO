package br.com.CursoEmVideo.Implementation;

import java.util.Scanner;

import br.com.CursoEmVideo.beans.ControleRemoto;

public class ImplementacaoMidia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		ControleRemoto cTv = new ControleRemoto();
		
		System.out.println("");
		System.out.println("Dados iniciais do objeto:");
		System.out.println("Volume Atual: " + cTv.getVolume());
		System.out.println("Status Ligado: " + cTv.isLigado());
		System.out.println("Em execução: " + cTv.isTocando());
		System.out.println("");
		
		
		cTv.ligar();
		
		cTv.onMudo();
		
		cTv.abrirMenu();
		
		System.out.println("");
		
		cTv.fecharMenu();
		
		cTv.offMudo();
		
		cTv.upVolume();		
		
		cTv.abrirMenu();
		
		System.out.println("");
		
		cTv.fecharMenu();
		
		cTv.onMudo();
		
		cTv.play();
		
		cTv.abrirMenu();
		
		System.out.println("");
		
		cTv.pause();
		
		cTv.offMudo();
		
		cTv.abrirMenu();
		
		
		leitor.close();
	}

}
