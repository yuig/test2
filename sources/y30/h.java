package y30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f136739a;

    public h(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f136739a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f136739a, ((h) obj).f136739a);
    }

    public final int hashCode() {
        return this.f136739a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherNode(__typename="), this.f136739a, ")");
    }
}
