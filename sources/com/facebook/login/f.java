package com.facebook.login;

import android.app.Dialog;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes3.dex */
public final class f extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceAuthDialog f30008a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DeviceAuthDialog deviceAuthDialog, FragmentActivity fragmentActivity, int i13) {
        super(fragmentActivity, i13);
        this.f30008a = deviceAuthDialog;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f30008a.getClass();
        super.onBackPressed();
    }
}
