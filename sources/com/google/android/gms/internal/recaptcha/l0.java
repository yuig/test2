package com.google.android.gms.internal.recaptcha;

/* loaded from: classes3.dex */
public final class l0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public p0[] f31768a;

    @Override // com.google.android.gms.internal.recaptcha.p0
    public final boolean zza(Class cls) {
        for (p0 p0Var : this.f31768a) {
            if (p0Var.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.recaptcha.p0
    public final q0 zzb(Class cls) {
        for (p0 p0Var : this.f31768a) {
            if (p0Var.zza(cls)) {
                return p0Var.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
