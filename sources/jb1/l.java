package jb1;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes5.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f75349a;

    public l(e0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f75349a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f75349a, ((l) obj).f75349a);
    }

    public final int hashCode() {
        return this.f75349a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsSideEffect(wrapped="), this.f75349a, ")");
    }
}
