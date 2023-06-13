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
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.constants.CustomextensionConstants;
import org.training.jalo.MyItem3;
import org.training.jalo.MyItem4;

/**
 * Generated class for type MyItem1.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class MyItem1 extends GenericItem
{
	/** Qualifier of the <code>MyItem1.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>MyItem1.item3</code> attribute **/
	public static final String ITEM3 = "item3";
	/** Qualifier of the <code>MyItem1.item4</code> attribute **/
	public static final String ITEM4 = "item4";
	/** Relation ordering override parameter constants for ManyToMany from ((customextension))*/
	protected static String MANYTOMANY_SRC_ORDERED = "relation.ManyToMany.source.ordered";
	protected static String MANYTOMANY_TGT_ORDERED = "relation.ManyToMany.target.ordered";
	/** Relation disable markmodifed parameter constants for ManyToMany from ((customextension))*/
	protected static String MANYTOMANY_MARKMODIFIED = "relation.ManyToMany.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n ITEM3's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<MyItem3> ITEM3HANDLER = new OneToManyHandler<MyItem3>(
	CustomextensionConstants.TC.MYITEM3,
	false,
	"item1",
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
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("MyItem4");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(MANYTOMANY_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem1.item3</code> attribute.
	 * @return the item3
	 */
	public Collection<MyItem3> getItem3(final SessionContext ctx)
	{
		return ITEM3HANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem1.item3</code> attribute.
	 * @return the item3
	 */
	public Collection<MyItem3> getItem3()
	{
		return getItem3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem1.item3</code> attribute. 
	 * @param value the item3
	 */
	public void setItem3(final SessionContext ctx, final Collection<MyItem3> value)
	{
		ITEM3HANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem1.item3</code> attribute. 
	 * @param value the item3
	 */
	public void setItem3(final Collection<MyItem3> value)
	{
		setItem3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to item3. 
	 * @param value the item to add to item3
	 */
	public void addToItem3(final SessionContext ctx, final MyItem3 value)
	{
		ITEM3HANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to item3. 
	 * @param value the item to add to item3
	 */
	public void addToItem3(final MyItem3 value)
	{
		addToItem3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from item3. 
	 * @param value the item to remove from item3
	 */
	public void removeFromItem3(final SessionContext ctx, final MyItem3 value)
	{
		ITEM3HANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from item3. 
	 * @param value the item to remove from item3
	 */
	public void removeFromItem3(final MyItem3 value)
	{
		removeFromItem3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem1.item4</code> attribute.
	 * @return the item4
	 */
	public Collection<MyItem4> getItem4(final SessionContext ctx)
	{
		final List<MyItem4> items = getLinkedItems( 
			ctx,
			true,
			CustomextensionConstants.Relations.MANYTOMANY,
			"MyItem4",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem1.item4</code> attribute.
	 * @return the item4
	 */
	public Collection<MyItem4> getItem4()
	{
		return getItem4( getSession().getSessionContext() );
	}
	
	public long getItem4Count(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			CustomextensionConstants.Relations.MANYTOMANY,
			"MyItem4",
			null
		);
	}
	
	public long getItem4Count()
	{
		return getItem4Count( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem1.item4</code> attribute. 
	 * @param value the item4
	 */
	public void setItem4(final SessionContext ctx, final Collection<MyItem4> value)
	{
		setLinkedItems( 
			ctx,
			true,
			CustomextensionConstants.Relations.MANYTOMANY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(MANYTOMANY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem1.item4</code> attribute. 
	 * @param value the item4
	 */
	public void setItem4(final Collection<MyItem4> value)
	{
		setItem4( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to item4. 
	 * @param value the item to add to item4
	 */
	public void addToItem4(final SessionContext ctx, final MyItem4 value)
	{
		addLinkedItems( 
			ctx,
			true,
			CustomextensionConstants.Relations.MANYTOMANY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MANYTOMANY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to item4. 
	 * @param value the item to add to item4
	 */
	public void addToItem4(final MyItem4 value)
	{
		addToItem4( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from item4. 
	 * @param value the item to remove from item4
	 */
	public void removeFromItem4(final SessionContext ctx, final MyItem4 value)
	{
		removeLinkedItems( 
			ctx,
			true,
			CustomextensionConstants.Relations.MANYTOMANY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MANYTOMANY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from item4. 
	 * @param value the item to remove from item4
	 */
	public void removeFromItem4(final MyItem4 value)
	{
		removeFromItem4( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem1.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "name".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyItem1.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem1.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyItem1.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
