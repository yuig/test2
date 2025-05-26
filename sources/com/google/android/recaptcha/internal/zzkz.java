package com.google.android.recaptcha.internal;

import a.a;

/* loaded from: classes3.dex */
final class zzkz extends zzlc {
    private final int zzc;

    public zzkz(byte[] bArr, int i13, int i14) {
        super(bArr);
        zzle.zzi(0, i14, bArr.length);
        this.zzc = i14;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zza(int i13) {
        int i14 = this.zzc;
        if (((i14 - (i13 + 1)) | i13) >= 0) {
            return ((zzlc) this).zza[i13];
        }
        if (i13 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.d("Index < 0: ", i13));
        }
        throw new ArrayIndexOutOfBoundsException(a.f("Index > length: ", i13, ", ", i14));
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zzb(int i13) {
        return ((zzlc) this).zza[i13];
    }

    @Override // com.google.android.recaptcha.internal.zzlc
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final void zze(byte[] bArr, int i13, int i14, int i15) {
        System.arraycopy(((zzlc) this).zza, 0, bArr, 0, i15);
    }
}
