package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j1 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132583a;

    public j1(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132583a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && Intrinsics.d(this.f132583a, ((j1) obj).f132583a);
    }

    public final int hashCode() {
        return this.f132583a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherNode(__typename="), this.f132583a, ")");
    }
}
