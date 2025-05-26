package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.y f92595a;

    public h0(zy.y wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f92595a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.d(this.f92595a, ((h0) obj).f92595a);
    }

    public final int hashCode() {
        return this.f92595a.hashCode();
    }

    public final String toString() {
        return "ImpressionRequest(wrapped=" + this.f92595a + ")";
    }
}
