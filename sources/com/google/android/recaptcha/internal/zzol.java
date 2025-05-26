package com.google.android.recaptcha.internal;

import a.a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i13, int i14, zzoi zzoiVar, boolean z13, int[] iArr2, int i15, int i16, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i13;
        this.zzf = i14;
        this.zzi = zzoiVar instanceof zznd;
        boolean z14 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z14 = true;
        }
        this.zzh = z14;
        this.zzj = iArr2;
        this.zzk = i15;
        this.zzl = i16;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i13) {
        zzow zzx = zzx(i13);
        int zzu = zzu(i13) & 1048575;
        if (!zzN(obj, i13)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i13, int i14) {
        zzow zzx = zzx(i14);
        if (!zzR(obj, i13, i14)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i14) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder w13 = a.w("Field ", str, " for ", name, " not found. Known fields are ");
            w13.append(arrays);
            throw new RuntimeException(w13.toString());
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i13) {
        if (zzN(obj2, i13)) {
            int zzu = zzu(i13) & 1048575;
            Unsafe unsafe = zzb;
            long j13 = zzu;
            Object object = unsafe.getObject(obj2, j13);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i13] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i13);
            if (!zzN(obj, i13)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j13, zze);
                } else {
                    unsafe.putObject(obj, j13, object);
                }
                zzH(obj, i13);
                return;
            }
            Object object2 = unsafe.getObject(obj, j13);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j13, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i13) {
        int i14 = this.zzc[i13];
        if (zzR(obj2, i14, i13)) {
            int zzu = zzu(i13) & 1048575;
            Unsafe unsafe = zzb;
            long j13 = zzu;
            Object object = unsafe.getObject(obj2, j13);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i13] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i13);
            if (!zzR(obj, i14, i13)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j13, zze);
                } else {
                    unsafe.putObject(obj, j13, object);
                }
                zzI(obj, i14, i13);
                return;
            }
            Object object2 = unsafe.getObject(obj, j13);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j13, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i13, zzov zzovVar) {
        long j13 = i13 & 1048575;
        if (zzM(i13)) {
            zzps.zzs(obj, j13, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j13, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j13, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i13) {
        int zzr = zzr(i13);
        long j13 = 1048575 & zzr;
        if (j13 == 1048575) {
            return;
        }
        zzps.zzq(obj, j13, (1 << (zzr >>> 20)) | zzps.zzc(obj, j13));
    }

    private final void zzI(Object obj, int i13, int i14) {
        zzps.zzq(obj, zzr(i14) & 1048575, i13);
    }

    private final void zzJ(Object obj, int i13, Object obj2) {
        zzb.putObject(obj, zzu(i13) & 1048575, obj2);
        zzH(obj, i13);
    }

    private final void zzK(Object obj, int i13, int i14, Object obj2) {
        zzb.putObject(obj, zzu(i14) & 1048575, obj2);
        zzI(obj, i13, i14);
    }

    private final boolean zzL(Object obj, Object obj2, int i13) {
        return zzN(obj, i13) == zzN(obj2, i13);
    }

    private static boolean zzM(int i13) {
        return (i13 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i13) {
        int zzr = zzr(i13);
        long j13 = zzr & 1048575;
        if (j13 != 1048575) {
            return (zzps.zzc(obj, j13) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i13);
        long j14 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j14)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j14)) != 0;
            case 2:
                return zzps.zzd(obj, j14) != 0;
            case 3:
                return zzps.zzd(obj, j14) != 0;
            case 4:
                return zzps.zzc(obj, j14) != 0;
            case 5:
                return zzps.zzd(obj, j14) != 0;
            case 6:
                return zzps.zzc(obj, j14) != 0;
            case 7:
                return zzps.zzw(obj, j14);
            case 8:
                Object zzf = zzps.zzf(obj, j14);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzle) {
                    return !zzle.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzps.zzf(obj, j14) != null;
            case 10:
                return !zzle.zzb.equals(zzps.zzf(obj, j14));
            case 11:
                return zzps.zzc(obj, j14) != 0;
            case 12:
                return zzps.zzc(obj, j14) != 0;
            case 13:
                return zzps.zzc(obj, j14) != 0;
            case 14:
                return zzps.zzd(obj, j14) != 0;
            case 15:
                return zzps.zzc(obj, j14) != 0;
            case 16:
                return zzps.zzd(obj, j14) != 0;
            case 17:
                return zzps.zzf(obj, j14) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i13, int i14, int i15, int i16) {
        return i14 == 1048575 ? zzN(obj, i13) : (i15 & i16) != 0;
    }

    private static boolean zzP(Object obj, int i13, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i13 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i13, int i14) {
        return zzps.zzc(obj, (long) (zzr(i14) & 1048575)) == i13;
    }

    private static boolean zzS(Object obj, long j13) {
        return ((Boolean) zzps.zzf(obj, j13)).booleanValue();
    }

    private static final void zzT(int i13, Object obj, zzpy zzpyVar) {
        if (obj instanceof String) {
            zzpyVar.zzG(i13, (String) obj);
        } else {
            zzpyVar.zzd(i13, (zzle) obj);
        }
    }

    public static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzf = zzpm.zzf();
        zzndVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.recaptcha.internal.zzol zzm(java.lang.Class r32, com.google.android.recaptcha.internal.zzof r33, com.google.android.recaptcha.internal.zzoo r34, com.google.android.recaptcha.internal.zznv r35, com.google.android.recaptcha.internal.zzpl r36, com.google.android.recaptcha.internal.zzmp r37, com.google.android.recaptcha.internal.zzod r38) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzof, com.google.android.recaptcha.internal.zzoo, com.google.android.recaptcha.internal.zznv, com.google.android.recaptcha.internal.zzpl, com.google.android.recaptcha.internal.zzmp, com.google.android.recaptcha.internal.zzod):com.google.android.recaptcha.internal.zzol");
    }

    private static double zzn(Object obj, long j13) {
        return ((Double) zzps.zzf(obj, j13)).doubleValue();
    }

    private static float zzo(Object obj, long j13) {
        return ((Float) zzps.zzf(obj, j13)).floatValue();
    }

    private static int zzp(Object obj, long j13) {
        return ((Integer) zzps.zzf(obj, j13)).intValue();
    }

    private final int zzq(int i13) {
        if (i13 < this.zze || i13 > this.zzf) {
            return -1;
        }
        return zzs(i13, 0);
    }

    private final int zzr(int i13) {
        return this.zzc[i13 + 2];
    }

    private final int zzs(int i13, int i14) {
        int length = (this.zzc.length / 3) - 1;
        while (i14 <= length) {
            int i15 = (length + i14) >>> 1;
            int i16 = i15 * 3;
            int i17 = this.zzc[i16];
            if (i13 == i17) {
                return i16;
            }
            if (i13 < i17) {
                length = i15 - 1;
            } else {
                i14 = i15 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i13) {
        return (i13 >>> 20) & 255;
    }

    private final int zzu(int i13) {
        return this.zzc[i13 + 1];
    }

    private static long zzv(Object obj, long j13) {
        return ((Long) zzps.zzf(obj, j13)).longValue();
    }

    private final zznh zzw(int i13) {
        int i14 = i13 / 3;
        return (zznh) this.zzd[i14 + i14 + 1];
    }

    private final zzow zzx(int i13) {
        Object[] objArr = this.zzd;
        int i14 = i13 / 3;
        int i15 = i14 + i14;
        zzow zzowVar = (zzow) objArr[i15];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzb2 = zzos.zza().zzb((Class) objArr[i15 + 1]);
        this.zzd[i15] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i13, Object obj2, zzpl zzplVar, Object obj3) {
        int i14 = this.zzc[i13];
        Object zzf = zzps.zzf(obj, zzu(i13) & 1048575);
        if (zzf == null || zzw(i13) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i13) {
        int i14 = i13 / 3;
        return this.zzd[i14 + i14];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r2v40 ??), method size: 2196
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zza(java.lang.Object):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i13;
        long doubleToLongBits;
        int i14;
        int floatToIntBits;
        int zzc;
        int i15;
        int i16 = 0;
        for (int i17 = 0; i17 < this.zzc.length; i17 += 3) {
            int zzu = zzu(i17);
            int[] iArr = this.zzc;
            int i18 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i19 = iArr[i17];
            long j13 = i18;
            int i23 = 37;
            switch (zzt) {
                case 0:
                    i13 = i16 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j13));
                    byte[] bArr = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i16 = i13 + zzc;
                    break;
                case 1:
                    i14 = i16 * 53;
                    floatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j13));
                    i16 = floatToIntBits + i14;
                    break;
                case 2:
                    i13 = i16 * 53;
                    doubleToLongBits = zzps.zzd(obj, j13);
                    byte[] bArr2 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i16 = i13 + zzc;
                    break;
                case 3:
                    i13 = i16 * 53;
                    doubleToLongBits = zzps.zzd(obj, j13);
                    byte[] bArr3 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i16 = i13 + zzc;
                    break;
                case 4:
                    i13 = i16 * 53;
                    zzc = zzps.zzc(obj, j13);
                    i16 = i13 + zzc;
                    break;
                case 5:
                    i13 = i16 * 53;
                    doubleToLongBits = zzps.zzd(obj, j13);
                    byte[] bArr4 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i16 = i13 + zzc;
                    break;
                case 6:
                    i13 = i16 * 53;
                    zzc = zzps.zzc(obj, j13);
                    i16 = i13 + zzc;
                    break;
                case 7:
                    i14 = i16 * 53;
                    floatToIntBits = zznl.zza(zzps.zzw(obj, j13));
                    i16 = floatToIntBits + i14;
                    break;
                case 8:
                    i14 = i16 * 53;
                    floatToIntBits = ((String) zzps.zzf(obj, j13)).hashCode();
                    i16 = floatToIntBits + i14;
                    break;
                case 9:
                    i15 = i16 * 53;
                    Object zzf = zzps.zzf(obj, j13);
                    if (zzf != null) {
                        i23 = zzf.hashCode();
                    }
                    i16 = i15 + i23;
                    break;
                case 10:
                    i14 = i16 * 53;
                    floatToIntBits = zzps.zzf(obj, j13).hashCode();
                    i16 = floatToIntBits + i14;
                    break;
                case 11:
                    i13 = i16 * 53;
                    zzc = zzps.zzc(obj, j13);
                    i16 = i13 + zzc;
                    break;
                case 12:
                    i13 = i16 * 53;
                    zzc = zzps.zzc(obj, j13);
                    i16 = i13 + zzc;
                    break;
                case 13:
                    i13 = i16 * 53;
                    zzc = zzps.zzc(obj, j13);
                    i16 = i13 + zzc;
                    break;
                case 14:
                    i13 = i16 * 53;
                    doubleToLongBits = zzps.zzd(obj, j13);
                    byte[] bArr5 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i16 = i13 + zzc;
                    break;
                case 15:
                    i13 = i16 * 53;
                    zzc = zzps.zzc(obj, j13);
                    i16 = i13 + zzc;
                    break;
                case 16:
                    i13 = i16 * 53;
                    doubleToLongBits = zzps.zzd(obj, j13);
                    byte[] bArr6 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i16 = i13 + zzc;
                    break;
                case 17:
                    i15 = i16 * 53;
                    Object zzf2 = zzps.zzf(obj, j13);
                    if (zzf2 != null) {
                        i23 = zzf2.hashCode();
                    }
                    i16 = i15 + i23;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i14 = i16 * 53;
                    floatToIntBits = zzps.zzf(obj, j13).hashCode();
                    i16 = floatToIntBits + i14;
                    break;
                case 50:
                    i14 = i16 * 53;
                    floatToIntBits = zzps.zzf(obj, j13).hashCode();
                    i16 = floatToIntBits + i14;
                    break;
                case 51:
                    if (zzR(obj, i19, i17)) {
                        i13 = i16 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j13));
                        byte[] bArr7 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i16 = i13 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i19, i17)) {
                        i14 = i16 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j13));
                        i16 = floatToIntBits + i14;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i19, i17)) {
                        i13 = i16 * 53;
                        doubleToLongBits = zzv(obj, j13);
                        byte[] bArr8 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i16 = i13 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i19, i17)) {
                        i13 = i16 * 53;
                        doubleToLongBits = zzv(obj, j13);
                        byte[] bArr9 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i16 = i13 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i19, i17)) {
                        i13 = i16 * 53;
                        zzc = zzp(obj, j13);
                        i16 = i13 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i19, i17)) {
                        i13 = i16 * 53;
                        doubleToLongBits = zzv(obj, j13);
                        byte[] bArr10 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i16 = i13 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i19, i17)) {
                        i13 = i16 * 53;
                        zzc = zzp(obj, j13);
                        i16 = i13 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i19, i17)) {
                        i14 = i16 * 53;
                        floatToIntBits = zznl.zza(zzS(obj, j13));
                        i16 = floatToIntBits + i14;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i19, i17)) {
                        i14 = i16 * 53;
                        floatToIntBits = ((String) zzps.zzf(obj, j13)).hashCode();
                        i16 = floatToIntBits + i14;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i19, i17)) {
                        i14 = i16 * 53;
                        floatToIntBits = zzps.zzf(obj, j13).hashCode();
                        i16 = floatToIntBits + i14;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i19, i17)) {
                        i14 = i16 * 53;
                        floatToIntBits = zzps.zzf(obj, j13).hashCode();
                        i16 = floatToIntBits + i14;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i19, i17)) {
                        i13 = i16 * 53;
                        zzc = zzp(obj, j13);
                        i16 = i13 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i19, i17)) {
                        i13 = i16 * 53;
                        zzc = zzp(obj, j13);
                        i16 = i13 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i19, i17)) {
                        i13 = i16 * 53;
                        zzc = zzp(obj, j13);
                        i16 = i13 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i19, i17)) {
                        i13 = i16 * 53;
                        doubleToLongBits = zzv(obj, j13);
                        byte[] bArr11 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i16 = i13 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i19, i17)) {
                        i13 = i16 * 53;
                        zzc = zzp(obj, j13);
                        i16 = i13 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i19, i17)) {
                        i13 = i16 * 53;
                        doubleToLongBits = zzv(obj, j13);
                        byte[] bArr12 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i16 = i13 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i19, i17)) {
                        i14 = i16 * 53;
                        floatToIntBits = zzps.zzf(obj, j13).hashCode();
                        i16 = floatToIntBits + i14;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = ((zznd) obj).zzc.hashCode() + (i16 * 53);
        return this.zzh ? (hashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0d0f, code lost:
    
        if (r14 == r8) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d11, code lost:
    
        r31.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0d17, code lost:
    
        r8 = r6.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0d1c, code lost:
    
        if (r8 >= r6.zzl) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0d1e, code lost:
    
        zzy(r34, r6.zzj[r8], null, r6.zzm, r34);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0d33, code lost:
    
        if (r9 != 0) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0d37, code lost:
    
        if (r10 != r37) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0d3f, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0d46, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0d42, code lost:
    
        if (r10 > r37) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0d44, code lost:
    
        if (r11 != r9) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0d4c, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x090d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0bd1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0be3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.recaptcha.internal.zzkt r39) {
        /*
            Method dump skipped, instructions count: 3590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zznd) {
                zznd zzndVar = (zznd) obj;
                zzndVar.zzJ(Integer.MAX_VALUE);
                zzndVar.zza = 0;
                zzndVar.zzH();
            }
            int[] iArr = this.zzc;
            for (int i13 = 0; i13 < iArr.length; i13 += 3) {
                int zzu = zzu(i13);
                int i14 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j13 = i14;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zznk) zzps.zzf(obj, j13)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j13);
                                if (object != null) {
                                    ((zzoc) object).zzc();
                                    unsafe.putObject(obj, j13, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i13], i13)) {
                        zzx(i13).zzf(zzb.getObject(obj, j13));
                    }
                }
                if (zzN(obj, i13)) {
                    zzx(i13).zzf(zzb.getObject(obj, j13));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int zzu = zzu(i13);
            int i14 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i15 = iArr[i13];
            long j13 = i14;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i13)) {
                        zzps.zzo(obj, j13, zzps.zza(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i13)) {
                        zzps.zzp(obj, j13, zzps.zzb(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i13)) {
                        zzps.zzr(obj, j13, zzps.zzd(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i13)) {
                        zzps.zzr(obj, j13, zzps.zzd(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i13)) {
                        zzps.zzq(obj, j13, zzps.zzc(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i13)) {
                        zzps.zzr(obj, j13, zzps.zzd(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i13)) {
                        zzps.zzq(obj, j13, zzps.zzc(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i13)) {
                        zzps.zzm(obj, j13, zzps.zzw(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i13)) {
                        zzps.zzs(obj, j13, zzps.zzf(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i13);
                    break;
                case 10:
                    if (zzN(obj2, i13)) {
                        zzps.zzs(obj, j13, zzps.zzf(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i13)) {
                        zzps.zzq(obj, j13, zzps.zzc(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i13)) {
                        zzps.zzq(obj, j13, zzps.zzc(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i13)) {
                        zzps.zzq(obj, j13, zzps.zzc(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i13)) {
                        zzps.zzr(obj, j13, zzps.zzd(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i13)) {
                        zzps.zzq(obj, j13, zzps.zzc(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i13)) {
                        zzps.zzr(obj, j13, zzps.zzd(obj2, j13));
                        zzH(obj, i13);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i13);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zznk zznkVar = (zznk) zzps.zzf(obj, j13);
                    zznk zznkVar2 = (zznk) zzps.zzf(obj2, j13);
                    int size = zznkVar.size();
                    int size2 = zznkVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVar.zzc()) {
                            zznkVar = zznkVar.zzd(size2 + size);
                        }
                        zznkVar.addAll(zznkVar2);
                    }
                    if (size > 0) {
                        zznkVar2 = zznkVar;
                    }
                    zzps.zzs(obj, j13, zznkVar2);
                    break;
                case 50:
                    int i16 = zzoy.zza;
                    zzps.zzs(obj, j13, zzod.zzb(zzps.zzf(obj, j13), zzps.zzf(obj2, j13)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i15, i13)) {
                        zzps.zzs(obj, j13, zzps.zzf(obj2, j13));
                        zzI(obj, i15, i13);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i13);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i15, i13)) {
                        zzps.zzs(obj, j13, zzps.zzf(obj2, j13));
                        zzI(obj, i15, i13);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i13);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) {
        Object valueOf;
        Object zze;
        zzmoVar.getClass();
        zzD(obj);
        zzpl zzplVar = this.zzm;
        Object obj2 = null;
        zzmt zzmtVar = null;
        while (true) {
            try {
                int zzc = zzovVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    int zzu = zzu(zzq);
                    try {
                    } catch (zznm unused) {
                        if (obj2 == null) {
                            obj2 = zzplVar.zza(obj);
                        }
                        if (!zzplVar.zzk(obj2, zzovVar, 0)) {
                            for (int i13 = this.zzk; i13 < this.zzl; i13++) {
                                zzy(obj, this.zzj[i13], obj2, zzplVar, obj);
                            }
                        }
                    }
                    switch (zzt(zzu)) {
                        case 0:
                            zzps.zzo(obj, zzu & 1048575, zzovVar.zza());
                            zzH(obj, zzq);
                        case 1:
                            zzps.zzp(obj, zzu & 1048575, zzovVar.zzb());
                            zzH(obj, zzq);
                        case 2:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzl());
                            zzH(obj, zzq);
                        case 3:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzo());
                            zzH(obj, zzq);
                        case 4:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzg());
                            zzH(obj, zzq);
                        case 5:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzk());
                            zzH(obj, zzq);
                        case 6:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzf());
                            zzH(obj, zzq);
                        case 7:
                            zzps.zzm(obj, zzu & 1048575, zzovVar.zzN());
                            zzH(obj, zzq);
                        case 8:
                            zzG(obj, zzu, zzovVar);
                            zzH(obj, zzq);
                        case 9:
                            zzoi zzoiVar = (zzoi) zzA(obj, zzq);
                            zzovVar.zzu(zzoiVar, zzx(zzq), zzmoVar);
                            zzJ(obj, zzq, zzoiVar);
                        case 10:
                            zzps.zzs(obj, zzu & 1048575, zzovVar.zzp());
                            zzH(obj, zzq);
                        case 11:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzj());
                            zzH(obj, zzq);
                        case 12:
                            int zze2 = zzovVar.zze();
                            zznh zzw = zzw(zzq);
                            if (zzw != null && !zzw.zza(zze2)) {
                                obj2 = zzoy.zzo(obj, zzc, zze2, obj2, zzplVar);
                            }
                            zzps.zzq(obj, zzu & 1048575, zze2);
                            zzH(obj, zzq);
                            break;
                        case 13:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzh());
                            zzH(obj, zzq);
                        case 14:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzm());
                            zzH(obj, zzq);
                        case 15:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzi());
                            zzH(obj, zzq);
                        case 16:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzn());
                            zzH(obj, zzq);
                        case 17:
                            zzoi zzoiVar2 = (zzoi) zzA(obj, zzq);
                            zzovVar.zzt(zzoiVar2, zzx(zzq), zzmoVar);
                            zzJ(obj, zzq, zzoiVar2);
                        case 18:
                            zzovVar.zzx(zznv.zza(obj, zzu & 1048575));
                        case 19:
                            zzovVar.zzB(zznv.zza(obj, zzu & 1048575));
                        case 20:
                            zzovVar.zzE(zznv.zza(obj, zzu & 1048575));
                        case 21:
                            zzovVar.zzM(zznv.zza(obj, zzu & 1048575));
                        case 22:
                            zzovVar.zzD(zznv.zza(obj, zzu & 1048575));
                        case 23:
                            zzovVar.zzA(zznv.zza(obj, zzu & 1048575));
                        case 24:
                            zzovVar.zzz(zznv.zza(obj, zzu & 1048575));
                        case 25:
                            zzovVar.zzv(zznv.zza(obj, zzu & 1048575));
                        case 26:
                            if (zzM(zzu)) {
                                ((zzlj) zzovVar).zzK(zznv.zza(obj, zzu & 1048575), true);
                            } else {
                                ((zzlj) zzovVar).zzK(zznv.zza(obj, zzu & 1048575), false);
                            }
                        case 27:
                            zzovVar.zzF(zznv.zza(obj, zzu & 1048575), zzx(zzq), zzmoVar);
                        case 28:
                            zzovVar.zzw(zznv.zza(obj, zzu & 1048575));
                        case 29:
                            zzovVar.zzL(zznv.zza(obj, zzu & 1048575));
                        case 30:
                            List zza2 = zznv.zza(obj, zzu & 1048575);
                            zzovVar.zzy(zza2);
                            obj2 = zzoy.zzn(obj, zzc, zza2, zzw(zzq), obj2, zzplVar);
                        case 31:
                            zzovVar.zzG(zznv.zza(obj, zzu & 1048575));
                        case 32:
                            zzovVar.zzH(zznv.zza(obj, zzu & 1048575));
                        case 33:
                            zzovVar.zzI(zznv.zza(obj, zzu & 1048575));
                        case 34:
                            zzovVar.zzJ(zznv.zza(obj, zzu & 1048575));
                        case 35:
                            zzovVar.zzx(zznv.zza(obj, zzu & 1048575));
                        case 36:
                            zzovVar.zzB(zznv.zza(obj, zzu & 1048575));
                        case 37:
                            zzovVar.zzE(zznv.zza(obj, zzu & 1048575));
                        case 38:
                            zzovVar.zzM(zznv.zza(obj, zzu & 1048575));
                        case 39:
                            zzovVar.zzD(zznv.zza(obj, zzu & 1048575));
                        case 40:
                            zzovVar.zzA(zznv.zza(obj, zzu & 1048575));
                        case 41:
                            zzovVar.zzz(zznv.zza(obj, zzu & 1048575));
                        case 42:
                            zzovVar.zzv(zznv.zza(obj, zzu & 1048575));
                        case 43:
                            zzovVar.zzL(zznv.zza(obj, zzu & 1048575));
                        case 44:
                            List zza3 = zznv.zza(obj, zzu & 1048575);
                            zzovVar.zzy(zza3);
                            obj2 = zzoy.zzn(obj, zzc, zza3, zzw(zzq), obj2, zzplVar);
                        case 45:
                            zzovVar.zzG(zznv.zza(obj, zzu & 1048575));
                        case 46:
                            zzovVar.zzH(zznv.zza(obj, zzu & 1048575));
                        case 47:
                            zzovVar.zzI(zznv.zza(obj, zzu & 1048575));
                        case 48:
                            zzovVar.zzJ(zznv.zza(obj, zzu & 1048575));
                        case 49:
                            zzovVar.zzC(zznv.zza(obj, zzu & 1048575), zzx(zzq), zzmoVar);
                        case 50:
                            Object zzz = zzz(zzq);
                            long zzu2 = zzu(zzq) & 1048575;
                            Object zzf = zzps.zzf(obj, zzu2);
                            if (zzf == null) {
                                zzf = zzoc.zza().zzb();
                                zzps.zzs(obj, zzu2, zzf);
                            } else if (zzod.zza(zzf)) {
                                Object zzb2 = zzoc.zza().zzb();
                                zzod.zzb(zzb2, zzf);
                                zzps.zzs(obj, zzu2, zzb2);
                                zzf = zzb2;
                            }
                            throw null;
                            break;
                        case 51:
                            zzps.zzs(obj, zzu & 1048575, Double.valueOf(zzovVar.zza()));
                            zzI(obj, zzc, zzq);
                        case 52:
                            zzps.zzs(obj, zzu & 1048575, Float.valueOf(zzovVar.zzb()));
                            zzI(obj, zzc, zzq);
                        case 53:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzl()));
                            zzI(obj, zzc, zzq);
                        case 54:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzo()));
                            zzI(obj, zzc, zzq);
                        case 55:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzg()));
                            zzI(obj, zzc, zzq);
                        case 56:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzk()));
                            zzI(obj, zzc, zzq);
                        case 57:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzf()));
                            zzI(obj, zzc, zzq);
                        case 58:
                            zzps.zzs(obj, zzu & 1048575, Boolean.valueOf(zzovVar.zzN()));
                            zzI(obj, zzc, zzq);
                        case 59:
                            zzG(obj, zzu, zzovVar);
                            zzI(obj, zzc, zzq);
                        case 60:
                            zzoi zzoiVar3 = (zzoi) zzB(obj, zzc, zzq);
                            zzovVar.zzu(zzoiVar3, zzx(zzq), zzmoVar);
                            zzK(obj, zzc, zzq, zzoiVar3);
                        case 61:
                            zzps.zzs(obj, zzu & 1048575, zzovVar.zzp());
                            zzI(obj, zzc, zzq);
                        case 62:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzj()));
                            zzI(obj, zzc, zzq);
                        case 63:
                            int zze3 = zzovVar.zze();
                            zznh zzw2 = zzw(zzq);
                            if (zzw2 != null && !zzw2.zza(zze3)) {
                                obj2 = zzoy.zzo(obj, zzc, zze3, obj2, zzplVar);
                            }
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zze3));
                            zzI(obj, zzc, zzq);
                            break;
                        case 64:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzh()));
                            zzI(obj, zzc, zzq);
                        case 65:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzm()));
                            zzI(obj, zzc, zzq);
                        case 66:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzi()));
                            zzI(obj, zzc, zzq);
                        case 67:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzn()));
                            zzI(obj, zzc, zzq);
                        case 68:
                            zzoi zzoiVar4 = (zzoi) zzB(obj, zzc, zzq);
                            zzovVar.zzt(zzoiVar4, zzx(zzq), zzmoVar);
                            zzK(obj, zzc, zzq, zzoiVar4);
                        default:
                            if (obj2 == null) {
                                obj2 = zzplVar.zza(obj);
                            }
                            if (!zzplVar.zzk(obj2, zzovVar, 0)) {
                                for (int i14 = this.zzk; i14 < this.zzl; i14++) {
                                    zzy(obj, this.zzj[i14], obj2, zzplVar, obj);
                                }
                                break;
                            }
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i15 = this.zzk; i15 < this.zzl; i15++) {
                        zzy(obj, this.zzj[i15], obj2, zzplVar, obj);
                    }
                } else {
                    zznc zza4 = !this.zzh ? null : zzmoVar.zza(this.zzg, zzc);
                    if (zza4 != null) {
                        if (zzmtVar == null) {
                            zzmtVar = ((zzna) obj).zzi();
                        }
                        zznb zznbVar = zza4.zza;
                        zzpw zzpwVar = zzpw.zzn;
                        zzpw zzpwVar2 = zznbVar.zzb;
                        if (zzpwVar2 == zzpwVar) {
                            zzovVar.zzg();
                            throw null;
                        }
                        switch (zzpwVar2.ordinal()) {
                            case 0:
                                valueOf = Double.valueOf(zzovVar.zza());
                                break;
                            case 1:
                                valueOf = Float.valueOf(zzovVar.zzb());
                                break;
                            case 2:
                                valueOf = Long.valueOf(zzovVar.zzl());
                                break;
                            case 3:
                                valueOf = Long.valueOf(zzovVar.zzo());
                                break;
                            case 4:
                                valueOf = Integer.valueOf(zzovVar.zzg());
                                break;
                            case 5:
                                valueOf = Long.valueOf(zzovVar.zzk());
                                break;
                            case 6:
                                valueOf = Integer.valueOf(zzovVar.zzf());
                                break;
                            case 7:
                                valueOf = Boolean.valueOf(zzovVar.zzN());
                                break;
                            case 8:
                                valueOf = zzovVar.zzr();
                                break;
                            case 9:
                                Object zze4 = zzmtVar.zze(zza4.zza);
                                if (!(zze4 instanceof zznd)) {
                                    throw null;
                                }
                                zzow zzb3 = zzos.zza().zzb(zze4.getClass());
                                if (!((zznd) zze4).zzL()) {
                                    Object zze5 = zzb3.zze();
                                    zzb3.zzg(zze5, zze4);
                                    zzmtVar.zzi(zza4.zza, zze5);
                                    zze4 = zze5;
                                }
                                zzovVar.zzt(zze4, zzb3, zzmoVar);
                                continue;
                            case 10:
                                Object zze6 = zzmtVar.zze(zza4.zza);
                                if (!(zze6 instanceof zznd)) {
                                    throw null;
                                }
                                zzow zzb4 = zzos.zza().zzb(zze6.getClass());
                                if (!((zznd) zze6).zzL()) {
                                    Object zze7 = zzb4.zze();
                                    zzb4.zzg(zze7, zze6);
                                    zzmtVar.zzi(zza4.zza, zze7);
                                    zze6 = zze7;
                                }
                                zzovVar.zzu(zze6, zzb4, zzmoVar);
                                continue;
                            case 11:
                                valueOf = zzovVar.zzp();
                                break;
                            case 12:
                                valueOf = Integer.valueOf(zzovVar.zzj());
                                break;
                            case 13:
                                throw new IllegalStateException("Shouldn't reach here.");
                            case 14:
                                valueOf = Integer.valueOf(zzovVar.zzh());
                                break;
                            case 15:
                                valueOf = Long.valueOf(zzovVar.zzm());
                                break;
                            case 16:
                                valueOf = Integer.valueOf(zzovVar.zzi());
                                break;
                            case 17:
                                valueOf = Long.valueOf(zzovVar.zzn());
                                break;
                            default:
                                valueOf = null;
                                break;
                        }
                        int ordinal = zza4.zza.zzb.ordinal();
                        if ((ordinal == 9 || ordinal == 10) && (zze = zzmtVar.zze(zza4.zza)) != null) {
                            byte[] bArr = zznl.zzb;
                            valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                        }
                        zzmtVar.zzi(zza4.zza, valueOf);
                    } else {
                        if (obj2 == null) {
                            obj2 = zzplVar.zza(obj);
                        }
                        if (!zzplVar.zzk(obj2, zzovVar, 0)) {
                            for (int i16 = this.zzk; i16 < this.zzl; i16++) {
                                zzy(obj, this.zzj[i16], obj2, zzplVar, obj);
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                for (int i17 = this.zzk; i17 < this.zzl; i17++) {
                    zzy(obj, this.zzj[i17], obj2, zzplVar, obj);
                }
                if (obj2 != null) {
                    zzplVar.zzj(obj, obj2);
                }
                throw th3;
            }
        }
        if (obj2 != null) {
            zzplVar.zzj(obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i13, int i14, zzkt zzktVar) {
        zzc(obj, bArr, i13, i14, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r24, com.google.android.recaptcha.internal.zzpy r25) {
        /*
            Method dump skipped, instructions count: 1908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzpy):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzF;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int zzu = zzu(i13);
            long j13 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i13) && Double.doubleToLongBits(zzps.zza(obj, j13)) == Double.doubleToLongBits(zzps.zza(obj2, j13))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i13) && Float.floatToIntBits(zzps.zzb(obj, j13)) == Float.floatToIntBits(zzps.zzb(obj2, j13))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i13) && zzps.zzd(obj, j13) == zzps.zzd(obj2, j13)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i13) && zzps.zzd(obj, j13) == zzps.zzd(obj2, j13)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i13) && zzps.zzc(obj, j13) == zzps.zzc(obj2, j13)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i13) && zzps.zzd(obj, j13) == zzps.zzd(obj2, j13)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i13) && zzps.zzc(obj, j13) == zzps.zzc(obj2, j13)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i13) && zzps.zzw(obj, j13) == zzps.zzw(obj2, j13)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i13) && zzoy.zzF(zzps.zzf(obj, j13), zzps.zzf(obj2, j13))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i13) && zzoy.zzF(zzps.zzf(obj, j13), zzps.zzf(obj2, j13))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i13) && zzoy.zzF(zzps.zzf(obj, j13), zzps.zzf(obj2, j13))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i13) && zzps.zzc(obj, j13) == zzps.zzc(obj2, j13)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i13) && zzps.zzc(obj, j13) == zzps.zzc(obj2, j13)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i13) && zzps.zzc(obj, j13) == zzps.zzc(obj2, j13)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i13) && zzps.zzd(obj, j13) == zzps.zzd(obj2, j13)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i13) && zzps.zzc(obj, j13) == zzps.zzc(obj2, j13)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i13) && zzps.zzd(obj, j13) == zzps.zzd(obj2, j13)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i13) && zzoy.zzF(zzps.zzf(obj, j13), zzps.zzf(obj2, j13))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzF = zzoy.zzF(zzps.zzf(obj, j13), zzps.zzf(obj2, j13));
                    break;
                case 50:
                    zzF = zzoy.zzF(zzps.zzf(obj, j13), zzps.zzf(obj2, j13));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzr = zzr(i13) & 1048575;
                    if (zzps.zzc(obj, zzr) == zzps.zzc(obj2, zzr) && zzoy.zzF(zzps.zzf(obj, j13), zzps.zzf(obj2, j13))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        int i13;
        int i14;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i16 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i18 = iArr[i16];
            int i19 = iArr2[i18];
            int zzu = zzu(i18);
            int i23 = this.zzc[i18 + 2];
            int i24 = i23 & 1048575;
            int i25 = 1 << (i23 >>> 20);
            if (i24 != i17) {
                if (i24 != 1048575) {
                    i15 = zzb.getInt(obj, i24);
                }
                i14 = i15;
                i13 = i24;
            } else {
                i13 = i17;
                i14 = i15;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i18, i13, i14, i25)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i19, i18) && !zzP(obj, zzu, zzx(i18))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzoc) zzps.zzf(obj, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzps.zzf(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzow zzx = zzx(i18);
                    for (int i26 = 0; i26 < list.size(); i26++) {
                        if (!zzx.zzl(list.get(i26))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i18, i13, i14, i25) && !zzP(obj, zzu, zzx(i18))) {
                return false;
            }
            i16++;
            i17 = i13;
            i15 = i14;
        }
        return !this.zzh || ((zzna) obj).zzb.zzk();
    }
}
