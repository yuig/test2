package u01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f119974a;

    /* renamed from: b, reason: collision with root package name */
    public final String f119975b;

    /* renamed from: c, reason: collision with root package name */
    public final String f119976c;

    public y(String pinId, String str, String str2) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f119974a = pinId;
        this.f119975b = str;
        this.f119976c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f119974a, yVar.f119974a) && Intrinsics.d(this.f119975b, yVar.f119975b) && Intrinsics.d(this.f119976c, yVar.f119976c);
    }

    public final int hashCode() {
        int hashCode = this.f119974a.hashCode() * 31;
        String str = this.f119975b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f119976c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShoppingModuleRequestParams(pinId=");
        sb3.append(this.f119974a);
        sb3.append(", source=");
        sb3.append(this.f119975b);
        sb3.append(", searchQuery=");
        return a.a.p(sb3, this.f119976c, ")");
    }
}
