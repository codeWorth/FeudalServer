package mutliplayer.types;

import com.jme3.network.AbstractMessage;
import com.jme3.network.serializing.Serializable;

@Serializable
public class StringMessage extends AbstractMessage {
	public String message;       // custom message data
	
	public StringMessage() {
		message = "";
	}    // empty constructor
	
	public StringMessage(String s) { 
		message = s; 
	} // custom constructor
}
