package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final x62.n f124971a;

    public y0(x62.n mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f124971a = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && this.f124971a == ((y0) obj).f124971a;
    }

    public final int hashCode() {
        return this.f124971a.hashCode();
    }

    public final String toString() {
        return "UpdateRefineMaskMode(mode=" + this.f124971a + ")";
    }
}
