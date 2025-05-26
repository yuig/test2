package com.pinterest.qrCodeLogin;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final ln1.e f50319a;

    /* renamed from: b, reason: collision with root package name */
    public final i f50320b;

    public j(ln1.e loadingState, i tokenVerificationState) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        Intrinsics.checkNotNullParameter(tokenVerificationState, "tokenVerificationState");
        this.f50319a = loadingState;
        this.f50320b = tokenVerificationState;
    }

    public static j e(ln1.e loadingState, i tokenVerificationState) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        Intrinsics.checkNotNullParameter(tokenVerificationState, "tokenVerificationState");
        return new j(loadingState, tokenVerificationState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f50319a == jVar.f50319a && Intrinsics.d(this.f50320b, jVar.f50320b);
    }

    public final int hashCode() {
        return this.f50320b.hashCode() + (this.f50319a.hashCode() * 31);
    }

    public final String toString() {
        return "QrCodeLoginDisplayState(loadingState=" + this.f50319a + ", tokenVerificationState=" + this.f50320b + ")";
    }
}
