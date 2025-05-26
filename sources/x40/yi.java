package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yi {

    /* renamed from: a, reason: collision with root package name */
    public final String f133753a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f133754b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f133755c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133756d;

    public yi(Boolean bool, String str, String str2, boolean z13) {
        this.f133753a = str;
        this.f133754b = z13;
        this.f133755c = bool;
        this.f133756d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi)) {
            return false;
        }
        yi yiVar = (yi) obj;
        return Intrinsics.d(this.f133753a, yiVar.f133753a) && this.f133754b == yiVar.f133754b && Intrinsics.d(this.f133755c, yiVar.f133755c) && Intrinsics.d(this.f133756d, yiVar.f133756d);
    }

    public final int hashCode() {
        String str = this.f133753a;
        int e13 = ep.b.e(this.f133754b, (str == null ? 0 : str.hashCode()) * 31, 31);
        Boolean bool = this.f133755c;
        int hashCode = (e13 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f133756d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PageInfo(endCursor=");
        sb3.append(this.f133753a);
        sb3.append(", hasNextPage=");
        sb3.append(this.f133754b);
        sb3.append(", hasPreviousPage=");
        sb3.append(this.f133755c);
        sb3.append(", startCursor=");
        return a.a.p(sb3, this.f133756d, ")");
    }
}
