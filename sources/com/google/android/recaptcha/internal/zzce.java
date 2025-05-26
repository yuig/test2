package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzce extends Exception {
    private final Throwable zza;

    @NotNull
    private final zztd zzb;

    @NotNull
    private final int zzc;

    @NotNull
    private final int zzd;

    public zzce(@NotNull int i13, @NotNull int i14, Throwable th3) {
        this.zzc = i13;
        this.zzd = i14;
        this.zza = th3;
        zztd zzf = zzte.zzf();
        zzf.zzq(i14);
        zzf.zzr(i13);
        this.zzb = zzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    @NotNull
    public final zztd zza() {
        return this.zzb;
    }

    @NotNull
    public final int zzb() {
        return this.zzd;
    }
}
