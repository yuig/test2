package com.google.android.recaptcha.internal;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class zzju extends zzjv implements Serializable {
    final byte[] zza;

    public zzju(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(zzji.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i13 = bArr[0] & 255;
        int i14 = bArr[1] & 255;
        int i15 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i13 | (i14 << 8) | (i15 << 16);
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zzb() {
        return this.zza.length * 8;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final boolean zzc(zzjv zzjvVar) {
        if (this.zza.length != zzjvVar.zze().length) {
            return false;
        }
        boolean z13 = true;
        int i13 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i13 >= bArr.length) {
                return z13;
            }
            z13 &= bArr[i13] == zzjvVar.zze()[i13];
            i13++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final byte[] zze() {
        return this.zza;
    }
}
