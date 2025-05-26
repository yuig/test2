package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f120316a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f120317b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f120318c;

    /* renamed from: d, reason: collision with root package name */
    public final String f120319d;

    public d1(Boolean bool, String str, String str2, boolean z13) {
        this.f120316a = str;
        this.f120317b = z13;
        this.f120318c = bool;
        this.f120319d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Intrinsics.d(this.f120316a, d1Var.f120316a) && this.f120317b == d1Var.f120317b && Intrinsics.d(this.f120318c, d1Var.f120318c) && Intrinsics.d(this.f120319d, d1Var.f120319d);
    }

    public final int hashCode() {
        String str = this.f120316a;
        int e13 = ep.b.e(this.f120317b, (str == null ? 0 : str.hashCode()) * 31, 31);
        Boolean bool = this.f120318c;
        int hashCode = (e13 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f120319d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PageInfo(endCursor=");
        sb3.append(this.f120316a);
        sb3.append(", hasNextPage=");
        sb3.append(this.f120317b);
        sb3.append(", hasPreviousPage=");
        sb3.append(this.f120318c);
        sb3.append(", startCursor=");
        return a.a.p(sb3, this.f120319d, ")");
    }
}
