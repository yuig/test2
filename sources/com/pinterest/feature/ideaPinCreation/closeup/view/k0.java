package com.pinterest.feature.ideaPinCreation.closeup.view;

/* loaded from: classes5.dex */
public final class k0 extends hs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f46211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46212b;

    public k0(m0 m0Var, int i13) {
        this.f46211a = m0Var;
        this.f46212b = i13;
    }

    @Override // hs1.c
    public final void e() {
        com.google.android.gms.internal.measurement.x xVar = this.f46211a.f46244l;
        Object obj = xVar.f31694b;
        ((Boolean[]) obj)[this.f46212b] = Boolean.TRUE;
        ((uk2.f) xVar.f31695c).c((Boolean[]) obj);
    }
}
