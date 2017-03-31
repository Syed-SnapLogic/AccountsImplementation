package com.snaplogic.snaps.systempropertytest;

import com.snaplogic.account.api.AccountType;
import com.snaplogic.account.api.ExtendedValidatableAccount;
import com.snaplogic.account.api.capabilities.AccountCategory;
import com.snaplogic.snap.api.capabilities.General;
import com.snaplogic.snap.api.capabilities.Version;

/**
 * Created by Syed on 31/3/17.
 */
@General(title = "Regular Account")
@Version(snap = 1)
@AccountCategory(type = AccountType.CUSTOM)
public class RegularAccount extends CommonAccount implements ExtendedValidatableAccount<String, Void> {
    @Override
    public String validate(Void arg) {
        // do custom validation here
        return connect();
    }
}

