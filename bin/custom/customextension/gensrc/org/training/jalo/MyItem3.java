/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 13, 2023, 3:17:01 PM                    ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.constants.CustomextensionConstants;
import org.training.jalo.ItemWithAllAttributes;
import org.training.jalo.MyItem1;

/**
 * Generated class for type MyItem3.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class MyItem3 extends GenericItem
{
	/** Qualifier of the <code>MyItem3.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>MyItem3.item1</code> attribute **/
	public static final String ITEM1 = "item1";
	/** Qualifier of the <code>MyItem3.itemWithAllAttributes</code> attribute **/
	public static final String ITEMWITHALLATTRIBUTES = "itemWithAllAttributes";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ITEM1's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<MyItem3> ITEM1HANDLER = new BidirectionalOneToManyHandler<MyItem3>(
	CustomextensionConstants.TC.MYITEM3,
	false,
	"item1",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ITEMWITHALLATTRIBUTES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<MyItem3> ITEMWITHALLATTRIBUTESHANDLER = new BidirectionalOneToManyHandler<MyItem3>(
	CustomextensionConstants.TC.MYITEM3,
	false,
	"itemWithAllAttributes",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(ITEM1, AttributeMode.INITIAL);
		tmp.put(ITEMWITHALLATTRIBUTES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ITEM1HANDLER.newInstance(ctx, allAttributes);
		ITEMWITHALLATTRIBUTESHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem3.item1</code> attribute.
	 * @return the item1
	 */
	public MyItem1 getItem1(final SessionContext ctx)
	{
		return (MyItem1)getProperty( ctx, "item1".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem3.item1</code> attribute.
	 * @return the item1
	 */
	public MyItem1 getItem1()
	{
		return getItem1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem3.item1</code> attribute. 
	 * @param value the item1
	 */
	public void setItem1(final SessionContext ctx, final MyItem1 value)
	{
		ITEM1HANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem3.item1</code> attribute. 
	 * @param value the item1
	 */
	public void setItem1(final MyItem1 value)
	{
		setItem1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem3.itemWithAllAttributes</code> attribute.
	 * @return the itemWithAllAttributes
	 */
	public ItemWithAllAttributes getItemWithAllAttributes(final SessionContext ctx)
	{
		return (ItemWithAllAttributes)getProperty( ctx, "itemWithAllAttributes".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem3.itemWithAllAttributes</code> attribute.
	 * @return the itemWithAllAttributes
	 */
	public ItemWithAllAttributes getItemWithAllAttributes()
	{
		return getItemWithAllAttributes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem3.itemWithAllAttributes</code> attribute. 
	 * @param value the itemWithAllAttributes
	 */
	public void setItemWithAllAttributes(final SessionContext ctx, final ItemWithAllAttributes value)
	{
		ITEMWITHALLATTRIBUTESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem3.itemWithAllAttributes</code> attribute. 
	 * @param value the itemWithAllAttributes
	 */
	public void setItemWithAllAttributes(final ItemWithAllAttributes value)
	{
		setItemWithAllAttributes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem3.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "name".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem3.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem3.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem3.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
