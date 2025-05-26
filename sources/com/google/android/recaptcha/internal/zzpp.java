package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzpp extends zzpr {
    public zzpp(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final double zza(Object obj, long j13) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j13));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final float zzb(Object obj, long j13) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j13));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzc(Object obj, long j13, boolean z13) {
        if (zzps.zzb) {
            zzps.zzD(obj, j13, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzps.zzE(obj, j13, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzd(Object obj, long j13, byte b13) {
        if (zzps.zzb) {
            zzps.zzD(obj, j13, b13);
        } else {
            zzps.zzE(obj, j13, b13);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zze(Object obj, long j13, double d2) {
        this.zza.putLong(obj, j13, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzf(Object obj, long j13, float f13) {
        this.zza.putInt(obj, j13, Float.floatToIntBits(f13));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final boolean zzg(Object obj, long j13) {
        return zzps.zzb ? zzps.zzt(obj, j13) : zzps.zzu(obj, j13);
    }
}
