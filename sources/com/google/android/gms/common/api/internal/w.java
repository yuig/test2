package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
public final class w implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f30892a;

    public w(f fVar) {
        this.f30892a = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z13) {
        bi.f fVar = this.f30892a.f30819n;
        fVar.sendMessage(fVar.obtainMessage(1, Boolean.valueOf(z13)));
    }
}
