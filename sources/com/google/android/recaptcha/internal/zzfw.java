package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import ao2.j0;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzfw {

    @NotNull
    private final WebView zza;

    @NotNull
    private final j0 zzb;

    public zzfw(@NotNull WebView webView, @NotNull j0 j0Var) {
        this.zza = webView;
        this.zzb = j0Var;
    }

    public final void zzb(@NotNull String str, @NotNull String... strArr) {
        j.z(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
