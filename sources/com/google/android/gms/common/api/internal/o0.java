package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes3.dex */
public final class o0 extends r0 {

    /* renamed from: b, reason: collision with root package name */
    public final fh.h f30854b;

    public o0(fh.g gVar) {
        super(1);
        this.f30854b = gVar;
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void a(Status status) {
        try {
            fh.h hVar = this.f30854b;
            hVar.getClass();
            com.bumptech.glide.d.i("Failed result must not be success", !(status.f30751f <= 0));
            hVar.C0(status);
        } catch (IllegalStateException e13) {
            Log.w("ApiCallRunner", "Exception reporting failure", e13);
        }
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void b(RuntimeException runtimeException) {
        Status status = new Status(10, a.a.D(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), null, null);
        try {
            fh.h hVar = this.f30854b;
            hVar.getClass();
            com.bumptech.glide.d.i("Failed result must not be success", !false);
            hVar.C0(status);
        } catch (IllegalStateException e13) {
            Log.w("ApiCallRunner", "Exception reporting failure", e13);
        }
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void c(z zVar) {
        try {
            fh.h hVar = this.f30854b;
            com.google.android.gms.common.api.c cVar = zVar.f30902b;
            hVar.getClass();
            try {
                hVar.D0(cVar);
            } catch (DeadObjectException e13) {
                hVar.C0(new Status(8, e13.getLocalizedMessage(), null, null));
                throw e13;
            } catch (RemoteException e14) {
                hVar.C0(new Status(8, e14.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e15) {
            b(e15);
        }
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void d(tb.l lVar, boolean z13) {
        Boolean valueOf = Boolean.valueOf(z13);
        Map map = (Map) lVar.f116986b;
        fh.h hVar = this.f30854b;
        map.put(hVar, valueOf);
        hVar.y0(new s(lVar, hVar));
    }
}
