package com.google.android.recaptcha.internal;

import a.a;

/* loaded from: classes3.dex */
final class zzke extends zzkg {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzke(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.recaptcha.internal.zzkd r0 = new com.google.android.recaptcha.internal.zzkd
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = com.google.android.recaptcha.internal.zzkd.zze(r0)
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            com.google.android.recaptcha.internal.zzjf.zza(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzke.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    public final int zza(byte[] bArr, CharSequence charSequence) {
        CharSequence zze = zze(charSequence);
        if (!this.zza.zzc(zze.length())) {
            throw new zzkf(a.d("Invalid input length ", zze.length()));
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < zze.length()) {
            int i15 = i14 + 1;
            int zzb = (this.zza.zzb(zze.charAt(i13)) << 18) | (this.zza.zzb(zze.charAt(i13 + 1)) << 12);
            bArr[i14] = (byte) (zzb >>> 16);
            int i16 = i13 + 2;
            if (i16 < zze.length()) {
                int i17 = i13 + 3;
                int zzb2 = zzb | (this.zza.zzb(zze.charAt(i16)) << 6);
                int i18 = i14 + 2;
                bArr[i15] = (byte) ((zzb2 >>> 8) & 255);
                if (i17 < zze.length()) {
                    i13 += 4;
                    i14 += 3;
                    bArr[i18] = (byte) ((zzb2 | this.zza.zzb(zze.charAt(i17))) & 255);
                } else {
                    i14 = i18;
                    i13 = i17;
                }
            } else {
                i13 = i16;
                i14 = i15;
            }
        }
        return i14;
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    public final void zzb(Appendable appendable, byte[] bArr, int i13, int i14) {
        int i15 = 0;
        zzjf.zzd(0, i14, bArr.length);
        for (int i16 = i14; i16 >= 3; i16 -= 3) {
            int i17 = bArr[i15] & 255;
            int i18 = ((bArr[i15 + 1] & 255) << 8) | (i17 << 16) | (bArr[i15 + 2] & 255);
            appendable.append(this.zza.zza(i18 >>> 18));
            appendable.append(this.zza.zza((i18 >>> 12) & 63));
            appendable.append(this.zza.zza((i18 >>> 6) & 63));
            appendable.append(this.zza.zza(i18 & 63));
            i15 += 3;
        }
        if (i15 < i14) {
            zzf(appendable, bArr, i15, i14 - i15);
        }
    }
}
