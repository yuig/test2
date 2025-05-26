package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class oh {

    /* renamed from: a, reason: collision with root package name */
    public final String f132996a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132997b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f132998c;

    /* renamed from: d, reason: collision with root package name */
    public final String f132999d;

    public oh(Boolean bool, String str, String str2, boolean z13) {
        this.f132996a = str;
        this.f132997b = bool;
        this.f132998c = z13;
        this.f132999d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh)) {
            return false;
        }
        oh ohVar = (oh) obj;
        return Intrinsics.d(this.f132996a, ohVar.f132996a) && Intrinsics.d(this.f132997b, ohVar.f132997b) && this.f132998c == ohVar.f132998c && Intrinsics.d(this.f132999d, ohVar.f132999d);
    }

    public final int hashCode() {
        String str = this.f132996a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f132997b;
        int e13 = ep.b.e(this.f132998c, (hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        String str2 = this.f132999d;
        return e13 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PageInfo(endCursor=");
        sb3.append(this.f132996a);
        sb3.append(", hasPreviousPage=");
        sb3.append(this.f132997b);
        sb3.append(", hasNextPage=");
        sb3.append(this.f132998c);
        sb3.append(", startCursor=");
        return a.a.p(sb3, this.f132999d, ")");
    }
}
