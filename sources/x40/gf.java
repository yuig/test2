package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gf implements ff {

    /* renamed from: a, reason: collision with root package name */
    public final String f132453a;

    public gf(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132453a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gf) && Intrinsics.d(this.f132453a, ((gf) obj).f132453a);
    }

    public final int hashCode() {
        return this.f132453a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherNode(__typename="), this.f132453a, ")");
    }
}
