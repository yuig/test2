package y90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final m62.f0 f138189a;

    public i(m62.f0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f138189a = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f138189a, ((i) obj).f138189a);
    }

    public final int hashCode() {
        return this.f138189a.hashCode();
    }

    public final String toString() {
        return "ActionDispatched(action=" + this.f138189a + ")";
    }
}
