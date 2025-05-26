package zh;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ch.j;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class c extends jh.h {

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f141969e;

    public c(Context context, Looper looper, jh.g gVar, j jVar, com.google.android.gms.common.api.g gVar2, com.google.android.gms.common.api.h hVar) {
        super(context, looper, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, gVar, gVar2, hVar);
        this.f141969e = jVar == null ? new Bundle() : new Bundle(jVar.f27725a);
    }

    @Override // jh.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService", 0);
    }

    @Override // jh.f
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f141969e;
    }

    @Override // jh.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // jh.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
    }

    @Override // jh.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.accounttransfer.service.START";
    }

    @Override // jh.f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
