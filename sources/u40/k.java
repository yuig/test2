package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f120353a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f120354b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120355c;

    public k(String __typename, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120353a = __typename;
        this.f120354b = bool;
        this.f120355c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f120353a, kVar.f120353a) && Intrinsics.d(this.f120354b, kVar.f120354b) && Intrinsics.d(this.f120355c, kVar.f120355c);
    }

    public final int hashCode() {
        int hashCode = this.f120353a.hashCode() * 31;
        Boolean bool = this.f120354b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f120355c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f120353a);
        sb3.append(", verified=");
        sb3.append(this.f120354b);
        sb3.append(", name=");
        return a.a.p(sb3, this.f120355c, ")");
    }
}
