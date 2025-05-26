package c61;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements y {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f26644a;

    public v(ll1.d fragmentLifecycleEvent) {
        Intrinsics.checkNotNullParameter(fragmentLifecycleEvent, "fragmentLifecycleEvent");
        this.f26644a = fragmentLifecycleEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f26644a, ((v) obj).f26644a);
    }

    public final int hashCode() {
        return this.f26644a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("WrappedFragmentLifecycleEvent(fragmentLifecycleEvent="), this.f26644a, ")");
    }
}
