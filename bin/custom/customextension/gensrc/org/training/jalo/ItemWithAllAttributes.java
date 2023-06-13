/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 13, 2023, 3:17:01 PM                    ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.constants.CustomextensionConstants;
import org.training.jalo.MyItem3;

/**
 * Generated class for type ItemWithAllAttributes.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class ItemWithAllAttributes extends GenericItem
{
	/** Qualifier of the <code>ItemWithAllAttributes.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>ItemWithAllAttributes.customEnumProperty</code> attribute **/
	public static final String CUSTOMENUMPROPERTY = "customEnumProperty";
	/** Qualifier of the <code>ItemWithAllAttributes.customMapAttribute</code> attribute **/
	public static final String CUSTOMMAPATTRIBUTE = "customMapAttribute";
	/** Qualifier of the <code>ItemWithAllAttributes.customListAttribute</code> attribute **/
	public static final String CUSTOMLISTATTRIBUTE = "customListAttribute";
	/** Qualifier of the <code>ItemWithAllAttributes.manyToMany</code> attribute **/
	public static final String MANYTOMANY = "manyToMany";
	/** Qualifier of the <code>ItemWithAllAttributes.item3</code> attribute **/
	public static final String ITEM3 = "item3";
	/**
	* {@link OneToManyHandler} for handling 1:n ITEM3's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<MyItem3> ITEM3HANDLER = new OneToManyHandler<MyItem3>(
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
		tmp.put(CUSTOMENUMPROPERTY, AttributeMode.INITIAL);
		tmp.put(CUSTOMMAPATTRIBUTE, AttributeMode.INITIAL);
		tmp.put(CUSTOMLISTATTRIBUTE, AttributeMode.INITIAL);
		tmp.put(MANYTOMANY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemWithAllAttributes.customEnumProperty</code> attribute.
	 * @return the customEnumProperty
	 */
	public EnumerationValue getCustomEnumProperty(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "customEnumProperty".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemWithAllAttributes.customEnumProperty</code> attribute.
	 * @return the customEnumProperty
	 */
	public EnumerationValue getCustomEnumProperty()
	{
		return getCustomEnumProperty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItemWithAllAttributes.customEnumProperty</code> attribute. 
	 * @param value the customEnumProperty
	 */
	public void setCustomEnumProperty(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "customEnumProperty".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItemWithAllAttributes.customEnumProperty</code> attribute. 
	 * @param value the customEnumProperty
	 */
	public void setCustomEnumProperty(final EnumerationValue value)
	{
		setCustomEnumProperty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemWithAllAttributes.customListAttribute</code> attribute.
	 * @return the customListAttribute
	 */
	public List<Integer> getCustomListAttribute(final SessionContext ctx)
	{
		List<Integer> coll = (List<Integer>)getProperty( ctx, "customListAttribute".intern());
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemWithAllAttributes.customListAttribute</code> attribute.
	 * @return the customListAttribute
	 */
	public List<Integer> getCustomListAttribute()
	{
		return getCustomListAttribute( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItemWithAllAttributes.customListAttribute</code> attribute. 
	 * @param value the customListAttribute
	 */
	public void setCustomListAttribute(final SessionContext ctx, final List<Integer> value)
	{
		setProperty(ctx, "customListAttribute".intern(),value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItemWithAllAttributes.customListAttribute</code> attribute. 
	 * @param value the customListAttribute
	 */
	public void setCustomListAttribute(final List<Integer> value)
	{
		setCustomListAttribute( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemWithAllAttributes.customMapAttribute</code> attribute.
	 * @return the customMapAttribute
	 */
	public Map<String,String> getAllCustomMapAttribute(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, "customMapAttribute".intern());
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemWithAllAttributes.customMapAttribute</code> attribute.
	 * @return the customMapAttribute
	 */
	public Map<String,String> getAllCustomMapAttribute()
	{
		return getAllCustomMapAttribute( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItemWithAllAttributes.customMapAttribute</code> attribute. 
	 * @param value the customMapAttribute
	 */
	public void setAllCustomMapAttribute(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, "customMapAttribute".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItemWithAllAttributes.customMapAttribute</code> attribute. 
	 * @param value the customMapAttribute
	 */
	public void setAllCustomMapAttribute(final Map<String,String> value)
	{
		setAllCustomMapAttribute( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemWithAllAttributes.item3</code> attribute.
	 * @return the item3
	 */
	public Collection<MyItem3> getItem3(final SessionContext ctx)
	{
		return ITEM3HANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemWithAllAttributes.item3</code> attribute.
	 * @return the item3
	 */
	public Collection<MyItem3> getItem3()
	{
		return getItem3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItemWithAllAttributes.item3</code> attribute. 
	 * @param value the item3
	 */
	public void setItem3(final SessionContext ctx, final Collection<MyItem3> value)
	{
		ITEM3HANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItemWithAllAttributes.item3</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>ItemWithAllAttributes.manyToMany</code> attribute.
	 * @return the manyToMany
	 */
	public Link getManyToMany(final SessionContext ctx)
	{
		return (Link)getProperty( ctx, "manyToMany".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemWithAllAttributes.manyToMany</code> attribute.
	 * @return the manyToMany
	 */
	public Link getManyToMany()
	{
		return getManyToMany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItemWithAllAttributes.manyToMany</code> attribute. 
	 * @param value the manyToMany
	 */
	public void setManyToMany(final SessionContext ctx, final Link value)
	{
		setProperty(ctx, "manyToMany".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItemWithAllAttributes.manyToMany</code> attribute. 
	 * @param value the manyToMany
	 */
	public void setManyToMany(final Link value)
	{
		setManyToMany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemWithAllAttributes.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "name".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemWithAllAttributes.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItemWithAllAttributes.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ItemWithAllAttributes.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
