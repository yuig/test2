package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class bl extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f33469c;

    /* renamed from: d, reason: collision with root package name */
    private final nk.w f33470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f33469c = bnVar;
        this.f33470d = new nk.w("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, nk.o
    public final void e(Bundle bundle) {
        k kVar;
        super.e(bundle);
        this.f33470d.c("onWarmUpExpressIntegrityToken", new Object[0]);
        kVar = this.f33469c.f33477f;
        ApiException a13 = kVar.a(bundle);
        if (a13 != null) {
            this.f33463a.trySetException(a13);
        } else {
            this.f33463a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
