package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public class zzkq implements zzoq {
    private static final zzmo zza;

    static {
        int i13 = zzmo.zzb;
        int i14 = zzos.zza;
        zza = zzmo.zza;
    }

    public zzoi zza(byte[] bArr, int i13, int i14, zzmo zzmoVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzoq
    public final /* synthetic */ Object zzb(byte[] bArr) {
        zzoi zza2 = zza(bArr, 0, bArr.length, zza);
        if (zza2 == null || zza2.zzp()) {
            return zza2;
        }
        throw new zzpk((zzko) zza2).zza();
    }
}
