package n70;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f89620a;

    public k(ll1.d wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f89620a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f89620a, ((k) obj).f89620a);
    }

    public final int hashCode() {
        return this.f89620a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("WrappedLifecycleEvent(wrapped="), this.f89620a, ")");
    }
}
