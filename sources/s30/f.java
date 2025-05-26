package s30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f implements g {

    /* renamed from: d, reason: collision with root package name */
    public final String f111032d;

    public f(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f111032d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f111032d, ((f) obj).f111032d);
    }

    public final int hashCode() {
        return this.f111032d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3AndroidCubesSignInQuery(__typename="), this.f111032d, ")");
    }
}
