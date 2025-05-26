package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
public final class c0 extends com.google.android.gms.common.api.i {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.f f30799b;

    public c0(com.google.android.gms.common.api.f fVar) {
        this.f30799b = fVar;
    }

    public final fh.h a(fh.g gVar) {
        com.google.android.gms.common.api.f fVar = this.f30799b;
        fVar.getClass();
        boolean z13 = true;
        if (!gVar.f30781i && !((Boolean) BasePendingResult.f30772j.get()).booleanValue()) {
            z13 = false;
        }
        gVar.f30781i = z13;
        f fVar2 = fVar.f30770j;
        fVar2.getClass();
        i0 i0Var = new i0(new o0(gVar), fVar2.f30814i.get(), fVar);
        bi.f fVar3 = fVar2.f30819n;
        fVar3.sendMessage(fVar3.obtainMessage(4, i0Var));
        return gVar;
    }
}
