package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements l {

    /* renamed from: d, reason: collision with root package name */
    public final String f74614d;

    public o(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f74614d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f74614d, ((o) obj).f74614d);
    }

    public final int hashCode() {
        return this.f74614d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherData(__typename="), this.f74614d, ")");
    }
}
