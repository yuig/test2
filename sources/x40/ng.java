package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ng implements kg {

    /* renamed from: d, reason: collision with root package name */
    public final String f132899d;

    public ng(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132899d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng) && Intrinsics.d(this.f132899d, ((ng) obj).f132899d);
    }

    public final int hashCode() {
        return this.f132899d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherData(__typename="), this.f132899d, ")");
    }
}
