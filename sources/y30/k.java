package y30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f136750a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f136751b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f136752c;

    /* renamed from: d, reason: collision with root package name */
    public final String f136753d;

    public k(Boolean bool, String str, String str2, boolean z13) {
        this.f136750a = str;
        this.f136751b = z13;
        this.f136752c = bool;
        this.f136753d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f136750a, kVar.f136750a) && this.f136751b == kVar.f136751b && Intrinsics.d(this.f136752c, kVar.f136752c) && Intrinsics.d(this.f136753d, kVar.f136753d);
    }

    public final int hashCode() {
        String str = this.f136750a;
        int e13 = ep.b.e(this.f136751b, (str == null ? 0 : str.hashCode()) * 31, 31);
        Boolean bool = this.f136752c;
        int hashCode = (e13 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f136753d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PageInfo(endCursor=");
        sb3.append(this.f136750a);
        sb3.append(", hasNextPage=");
        sb3.append(this.f136751b);
        sb3.append(", hasPreviousPage=");
        sb3.append(this.f136752c);
        sb3.append(", startCursor=");
        return a.a.p(sb3, this.f136753d, ")");
    }
}
