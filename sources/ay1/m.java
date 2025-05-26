package ay1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements q {

    /* renamed from: a, reason: collision with root package name */
    public final f f20680a;

    public m(f state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f20680a = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f20680a, ((m) obj).f20680a);
    }

    public final int hashCode() {
        return this.f20680a.hashCode();
    }

    public final String toString() {
        return "UpdatePinMetrics(state=" + this.f20680a + ")";
    }
}
