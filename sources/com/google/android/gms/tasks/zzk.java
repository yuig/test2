package com.google.android.gms.tasks;

import com.bumptech.glide.d;

/* loaded from: classes.dex */
final class zzk implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzl zzb;

    public zzk(zzl zzlVar, Task task) {
        this.zzb = zzlVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnFailureListener onFailureListener;
        OnFailureListener onFailureListener2;
        obj = this.zzb.zzb;
        synchronized (obj) {
            try {
                zzl zzlVar = this.zzb;
                onFailureListener = zzlVar.zzc;
                if (onFailureListener != null) {
                    onFailureListener2 = zzlVar.zzc;
                    Exception exception = this.zza.getException();
                    d.t(exception);
                    onFailureListener2.onFailure(exception);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
