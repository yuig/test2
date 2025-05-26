package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hb implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132498a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132499b;

    public hb(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132498a = __typename;
        this.f132499b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f132499b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return Intrinsics.d(this.f132498a, hbVar.f132498a) && Intrinsics.d(this.f132499b, hbVar.f132499b);
    }

    public final int hashCode() {
        int hashCode = this.f132498a.hashCode() * 31;
        Boolean bool = this.f132499b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132498a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f132499b, ")");
    }
}
