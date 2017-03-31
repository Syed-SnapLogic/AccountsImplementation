package com.snaplogic.snaps.systempropertytest;

import com.snaplogic.account.api.AccountType;
import com.snaplogic.account.api.capabilities.AccountCategory;
import com.snaplogic.snap.api.capabilities.General;
import com.snaplogic.snap.api.capabilities.Version;

/**
 * Created by Syed on 31/3/17.
 */
@General(title = "Dynamic Account")
@Version(snap = 1)
@AccountCategory(type = AccountType.CUSTOM)
public class DynamicAccount extends CommonAccount {
    public DynamicAccount() {
        super.p1Exp = true;
    }
}

