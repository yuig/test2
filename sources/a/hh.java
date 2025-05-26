package a;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hh extends jh.f {
    @Override // jh.f
    public final IInterface createServiceInterface(IBinder binder) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        int i13 = m6.f112i;
        if (binder == null) {
            return null;
        }
        IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof c7 ? (c7) queryLocalInterface : new v5(binder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // jh.f
    public final int getMinApkVersion() {
        return 243300000;
    }

    @Override // jh.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // jh.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }
}
