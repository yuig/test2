package p50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements t {

    /* renamed from: a, reason: collision with root package name */
    public final String f98884a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f98885b;

    public r(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f98884a = __typename;
        this.f98885b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f98884a, rVar.f98884a) && Intrinsics.d(this.f98885b, rVar.f98885b);
    }

    public final int hashCode() {
        int hashCode = this.f98884a.hashCode() * 31;
        Boolean bool = this.f98885b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BooleanResponseV3WidgetTapsMutation(__typename=");
        sb3.append(this.f98884a);
        sb3.append(", data=");
        return a.c.h(sb3, this.f98885b, ")");
    }
}
