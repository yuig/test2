package p50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f98860a;

    public d(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f98860a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f98860a, ((d) obj).f98860a);
    }

    public final int hashCode() {
        return this.f98860a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherData(__typename="), this.f98860a, ")");
    }
}
