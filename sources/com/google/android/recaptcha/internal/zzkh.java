package com.google.android.recaptcha.internal;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.IOException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes3.dex */
public abstract class zzkh {
    private static final zzkh zza = new zzke("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzkh zzb = new zzke("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    static {
        char[] cArr;
        new zzkg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzkg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzkd zzkdVar = new zzkd("base16()", "0123456789ABCDEF".toCharArray());
        new zzkg(zzkdVar, null);
        char[] cArr2 = new char[BitmapUtils.BITMAP_TO_JPEG_SIZE];
        cArr = zzkdVar.zzf;
        zzjf.zza(cArr.length == 16);
        for (int i13 = 0; i13 < 256; i13++) {
            cArr2[i13] = zzkdVar.zza(i13 >>> 4);
            cArr2[i13 | RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER] = zzkdVar.zza(i13 & 15);
        }
    }

    public static zzkh zzg() {
        return zza;
    }

    public static zzkh zzh() {
        return zzb;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence);

    public abstract void zzb(Appendable appendable, byte[] bArr, int i13, int i14);

    public abstract int zzc(int i13);

    public abstract int zzd(int i13);

    public CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i13, int i14) {
        zzjf.zzd(0, i14, bArr.length);
        StringBuilder sb3 = new StringBuilder(zzd(i14));
        try {
            zzb(sb3, bArr, 0, i14);
            return sb3.toString();
        } catch (IOException e13) {
            throw new AssertionError(e13);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence zze = zze(charSequence);
            int zzc = zzc(zze.length());
            byte[] bArr = new byte[zzc];
            int zza2 = zza(bArr, zze);
            if (zza2 == zzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[zza2];
            System.arraycopy(bArr, 0, bArr2, 0, zza2);
            return bArr2;
        } catch (zzkf e13) {
            throw new IllegalArgumentException(e13);
        }
    }
}
