package com.generention.genjobs.model;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cadastro implements Desenvolvedorr, Gestor, Dataa, DevOpss {
		
		
		int op;
		boolean error = true;//telefone cpf=aceita at� 11 n�meros
		boolean loop = true;//cep
		Scanner leia = new Scanner(System.in);
		public String nome;
		public String email;
		private float telefone;
		private String cpf;
		private int cep;
		private String cidade;
		private String endereco;
		{
			
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
		
		public void visualizar() throws InterruptedException  {
			
			/*System.out.println("\t\tBem vindo a GenJobs, a plataforma de maior empregabilidade de tecnologia da turma 57.\n\n");
			System.out.println("\t\t\t\tGENJOBS");
			System.out.println("\n\n\nInforme seus dados cadastrais:");
			System.out.println("Nome:");
			this.nome = leia.nextLine();
			System.out.println("CPF: ");
			this.cpf = leia.nextLine();
			
			if(this.cpf.length()!=11)
			{
				do {	
					System.out.println("CPF inv�lido. Preencha apenas 11 n�meros.");
						System.out.println("CPF: ");
							this.cpf = leia.nextLine();
								}while(this.cpf.length()!=11); }
				
			System.out.println("Insira seu endere�o de email: ");
			this.email = leia.nextLine();
						
				
				do {	
					try {
						System.out.println("Telefone: ");
							this.telefone = leia.nextFloat();
								loop = false;
									
					}catch(java.util.InputMismatchException e) {
						System.err.println("Exce��o: "+e);
						leia.nextLine();
						System.out.println("Digite apenas n�meros. ");
					
					
					}
				}while(loop); 
						
				
				
				do {	
					try {
						System.out.println("CEP: ");
							this.cep = leia.nextInt();
								error = false;
										
					}catch(java.util.InputMismatchException e) {
						System.err.println("Exce��o: "+e);
						leia.nextLine();
						System.out.println("Digite apenas n�meros. ");
						
						
					}
				}while(error); 
								
				*/
				System.out.println("Endere�o: ");
				this.endereco = leia.next();
				System.out.println("Cidade: ");
				this.cidade = leia.next();//n�o da a op��o de escrita
				System.out.println(this.nome+", voc� ser� redirecionado....");
				TimeUnit.SECONDS.sleep(4);
			 }
		
		public void paginaInicial() {
			
		
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nGEN JOBS, TRABALHANDO PARA VOC� TRABALHAR\n\n");
				System.out.println("A nossa plataforma � feita atrav�s do match entre voc� e os nossos colaboradores.\nResponda as perguntas abaixo.");
			
		}
		public void profissao() {
			do {
			System.out.println("\n �reas de atua��o");
		    System.out.println("\n1- Desenvolvimento (Full Stack, Front-end, Back-end)");
		    System.out.println("\n2- DevOps");
		    System.out.println("\n3- Data Science");
		    System.out.println("\n4- Gest�o de projetos");
		    System.out.println("\nDigite a sua op��o: ");

		           op = leia.nextInt();  
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
		            }while(op<1 || op>5);
		        }
		@Override
		public void dv() {
			
			do {
				System.out.println("\n ------------------------------------");
				System.out.println("Atribui��es DevOps:");
				System.out.println("\n ------------------------------------");
				System.out.println("Voc� preenche alguns dos atributos para o cargo?\n");
				System.out.println("Obs: mesmo se voc� n�o conhecer ainda esse t�pico, n�o desanime! Continue estudando e se aprimorando continuamente.");
				System.out.println("\n\nConhecimento de metodologias �geis, gerenciamento de conflitos, linguagem de programa��o e automa��o de processos.");
				System.out.println("\n1 - sim");
				System.out.println("\n2 - n�o\n");
				System.out.println("Digite sua op��o: ");

				op = leia.nextInt();	
				switch (op) {
				
				case 1:
					System.out.println("sim");
					
					break;
				case 2:
					System.out.println("n�o");
					break;
				
				default:
		            System.out.println("\n Op��o inv�lida");
		        
				}
				}while(op < 1 || op >2);
			}
			
				
				
				
			
		
		@Override
		public void datinha() { 
			
		do {
		System.out.println("\n ------------------------------------");
		System.out.println("Atribui��es Data Science:");
		System.out.println("\n ------------------------------------");
		System.out.println("Voc� tem conhecimento da linguagem Python?");
		System.out.println("\n1 - sim");
		System.out.println("\n2 - n�o");
		System.out.println("Digite sua op��o: ");
		
		op = leia.nextInt();	
		switch (op) {
		
		case 1:
			System.out.println("sim");
			
			break;
		case 2:
			System.out.println("n�o");
			break;
		
		default:
            System.out.println("\n Op��o inv�lida");
		}
		}while(op < 1 || op >2);
	
		do {
		
		System.out.println("\nVoc� tem habilidade de analisar dados matem�ticos e estat�sticas ?");
		System.out.println("\n1 - sim");
		System.out.println("\n2 - n�o");
		System.out.println("Digite sua op��o: ");

		op = leia.nextInt();	
		switch (op) {
		
		case 1:
			System.out.println("sim");
			
			break;
		case 2:
			System.out.println("n�o");
			break;
		
		default:
            System.out.println("\n Op��o inv�lida");
		}
		
		}while(op < 1 || op >2);
		
		do {
		
		System.out.println("\nVoc� tem habilidade com banco de dados ?");
		System.out.println("\n1 - sim");
		System.out.println("\n2 - n�o");
		System.out.println("Digite sua op��o: ");

		op = leia.nextInt();	
		switch (op) {
		
		case 1:
			System.out.println("sim");
			
			break;
		case 2:
			System.out.println("n�o");
			break;
		
		default:
            System.out.println("\n Op��o inv�lida");
		}
		}while(op < 1 || op >2);
}

		
		
		@Override 
		public void gp() {
		
			do {
			System.out.println("\n ------------------------------------");
			System.out.println("N�vel de Ingl�s: ");
			System.out.println("\n ------------------------------------");
			System.out.println("\n1- B�sico");
			System.out.println("\n2- Interm�diario");
			System.out.println("\n3- Avan�ado");
			System.out.println("\n4- Fluente");
			System.out.println("Digite sua op��o: ");
			
			op = leia.nextInt();	
			switch (op) {
			
			case 1:
				System.out.println("B�sico");
				
				break;
			case 2:
				System.out.println("Interm�diario");
				break;
			case 3:
				System.out.println("Avan�ado");
				break;
			case 4:
				System.out.println("Fluente\n");
				break;
			
				
			default:
	            System.out.println("\n Op��o inv�lida");		
			
		}
			}while(op < 1 || op >4);
		}
		public void experienciaGp() {
		
			do {
				System.out.println("\n ------------------------------------");
				System.out.println("Experi�ncia profissional: ");
				System.out.println("\n ------------------------------------");
				System.out.println("\n1- 1 ano - 3 anos");
				System.out.println("\n2- 3 anos - 5 anos");
				System.out.println("\n3- 5 ano - 7 anos");
				System.out.println("\n4- 7 ano - 10 anos");
				System.out.println("\n5- Mais que 10 anos");
				System.out.println("\nDigite a sua op��o: ");

		op = leia.nextInt();	
		switch (op) {
		
		case 1:
			System.out.println();
			
			break;
		case 2:
			System.out.println();
			break;
		case 3:
			System.out.println();
			break;
		case 4:
			System.out.println();
			break;
		case 5:
			System.out.println();
			break;
					
		default:
	        System.out.println("\n Op��o inv�lida");
	}
			}while(op < 1 || op >2);
			}
		
		
		@Override
		public void desenvolver() {
		
			String Java;
			String JavaScript;
			String Phyton;
			String SQL;
			String PHP;
			String DataScience;
			

		}

		

		public void escolher() {
			do {
				System.out.println("\n ------------------------------------");
				System.out.println("VAGAS");
				System.out.println("\n ------------------------------------");
				System.out.println("Escolha a Linguagem de Programação:");
				System.out.println("\n1- Java");
				System.out.println("\n2- JavaScript");
				System.out.println("\n3- Python");
				System.out.println("\n4- RUBY");
				System.out.println("\n5- PHP");
				System.out.println("\nDigite a sua op��o: "); 

		op = leia.nextInt();	
		switch (op) {
		
		case 1:
			System.out.println("Java");
			
			break;
		case 2:
			System.out.println("JavaScript");
			break;
		case 3:
			System.out.println("Python");
			break;
		case 4:
			System.out.println("RUBY");
			break;
		case 5:
			System.out.println("PHP");
			break;
			
		
		default:
            System.out.println("\n Op��o inv�lida");

		}
			}while(op < 1 || op >5);
		}	
		
		public void nivel() {
			do {
			System.out.println("\n ------------------------------------");
			System.out.println("Experi�ncia profissional: ");
			System.out.println("\n ------------------------------------");
			System.out.println("\n1- Trainee");
			System.out.println("\n2- J�nior");
			System.out.println("\n3- Pleno");
			System.out.println("\n4- S�nior");
			System.out.println("\n5- Especialista");
			System.out.println("\nDigite a sua op��o: ");

	op = leia.nextInt();	
	switch (op) {
	
	case 1:
		System.out.println("Trainee");
		
		break;
	case 2:
		System.out.println("J�nior");
		break;
	case 3:
		System.out.println("Pleno");
		break;
	case 4:
		System.out.println("S�nior");
		break;
	case 5:
		System.out.println("Especialista");
		break;
				
	default:
        System.out.println("\nOp��o inv�lida");
}
			}while(op < 1 || op >5);
		}
		
		public void fim() {
			
			System.out.println("\n\nParab�ns "+this.nome+", voc� foi cadastrado no nosso banco de dados. Boa sorte!!");
		}
		
}		

		

		
		
	

