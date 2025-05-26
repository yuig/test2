package com.google.android.recaptcha.internal;

import ao2.j0;
import java.util.TimerTask;
import kotlin.jvm.internal.j;

/* loaded from: classes3.dex */
public final class zzep extends TimerTask {
    final /* synthetic */ zzes zza;

    public zzep(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        j0 j0Var;
        zzes zzesVar = this.zza;
        j0Var = zzesVar.zzd;
        j.z(j0Var, null, null, new zzeq(zzesVar, null), 3);
    }
}
