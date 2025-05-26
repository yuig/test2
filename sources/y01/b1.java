package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f136386a;

    public b1(al1.a wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f136386a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && Intrinsics.d(this.f136386a, ((b1) obj).f136386a);
    }

    public final int hashCode() {
        return this.f136386a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("PinSwipeFragmentNavigationSER(wrapped="), this.f136386a, ")");
    }
}
