package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class v6 implements b7 {

    /* renamed from: a, reason: collision with root package name */
    public b7[] f31673a;

    @Override // com.google.android.gms.internal.measurement.b7
    public final y6 zza(Class cls) {
        for (b7 b7Var : this.f31673a) {
            if (b7Var.zzb(cls)) {
                return b7Var.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.b7
    public final boolean zzb(Class cls) {
        for (b7 b7Var : this.f31673a) {
            if (b7Var.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
