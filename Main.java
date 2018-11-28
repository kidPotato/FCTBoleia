
/**
 * 
 * @author Joao Manuel Morais Gomes StudentID:55162 TP4
 * @author Tomas Esteves Cardoso StudentID:55996 TP4
 * @version DD/MM/YEAR
 * 
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Partilha fctboleia = new Partilha();
		String option = readOption(fctboleia, input);
		while (!option.equals(TERMINATE_COMMAND) || fctboleia.sessionStatus()) {
			executeOption(fctboleia, option, input);
			option = readOption(fctboleia, input);
		}
		input.close();
		System.out.println("Obrigado. Ate proxima.");
		return;
	}

	private static final String PROMPT = "> ";
	private static final String HELP_COMMAND = "ajuda";
	private static final String REGIST_COMMAND = "regista";
	private static final String LOGIN_COMMAND = "entrada";
	private static final String LOGOUT_COMMAND = "sai";
	private static final String DRIVE_COMMAND = "nova";
	private static final String LIST_COMMAND = "lista";
	private static final String HITCHHIKING_COMMAND = "boleia";
	private static final String CONSULT_COMMAND = "consulta";
	private static final String REMOVE_COMMAND = "remove";
	private static final String TERMINATE_COMMAND = "termina";
	private static final String UNKNOWN_COMMAND = "Comando inexistente.";

	private static String readOption(Partilha fctboleia, Scanner input) {
		printPrompt(fctboleia);
		return input.next().toLowerCase();
	}

	private static void printPrompt(Partilha fctboleia) {
		if (fctboleia.sessionStatus())
			System.out.printf(/* EMAIL */PROMPT);
		else
			System.out.print(PROMPT);
	}

	private static void executeOption(Partilha fctboleia, String option, Scanner input) {
		if (fctboleia.sessionStatus())
			executeOptionSessionIsOn(fctboleia, option, input);
		else
			executeOptionSessionIsOff(fctboleia, option, input);
	}

	private static void executeOptionSessionIsOff(Partilha fctboleia, String option, Scanner input) {
		switch (option) {
		case HELP_COMMAND:
			helpMenuSessionIsOff(fctboleia);
			break;
		case REGIST_COMMAND:
			registerUser(fctboleia, input);
			break;
		case LOGIN_COMMAND:
			login(fctboleia, input);
			break;
		default:
			showUnknownCommand();
			input.nextLine();
			break;
		}
	}

	private static void helpMenuSessionIsOff(Partilha fctboleia) {
		System.out.println("ajuda - Mostra os comandos existentes");
		System.out.println("termina - Termina a execucao do programa");
		System.out.println("regista - Regista um novo utilizador no programa");
		System.out.println("entrada - Permite a entrada (”login”) dum utilizador no programa");
	}

	// Como nestes dois comandos o racicocinio e o mesmo usar um metodo pra a cena
	// da palavra passe a ser usado pelos dois no entanto existe o problema da
	// mudanca de estado mas talvez seja possivel de usar um noutro...

	private static void registerUser(Partilha fctboleia, Scanner input) {
		String email = input.next();input.nextLine();
		if(/*metodo q checa a exitencia de mail*/) {
			System.out.println("Utilizador ja existente.");
			System.out.println("Registo nao efetuado.");
		}
		else {
			System.out.print("nome (maximo 50 caracteres):");//cagar nos caracteres deste campo (usar como pre)
			String name = input.nextLine(); //N tenho a certeza acerca deste parametro
			for (int attempts = 3; attempts != 0; attempts--) {
				System.out.print("password (entre 3 e 5 caracteres - digitos e letras):");
				//Scanner de caracteres q n sei como fazer de momento talvez seja usar do tipo string
				if(/*metodo pra ver se a palavra passe cumpre as condicoes*/) {
					/*metodo pra dar save da pass*/
					/*metodo pra dar save do nome*/
					/*metodo pra dar save do mail*/
					attempts = 0;
					System.out.println("Registo efetuado.");
					
				}
				else {
					System.out.println("Password incorrecta.");
				}
					
			}
			if (/*metodo q checa a existencia do mail negado*/)
			System.out.println("Registo nao efetuado.");
		}
	}

	private static void login(Partilha fctboleia, Scanner input) {
		String email = input.next();
		input.nextLine();			
		if(/*metodo q checa a exitencia de mail*/) {
			String name = input.nextLine(); //N tenho a certeza acerca deste parametro
			for (int attempts = 3; attempts != 0; attempts--) {
				System.out.print("password:");
				//Scanner de caracteres q n sei como fazer de momento talvez seja usar do tipo string
				//usar metodos de entrada da pass
				if(/*metodo pra ver se a palavra passe e a certa*/) {
					attempts = 0;
					fctboleia.changeSessionStatus();
					//metodo para dar entrada a uma possivel variavel???
					
				}				
				else {
					System.out.println("Password incorrecta.");
				}
			}
		}
		else {
			System.out.println("Utilizador nao existente.");}
	}

	private static void executeOptionSessionIsOn(Partilha fctboleia, String option, Scanner input) {
		switch (option) {
		case HELP_COMMAND:
			helpMenuSessionIsOn(fctboleia);
			break;
		case LOGOUT_COMMAND:
			logout(fctboleia);
			break;
		case DRIVE_COMMAND:
			newDrive(fctboleia, input);
			break;
		case LIST_COMMAND:
			driveList(fctboleia, input);
			break;
		case HITCHHIKING_COMMAND:
			hitchhiking(fctboleia, input);
			break;
		case CONSULT_COMMAND:
			consultDrive(fctboleia, input);
			break;
		case REMOVE_COMMAND:
			removeDrive(fctboleia, input);
			break;
		default:
			showUnknownCommand();
			input.nextLine();
			break;
		}
	}

	private static void helpMenuSessionIsOn(Partilha fctboleia) {
		System.out.println("ajuda - Mostra os comandos existentes");
		System.out.println("sai - Termina a sessao deste utilizador no programa");
		System.out.println("nova - Regista uma nova deslocacao");
		System.out.println("lista - Lista todas ou algumas deslocacoes registadas");
		System.out.println("boleia - Regista uma boleia para uma dada deslocacao");
		System.out.println("consulta - Lista a informacao de uma dada deslocacao");
		System.out.println("remove - Retira uma dada deslocacao");
	}

	private static void logout(Partilha fctboleia) {
		fctboleia.changeSessionStatus();
		System.out.println("Obrigado. Ate proxima.");
	}

	private static void newDrive(Partilha fctboleia, Scanner input) {

	}

	private static void driveList(Partilha fctboleia, Scanner input) {

	}

	private static void hitchhiking(Partilha fctboleia, Scanner input) {

	}

	private static void consultDrive(Partilha fctboleia, Scanner input) {

	}

	private static void removeDrive(Partilha fctboleia, Scanner input) {

	}

	private static void showUnknownCommand() {
		System.out.println(UNKNOWN_COMMAND);
	}

}