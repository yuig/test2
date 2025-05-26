package vn0;

import kotlin.jvm.internal.Intrinsics;
import sk0.u;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final u f126256a;

    public e(u sideEffectRequest) {
        Intrinsics.checkNotNullParameter(sideEffectRequest, "sideEffectRequest");
        this.f126256a = sideEffectRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f126256a, ((e) obj).f126256a);
    }

    public final int hashCode() {
        return this.f126256a.hashCode();
    }

    public final String toString() {
        return "FloatingToolbarRequest(sideEffectRequest=" + this.f126256a + ")";
    }
}
