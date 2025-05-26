package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zg implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133828a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133829b;

    public zg(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133828a = __typename;
        this.f133829b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133829b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg)) {
            return false;
        }
        zg zgVar = (zg) obj;
        return Intrinsics.d(this.f133828a, zgVar.f133828a) && Intrinsics.d(this.f133829b, zgVar.f133829b);
    }

    public final int hashCode() {
        int hashCode = this.f133828a.hashCode() * 31;
        Boolean bool = this.f133829b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133828a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133829b, ")");
    }
}
