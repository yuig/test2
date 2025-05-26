package com.google.android.gms.internal.recaptcha;

/* loaded from: classes3.dex */
public final class s0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f31785a;

    /* renamed from: b, reason: collision with root package name */
    public final w f31786b;

    public s0(e1 e1Var, w wVar) {
        this.f31785a = e1Var;
        wVar.getClass();
        this.f31786b = wVar;
    }

    @Override // com.google.android.gms.internal.recaptcha.a1
    public final boolean a(Object obj, Object obj2) {
        e1 e1Var = this.f31785a;
        e1Var.getClass();
        c1 c1Var = ((b0) obj).zzb;
        e1Var.getClass();
        return c1Var.equals(((b0) obj2).zzb);
    }

    @Override // com.google.android.gms.internal.recaptcha.a1
    public final void b(Object obj, Object obj2) {
        b1.b(this.f31785a, obj, obj2);
    }

    @Override // com.google.android.gms.internal.recaptcha.a1
    public final void c(b0 b0Var) {
        this.f31785a.getClass();
        b0Var.zzb.getClass();
        this.f31786b.getClass();
        a.c.s(b0Var);
        throw null;
    }

    @Override // com.google.android.gms.internal.recaptcha.a1
    public final int zza(Object obj) {
        this.f31785a.getClass();
        return ((b0) obj).zzb.hashCode();
    }
}
