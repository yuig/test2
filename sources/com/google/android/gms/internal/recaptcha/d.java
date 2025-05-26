package com.google.android.gms.internal.recaptcha;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class d extends jh.h {
    @Override // jh.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptcha.internal.IRecaptchaService");
        return queryLocalInterface instanceof q1 ? (q1) queryLocalInterface : new q1(iBinder);
    }

    @Override // jh.f
    public final Feature[] getApiFeatures() {
        return qi.b.f103968d;
    }

    @Override // jh.f
    public final int getMinApkVersion() {
        return 17108000;
    }

    @Override // jh.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.recaptcha.internal.IRecaptchaService";
    }

    @Override // jh.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.recaptcha.service.START";
    }
}
