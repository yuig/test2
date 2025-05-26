package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x8 implements e9, z40.m {

    /* renamed from: a, reason: collision with root package name */
    public final String f133677a;

    public x8(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133677a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8) && Intrinsics.d(this.f133677a, ((x8) obj).f133677a);
    }

    public final int hashCode() {
        return this.f133677a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherUsers(__typename="), this.f133677a, ")");
    }
}
