package codeTest;
import javax.jms.MessageListener;

import com.gwservices.server.jms.JMSServer;

public abstract class CodeTestExerciseJms implements MessageListener {

	//This is the queue connection factory name bound in JNDI
	public static final String QUEUE_CONNECTION_FACTORY = "java:/QueueConnectionFactory";
	//This is the queue name bound in JNDI, that messages need to be sent to
	public static final String SEND_QUEUE = "queue/requestQueue";
	//This is the queue name bound in JNDI, that the message listener will need to listen on
	public static final String REPLY_QUEUE = "queue/replyQueue";
	
	private JMSServer _jmsServer;
	public CodeTestExerciseJms(){
		initialize();		
	}
	
	
	/**
	 * 
	 * This is the method that will be responsible for establishing a
	 * connection to the request queue and sending an arbitrary TextMessage to.
	 * 
	 * The body of the message should be a simple statement.  This message has 
	 * to be of type TextMessage.
	 * 
	 */
	public abstract void sendMessage();
	
	/**
	 * 
	 * This method will be responsible for establishing a connection to the 
	 * reply queue and registering a message listener for that queue.  The message listener that 
	 * is to be registered will only responsible for being able to handle messages of type TextMessage 
	 * when the message is received by the listener its body should be printed to the console and then 
	 * acknowledged.
	 * 
	 */
	public abstract void registerMessageListener();
		
	private final void initialize(){
		_jmsServer = JMSServer.getInstance();
		_jmsServer.start();
	}
	
	public final void process(){
		registerMessageListener();		
		sendMessage();
		_jmsServer.stop();
	}
	
	
}
