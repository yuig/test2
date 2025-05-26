package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wc {

    /* renamed from: a, reason: collision with root package name */
    public final String f133622a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133623b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f133624c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133625d;

    public wc(Boolean bool, String str, String str2, boolean z13) {
        this.f133622a = str;
        this.f133623b = bool;
        this.f133624c = z13;
        this.f133625d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc)) {
            return false;
        }
        wc wcVar = (wc) obj;
        return Intrinsics.d(this.f133622a, wcVar.f133622a) && Intrinsics.d(this.f133623b, wcVar.f133623b) && this.f133624c == wcVar.f133624c && Intrinsics.d(this.f133625d, wcVar.f133625d);
    }

    public final int hashCode() {
        String str = this.f133622a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f133623b;
        int e13 = ep.b.e(this.f133624c, (hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        String str2 = this.f133625d;
        return e13 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PageInfo(endCursor=");
        sb3.append(this.f133622a);
        sb3.append(", hasPreviousPage=");
        sb3.append(this.f133623b);
        sb3.append(", hasNextPage=");
        sb3.append(this.f133624c);
        sb3.append(", startCursor=");
        return a.a.p(sb3, this.f133625d, ")");
    }
}
