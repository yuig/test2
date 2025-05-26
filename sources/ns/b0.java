package ns;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f91898a;

    public b0(k92.n wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f91898a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f91898a, ((b0) obj).f91898a);
    }

    public final int hashCode() {
        return this.f91898a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("WrappedToastRequest(wrapped="), this.f91898a, ")");
    }
}
