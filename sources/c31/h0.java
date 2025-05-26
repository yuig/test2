package c31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f31.k0 f25583a;

    public h0(f31.k0 searchEffect) {
        Intrinsics.checkNotNullParameter(searchEffect, "searchEffect");
        this.f25583a = searchEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.d(this.f25583a, ((h0) obj).f25583a);
    }

    public final int hashCode() {
        return this.f25583a.hashCode();
    }

    public final String toString() {
        return "WrappedSearchSideEffectRequest(searchEffect=" + this.f25583a + ")";
    }
}
