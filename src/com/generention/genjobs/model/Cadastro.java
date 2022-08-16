package com.generention.genjobs.model;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cadastro {
		
		int op;
		boolean loop = true;
		Scanner leia = new Scanner(System.in);
		public String nome;
		public String email;
		private float telefone;
		private String cpf;
		private int cep;
		private String cidade;
		private String endereco;
		private double teste;
		private String emailTeste;
		public Cadastro() {
			
			this.teste = teste;
			this.nome = nome;
			this.email = email;
			this.telefone = telefone;
			this.cpf = cpf;
			this.cep = cep;
			this.cidade = cidade;
			this.endereco = endereco;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public float getTelefone() {
			return telefone;
		}
		public void setTelefone(float telefone) {
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public int getCep() {
			return cep;
		}
		public void setCep(int cep) {
			this.cep = cep;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		
		public void visualizar()  {
			
			System.out.println("\t\tBem vindo a GenJobs, a plataforma de maior empregabilidade de tecnologia da turma 57.\n\n");
			System.out.println("\t\t\t\tGENJOBS");
			System.out.println("\n\n\nInforme seus dados cadastrais:");
			System.out.println("Nome:");
			this.nome = leia.nextLine();
			System.out.println("CPF: ");
			this.cpf = leia.nextLine();
			
			do {
				
			
			if(this.cpf.length()==11) {
				System.out.println("Insira seu endere�o de email: ");
				this.email = leia.nextLine();
				System.out.println("Telefone:");
				this.telefone = leia.nextFloat();
				System.out.println("CEP: ");
				this.cep = leia.nextInt();
				System.out.println("Endere�o: ");
				this.endereco = leia.next();
				System.out.println("Cidade: ");
				this.cidade = leia.nextLine();//n�o da a op��o de escrita
				System.out.println(this.nome+", voc� ser� redirecionado....");
				
				loop = true; }
			
			else {System.out.println("CPF inv�lido. Digite novamente");
			System.out.println("CPF: ");
			this.cpf = leia.nextLine();
				
			}}while(loop);
				
			 }
		
		
		public void paginaInicial() {
			
		
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nGEN JOBS, TRABALHANDO PARA VOC� TRABALHAR\n\n");
			System.out.println("A nossa plataforma � feita atrav�s do match entre voc� e os nossos colaboradores.\nResponda as perguntas abaixo.");
			
		}
		public void profissao() {
			System.out.println("\n �reas de atua��o");
		    System.out.println("\n1- Desenvolvimento (Full Stack, Front-end, Back-end");
		    System.out.println("\n2- DevOps");
		    System.out.println("\n3- Data Science");
		    System.out.println("\n4- Gest�o de projetos");
		    System.out.println("\n5- Outros");
		    System.out.println("\n Digite a sua op��o: ");

		            op = leia.nextInt();  // o tipo de dados � Int(eiro)
		            switch(op) {
		            case 1: 
		                System.out.println("\n Desenvolvimento (Full Stack, Front-end, Back-end)");
		                break; // finalizar cada case
		            

		         
		            case 2: 
		                System.out.println("\n DevOps");
		                break; 
		            
		           
		            case 3: 
		                System.out.println("\n Data Science");
		                break; 
		      
		            case 4: 
		                System.out.println("\n Gest�o de projetos");
		                break; 
		            

		            
		            case 5: 
		                System.out.println("\n Outros");
		                break; 

		            // exce��o: se meu usu�rio n�o retornar o que espero, retorno isso.
		            default:
		                System.out.println("\n Op��o inv�lida");
		              

		            }
		        }
		
			
		}
		
		
		
		
	

