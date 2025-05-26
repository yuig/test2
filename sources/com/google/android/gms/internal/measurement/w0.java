package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class w0 extends ai.a implements u0 {
    public w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 2);
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final void f(Bundle bundle) {
        Parcel j13 = j();
        h0.c(j13, bundle);
        H(j13, 1);
    }
}
