package rb1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements t {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f107093a;

    public r(al1.a wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f107093a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f107093a, ((r) obj).f107093a);
    }

    public final int hashCode() {
        return this.f107093a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("WrappedPasscodeNavigationRequest(wrapped="), this.f107093a, ")");
    }
}
