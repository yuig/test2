package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
abstract class bm extends nk.x {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f33471f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f33471f = bnVar;
    }

    @Override // nk.x
    public final void a(Exception exc) {
        if (!(exc instanceof com.google.android.play.integrity.internal.af)) {
            super.a(exc);
        } else if (bn.k(this.f33471f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
