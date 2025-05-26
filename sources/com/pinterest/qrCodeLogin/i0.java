package com.pinterest.qrCodeLogin;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.l0 f50317a;

    /* renamed from: b, reason: collision with root package name */
    public final String f50318b;

    public i0(zy.l0 pinalyticsVMState, String qrCodeToken) {
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(qrCodeToken, "qrCodeToken");
        this.f50317a = pinalyticsVMState;
        this.f50318b = qrCodeToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.d(this.f50317a, i0Var.f50317a) && Intrinsics.d(this.f50318b, i0Var.f50318b);
    }

    public final int hashCode() {
        return this.f50318b.hashCode() + (this.f50317a.hashCode() * 31);
    }

    public final String toString() {
        return "QrCodeLoginVMState(pinalyticsVMState=" + this.f50317a + ", qrCodeToken=" + this.f50318b + ")";
    }
}
