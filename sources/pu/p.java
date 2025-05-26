package pu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final mu.m f101367a;

    public p(mu.m inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f101367a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f101367a, ((p) obj).f101367a);
    }

    public final int hashCode() {
        return this.f101367a.hashCode();
    }

    public final String toString() {
        return "WrappedBaseEvent(inner=" + this.f101367a + ")";
    }
}
