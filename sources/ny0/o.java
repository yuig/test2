package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements p {

    /* renamed from: a, reason: collision with root package name */
    public final zy.l f92610a;

    public o(zy.l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f92610a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f92610a, ((o) obj).f92610a);
    }

    public final int hashCode() {
        return this.f92610a.hashCode();
    }

    public final String toString() {
        return "WrappedImpressionEvent(event=" + this.f92610a + ")";
    }
}
