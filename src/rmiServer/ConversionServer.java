package rmiServer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import rmiService.ConversionImpl;

public class ConversionServer {

	public static void main(String[] args) throws RemoteException, MalformedURLException {

		LocateRegistry.createRegistry(1099);
		//skeleton
		ConversionImpl od=new ConversionImpl();//od:objet distant
		System.out.println(od.toString());
		Naming.rebind("rmi://localhost:1099/objetdistant",od);
		

	}

}
