package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzex {

    @NotNull
    private final zzfm zza;

    public zzex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final zzew zza(@NotNull String str) {
        try {
            HttpURLConnection zza = this.zza.zza(str);
            zza.setRequestMethod("POST");
            zza.setDoOutput(true);
            zza.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzew(zza);
        } catch (zzbd e13) {
            throw e13;
        } catch (Exception e14) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e14.getMessage());
        }
    }

    public /* synthetic */ zzex(zzfm zzfmVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this.zza = new zzfm();
    }
}
