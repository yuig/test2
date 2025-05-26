package iz0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements x {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f73936a;

    public v(al1.i wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f73936a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f73936a, ((v) obj).f73936a);
    }

    public final int hashCode() {
        return this.f73936a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigateToQuiz(wrapped="), this.f73936a, ")");
    }
}
