package com.pinterest.qrCodeLogin;

import com.pinterest.error.NetworkResponseError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements t {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkResponseError f50330a;

    public o(NetworkResponseError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f50330a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f50330a, ((o) obj).f50330a);
    }

    public final int hashCode() {
        return this.f50330a.hashCode();
    }

    public final String toString() {
        return "OtherAuthError(error=" + this.f50330a + ")";
    }
}
