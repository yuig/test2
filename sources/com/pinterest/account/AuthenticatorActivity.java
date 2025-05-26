package com.pinterest.account;

import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;
import kg.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/account/AuthenticatorActivity;", "Landroid/accounts/AccountAuthenticatorActivity;", "<init>", "()V", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AuthenticatorActivity extends AccountAuthenticatorActivity {
    @Override // android.accounts.AccountAuthenticatorActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getString(x0.account_transfer_activity_toast);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        o.M(1, this, string);
        finish();
    }
}
