package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes3.dex */
final class zzlo implements zzpy {
    private final zzln zza;

    private zzlo(zzln zzlnVar) {
        byte[] bArr = zznl.zzb;
        this.zza = zzlnVar;
        zzlnVar.zza = this;
    }

    public static zzlo zza(zzln zzlnVar) {
        zzlo zzloVar = zzlnVar.zza;
        return zzloVar != null ? zzloVar : new zzlo(zzlnVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzA(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!(list instanceof zznx)) {
            if (!z13) {
                while (i14 < list.size()) {
                    this.zza.zzh(i13, ((Long) list.get(i14)).longValue());
                    i14++;
                }
                return;
            }
            this.zza.zzr(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ((Long) list.get(i16)).getClass();
                i15 += 8;
            }
            this.zza.zzt(i15);
            while (i14 < list.size()) {
                this.zza.zzi(((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z13) {
            while (i14 < zznxVar.size()) {
                this.zza.zzh(i13, zznxVar.zze(i14));
                i14++;
            }
            return;
        }
        this.zza.zzr(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < zznxVar.size(); i18++) {
            zznxVar.zze(i18);
            i17 += 8;
        }
        this.zza.zzt(i17);
        while (i14 < zznxVar.size()) {
            this.zza.zzi(zznxVar.zze(i14));
            i14++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzB(int i13, int i14) {
        this.zza.zzs(i13, (i14 >> 31) ^ (i14 + i14));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzC(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!(list instanceof zzne)) {
            if (!z13) {
                while (i14 < list.size()) {
                    zzln zzlnVar = this.zza;
                    int intValue = ((Integer) list.get(i14)).intValue();
                    zzlnVar.zzs(i13, (intValue >> 31) ^ (intValue + intValue));
                    i14++;
                }
                return;
            }
            this.zza.zzr(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                int intValue2 = ((Integer) list.get(i16)).intValue();
                i15 += zzln.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            this.zza.zzt(i15);
            while (i14 < list.size()) {
                zzln zzlnVar2 = this.zza;
                int intValue3 = ((Integer) list.get(i14)).intValue();
                zzlnVar2.zzt((intValue3 >> 31) ^ (intValue3 + intValue3));
                i14++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z13) {
            while (i14 < zzneVar.size()) {
                zzln zzlnVar3 = this.zza;
                int zze = zzneVar.zze(i14);
                zzlnVar3.zzs(i13, (zze >> 31) ^ (zze + zze));
                i14++;
            }
            return;
        }
        this.zza.zzr(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < zzneVar.size(); i18++) {
            int zze2 = zzneVar.zze(i18);
            i17 += zzln.zzA((zze2 >> 31) ^ (zze2 + zze2));
        }
        this.zza.zzt(i17);
        while (i14 < zzneVar.size()) {
            zzln zzlnVar4 = this.zza;
            int zze3 = zzneVar.zze(i14);
            zzlnVar4.zzt((zze3 >> 31) ^ (zze3 + zze3));
            i14++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzD(int i13, long j13) {
        this.zza.zzu(i13, (j13 >> 63) ^ (j13 + j13));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzE(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!(list instanceof zznx)) {
            if (!z13) {
                while (i14 < list.size()) {
                    zzln zzlnVar = this.zza;
                    long longValue = ((Long) list.get(i14)).longValue();
                    zzlnVar.zzu(i13, (longValue >> 63) ^ (longValue + longValue));
                    i14++;
                }
                return;
            }
            this.zza.zzr(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                long longValue2 = ((Long) list.get(i16)).longValue();
                i15 += zzln.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            this.zza.zzt(i15);
            while (i14 < list.size()) {
                zzln zzlnVar2 = this.zza;
                long longValue3 = ((Long) list.get(i14)).longValue();
                zzlnVar2.zzv((longValue3 >> 63) ^ (longValue3 + longValue3));
                i14++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z13) {
            while (i14 < zznxVar.size()) {
                zzln zzlnVar3 = this.zza;
                long zze = zznxVar.zze(i14);
                zzlnVar3.zzu(i13, (zze >> 63) ^ (zze + zze));
                i14++;
            }
            return;
        }
        this.zza.zzr(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < zznxVar.size(); i18++) {
            long zze2 = zznxVar.zze(i18);
            i17 += zzln.zzB((zze2 >> 63) ^ (zze2 + zze2));
        }
        this.zza.zzt(i17);
        while (i14 < zznxVar.size()) {
            zzln zzlnVar4 = this.zza;
            long zze3 = zznxVar.zze(i14);
            zzlnVar4.zzv((zze3 >> 63) ^ (zze3 + zze3));
            i14++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    @Deprecated
    public final void zzF(int i13) {
        this.zza.zzr(i13, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzG(int i13, String str) {
        this.zza.zzp(i13, str);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzH(int i13, List list) {
        int i14 = 0;
        if (!(list instanceof zznu)) {
            while (i14 < list.size()) {
                this.zza.zzp(i13, (String) list.get(i14));
                i14++;
            }
            return;
        }
        zznu zznuVar = (zznu) list;
        while (i14 < list.size()) {
            Object zzc = zznuVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzp(i13, (String) zzc);
            } else {
                this.zza.zze(i13, (zzle) zzc);
            }
            i14++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzI(int i13, int i14) {
        this.zza.zzs(i13, i14);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzJ(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!(list instanceof zzne)) {
            if (!z13) {
                while (i14 < list.size()) {
                    this.zza.zzs(i13, ((Integer) list.get(i14)).intValue());
                    i14++;
                }
                return;
            }
            this.zza.zzr(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                i15 += zzln.zzA(((Integer) list.get(i16)).intValue());
            }
            this.zza.zzt(i15);
            while (i14 < list.size()) {
                this.zza.zzt(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z13) {
            while (i14 < zzneVar.size()) {
                this.zza.zzs(i13, zzneVar.zze(i14));
                i14++;
            }
            return;
        }
        this.zza.zzr(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < zzneVar.size(); i18++) {
            i17 += zzln.zzA(zzneVar.zze(i18));
        }
        this.zza.zzt(i17);
        while (i14 < zzneVar.size()) {
            this.zza.zzt(zzneVar.zze(i14));
            i14++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzK(int i13, long j13) {
        this.zza.zzu(i13, j13);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzL(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!(list instanceof zznx)) {
            if (!z13) {
                while (i14 < list.size()) {
                    this.zza.zzu(i13, ((Long) list.get(i14)).longValue());
                    i14++;
                }
                return;
            }
            this.zza.zzr(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                i15 += zzln.zzB(((Long) list.get(i16)).longValue());
            }
            this.zza.zzt(i15);
            while (i14 < list.size()) {
                this.zza.zzv(((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z13) {
            while (i14 < zznxVar.size()) {
                this.zza.zzu(i13, zznxVar.zze(i14));
                i14++;
            }
            return;
        }
        this.zza.zzr(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < zznxVar.size(); i18++) {
            i17 += zzln.zzB(zznxVar.zze(i18));
        }
        this.zza.zzt(i17);
        while (i14 < zznxVar.size()) {
            this.zza.zzv(zznxVar.zze(i14));
            i14++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzb(int i13, boolean z13) {
        this.zza.zzd(i13, z13);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzc(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!(list instanceof zzkv)) {
            if (!z13) {
                while (i14 < list.size()) {
                    this.zza.zzd(i13, ((Boolean) list.get(i14)).booleanValue());
                    i14++;
                }
                return;
            }
            this.zza.zzr(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ((Boolean) list.get(i16)).getClass();
                i15++;
            }
            this.zza.zzt(i15);
            while (i14 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i14)).booleanValue() ? (byte) 1 : (byte) 0);
                i14++;
            }
            return;
        }
        zzkv zzkvVar = (zzkv) list;
        if (!z13) {
            while (i14 < zzkvVar.size()) {
                this.zza.zzd(i13, zzkvVar.zzf(i14));
                i14++;
            }
            return;
        }
        this.zza.zzr(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < zzkvVar.size(); i18++) {
            zzkvVar.zzf(i18);
            i17++;
        }
        this.zza.zzt(i17);
        while (i14 < zzkvVar.size()) {
            this.zza.zzb(zzkvVar.zzf(i14) ? (byte) 1 : (byte) 0);
            i14++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzd(int i13, zzle zzleVar) {
        this.zza.zze(i13, zzleVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zze(int i13, List list) {
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.zza.zze(i13, (zzle) list.get(i14));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzf(int i13, double d2) {
        this.zza.zzh(i13, Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzg(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!(list instanceof zzmi)) {
            if (!z13) {
                while (i14 < list.size()) {
                    this.zza.zzh(i13, Double.doubleToRawLongBits(((Double) list.get(i14)).doubleValue()));
                    i14++;
                }
                return;
            }
            this.zza.zzr(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ((Double) list.get(i16)).getClass();
                i15 += 8;
            }
            this.zza.zzt(i15);
            while (i14 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i14)).doubleValue()));
                i14++;
            }
            return;
        }
        zzmi zzmiVar = (zzmi) list;
        if (!z13) {
            while (i14 < zzmiVar.size()) {
                this.zza.zzh(i13, Double.doubleToRawLongBits(zzmiVar.zze(i14)));
                i14++;
            }
            return;
        }
        this.zza.zzr(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < zzmiVar.size(); i18++) {
            zzmiVar.zze(i18);
            i17 += 8;
        }
        this.zza.zzt(i17);
        while (i14 < zzmiVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzmiVar.zze(i14)));
            i14++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    @Deprecated
    public final void zzh(int i13) {
        this.zza.zzr(i13, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzi(int i13, int i14) {
        this.zza.zzj(i13, i14);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzj(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!(list instanceof zzne)) {
            if (!z13) {
                while (i14 < list.size()) {
                    this.zza.zzj(i13, ((Integer) list.get(i14)).intValue());
                    i14++;
                }
                return;
            }
            this.zza.zzr(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                i15 += zzln.zzB(((Integer) list.get(i16)).intValue());
            }
            this.zza.zzt(i15);
            while (i14 < list.size()) {
                this.zza.zzk(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z13) {
            while (i14 < zzneVar.size()) {
                this.zza.zzj(i13, zzneVar.zze(i14));
                i14++;
            }
            return;
        }
        this.zza.zzr(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < zzneVar.size(); i18++) {
            i17 += zzln.zzB(zzneVar.zze(i18));
        }
        this.zza.zzt(i17);
        while (i14 < zzneVar.size()) {
            this.zza.zzk(zzneVar.zze(i14));
            i14++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzk(int i13, int i14) {
        this.zza.zzf(i13, i14);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzl(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!(list instanceof zzne)) {
            if (!z13) {
                while (i14 < list.size()) {
                    this.zza.zzf(i13, ((Integer) list.get(i14)).intValue());
                    i14++;
                }
                return;
            }
            this.zza.zzr(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ((Integer) list.get(i16)).getClass();
                i15 += 4;
            }
            this.zza.zzt(i15);
            while (i14 < list.size()) {
                this.zza.zzg(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z13) {
            while (i14 < zzneVar.size()) {
                this.zza.zzf(i13, zzneVar.zze(i14));
                i14++;
            }
            return;
        }
        this.zza.zzr(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < zzneVar.size(); i18++) {
            zzneVar.zze(i18);
            i17 += 4;
        }
        this.zza.zzt(i17);
        while (i14 < zzneVar.size()) {
            this.zza.zzg(zzneVar.zze(i14));
            i14++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzm(int i13, long j13) {
        this.zza.zzh(i13, j13);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzn(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!(list instanceof zznx)) {
            if (!z13) {
                while (i14 < list.size()) {
                    this.zza.zzh(i13, ((Long) list.get(i14)).longValue());
                    i14++;
                }
                return;
            }
            this.zza.zzr(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ((Long) list.get(i16)).getClass();
                i15 += 8;
            }
            this.zza.zzt(i15);
            while (i14 < list.size()) {
                this.zza.zzi(((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z13) {
            while (i14 < zznxVar.size()) {
                this.zza.zzh(i13, zznxVar.zze(i14));
                i14++;
            }
            return;
        }
        this.zza.zzr(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < zznxVar.size(); i18++) {
            zznxVar.zze(i18);
            i17 += 8;
        }
        this.zza.zzt(i17);
        while (i14 < zznxVar.size()) {
            this.zza.zzi(zznxVar.zze(i14));
            i14++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzo(int i13, float f13) {
        this.zza.zzf(i13, Float.floatToRawIntBits(f13));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzp(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!(list instanceof zzmv)) {
            if (!z13) {
                while (i14 < list.size()) {
                    this.zza.zzf(i13, Float.floatToRawIntBits(((Float) list.get(i14)).floatValue()));
                    i14++;
                }
                return;
            }
            this.zza.zzr(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ((Float) list.get(i16)).getClass();
                i15 += 4;
            }
            this.zza.zzt(i15);
            while (i14 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i14)).floatValue()));
                i14++;
            }
            return;
        }
        zzmv zzmvVar = (zzmv) list;
        if (!z13) {
            while (i14 < zzmvVar.size()) {
                this.zza.zzf(i13, Float.floatToRawIntBits(zzmvVar.zze(i14)));
                i14++;
            }
            return;
        }
        this.zza.zzr(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < zzmvVar.size(); i18++) {
            zzmvVar.zze(i18);
            i17 += 4;
        }
        this.zza.zzt(i17);
        while (i14 < zzmvVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzmvVar.zze(i14)));
            i14++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzq(int i13, Object obj, zzow zzowVar) {
        zzln zzlnVar = this.zza;
        zzlnVar.zzr(i13, 3);
        zzowVar.zzj((zzoi) obj, zzlnVar.zza);
        zzlnVar.zzr(i13, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzr(int i13, int i14) {
        this.zza.zzj(i13, i14);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzs(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!(list instanceof zzne)) {
            if (!z13) {
                while (i14 < list.size()) {
                    this.zza.zzj(i13, ((Integer) list.get(i14)).intValue());
                    i14++;
                }
                return;
            }
            this.zza.zzr(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                i15 += zzln.zzB(((Integer) list.get(i16)).intValue());
            }
            this.zza.zzt(i15);
            while (i14 < list.size()) {
                this.zza.zzk(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z13) {
            while (i14 < zzneVar.size()) {
                this.zza.zzj(i13, zzneVar.zze(i14));
                i14++;
            }
            return;
        }
        this.zza.zzr(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < zzneVar.size(); i18++) {
            i17 += zzln.zzB(zzneVar.zze(i18));
        }
        this.zza.zzt(i17);
        while (i14 < zzneVar.size()) {
            this.zza.zzk(zzneVar.zze(i14));
            i14++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzt(int i13, long j13) {
        this.zza.zzu(i13, j13);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzu(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!(list instanceof zznx)) {
            if (!z13) {
                while (i14 < list.size()) {
                    this.zza.zzu(i13, ((Long) list.get(i14)).longValue());
                    i14++;
                }
                return;
            }
            this.zza.zzr(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                i15 += zzln.zzB(((Long) list.get(i16)).longValue());
            }
            this.zza.zzt(i15);
            while (i14 < list.size()) {
                this.zza.zzv(((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z13) {
            while (i14 < zznxVar.size()) {
                this.zza.zzu(i13, zznxVar.zze(i14));
                i14++;
            }
            return;
        }
        this.zza.zzr(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < zznxVar.size(); i18++) {
            i17 += zzln.zzB(zznxVar.zze(i18));
        }
        this.zza.zzt(i17);
        while (i14 < zznxVar.size()) {
            this.zza.zzv(zznxVar.zze(i14));
            i14++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzv(int i13, Object obj, zzow zzowVar) {
        this.zza.zzm(i13, (zzoi) obj, zzowVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzw(int i13, Object obj) {
        if (obj instanceof zzle) {
            this.zza.zzo(i13, (zzle) obj);
        } else {
            this.zza.zzn(i13, (zzoi) obj);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzx(int i13, int i14) {
        this.zza.zzf(i13, i14);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzy(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!(list instanceof zzne)) {
            if (!z13) {
                while (i14 < list.size()) {
                    this.zza.zzf(i13, ((Integer) list.get(i14)).intValue());
                    i14++;
                }
                return;
            }
            this.zza.zzr(i13, 2);
            int i15 = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ((Integer) list.get(i16)).getClass();
                i15 += 4;
            }
            this.zza.zzt(i15);
            while (i14 < list.size()) {
                this.zza.zzg(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z13) {
            while (i14 < zzneVar.size()) {
                this.zza.zzf(i13, zzneVar.zze(i14));
                i14++;
            }
            return;
        }
        this.zza.zzr(i13, 2);
        int i17 = 0;
        for (int i18 = 0; i18 < zzneVar.size(); i18++) {
            zzneVar.zze(i18);
            i17 += 4;
        }
        this.zza.zzt(i17);
        while (i14 < zzneVar.size()) {
            this.zza.zzg(zzneVar.zze(i14));
            i14++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzz(int i13, long j13) {
        this.zza.zzh(i13, j13);
    }
}
