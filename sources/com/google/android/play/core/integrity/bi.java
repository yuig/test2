package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
class bi extends nk.n {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f33463a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f33464b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.f33464b = bnVar;
        this.f33463a = taskCompletionSource;
    }

    @Override // nk.o
    public final void b(Bundle bundle) {
        this.f33464b.f33472a.d(this.f33463a);
    }

    @Override // nk.o
    public void c(Bundle bundle) {
        this.f33464b.f33472a.d(this.f33463a);
    }

    @Override // nk.o
    public final void d(Bundle bundle) {
        this.f33464b.f33472a.d(this.f33463a);
    }

    @Override // nk.o
    public void e(Bundle bundle) {
        this.f33464b.f33472a.d(this.f33463a);
    }
}
