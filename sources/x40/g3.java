package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g3 implements f3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132429a;

    public g3(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132429a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3) && Intrinsics.d(this.f132429a, ((g3) obj).f132429a);
    }

    public final int hashCode() {
        return this.f132429a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherNode(__typename="), this.f132429a, ")");
    }
}
