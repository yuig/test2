package fa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f61528a;

    public q0(o82.g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f61528a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && Intrinsics.d(this.f61528a, ((q0) obj).f61528a);
    }

    public final int hashCode() {
        return this.f61528a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("SectionEvent(event="), this.f61528a, ")");
    }
}
