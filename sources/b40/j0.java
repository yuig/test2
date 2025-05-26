package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f21719a;

    public j0(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f21719a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.d(this.f21719a, ((j0) obj).f21719a);
    }

    public final int hashCode() {
        return this.f21719a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Data(id="), this.f21719a, ")");
    }
}
