package ns;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f91910a;

    public f(ll1.d fragmentLifecycleEvent) {
        Intrinsics.checkNotNullParameter(fragmentLifecycleEvent, "fragmentLifecycleEvent");
        this.f91910a = fragmentLifecycleEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f91910a, ((f) obj).f91910a);
    }

    public final int hashCode() {
        return this.f91910a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("WrappedFragmentLifecycleEvent(fragmentLifecycleEvent="), this.f91910a, ")");
    }
}
