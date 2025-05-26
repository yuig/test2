package kb1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements s {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f79093a;

    public q(al1.a wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f79093a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f79093a, ((q) obj).f79093a);
    }

    public final int hashCode() {
        return this.f79093a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("WrappedPasscodeNavigationSideEffect(wrapped="), this.f79093a, ")");
    }
}
