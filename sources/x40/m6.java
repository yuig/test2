package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m6 implements n6 {

    /* renamed from: d, reason: collision with root package name */
    public final String f132809d;

    public m6(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132809d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6) && Intrinsics.d(this.f132809d, ((m6) obj).f132809d);
    }

    public final int hashCode() {
        return this.f132809d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3DeclineContactRequestsMutation(__typename="), this.f132809d, ")");
    }
}
