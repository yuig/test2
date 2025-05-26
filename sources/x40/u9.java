package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u9 implements r9 {

    /* renamed from: d, reason: collision with root package name */
    public final String f133457d;

    public u9(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133457d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u9) && Intrinsics.d(this.f133457d, ((u9) obj).f133457d);
    }

    public final int hashCode() {
        return this.f133457d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherData(__typename="), this.f133457d, ")");
    }
}
