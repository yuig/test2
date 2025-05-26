package vn0;

import kotlin.jvm.internal.Intrinsics;
import tk0.f0;

/* loaded from: classes5.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f126257a;

    public f(f0 sideEffectRequest) {
        Intrinsics.checkNotNullParameter(sideEffectRequest, "sideEffectRequest");
        this.f126257a = sideEffectRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f126257a, ((f) obj).f126257a);
    }

    public final int hashCode() {
        return this.f126257a.hashCode();
    }

    public final String toString() {
        return "OrganizeFloatingToolbarRequest(sideEffectRequest=" + this.f126257a + ")";
    }
}
