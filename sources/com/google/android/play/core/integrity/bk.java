package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class bk extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f33466c;

    /* renamed from: d, reason: collision with root package name */
    private final nk.w f33467d;

    /* renamed from: e, reason: collision with root package name */
    private final long f33468e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j13) {
        super(bnVar, taskCompletionSource);
        this.f33466c = bnVar;
        this.f33467d = new nk.w("OnRequestIntegrityTokenCallback");
        this.f33468e = j13;
    }

    @Override // com.google.android.play.core.integrity.bi, nk.o
    public final void c(Bundle bundle) {
        k kVar;
        String str;
        super.c(bundle);
        this.f33467d.c("onRequestExpressIntegrityToken", new Object[0]);
        kVar = this.f33466c.f33477f;
        ApiException a13 = kVar.a(bundle);
        if (a13 != null) {
            this.f33463a.trySetException(a13);
            return;
        }
        long j13 = bundle.getLong("request.token.sid");
        str = this.f33466c.f33474c;
        bj bjVar = new bj(this, str, j13);
        TaskCompletionSource taskCompletionSource = this.f33463a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
