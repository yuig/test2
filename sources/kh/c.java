package kh;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.n;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import jh.g;
import jh.h;
import jh.o;

/* loaded from: classes3.dex */
public final class c extends h {

    /* renamed from: e, reason: collision with root package name */
    public final o f79408e;

    public c(Context context, Looper looper, g gVar, o oVar, e eVar, n nVar) {
        super(context, looper, RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF, gVar, eVar, nVar);
        this.f79408e = oVar;
    }

    @Override // jh.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // jh.f
    public final Feature[] getApiFeatures() {
        return bi.c.f22822b;
    }

    @Override // jh.f
    public final Bundle getGetServiceRequestExtraArgs() {
        o oVar = this.f79408e;
        oVar.getClass();
        Bundle bundle = new Bundle();
        String str = oVar.f76186a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // jh.f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // jh.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // jh.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // jh.f
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
