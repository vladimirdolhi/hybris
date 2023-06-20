/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 20, 2023, 8:50:34 PM                    ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type ContactRequest.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class ContactRequest extends GenericItem
{
	/** Qualifier of the <code>ContactRequest.message</code> attribute **/
	public static final String MESSAGE = "message";
	/** Qualifier of the <code>ContactRequest.sender</code> attribute **/
	public static final String SENDER = "sender";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MESSAGE, AttributeMode.INITIAL);
		tmp.put(SENDER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactRequest.message</code> attribute.
	 * @return the message - Message
	 */
	public String getMessage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "message".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactRequest.message</code> attribute.
	 * @return the message - Message
	 */
	public String getMessage()
	{
		return getMessage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactRequest.message</code> attribute. 
	 * @param value the message - Message
	 */
	public void setMessage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "message".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactRequest.message</code> attribute. 
	 * @param value the message - Message
	 */
	public void setMessage(final String value)
	{
		setMessage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactRequest.sender</code> attribute.
	 * @return the sender - Sender
	 */
	public String getSender(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "sender".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactRequest.sender</code> attribute.
	 * @return the sender - Sender
	 */
	public String getSender()
	{
		return getSender( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactRequest.sender</code> attribute. 
	 * @param value the sender - Sender
	 */
	public void setSender(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "sender".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactRequest.sender</code> attribute. 
	 * @param value the sender - Sender
	 */
	public void setSender(final String value)
	{
		setSender( getSession().getSessionContext(), value );
	}
	
}
