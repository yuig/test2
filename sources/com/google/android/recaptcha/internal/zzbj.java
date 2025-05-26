package com.google.android.recaptcha.internal;

import a.a;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    @NotNull
    public final String toString() {
        String P = StringsKt.P(String.valueOf(this.zzb / this.zza), 10);
        String P2 = StringsKt.P(String.valueOf(this.zzc), 10);
        String P3 = StringsKt.P(String.valueOf(this.zzb), 10);
        String P4 = StringsKt.P(String.valueOf(this.zza), 5);
        StringBuilder w13 = a.w("avgExecutionTime: ", P, " us| maxExecutionTime: ", P2, " us| totalTime: ");
        w13.append(P3);
        w13.append(" us| #Usages: ");
        w13.append(P4);
        return w13.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull zzbj zzbjVar) {
        return al2.a.b(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j13) {
        this.zzc = j13;
    }

    public final void zzf(long j13) {
        this.zzb = j13;
    }

    public final void zzg(int i13) {
        this.zza = i13;
    }
}
