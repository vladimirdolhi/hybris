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
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.constants.CustomextensionConstants;
import org.training.jalo.MyItem1;

/**
 * Generated class for type MyItem4.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class MyItem4 extends GenericItem
{
	/** Qualifier of the <code>MyItem4.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>MyItem4.item1</code> attribute **/
	public static final String ITEM1 = "item1";
	/** Relation ordering override parameter constants for ManyToMany from ((customextension))*/
	protected static String MANYTOMANY_SRC_ORDERED = "relation.ManyToMany.source.ordered";
	protected static String MANYTOMANY_TGT_ORDERED = "relation.ManyToMany.target.ordered";
	/** Relation disable markmodifed parameter constants for ManyToMany from ((customextension))*/
	protected static String MANYTOMANY_MARKMODIFIED = "relation.ManyToMany.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("MyItem1");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(MANYTOMANY_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem4.item1</code> attribute.
	 * @return the item1
	 */
	public Collection<MyItem1> getItem1(final SessionContext ctx)
	{
		final List<MyItem1> items = getLinkedItems( 
			ctx,
			false,
			CustomextensionConstants.Relations.MANYTOMANY,
			"MyItem1",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem4.item1</code> attribute.
	 * @return the item1
	 */
	public Collection<MyItem1> getItem1()
	{
		return getItem1( getSession().getSessionContext() );
	}
	
	public long getItem1Count(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			CustomextensionConstants.Relations.MANYTOMANY,
			"MyItem1",
			null
		);
	}
	
	public long getItem1Count()
	{
		return getItem1Count( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem4.item1</code> attribute. 
	 * @param value the item1
	 */
	public void setItem1(final SessionContext ctx, final Collection<MyItem1> value)
	{
		setLinkedItems( 
			ctx,
			false,
			CustomextensionConstants.Relations.MANYTOMANY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(MANYTOMANY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem4.item1</code> attribute. 
	 * @param value the item1
	 */
	public void setItem1(final Collection<MyItem1> value)
	{
		setItem1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to item1. 
	 * @param value the item to add to item1
	 */
	public void addToItem1(final SessionContext ctx, final MyItem1 value)
	{
		addLinkedItems( 
			ctx,
			false,
			CustomextensionConstants.Relations.MANYTOMANY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MANYTOMANY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to item1. 
	 * @param value the item to add to item1
	 */
	public void addToItem1(final MyItem1 value)
	{
		addToItem1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from item1. 
	 * @param value the item to remove from item1
	 */
	public void removeFromItem1(final SessionContext ctx, final MyItem1 value)
	{
		removeLinkedItems( 
			ctx,
			false,
			CustomextensionConstants.Relations.MANYTOMANY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MANYTOMANY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from item1. 
	 * @param value the item to remove from item1
	 */
	public void removeFromItem1(final MyItem1 value)
	{
		removeFromItem1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem4.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "name".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem4.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem4.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem4.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
