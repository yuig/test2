package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class r0 extends i0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f31616a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31617b;

    public r0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f31616a = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object C(android.os.Bundle r3, java.lang.Class r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L2b
            java.lang.String r1 = "r"
            java.lang.Object r3 = r3.get(r1)
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> L10
            return r3
        L10:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received: "
            java.lang.String r2 = ", "
            java.lang.String r3 = t3.s1.c(r1, r4, r2, r3)
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.r0.C(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Bundle B(long j13) {
        Bundle bundle;
        synchronized (this.f31616a) {
            if (!this.f31617b) {
                try {
                    this.f31616a.wait(j13);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f31616a.get();
        }
        return bundle;
    }

    public final Long D() {
        return (Long) C(B(500L), Long.class);
    }

    public final String E(long j13) {
        return (String) C(B(j13), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final void f(Bundle bundle) {
        synchronized (this.f31616a) {
            try {
                try {
                    this.f31616a.set(bundle);
                    this.f31617b = true;
                } finally {
                    this.f31616a.notify();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.i0
    public final boolean j(int i13, Parcel parcel, Parcel parcel2) {
        if (i13 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) h0.a(parcel, Bundle.CREATOR);
        h0.d(parcel);
        f(bundle);
        parcel2.writeNoException();
        return true;
    }
}
