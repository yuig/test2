package dy0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f56615a;

    public v(zy.k0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f56615a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f56615a, ((v) obj).f56615a);
    }

    public final int hashCode() {
        return this.f56615a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingRequest(wrapped="), this.f56615a, ")");
    }
}
