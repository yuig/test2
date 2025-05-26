package yh;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class b extends jh.h {
    @Override // jh.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder);
    }

    @Override // jh.f
    public final Feature[] getApiFeatures() {
        return ah.c.f15168b;
    }

    @Override // jh.f
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // jh.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // jh.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
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
