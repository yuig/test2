package ct0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f53144a;

    public f(al1.i wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f53144a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f53144a, ((f) obj).f53144a);
    }

    public final int hashCode() {
        return this.f53144a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("WrappedNavigationSideEffectRequest(wrapped="), this.f53144a, ")");
    }
}
