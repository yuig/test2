package y90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements q {

    /* renamed from: a, reason: collision with root package name */
    public final m62.f0 f138202a;

    public m(m62.f0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f138202a = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f138202a, ((m) obj).f138202a);
    }

    public final int hashCode() {
        return this.f138202a.hashCode();
    }

    public final String toString() {
        return "EffectsViewActionConsumed(action=" + this.f138202a + ")";
    }
}
