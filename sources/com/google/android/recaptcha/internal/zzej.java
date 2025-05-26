package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzej {

    @NotNull
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzej(@NotNull String str, long j13, int i13) {
        this.zza = str;
        this.zzb = j13;
        this.zzc = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzej)) {
            return false;
        }
        zzej zzejVar = (zzej) obj;
        return Intrinsics.d(zzejVar.zza, this.zza) && zzejVar.zzb == this.zzb && zzejVar.zzc == this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    @NotNull
    public final String zzc() {
        return this.zza;
    }
}
