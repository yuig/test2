package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ba implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132037a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132038b;

    public ba(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132037a = __typename;
        this.f132038b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f132038b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return Intrinsics.d(this.f132037a, baVar.f132037a) && Intrinsics.d(this.f132038b, baVar.f132038b);
    }

    public final int hashCode() {
        int hashCode = this.f132037a.hashCode() * 31;
        Boolean bool = this.f132038b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132037a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f132038b, ")");
    }
}
