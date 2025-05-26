package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f58059a;

    public h1(zy.k0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f58059a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && Intrinsics.d(this.f58059a, ((h1) obj).f58059a);
    }

    public final int hashCode() {
        return this.f58059a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("PinalyticsEffectRequest(effect="), this.f58059a, ")");
    }
}
