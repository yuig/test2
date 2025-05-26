package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bj {

    /* renamed from: a, reason: collision with root package name */
    public final String f132061a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132062b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132063c;

    public bj(String __typename, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132061a = __typename;
        this.f132062b = bool;
        this.f132063c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        return Intrinsics.d(this.f132061a, bjVar.f132061a) && Intrinsics.d(this.f132062b, bjVar.f132062b) && Intrinsics.d(this.f132063c, bjVar.f132063c);
    }

    public final int hashCode() {
        int hashCode = this.f132061a.hashCode() * 31;
        Boolean bool = this.f132062b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f132063c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132061a);
        sb3.append(", verified=");
        sb3.append(this.f132062b);
        sb3.append(", name=");
        return a.a.p(sb3, this.f132063c, ")");
    }
}
