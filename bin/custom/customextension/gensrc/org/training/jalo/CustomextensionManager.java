/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 15, 2023, 8:45:29 PM                    ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;
import org.training.constants.CustomextensionConstants;
import org.training.jalo.ContactRequest;
import org.training.jalo.ItemWithAllAttributes;
import org.training.jalo.MyItem1;
import org.training.jalo.MyItem2;
import org.training.jalo.MyItem3;
import org.training.jalo.MyItem4;

/**
 * Generated class for type <code>CustomextensionManager</code>.
 */
@SuppressWarnings({"unused","cast"})
@SLDSafe
public class CustomextensionManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ContactRequest createContactRequest(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("ContactRequest");
			return (ContactRequest)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ContactRequest : "+e.getMessage(), 0 );
		}
	}
	
	public ContactRequest createContactRequest(final Map attributeValues)
	{
		return createContactRequest( getSession().getSessionContext(), attributeValues );
	}
	
	public ItemWithAllAttributes createItemWithAllAttributes(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("ItemWithAllAttributes");
			return (ItemWithAllAttributes)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ItemWithAllAttributes : "+e.getMessage(), 0 );
		}
	}
	
	public ItemWithAllAttributes createItemWithAllAttributes(final Map attributeValues)
	{
		return createItemWithAllAttributes( getSession().getSessionContext(), attributeValues );
	}
	
	public MyItem1 createMyItem1(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("MyItem1");
			return (MyItem1)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MyItem1 : "+e.getMessage(), 0 );
		}
	}
	
	public MyItem1 createMyItem1(final Map attributeValues)
	{
		return createMyItem1( getSession().getSessionContext(), attributeValues );
	}
	
	public MyItem2 createMyItem2(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("MyItem2");
			return (MyItem2)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MyItem2 : "+e.getMessage(), 0 );
		}
	}
	
	public MyItem2 createMyItem2(final Map attributeValues)
	{
		return createMyItem2( getSession().getSessionContext(), attributeValues );
	}
	
	public MyItem3 createMyItem3(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("MyItem3");
			return (MyItem3)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MyItem3 : "+e.getMessage(), 0 );
		}
	}
	
	public MyItem3 createMyItem3(final Map attributeValues)
	{
		return createMyItem3( getSession().getSessionContext(), attributeValues );
	}
	
	public MyItem4 createMyItem4(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("MyItem4");
			return (MyItem4)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MyItem4 : "+e.getMessage(), 0 );
		}
	}
	
	public MyItem4 createMyItem4(final Map attributeValues)
	{
		return createMyItem4( getSession().getSessionContext(), attributeValues );
	}
	
	public static final CustomextensionManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CustomextensionManager) em.getExtension(CustomextensionConstants.EXTENSIONNAME);
	}
	
	@Override
	public String getName()
	{
		return CustomextensionConstants.EXTENSIONNAME;
	}
	
}
