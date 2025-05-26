package com.pinterest.qrCodeLogin;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends g {

    /* renamed from: g, reason: collision with root package name */
    public static final c f50301g;

    static {
        int i13 = m0.qr_login_try_again;
        int i14 = m0.qr_login_same_wifi;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        f50301g = new c(i13, new u50.k0(i14, new ArrayList(0)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 875050886;
    }

    public final String toString() {
        return "InvalidIpAddress";
    }
}
