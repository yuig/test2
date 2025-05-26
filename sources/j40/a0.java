package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements b0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f74593d;

    public a0(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f74593d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f74593d, ((a0) obj).f74593d);
    }

    public final int hashCode() {
        return this.f74593d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3OrientationStatusQuery(__typename="), this.f74593d, ")");
    }
}
