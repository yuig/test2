package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f120320a;

    public e0(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120320a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.d(this.f120320a, ((e0) obj).f120320a);
    }

    public final int hashCode() {
        return this.f120320a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherNode(__typename="), this.f120320a, ")");
    }
}
