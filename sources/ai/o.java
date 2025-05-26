package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class o extends jh.h {

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f15234e;

    public o(Context context, Looper looper, jh.g gVar, com.google.android.gms.common.api.internal.e eVar, com.google.android.gms.common.api.internal.n nVar) {
        super(context, looper, RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE, gVar, eVar, nVar);
        this.f15234e = new Bundle();
    }

    @Override // jh.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return queryLocalInterface instanceof p ? (p) queryLocalInterface : new p(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService", 0);
    }

    @Override // jh.f
    public final Feature[] getApiFeatures() {
        return i.f15228d;
    }

    @Override // jh.f
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f15234e;
    }

    @Override // jh.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // jh.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // jh.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
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
