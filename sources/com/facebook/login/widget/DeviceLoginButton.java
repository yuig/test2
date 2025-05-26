package com.facebook.login.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.c;
import mf.a;

/* loaded from: classes3.dex */
public class DeviceLoginButton extends LoginButton {
    public DeviceLoginButton(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }

    @Override // com.facebook.login.widget.LoginButton
    public final c i() {
        return new a(this);
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
