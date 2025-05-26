package s02;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes4.dex */
public final class u implements v {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f110356a;

    public u(e0 inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f110356a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f110356a, ((u) obj).f110356a);
    }

    public final int hashCode() {
        return this.f110356a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsEffect(inner="), this.f110356a, ")");
    }
}
