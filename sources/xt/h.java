package xt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    public final String f135878a;

    public h(String errMsg) {
        Intrinsics.checkNotNullParameter(errMsg, "errMsg");
        this.f135878a = errMsg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f135878a, ((h) obj).f135878a);
    }

    public final int hashCode() {
        return this.f135878a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Error(errMsg="), this.f135878a, ")");
    }
}
