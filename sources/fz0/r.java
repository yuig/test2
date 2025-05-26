package fz0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f63149a;

    public r(al1.i wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f63149a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f63149a, ((r) obj).f63149a);
    }

    public final int hashCode() {
        return this.f63149a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigateToResult(wrapped="), this.f63149a, ")");
    }
}
