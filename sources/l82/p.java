package l82;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f82245a;

    public p(bo2.e customContext) {
        Intrinsics.checkNotNullParameter(customContext, "customContext");
        this.f82245a = customContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f82245a, ((p) obj).f82245a);
    }

    public final int hashCode() {
        return this.f82245a.hashCode();
    }

    public final String toString() {
        return "Tuning(customContext=" + this.f82245a + ")";
    }
}
