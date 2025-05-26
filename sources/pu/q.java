package pu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final tu.t f101368a;

    public q(tu.t inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f101368a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f101368a, ((q) obj).f101368a);
    }

    public final int hashCode() {
        return this.f101368a.hashCode();
    }

    public final String toString() {
        return "WrappedWebBrowserEvent(inner=" + this.f101368a + ")";
    }
}
