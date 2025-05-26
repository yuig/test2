package com.pinterest.qrCodeLogin;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends g {

    /* renamed from: g, reason: collision with root package name */
    public final u50.i0 f50303g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u50.i0 errorMessage) {
        super(m0.qr_login_try_again, errorMessage);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f50303g = errorMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f50303g, ((d) obj).f50303g);
    }

    public final int hashCode() {
        return this.f50303g.hashCode();
    }

    public final String toString() {
        return "OtherError(errorMessage=" + this.f50303g + ")";
    }
}
