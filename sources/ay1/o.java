package ay1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f20682a;

    public o(g0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f20682a = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f20682a, ((o) obj).f20682a);
    }

    public final int hashCode() {
        return this.f20682a.hashCode();
    }

    public final String toString() {
        return "UpdateSavedToBoard(state=" + this.f20682a + ")";
    }
}
