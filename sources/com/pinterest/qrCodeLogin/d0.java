package com.pinterest.qrCodeLogin;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f50304a;

    public d0(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f50304a = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f50304a, ((d0) obj).f50304a);
    }

    public final int hashCode() {
        return this.f50304a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("QrCodeAuthRequest(token="), this.f50304a, ")");
    }
}
