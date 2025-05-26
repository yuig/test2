package qh;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends jh.h {
    @Override // jh.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        Intrinsics.checkNotNullParameter(iBinder, "iBinder");
        int i13 = b.f103881b;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.deviceperformance.internal.IDevicePerformanceService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new a(iBinder);
    }

    @Override // jh.f
    public final Feature[] getApiFeatures() {
        Feature[] ALL_FEATURES = ei.b.f58956b;
        Intrinsics.checkNotNullExpressionValue(ALL_FEATURES, "ALL_FEATURES");
        return ALL_FEATURES;
    }

    @Override // jh.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // jh.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.deviceperformance.internal.IDevicePerformanceService";
    }

    @Override // jh.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.deviceperformance.service.START";
    }

    @Override // jh.f
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // jh.f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
