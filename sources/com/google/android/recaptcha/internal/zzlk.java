package com.google.android.recaptcha.internal;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
final class zzlk extends zzln {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzlk(byte[] bArr, int i13, int i14) {
        super(null);
        int length = bArr.length;
        if (((length - i14) | i14) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i14)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i14;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzb(byte b13) {
        try {
            byte[] bArr = this.zzb;
            int i13 = this.zzd;
            this.zzd = i13 + 1;
            bArr[i13] = b13;
        } catch (IndexOutOfBoundsException e13) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e13);
        }
    }

    public final void zzc(byte[] bArr, int i13, int i14) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i14);
            this.zzd += i14;
        } catch (IndexOutOfBoundsException e13) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i14)), e13);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzd(int i13, boolean z13) {
        zzt(i13 << 3);
        zzb(z13 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zze(int i13, zzle zzleVar) {
        zzt((i13 << 3) | 2);
        zzt(zzleVar.zzd());
        zzleVar.zzh(this);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzf(int i13, int i14) {
        zzt((i13 << 3) | 5);
        zzg(i14);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzg(int i13) {
        try {
            byte[] bArr = this.zzb;
            int i14 = this.zzd;
            bArr[i14] = (byte) (i13 & 255);
            bArr[i14 + 1] = (byte) ((i13 >> 8) & 255);
            bArr[i14 + 2] = (byte) ((i13 >> 16) & 255);
            this.zzd = i14 + 4;
            bArr[i14 + 3] = (byte) ((i13 >> 24) & 255);
        } catch (IndexOutOfBoundsException e13) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e13);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzh(int i13, long j13) {
        zzt((i13 << 3) | 1);
        zzi(j13);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzi(long j13) {
        try {
            byte[] bArr = this.zzb;
            int i13 = this.zzd;
            bArr[i13] = (byte) (((int) j13) & 255);
            bArr[i13 + 1] = (byte) (((int) (j13 >> 8)) & 255);
            bArr[i13 + 2] = (byte) (((int) (j13 >> 16)) & 255);
            bArr[i13 + 3] = (byte) (((int) (j13 >> 24)) & 255);
            bArr[i13 + 4] = (byte) (((int) (j13 >> 32)) & 255);
            bArr[i13 + 5] = (byte) (((int) (j13 >> 40)) & 255);
            bArr[i13 + 6] = (byte) (((int) (j13 >> 48)) & 255);
            this.zzd = i13 + 8;
            bArr[i13 + 7] = (byte) (((int) (j13 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e13) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e13);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzj(int i13, int i14) {
        zzt(i13 << 3);
        zzk(i14);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzk(int i13) {
        if (i13 >= 0) {
            zzt(i13);
        } else {
            zzv(i13);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzl(byte[] bArr, int i13, int i14) {
        zzc(bArr, 0, i14);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzm(int i13, zzoi zzoiVar, zzow zzowVar) {
        zzt((i13 << 3) | 2);
        zzt(((zzko) zzoiVar).zza(zzowVar));
        zzowVar.zzj(zzoiVar, this.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzn(int i13, zzoi zzoiVar) {
        zzt(11);
        zzs(2, i13);
        zzt(26);
        zzt(zzoiVar.zzo());
        zzoiVar.zze(this);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzo(int i13, zzle zzleVar) {
        zzt(11);
        zzs(2, i13);
        zze(3, zzleVar);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzp(int i13, String str) {
        zzt((i13 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i13 = this.zzd;
        try {
            int zzA = zzln.zzA(str.length() * 3);
            int zzA2 = zzln.zzA(str.length());
            if (zzA2 != zzA) {
                zzt(zzpv.zzc(str));
                byte[] bArr = this.zzb;
                int i14 = this.zzd;
                this.zzd = zzpv.zzb(str, bArr, i14, this.zzc - i14);
                return;
            }
            int i15 = i13 + zzA2;
            this.zzd = i15;
            int zzb = zzpv.zzb(str, this.zzb, i15, this.zzc - i15);
            this.zzd = i13;
            zzt((zzb - i13) - zzA2);
            this.zzd = zzb;
        } catch (zzpu e13) {
            this.zzd = i13;
            zzD(str, e13);
        } catch (IndexOutOfBoundsException e14) {
            throw new zzll(e14);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzr(int i13, int i14) {
        zzt((i13 << 3) | i14);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzs(int i13, int i14) {
        zzt(i13 << 3);
        zzt(i14);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzt(int i13) {
        while ((i13 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i14 = this.zzd;
                this.zzd = i14 + 1;
                bArr[i14] = (byte) ((i13 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) & 255);
                i13 >>>= 7;
            } catch (IndexOutOfBoundsException e13) {
                throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e13);
            }
        }
        byte[] bArr2 = this.zzb;
        int i15 = this.zzd;
        this.zzd = i15 + 1;
        bArr2[i15] = (byte) i13;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzu(int i13, long j13) {
        zzt(i13 << 3);
        zzv(j13);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzv(long j13) {
        boolean z13;
        z13 = zzln.zzc;
        if (!z13 || this.zzc - this.zzd < 10) {
            while ((j13 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i13 = this.zzd;
                    this.zzd = i13 + 1;
                    bArr[i13] = (byte) ((((int) j13) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) & 255);
                    j13 >>>= 7;
                } catch (IndexOutOfBoundsException e13) {
                    throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e13);
                }
            }
            byte[] bArr2 = this.zzb;
            int i14 = this.zzd;
            this.zzd = i14 + 1;
            bArr2[i14] = (byte) j13;
            return;
        }
        while (true) {
            int i15 = (int) j13;
            if ((j13 & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i16 = this.zzd;
                this.zzd = i16 + 1;
                zzps.zzn(bArr3, i16, (byte) i15);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i17 = this.zzd;
            this.zzd = i17 + 1;
            zzps.zzn(bArr4, i17, (byte) ((i15 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) & 255));
            j13 >>>= 7;
        }
    }
}
