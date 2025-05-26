package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
abstract class zzpr {
    final Unsafe zza;

    public zzpr(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j13);

    public abstract float zzb(Object obj, long j13);

    public abstract void zzc(Object obj, long j13, boolean z13);

    public abstract void zzd(Object obj, long j13, byte b13);

    public abstract void zze(Object obj, long j13, double d2);

    public abstract void zzf(Object obj, long j13, float f13);

    public abstract boolean zzg(Object obj, long j13);
}
