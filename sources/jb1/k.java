package jb1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f75348a;

    public k(al1.a wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f75348a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f75348a, ((k) obj).f75348a);
    }

    public final int hashCode() {
        return this.f75348a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("WrappedPasscodeNavigationSideEffect(wrapped="), this.f75348a, ")");
    }
}
