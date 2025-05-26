package com.google.android.recaptcha.internal;

import android.app.Application;
import bl2.c;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.j;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzcq {
    private static zzcv zza;

    @NotNull
    public static final zzcv zza(@NotNull Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(@NotNull Application application, @NotNull String str, long j13, @NotNull c cVar) {
        return zzcv.zzh(zza(application), str, j13, null, null, null, cVar, 28, null);
    }

    @NotNull
    public static final Task zzc(@NotNull Application application, @NotNull String str, long j13) {
        return zzas.zza(j.d(zza(application).zzd().zza(), null, new zzco(application, str, j13, null), 3));
    }

    public static final Object zzd(@NotNull Application application, @NotNull String str, @NotNull c cVar) {
        Object zzh;
        zzh = zzcv.zzh(r0, str, 0L, null, zza(application).zzf, zzch.zzb, cVar, 2, null);
        return zzh;
    }

    @NotNull
    public static final Task zze(@NotNull Application application, @NotNull String str) {
        return zzas.zza(j.d(zza(application).zzd().zza(), null, new zzcp(application, str, null), 3));
    }
}
