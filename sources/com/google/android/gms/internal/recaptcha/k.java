package com.google.android.gms.internal.recaptcha;

import java.time.Instant;

/* loaded from: classes.dex */
public enum k {
    INSTANCE;

    @Override // java.lang.Enum
    public final String toString() {
        return "TimeSource.system()";
    }

    public final Instant zza() {
        return Instant.now();
    }
}
