package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g4 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132430a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132431b;

    public g4(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132430a = __typename;
        this.f132431b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f132431b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return Intrinsics.d(this.f132430a, g4Var.f132430a) && Intrinsics.d(this.f132431b, g4Var.f132431b);
    }

    public final int hashCode() {
        int hashCode = this.f132430a.hashCode() * 31;
        Boolean bool = this.f132431b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132430a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f132431b, ")");
    }
}
