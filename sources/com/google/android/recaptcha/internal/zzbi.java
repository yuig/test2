package com.google.android.recaptcha.internal;

import ao2.i1;
import ao2.j0;
import dl2.b;
import ho2.c;
import java.util.concurrent.Executors;
import ko2.e;
import kotlin.jvm.internal.j;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzbi {

    @NotNull
    private final j0 zza = b.e();

    @NotNull
    private final j0 zzb;

    @NotNull
    private final j0 zzc;

    @NotNull
    private final j0 zzd;

    public zzbi() {
        c b13 = b.b(new i1(Executors.newSingleThreadExecutor()));
        j.z(b13, null, null, new zzbh(null), 3);
        this.zzb = b13;
        this.zzc = b.b(e.f80326c);
        c b14 = b.b(new i1(Executors.newSingleThreadExecutor()));
        j.z(b14, null, null, new zzbg(null), 3);
        this.zzd = b14;
    }

    @NotNull
    public final j0 zza() {
        return this.zzc;
    }

    @NotNull
    public final j0 zzb() {
        return this.zza;
    }

    @NotNull
    public final j0 zzc() {
        return this.zzd;
    }

    @NotNull
    public final j0 zzd() {
        return this.zzb;
    }
}
