package s30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f111021a;

    /* renamed from: b, reason: collision with root package name */
    public final String f111022b;

    /* renamed from: c, reason: collision with root package name */
    public final String f111023c;

    /* renamed from: d, reason: collision with root package name */
    public final String f111024d;

    /* renamed from: e, reason: collision with root package name */
    public final String f111025e;

    public b(a aVar, String str, String str2, String str3, String str4) {
        this.f111021a = aVar;
        this.f111022b = str;
        this.f111023c = str2;
        this.f111024d = str3;
        this.f111025e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f111021a, bVar.f111021a) && Intrinsics.d(this.f111022b, bVar.f111022b) && Intrinsics.d(this.f111023c, bVar.f111023c) && Intrinsics.d(this.f111024d, bVar.f111024d) && Intrinsics.d(this.f111025e, bVar.f111025e);
    }

    public final int hashCode() {
        a aVar = this.f111021a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.f111022b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f111023c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f111024d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f111025e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(image=");
        sb3.append(this.f111021a);
        sb3.append(", actionText=");
        sb3.append(this.f111022b);
        sb3.append(", actionUri=");
        sb3.append(this.f111023c);
        sb3.append(", subtitle=");
        sb3.append(this.f111024d);
        sb3.append(", title=");
        return a.a.p(sb3, this.f111025e, ")");
    }
}
