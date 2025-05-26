package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w2 implements d3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133570a;

    public w2(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133570a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2) && Intrinsics.d(this.f133570a, ((w2) obj).f133570a);
    }

    public final int hashCode() {
        return this.f133570a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherUsers(__typename="), this.f133570a, ")");
    }
}
