package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f6 implements g6 {

    /* renamed from: d, reason: collision with root package name */
    public final String f132375d;

    public f6(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132375d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6) && Intrinsics.d(this.f132375d, ((f6) obj).f132375d);
    }

    public final int hashCode() {
        return this.f132375d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3CreateThreadMutation(__typename="), this.f132375d, ")");
    }
}
