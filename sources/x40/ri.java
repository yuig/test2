package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ri implements qi {

    /* renamed from: a, reason: collision with root package name */
    public final String f133218a;

    public ri(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133218a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ri) && Intrinsics.d(this.f133218a, ((ri) obj).f133218a);
    }

    public final int hashCode() {
        return this.f133218a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherFollowers(__typename="), this.f133218a, ")");
    }
}
