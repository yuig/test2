package tu;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes3.dex */
public final class a0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f119266a;

    public a0(e0 inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f119266a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f119266a, ((a0) obj).f119266a);
    }

    public final int hashCode() {
        return this.f119266a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsEffectRequest(inner="), this.f119266a, ")");
    }
}
