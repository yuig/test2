package com.google.android.recaptcha.internal;

import a.a;

/* loaded from: classes3.dex */
class zzlc extends zzlb {
    protected final byte[] zza;

    public zzlc(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzle) || zzd() != ((zzle) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzlc)) {
            return obj.equals(this);
        }
        zzlc zzlcVar = (zzlc) obj;
        int zzj = zzj();
        int zzj2 = zzlcVar.zzj();
        if (zzj != 0 && zzj2 != 0 && zzj != zzj2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzlcVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzlcVar.zzd()) {
            throw new IllegalArgumentException(a.f("Ran off end of other: 0, ", zzd, ", ", zzlcVar.zzd()));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlcVar.zza;
        zzlcVar.zzc();
        int i13 = 0;
        int i14 = 0;
        while (i13 < zzd) {
            if (bArr[i13] != bArr2[i14]) {
                return false;
            }
            i13++;
            i14++;
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public byte zza(int i13) {
        return this.zza[i13];
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public byte zzb(int i13) {
        return this.zza[i13];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public void zze(byte[] bArr, int i13, int i14, int i15) {
        System.arraycopy(this.zza, 0, bArr, 0, i15);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final int zzf(int i13, int i14, int i15) {
        return zznl.zzb(i13, this.zza, 0, i15);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final zzle zzg(int i13, int i14) {
        int zzi = zzle.zzi(0, i14, zzd());
        return zzi == 0 ? zzle.zzb : new zzkz(this.zza, 0, zzi);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final void zzh(zzkw zzkwVar) {
        ((zzlk) zzkwVar).zzc(this.zza, 0, zzd());
    }
}
