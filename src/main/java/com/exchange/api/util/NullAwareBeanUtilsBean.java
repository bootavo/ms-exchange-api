package com.exchange.api.util;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.converters.IntegerConverter;

import java.lang.reflect.InvocationTargetException;

public class NullAwareBeanUtilsBean extends BeanUtilsBean {

    @Override
    public void copyProperty(Object dest, String name, Object value)
            throws IllegalAccessException, InvocationTargetException {

        IntegerConverter converter = new IntegerConverter(null);
        BeanUtilsBean beanUtilsBean = new BeanUtilsBean();
        beanUtilsBean.getConvertUtils().register(converter, Integer.class);

        if (value == null || value.toString().equals("0") || value.toString().equals("0.0"))
            return;
        super.copyProperty(dest, name, value);
    }

}
