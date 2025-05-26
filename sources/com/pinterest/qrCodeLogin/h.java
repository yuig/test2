package com.pinterest.qrCodeLogin;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends i {

    /* renamed from: g, reason: collision with root package name */
    public final u50.i0 f50310g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(u50.k0 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "tokenVerifiedDescription"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            int r2 = com.pinterest.qrCodeLogin.m0.qr_login_confirm
            fm1.c r0 = fm1.c.VISIBLE
            int r4 = r0.getVisibility()
            fm1.c r5 = fm1.c.GONE
            int r6 = r0.getVisibility()
            r7 = 32
            r1 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f50310g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.qrCodeLogin.h.<init>(u50.k0):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f50310g, ((h) obj).f50310g);
    }

    public final int hashCode() {
        return this.f50310g.hashCode();
    }

    public final String toString() {
        return "TokenVerified(tokenVerifiedDescription=" + this.f50310g + ")";
    }
}
