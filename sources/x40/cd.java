package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cd implements id {

    /* renamed from: a, reason: collision with root package name */
    public final String f132147a;

    public cd(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132147a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd) && Intrinsics.d(this.f132147a, ((cd) obj).f132147a);
    }

    public final int hashCode() {
        return this.f132147a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherUsers(__typename="), this.f132147a, ")");
    }
}
