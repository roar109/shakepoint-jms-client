package com.shakepoint.integration.jms.client.utils;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

public final class JmsUtils {
	public static String getText(final Message message) {

		if (message == null) {
			throw new RuntimeException("Message cannot be null");
		}

		if (!(message instanceof TextMessage)) {
			throw new RuntimeException("Message must be instance of " + TextMessage.class);
		}

		try {
			final TextMessage textMessage = (TextMessage) message;
			final String text = textMessage.getText();
			return text;
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}
}
