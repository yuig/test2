package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class m0 extends r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f30852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(q qVar, Feature[] featureArr, boolean z13, int i13) {
        super(featureArr, z13, i13);
        this.f30852d = qVar;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void b(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        ((o) this.f30852d.f30859c).accept(cVar, taskCompletionSource);
    }
}
