package f31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f61008a;

    public g0(h32.i0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f61008a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.d(this.f61008a, ((g0) obj).f61008a);
    }

    public final int hashCode() {
        return this.f61008a.hashCode();
    }

    public final String toString() {
        return "LogSearchBarClick(context=" + this.f61008a + ")";
    }
}
