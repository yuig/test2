package com.google.android.recaptcha.internal;

import ao2.j0;
import java.util.TimerTask;
import kotlin.jvm.internal.j;

/* loaded from: classes3.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        j0 j0Var;
        zzan zzanVar = this.zza;
        j0Var = zzanVar.zzb;
        j.z(j0Var, null, null, new zzaj(zzanVar, null), 3);
    }
}
