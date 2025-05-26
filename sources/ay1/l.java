package ay1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l implements q {

    /* renamed from: a, reason: collision with root package name */
    public final c f20679a;

    public l(a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f20679a = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f20679a, ((l) obj).f20679a);
    }

    public final int hashCode() {
        return this.f20679a.hashCode();
    }

    public final String toString() {
        return "UpdateParentPinStats(state=" + this.f20679a + ")";
    }
}
