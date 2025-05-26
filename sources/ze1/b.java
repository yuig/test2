package ze1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f141805a;

    /* renamed from: b, reason: collision with root package name */
    public final String f141806b;

    /* renamed from: c, reason: collision with root package name */
    public final String f141807c;

    public b(String str, String str2, String str3) {
        this.f141805a = str;
        this.f141806b = str2;
        this.f141807c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f141805a, bVar.f141805a) && Intrinsics.d(this.f141806b, bVar.f141806b) && Intrinsics.d(this.f141807c, bVar.f141807c);
    }

    public final int hashCode() {
        String str = this.f141805a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f141806b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f141807c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProductPinMetadata(price=");
        sb3.append(this.f141805a);
        sb3.append(", title=");
        sb3.append(this.f141806b);
        sb3.append(", merchantName=");
        return a.a.p(sb3, this.f141807c, ")");
    }
}
