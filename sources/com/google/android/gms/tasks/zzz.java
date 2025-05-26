package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzz implements Runnable {
    final /* synthetic */ zzw zza;
    final /* synthetic */ Callable zzb;

    public zzz(zzw zzwVar, Callable callable) {
        this.zza = zzwVar;
        this.zzb = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.zzb(this.zzb.call());
        } catch (Exception e13) {
            this.zza.zza(e13);
        } catch (Throwable th3) {
            this.zza.zza(new RuntimeException(th3));
        }
    }
}
