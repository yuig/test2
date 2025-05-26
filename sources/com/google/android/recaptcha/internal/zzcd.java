package com.google.android.recaptcha.internal;

import android.content.Context;
import il2.k;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzcd {
    public zzcd(@NotNull Context context) {
    }

    @NotNull
    public static final byte[] zza(@NotNull File file) {
        return k.a(file);
    }

    public static final void zzb(@NotNull File file, @NotNull byte[] bArr) {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        k.c(file, bArr);
    }
}
