package com.google.android.recaptcha.internal;

import a.c;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzpm {
    private static final zzpm zza = new zzpm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzpm(int i13, int[] iArr, Object[] objArr, boolean z13) {
        this.zze = -1;
        this.zzb = i13;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z13;
    }

    public static zzpm zzc() {
        return zza;
    }

    public static zzpm zze(zzpm zzpmVar, zzpm zzpmVar2) {
        int i13 = zzpmVar.zzb + zzpmVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzpmVar.zzc, i13);
        System.arraycopy(zzpmVar2.zzc, 0, copyOf, zzpmVar.zzb, zzpmVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzpmVar.zzd, i13);
        System.arraycopy(zzpmVar2.zzd, 0, copyOf2, zzpmVar.zzb, zzpmVar2.zzb);
        return new zzpm(i13, copyOf, copyOf2, true);
    }

    public static zzpm zzf() {
        return new zzpm(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i13) {
        int[] iArr = this.zzc;
        if (i13 > iArr.length) {
            int i14 = this.zzb;
            int i15 = (i14 / 2) + i14;
            if (i15 >= i13) {
                i13 = i15;
            }
            if (i13 < 8) {
                i13 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i13);
            this.zzd = Arrays.copyOf(this.zzd, i13);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzpm)) {
            return false;
        }
        zzpm zzpmVar = (zzpm) obj;
        int i13 = this.zzb;
        if (i13 == zzpmVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzpmVar.zzc;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzpmVar.zzd;
                    int i15 = this.zzb;
                    for (int i16 = 0; i16 < i15; i16++) {
                        if (objArr[i16].equals(objArr2[i16])) {
                        }
                    }
                    return true;
                }
                if (iArr[i14] != iArr2[i14]) {
                    break;
                }
                i14++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.zzb;
        int i14 = i13 + 527;
        int[] iArr = this.zzc;
        int i15 = 17;
        int i16 = 17;
        for (int i17 = 0; i17 < i13; i17++) {
            i16 = (i16 * 31) + iArr[i17];
        }
        int i18 = ((i14 * 31) + i16) * 31;
        Object[] objArr = this.zzd;
        int i19 = this.zzb;
        for (int i23 = 0; i23 < i19; i23++) {
            i15 = (i15 * 31) + objArr[i23].hashCode();
        }
        return i18 + i15;
    }

    public final int zza() {
        int zzA;
        int zzB;
        int zzA2;
        int i13 = this.zze;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.zzb; i15++) {
            int i16 = this.zzc[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 != 0) {
                if (i18 == 1) {
                    ((Long) this.zzd[i15]).getClass();
                    zzA2 = zzln.zzA(i17 << 3) + 8;
                } else if (i18 == 2) {
                    int i19 = i17 << 3;
                    zzle zzleVar = (zzle) this.zzd[i15];
                    int zzA3 = zzln.zzA(i19);
                    int zzd = zzleVar.zzd();
                    i14 = zzln.zzA(zzd) + zzd + zzA3 + i14;
                } else if (i18 == 3) {
                    int zzA4 = zzln.zzA(i17 << 3);
                    zzA = zzA4 + zzA4;
                    zzB = ((zzpm) this.zzd[i15]).zza();
                } else {
                    if (i18 != 5) {
                        throw new IllegalStateException(new zznm("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i15]).getClass();
                    zzA2 = zzln.zzA(i17 << 3) + 4;
                }
                i14 = zzA2 + i14;
            } else {
                int i23 = i17 << 3;
                long longValue = ((Long) this.zzd[i15]).longValue();
                zzA = zzln.zzA(i23);
                zzB = zzln.zzB(longValue);
            }
            i14 = zzB + zzA + i14;
        }
        this.zze = i14;
        return i14;
    }

    public final int zzb() {
        int i13 = this.zze;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.zzb; i15++) {
            int i16 = this.zzc[i15] >>> 3;
            zzle zzleVar = (zzle) this.zzd[i15];
            int zzA = zzln.zzA(8);
            int zzA2 = zzln.zzA(i16) + zzln.zzA(16);
            int zzA3 = zzln.zzA(24);
            int zzd = zzleVar.zzd();
            i14 += zzA + zzA + zzA2 + c.b(zzd, zzd, zzA3);
        }
        this.zze = i14;
        return i14;
    }

    public final zzpm zzd(zzpm zzpmVar) {
        if (zzpmVar.equals(zza)) {
            return this;
        }
        zzg();
        int i13 = this.zzb + zzpmVar.zzb;
        zzm(i13);
        System.arraycopy(zzpmVar.zzc, 0, this.zzc, this.zzb, zzpmVar.zzb);
        System.arraycopy(zzpmVar.zzd, 0, this.zzd, this.zzb, zzpmVar.zzb);
        this.zzb = i13;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb3, int i13) {
        for (int i14 = 0; i14 < this.zzb; i14++) {
            zzok.zzb(sb3, i13, String.valueOf(this.zzc[i14] >>> 3), this.zzd[i14]);
        }
    }

    public final void zzj(int i13, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i14 = this.zzb;
        iArr[i14] = i13;
        this.zzd[i14] = obj;
        this.zzb = i14 + 1;
    }

    public final void zzk(zzpy zzpyVar) {
        for (int i13 = 0; i13 < this.zzb; i13++) {
            zzpyVar.zzw(this.zzc[i13] >>> 3, this.zzd[i13]);
        }
    }

    public final void zzl(zzpy zzpyVar) {
        if (this.zzb != 0) {
            for (int i13 = 0; i13 < this.zzb; i13++) {
                int i14 = this.zzc[i13];
                Object obj = this.zzd[i13];
                int i15 = i14 & 7;
                int i16 = i14 >>> 3;
                if (i15 == 0) {
                    zzpyVar.zzt(i16, ((Long) obj).longValue());
                } else if (i15 == 1) {
                    zzpyVar.zzm(i16, ((Long) obj).longValue());
                } else if (i15 == 2) {
                    zzpyVar.zzd(i16, (zzle) obj);
                } else if (i15 == 3) {
                    zzpyVar.zzF(i16);
                    ((zzpm) obj).zzl(zzpyVar);
                    zzpyVar.zzh(i16);
                } else {
                    if (i15 != 5) {
                        throw new RuntimeException(new zznm("Protocol message tag had invalid wire type."));
                    }
                    zzpyVar.zzk(i16, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzpm() {
        this(0, new int[8], new Object[8], true);
    }
}
