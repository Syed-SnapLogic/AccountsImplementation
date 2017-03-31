package com.snaplogic.snaps.systempropertytest;

import com.snaplogic.account.api.Account;
import com.snaplogic.api.ExecutionException;
import com.snaplogic.common.properties.SnapProperty;
import com.snaplogic.common.properties.builders.PropertyBuilder;
import com.snaplogic.snap.api.PropertyValues;

/**
 * Created by Syed on 31/3/17.
 */
public class CommonAccount implements Account<String> {
    protected boolean p1Exp;
    protected String p1, p2;

    @Override
    public void defineProperties(PropertyBuilder propertyBuilder) {
        PropertyBuilder pb = propertyBuilder.describe("prop1", "prop1", "demo prop1");
        if (p1Exp) {
            pb = pb.expression(SnapProperty.DecoratorType.ACCEPTS_SCHEMA);
        }
        pb.add();

        propertyBuilder.describe("prop2", "prop2", "demo prop2")
                .add();
    }

    @Override
    public void configure(PropertyValues propertyValues) {
        if (p1Exp) {
            try {
                p1 = propertyValues.getAsExpression("prop1").eval(null);
            } catch (Exception x) {
                // handle exception
            }
        } else {
            p1 = propertyValues.get("prop1");
        }

        p2 = propertyValues.get("prop2");
    }

    @Override
    public String connect() throws ExecutionException {
        return p1 + " and " + p2;
    }

    @Override
    public void disconnect() throws ExecutionException {
        // NO OP
    }
}

