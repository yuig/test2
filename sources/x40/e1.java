package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132298a;

    public e1(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132298a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && Intrinsics.d(this.f132298a, ((e1) obj).f132298a);
    }

    public final int hashCode() {
        return this.f132298a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherNode(__typename="), this.f132298a, ")");
    }
}
