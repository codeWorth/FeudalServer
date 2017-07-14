package mutliplayer;

import java.io.IOException;

import com.jme3.app.SimpleApplication;
import com.jme3.network.Network;
import com.jme3.network.Server;
import com.jme3.network.serializing.Serializer;
import com.jme3.system.JmeContext;

import mutliplayer.types.StringMessage;

public class ServerApp extends SimpleApplication {

	public static void main(String[] args) {
		ServerApp app = new ServerApp();
		app.start(JmeContext.Type.Headless);
	}

	@Override
	public void simpleInitApp() {		
		try {
			Server myServer = Network.createServer(6143);
			myServer.start();
			
			//Serializer.registerClass(StringMessage.class);
			
			myServer.addMessageListener(new ServerListener(), StringMessage.class);
		} catch (IOException e) {
			System.out.println("Server dead RIP");
			e.printStackTrace();
		}
	    
	}
	
}
