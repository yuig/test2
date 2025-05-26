package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f120330a;

    public h(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120330a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f120330a, ((h) obj).f120330a);
    }

    public final int hashCode() {
        return this.f120330a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherData(__typename="), this.f120330a, ")");
    }
}
