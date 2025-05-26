package com.pinterest.qrCodeLogin;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f50306a;

    public e0(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f50306a = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.d(this.f50306a, ((e0) obj).f50306a);
    }

    public final int hashCode() {
        return this.f50306a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("TokenVerificationRequest(token="), this.f50306a, ")");
    }
}
