package c31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f25582a;

    public h(ll1.d innerEvent) {
        Intrinsics.checkNotNullParameter(innerEvent, "innerEvent");
        this.f25582a = innerEvent;
    }

    @Override // c31.f
    public final u50.s d() {
        return this.f25582a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f25582a, ((h) obj).f25582a);
    }

    public final int hashCode() {
        return this.f25582a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("WrappedLifecycleEvent(innerEvent="), this.f25582a, ")");
    }
}
