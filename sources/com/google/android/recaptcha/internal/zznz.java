package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
final class zznz implements zzog {
    private final zzog[] zza;

    public zznz(zzog... zzogVarArr) {
        this.zza = zzogVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zzog
    public final zzof zzb(Class cls) {
        for (int i13 = 0; i13 < 2; i13++) {
            zzog zzogVar = this.zza[i13];
            if (zzogVar.zzc(cls)) {
                return zzogVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.recaptcha.internal.zzog
    public final boolean zzc(Class cls) {
        for (int i13 = 0; i13 < 2; i13++) {
            if (this.zza[i13].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
