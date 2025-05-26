package com.google.android.recaptcha.internal;

import android.content.Context;
import ih.d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzbs {

    @NotNull
    private final d zza;

    public zzbs() {
        this.zza = d.f72259b;
    }

    @NotNull
    public final int zza(@NotNull Context context) {
        int b13 = this.zza.b(context);
        return (b13 == 1 || b13 == 3 || b13 == 9) ? 4 : 3;
    }

    public zzbs(@NotNull d dVar) {
        this.zza = dVar;
    }
}
