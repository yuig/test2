package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 implements w0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f120441d;

    public x0(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120441d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && Intrinsics.d(this.f120441d, ((x0) obj).f120441d);
    }

    public final int hashCode() {
        return this.f120441d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherFollowers(__typename="), this.f120441d, ")");
    }
}
