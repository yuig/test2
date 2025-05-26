package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pb {

    /* renamed from: a, reason: collision with root package name */
    public final String f133036a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133037b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f133038c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133039d;

    public pb(Boolean bool, String str, String str2, boolean z13) {
        this.f133036a = str;
        this.f133037b = bool;
        this.f133038c = z13;
        this.f133039d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb)) {
            return false;
        }
        pb pbVar = (pb) obj;
        return Intrinsics.d(this.f133036a, pbVar.f133036a) && Intrinsics.d(this.f133037b, pbVar.f133037b) && this.f133038c == pbVar.f133038c && Intrinsics.d(this.f133039d, pbVar.f133039d);
    }

    public final int hashCode() {
        String str = this.f133036a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f133037b;
        int e13 = ep.b.e(this.f133038c, (hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        String str2 = this.f133039d;
        return e13 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PageInfo(endCursor=");
        sb3.append(this.f133036a);
        sb3.append(", hasPreviousPage=");
        sb3.append(this.f133037b);
        sb3.append(", hasNextPage=");
        sb3.append(this.f133038c);
        sb3.append(", startCursor=");
        return a.a.p(sb3, this.f133039d, ")");
    }
}
