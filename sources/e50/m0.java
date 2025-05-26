package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f57391a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f57392b;

    /* renamed from: c, reason: collision with root package name */
    public final String f57393c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57394d;

    public m0(Boolean bool, String str, String str2, boolean z13) {
        this.f57391a = z13;
        this.f57392b = bool;
        this.f57393c = str;
        this.f57394d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f57391a == m0Var.f57391a && Intrinsics.d(this.f57392b, m0Var.f57392b) && Intrinsics.d(this.f57393c, m0Var.f57393c) && Intrinsics.d(this.f57394d, m0Var.f57394d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f57391a) * 31;
        Boolean bool = this.f57392b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f57393c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57394d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PageInfo(hasNextPage=");
        sb3.append(this.f57391a);
        sb3.append(", hasPreviousPage=");
        sb3.append(this.f57392b);
        sb3.append(", startCursor=");
        sb3.append(this.f57393c);
        sb3.append(", endCursor=");
        return a.a.p(sb3, this.f57394d, ")");
    }
}
