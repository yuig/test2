package com.pinterest.qrCodeLogin;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends g {

    /* renamed from: g, reason: collision with root package name */
    public static final f f50307g;

    static {
        int i13 = m0.qr_login_not_supported;
        int i14 = m0.qr_login_not_supported_2fa;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        f50307g = new f(i13, new u50.k0(i14, new ArrayList(0)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1818823846;
    }

    public final String toString() {
        return "SecondFactorAuthEnabled";
    }
}
