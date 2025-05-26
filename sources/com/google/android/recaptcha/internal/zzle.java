package com.google.android.recaptcha.internal;

import a.a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class zzle implements Iterable, Serializable {
    public static final zzle zzb = new zzlc(zznl.zzb);
    private int zza = 0;

    static {
        int i13 = zzks.zza;
    }

    public static int zzi(int i13, int i14, int i15) {
        int i16 = i14 - i13;
        if ((i13 | i14 | i16 | (i15 - i14)) >= 0) {
            return i16;
        }
        if (i13 < 0) {
            throw new IndexOutOfBoundsException(a.e("Beginning index: ", i13, " < 0"));
        }
        if (i14 < i13) {
            throw new IndexOutOfBoundsException(a.f("Beginning index larger than ending index: ", i13, ", ", i14));
        }
        throw new IndexOutOfBoundsException(a.f("End index: ", i14, " >= ", i15));
    }

    public static zzle zzk(byte[] bArr, int i13, int i14) {
        zzi(i13, i13 + i14, bArr.length);
        byte[] bArr2 = new byte[i14];
        System.arraycopy(bArr, i13, bArr2, 0, i14);
        return new zzlc(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i13 = this.zza;
        if (i13 == 0) {
            int zzd = zzd();
            i13 = zzf(zzd, 0, zzd);
            if (i13 == 0) {
                i13 = 1;
            }
            this.zza = i13;
        }
        return i13;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzkx(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        return a.p(a.v("<ByteString@", Integer.toHexString(System.identityHashCode(this)), " size=", zzd(), " contents=\""), zzd() <= 50 ? zzpg.zza(this) : zzpg.zza(zzg(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i13);

    public abstract byte zzb(int i13);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i13, int i14, int i15);

    public abstract int zzf(int i13, int i14, int i15);

    public abstract zzle zzg(int i13, int i14);

    public abstract void zzh(zzkw zzkwVar);

    public final int zzj() {
        return this.zza;
    }

    public final byte[] zzl() {
        int zzd = zzd();
        if (zzd == 0) {
            return zznl.zzb;
        }
        byte[] bArr = new byte[zzd];
        zze(bArr, 0, 0, zzd);
        return bArr;
    }
}
