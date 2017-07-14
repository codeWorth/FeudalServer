package mutliplayer;

import com.jme3.network.HostedConnection;
import com.jme3.network.Message;
import com.jme3.network.MessageListener;

import mutliplayer.types.StringMessage;

public class ServerListener implements MessageListener<HostedConnection> {

	@Override
	public void messageReceived(HostedConnection source, Message message) {
		if (message instanceof StringMessage) {
			StringMessage msg = (StringMessage) message;
			System.out.println("Server received '" + msg.message +"' from client #" + source.getId() );
		}
	}
	
}
