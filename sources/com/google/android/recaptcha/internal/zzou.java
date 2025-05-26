package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
final class zzou implements zzof {
    private final zzoi zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzou(zzoi zzoiVar, String str, Object[] objArr) {
        this.zza = zzoiVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i13 = charAt & 8191;
        int i14 = 1;
        int i15 = 13;
        while (true) {
            int i16 = i14 + 1;
            char charAt2 = str.charAt(i14);
            if (charAt2 < 55296) {
                this.zzd = i13 | (charAt2 << i15);
                return;
            } else {
                i13 |= (charAt2 & 8191) << i15;
                i15 += 13;
                i14 = i16;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final zzoi zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.recaptcha.internal.zzof
    public final int zzc() {
        int i13 = this.zzd;
        if ((i13 & 1) != 0) {
            return 1;
        }
        return (i13 & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
