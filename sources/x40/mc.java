package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mc implements jc {

    /* renamed from: d, reason: collision with root package name */
    public final String f132820d;

    public mc(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132820d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mc) && Intrinsics.d(this.f132820d, ((mc) obj).f132820d);
    }

    public final int hashCode() {
        return this.f132820d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherData(__typename="), this.f132820d, ")");
    }
}
