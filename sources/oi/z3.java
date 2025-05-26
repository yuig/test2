package oi;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class z3 extends jh.f {
    @Override // jh.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof t3 ? (t3) queryLocalInterface : new v3(iBinder);
    }

    @Override // jh.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // jh.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // jh.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
