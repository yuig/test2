package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* loaded from: classes3.dex */
public final class l0 extends si.b implements com.google.android.gms.common.api.g, com.google.android.gms.common.api.h {

    /* renamed from: i, reason: collision with root package name */
    public static final ch.c f30844i = ri.b.f108360a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f30845b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f30846c;

    /* renamed from: d, reason: collision with root package name */
    public final ch.c f30847d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f30848e;

    /* renamed from: f, reason: collision with root package name */
    public final jh.g f30849f;

    /* renamed from: g, reason: collision with root package name */
    public ri.c f30850g;

    /* renamed from: h, reason: collision with root package name */
    public b0 f30851h;

    public l0(Context context, bi.f fVar, jh.g gVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.f30845b = context;
        this.f30846c = fVar;
        this.f30849f = gVar;
        this.f30848e = gVar.f76145b;
        this.f30847d = f30844i;
    }

    public final void D() {
        ri.c cVar = this.f30850g;
        if (cVar != null) {
            cVar.disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void j() {
        this.f30850g.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f30851h.e(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void onConnectionSuspended(int i13) {
        b0 b0Var = this.f30851h;
        z zVar = (z) ((f) b0Var.f30793f).f30815j.get((a) b0Var.f30790c);
        if (zVar != null) {
            if (zVar.f30909i) {
                zVar.v(new ConnectionResult(17));
            } else {
                zVar.onConnectionSuspended(i13);
            }
        }
    }
}
