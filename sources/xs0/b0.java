package xs0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f135781a;

    public b0(k92.n effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f135781a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f135781a, ((b0) obj).f135781a);
    }

    public final int hashCode() {
        return this.f135781a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("WrappedToastSideEffectRequest(effect="), this.f135781a, ")");
    }
}
