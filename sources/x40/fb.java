package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fb implements mb, z40.m {

    /* renamed from: a, reason: collision with root package name */
    public final String f132408a;

    public fb(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132408a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fb) && Intrinsics.d(this.f132408a, ((fb) obj).f132408a);
    }

    public final int hashCode() {
        return this.f132408a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherUsers(__typename="), this.f132408a, ")");
    }
}
