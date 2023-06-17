package org.training.attributehandlers;


import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;
import org.training.model.MyItem1Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDynamicAttributeHandler extends AbstractDynamicAttributeHandler<String, MyItem1Model> {
    @Override
    public String get(MyItem1Model model) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return "Attribute dynamically generated at" + dateFormat.format(date);
    }
}
