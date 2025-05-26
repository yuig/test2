package jh;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class a0 extends ai.k implements b0 {
    public static b0 D(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof b0 ? (b0) queryLocalInterface : new z(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 1);
    }
}
