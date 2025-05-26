package com.pinterest.qrCodeLogin;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends g {

    /* renamed from: g, reason: collision with root package name */
    public static final e f50305g;

    static {
        int i13 = m0.qr_login_try_again;
        int i14 = m0.qr_login_verification_failed;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        f50305g = new e(i13, new u50.k0(i14, new ArrayList(0)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 314649007;
    }

    public final String toString() {
        return "QrCodeVerificationError";
    }
}
