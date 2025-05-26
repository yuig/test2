package com.google.android.recaptcha.internal;

import a.a;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes3.dex */
class zzkg extends zzkh {
    final zzkd zza;
    final Character zzb;

    public zzkg(zzkd zzkdVar, Character ch3) {
        this.zza = zzkdVar;
        if (ch3 != null && zzkdVar.zzd('=')) {
            throw new IllegalArgumentException(zzji.zza("Padding character %s was already in alphabet", ch3));
        }
        this.zzb = ch3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkg) {
            zzkg zzkgVar = (zzkg) obj;
            if (this.zza.equals(zzkgVar.zza) && Objects.equals(this.zzb, zzkgVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch3 = this.zzb;
        return Objects.hashCode(ch3) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BaseEncoding.");
        sb3.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb3.append(".omitPadding()");
            } else {
                sb3.append(".withPadChar('");
                sb3.append(this.zzb);
                sb3.append("')");
            }
        }
        return sb3.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public int zza(byte[] bArr, CharSequence charSequence) {
        zzkd zzkdVar;
        CharSequence zze = zze(charSequence);
        if (!this.zza.zzc(zze.length())) {
            throw new zzkf(a.d("Invalid input length ", zze.length()));
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < zze.length()) {
            long j13 = 0;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                zzkdVar = this.zza;
                if (i15 >= zzkdVar.zzc) {
                    break;
                }
                j13 <<= zzkdVar.zzb;
                if (i13 + i15 < zze.length()) {
                    j13 |= this.zza.zzb(zze.charAt(i16 + i13));
                    i16++;
                }
                i15++;
            }
            int i17 = zzkdVar.zzd;
            int i18 = i16 * zzkdVar.zzb;
            int i19 = (i17 - 1) * 8;
            while (i19 >= (i17 * 8) - i18) {
                bArr[i14] = (byte) ((j13 >>> i19) & 255);
                i19 -= 8;
                i14++;
            }
            i13 += this.zza.zzc;
        }
        return i14;
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public void zzb(Appendable appendable, byte[] bArr, int i13, int i14) {
        int i15 = 0;
        zzjf.zzd(0, i14, bArr.length);
        while (i15 < i14) {
            zzf(appendable, bArr, i15, Math.min(this.zza.zzd, i14 - i15));
            i15 += this.zza.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzc(int i13) {
        return (int) (((this.zza.zzb * i13) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzd(int i13) {
        zzkd zzkdVar = this.zza;
        return zzkdVar.zzc * zzkj.zza(i13, zzkdVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i13, int i14) {
        zzjf.zzd(i13, i13 + i14, bArr.length);
        int i15 = 0;
        zzjf.zza(i14 <= this.zza.zzd);
        long j13 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            j13 = (j13 | (bArr[i13 + i16] & 255)) << 8;
        }
        int i17 = (i14 + 1) * 8;
        zzkd zzkdVar = this.zza;
        while (i15 < i14 * 8) {
            long j14 = j13 >>> ((i17 - zzkdVar.zzb) - i15);
            zzkd zzkdVar2 = this.zza;
            appendable.append(zzkdVar2.zza(((int) j14) & zzkdVar2.zza));
            i15 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i15 < this.zza.zzd * 8) {
                this.zzb.getClass();
                appendable.append('=');
                i15 += this.zza.zzb;
            }
        }
    }

    public zzkg(String str, String str2, Character ch3) {
        this(new zzkd(str, str2.toCharArray()), ch3);
    }
}
