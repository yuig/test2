package ou;

import kotlin.jvm.internal.Intrinsics;
import pu.r;
import u50.s;

/* loaded from: classes3.dex */
public final class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final r f97684a;

    public c(r inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f97684a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f97684a, ((c) obj).f97684a);
    }

    public final int hashCode() {
        return this.f97684a.hashCode();
    }

    public final String toString() {
        return "WrappedAdsCoreEvent(inner=" + this.f97684a + ")";
    }
}
