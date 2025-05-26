package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bb implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132039a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132040b;

    public bb(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132039a = __typename;
        this.f132040b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f132040b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return Intrinsics.d(this.f132039a, bbVar.f132039a) && Intrinsics.d(this.f132040b, bbVar.f132040b);
    }

    public final int hashCode() {
        int hashCode = this.f132039a.hashCode() * 31;
        Boolean bool = this.f132040b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132039a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f132040b, ")");
    }
}
