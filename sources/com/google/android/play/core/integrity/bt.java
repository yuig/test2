package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes3.dex */
final class bt {

    /* renamed from: a, reason: collision with root package name */
    private final bn f33488a;

    public bt(bn bnVar) {
        this.f33488a = bnVar;
    }

    public final /* synthetic */ Task a(long j13, long j14, int i13, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f33488a.d(standardIntegrityTokenRequest.a(), j13, j14, 0);
    }
}
