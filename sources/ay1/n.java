package ay1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n implements q {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f20681a;

    public n(c0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f20681a = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f20681a, ((n) obj).f20681a);
    }

    public final int hashCode() {
        return this.f20681a.hashCode();
    }

    public final String toString() {
        return "UpdateRootPin(state=" + this.f20681a + ")";
    }
}
