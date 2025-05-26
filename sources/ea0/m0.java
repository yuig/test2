package ea0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f57978a;

    public m0(o82.g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f57978a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && Intrinsics.d(this.f57978a, ((m0) obj).f57978a);
    }

    public final int hashCode() {
        return this.f57978a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("SectionEvent(event="), this.f57978a, ")");
    }
}
