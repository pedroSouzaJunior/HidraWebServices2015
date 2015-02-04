package net.ledes.hidra.sources;

import java.io.IOException;

import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;



public class Main {

	public static void main(String[] args) throws InvalidRemoteException, TransportException, IOException, GitAPIException {

		Command hc = new Command();
		hc.inicializar("/home/pedro/Documentos/Teste");
		//hc.clone("https://github.com/DanielliUrbieta/TCC.git", "/home/danielli/novoClone");
		System.out.println(hc.adicionar("teste.txt"));
		//hc.remove("arquivo5.txt");
		//hc.commit("Testando Commit");
		//hc.cloneW("/home/danielli/teste01","/home/danielli/clone01");
		//String teste = hc.status();
		//System.out.println(teste);
		
		//System.out.println(hc.showBranch());
		//hc.getLogs();
		
 
	    
	    
	    

		

	}

}
