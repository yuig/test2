package com.pinterest.qrCodeLogin;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f50308a;

    public f0(al1.f wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f50308a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f50308a, ((f0) obj).f50308a);
    }

    public final int hashCode() {
        return this.f50308a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("WrappedNavigationEffectRequest(wrapped="), this.f50308a, ")");
    }
}
