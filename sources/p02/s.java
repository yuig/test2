package p02;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes4.dex */
public final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f98460a;

    public s(e0 inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f98460a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f98460a, ((s) obj).f98460a);
    }

    public final int hashCode() {
        return this.f98460a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsEffect(inner="), this.f98460a, ")");
    }
}
