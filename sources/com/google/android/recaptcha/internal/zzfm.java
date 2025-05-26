package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xk2.k;
import xk2.m;

/* loaded from: classes3.dex */
public final class zzfm {

    @NotNull
    private final k zza;

    public zzfm() {
        int i13 = zzav.zza;
        this.zza = m.b(zzfl.zza);
    }

    @NotNull
    public final HttpURLConnection zza(@NotNull String str) {
        if (!((zzfk) this.zza.getValue()).zzb(str)) {
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        }
        URLConnection openConnection = new URL(str).openConnection();
        Intrinsics.g(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}
