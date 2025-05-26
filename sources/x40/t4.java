package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t4 implements a5, z40.m {

    /* renamed from: a, reason: collision with root package name */
    public final String f133328a;

    public t4(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133328a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t4) && Intrinsics.d(this.f133328a, ((t4) obj).f133328a);
    }

    public final int hashCode() {
        return this.f133328a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherUsers(__typename="), this.f133328a, ")");
    }
}
