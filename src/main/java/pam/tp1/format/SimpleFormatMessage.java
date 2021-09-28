package pam.tp1.format;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class SimpleFormatMessage implements IFormatMessage{
	private static Logger logger = Logger.getLogger(SimpleFormatMessage.class);
	
	public SimpleFormatMessage()
	{
		super();
		logger.info("initialize bean");
	}

/**
 * 	Remplacer tous les caractères blancs (tab, espace) en un espace.	
 */
	@Override
	public String formatMessage(final String msg) {
		return msg.replaceAll("\\s+", " ");
	}

}
