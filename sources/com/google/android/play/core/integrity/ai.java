package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class ai extends nk.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f33406a;

    /* renamed from: b, reason: collision with root package name */
    private final nk.w f33407b;

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f33408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f33406a = ajVar;
        this.f33407b = new nk.w("OnRequestIntegrityTokenCallback");
        this.f33408c = taskCompletionSource;
    }

    @Override // nk.t
    public final void b(Bundle bundle) {
        k kVar;
        String str;
        this.f33406a.f33409a.d(this.f33408c);
        this.f33407b.c("onRequestIntegrityToken", new Object[0]);
        kVar = this.f33406a.f33413e;
        ApiException a13 = kVar.a(bundle);
        if (a13 != null) {
            this.f33408c.trySetException(a13);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f33408c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        long j13 = bundle.getLong("request.token.sid");
        str = this.f33406a.f33411c;
        ah ahVar = new ah(this, str, j13);
        TaskCompletionSource taskCompletionSource = this.f33408c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
