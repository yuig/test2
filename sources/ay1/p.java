package ay1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f20683a;

    public p(k0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f20683a = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f20683a, ((p) obj).f20683a);
    }

    public final int hashCode() {
        return this.f20683a.hashCode();
    }

    public final String toString() {
        return "UpdateVideoMetrics(state=" + this.f20683a + ")";
    }
}
