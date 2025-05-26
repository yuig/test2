package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzll extends IOException {
    public zzll() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzll(String str, Throwable th3) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th3);
    }

    public zzll(Throwable th3) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th3);
    }
}
