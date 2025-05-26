package r40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f106145a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f106146b;

    /* renamed from: c, reason: collision with root package name */
    public final String f106147c;

    public g(String __typename, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f106145a = __typename;
        this.f106146b = bool;
        this.f106147c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f106145a, gVar.f106145a) && Intrinsics.d(this.f106146b, gVar.f106146b) && Intrinsics.d(this.f106147c, gVar.f106147c);
    }

    public final int hashCode() {
        int hashCode = this.f106145a.hashCode() * 31;
        Boolean bool = this.f106146b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f106147c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f106145a);
        sb3.append(", verified=");
        sb3.append(this.f106146b);
        sb3.append(", name=");
        return a.a.p(sb3, this.f106147c, ")");
    }
}
