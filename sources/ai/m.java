package ai;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class m extends jh.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15232e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15233f;

    public m(Context context, Looper looper, jh.g gVar, bh.c cVar, com.google.android.gms.common.api.g gVar2, com.google.android.gms.common.api.h hVar) {
        super(context, looper, 68, gVar, gVar2, hVar);
        bh.b bVar = new bh.b(cVar == null ? bh.c.f22800c : cVar);
        bVar.f22799c = j.a();
        this.f15233f = new bh.c(bVar);
    }

    @Override // jh.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        switch (this.f15232e) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                return queryLocalInterface instanceof n ? (n) queryLocalInterface : new n(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 0);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
                return queryLocalInterface2 instanceof zh.g ? (zh.g) queryLocalInterface2 : new zh.g(iBinder, "com.google.android.gms.auth.api.internal.IAuthService", 0);
        }
    }

    @Override // jh.f
    public final Bundle getGetServiceRequestExtraArgs() {
        int i13 = this.f15232e;
        Object obj = this.f15233f;
        switch (i13) {
            case 0:
                bh.c cVar = (bh.c) obj;
                cVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("consumer_package", null);
                bundle.putBoolean("force_save_dialog", cVar.f22801a);
                bundle.putString("log_session_id", cVar.f22802b);
                return bundle;
            default:
                return (Bundle) obj;
        }
    }

    @Override // jh.f
    public final int getMinApkVersion() {
        switch (this.f15232e) {
            case 0:
                return 12800000;
            default:
                return 12451000;
        }
    }

    @Override // jh.f
    public final String getServiceDescriptor() {
        switch (this.f15232e) {
            case 0:
                return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
            default:
                return "com.google.android.gms.auth.api.internal.IAuthService";
        }
    }

    @Override // jh.f
    public final String getStartServiceAction() {
        switch (this.f15232e) {
            case 0:
                return "com.google.android.gms.auth.api.credentials.service.START";
            default:
                return "com.google.android.gms.auth.service.START";
        }
    }

    @Override // jh.f, com.google.android.gms.common.api.c
    public final boolean requiresSignIn() {
        switch (this.f15232e) {
            case 1:
                jh.g gVar = this.f76154b;
                Account account = gVar.f76144a;
                if (!TextUtils.isEmpty(account != null ? account.name : null)) {
                    ep.b.A(gVar.f76147d.get(bh.a.f22796b));
                    if (!gVar.f76145b.isEmpty()) {
                        return true;
                    }
                }
                return false;
            default:
                return super.requiresSignIn();
        }
    }

    @Override // jh.f
    public final boolean usesClientTelemetry() {
        switch (this.f15232e) {
            case 1:
                return true;
            default:
                return super.usesClientTelemetry();
        }
    }

    public m(Context context, Looper looper, jh.g gVar, com.google.android.gms.common.api.internal.e eVar, com.google.android.gms.common.api.internal.n nVar) {
        super(context, looper, 16, gVar, eVar, nVar);
        this.f15233f = new Bundle();
    }
}
