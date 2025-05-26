package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f120442a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f120443b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120444c;

    public y(String __typename, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120442a = __typename;
        this.f120443b = bool;
        this.f120444c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f120442a, yVar.f120442a) && Intrinsics.d(this.f120443b, yVar.f120443b) && Intrinsics.d(this.f120444c, yVar.f120444c);
    }

    public final int hashCode() {
        int hashCode = this.f120442a.hashCode() * 31;
        Boolean bool = this.f120443b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f120444c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f120442a);
        sb3.append(", verified=");
        sb3.append(this.f120443b);
        sb3.append(", name=");
        return a.a.p(sb3, this.f120444c, ")");
    }
}
