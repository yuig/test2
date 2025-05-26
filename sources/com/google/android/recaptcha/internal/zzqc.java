package com.google.android.recaptcha.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

/* loaded from: classes3.dex */
public final class zzqc {
    protected static final Charset zza = StandardCharsets.UTF_16;
    protected int[] zzb;
    protected int[] zzc;
    private final int[] zzd = {511133343, 1277647508, 107287496, 338123662};
    private byte[] zze;
    private byte[] zzf;
    private int zzg;

    public zzqc() {
    }

    public static int zza(int i13, int i14) {
        if (i13 % 2 != 0) {
            return (i13 | i14) - (i13 & i14);
        }
        return ((~i13) & i14) | ((~i14) & i13);
    }

    public static String zze(String str, byte[] bArr, zzqd zzqdVar) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr2 = new byte[12];
        int length = decode.length - 12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(decode, 0, bArr2, 0, 12);
        System.arraycopy(decode, 12, bArr3, 0, length);
        return new String(new zzqc(bArr, bArr2).zzd(bArr3), zza);
    }

    public static String zzf(String str, byte[] bArr, zzqd zzqdVar) {
        byte[] bArr2 = new byte[12];
        new SecureRandom().nextBytes(bArr2);
        byte[] zzd = new zzqc(bArr, bArr2).zzd(str.getBytes(zza));
        int length = zzd.length;
        byte[] bArr3 = new byte[length + 12];
        System.arraycopy(bArr2, 0, bArr3, 0, 12);
        System.arraycopy(zzd, 0, bArr3, 12, length);
        return Base64.encodeToString(bArr3, 2);
    }

    private static final int zzg(byte[] bArr, int i13) {
        int i14 = bArr[i13] & 255;
        int i15 = bArr[i13 + 1] & 255;
        int i16 = bArr[i13 + 2] & 255;
        return ((bArr[i13 + 3] & 255) << 24) | (i15 << 8) | i14 | (i16 << 16);
    }

    public final void zzb(int i13, int i14, int i15, int i16) {
        zzc(i13, i14, i16, 16);
        zzc(i15, i16, i14, 12);
        zzc(i13, i14, i16, 8);
        zzc(i15, i16, i14, 7);
    }

    public final void zzc(int i13, int i14, int i15, int i16) {
        int[] iArr = this.zzb;
        int i17 = iArr[i13] + iArr[i14];
        iArr[i13] = i17;
        int zza2 = zza(iArr[i15], i17);
        iArr[i15] = zza2;
        iArr[i15] = (zza2 << i16) | (zza2 >>> (32 - i16));
    }

    public final byte[] zzd(byte[] bArr) {
        if (this.zzg != 1) {
            throw new IllegalStateException();
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i13 = 0;
        while (length > 0) {
            int[] iArr = this.zzc;
            int[] iArr2 = this.zzb;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr2, 0, 16);
            this.zzb[12] = this.zzg;
            for (int i14 = 0; i14 < 10; i14++) {
                zzb(0, 4, 8, 12);
                zzb(1, 5, 9, 13);
                zzb(2, 6, 10, 14);
                zzb(3, 7, 11, 15);
                zzb(0, 5, 10, 15);
                zzb(1, 6, 11, 12);
                zzb(2, 7, 8, 13);
                zzb(3, 4, 9, 14);
            }
            byte[] bArr3 = new byte[64];
            for (int i15 = 0; i15 < 16; i15++) {
                int i16 = this.zzb[i15];
                int i17 = i15 * 4;
                bArr3[i17] = (byte) (i16 & 255);
                bArr3[i17 + 1] = (byte) ((i16 >> 8) & 255);
                bArr3[i17 + 2] = (byte) ((i16 >> 16) & 255);
                bArr3[i17 + 3] = (byte) ((i16 >> 24) & 255);
            }
            for (int i18 = 0; i18 < Math.min(64, length); i18++) {
                int i19 = i13 + i18;
                bArr2[i19] = (byte) zza(bArr3[i18], bArr[i19]);
            }
            this.zzg++;
            length -= 64;
            i13 += 64;
        }
        return bArr2;
    }

    public zzqc(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException();
        }
        this.zze = bArr;
        this.zzg = 1;
        this.zzf = bArr2;
        this.zzb = new int[16];
        for (int i13 = 0; i13 < 4; i13++) {
            this.zzb[i13] = zza(this.zzd[i13], 2131181306);
        }
        for (int i14 = 4; i14 < 12; i14++) {
            this.zzb[i14] = zzg(this.zze, (i14 - 4) * 4);
        }
        this.zzb[12] = this.zzg;
        for (int i15 = 13; i15 < 16; i15++) {
            this.zzb[i15] = zzg(this.zzf, (i15 - 13) * 4);
        }
        int[] iArr = new int[16];
        this.zzc = iArr;
        int[] iArr2 = this.zzb;
        int length = iArr2.length;
        System.arraycopy(iArr2, 0, iArr, 0, 16);
    }
}
