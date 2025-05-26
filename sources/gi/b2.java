package gi;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* loaded from: classes3.dex */
public final class b2 extends jh.h {
    @Override // jh.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return queryLocalInterface instanceof d2 ? (d2) queryLocalInterface : new d2(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService", 2);
    }

    @Override // jh.f
    public final Feature[] getApiFeatures() {
        return new Feature[]{th.a.f117630b, th.a.f117629a};
    }

    @Override // jh.f
    public final Bundle getGetServiceRequestExtraArgs() {
        return n60.o.a("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
    }

    @Override // jh.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // jh.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // jh.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // jh.f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
