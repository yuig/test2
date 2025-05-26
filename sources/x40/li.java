package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class li {

    /* renamed from: a, reason: collision with root package name */
    public final String f132796a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132797b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132798c;

    /* renamed from: d, reason: collision with root package name */
    public final String f132799d;

    public li(String __typename, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132796a = __typename;
        this.f132797b = str;
        this.f132798c = str2;
        this.f132799d = str3;
    }

    public final String a() {
        return this.f132799d;
    }

    public final String b() {
        return this.f132797b;
    }

    public final String c() {
        return this.f132798c;
    }

    public final String d() {
        return this.f132796a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li)) {
            return false;
        }
        li liVar = (li) obj;
        return Intrinsics.d(this.f132796a, liVar.f132796a) && Intrinsics.d(this.f132797b, liVar.f132797b) && Intrinsics.d(this.f132798c, liVar.f132798c) && Intrinsics.d(this.f132799d, liVar.f132799d);
    }

    public final int hashCode() {
        int hashCode = this.f132796a.hashCode() * 31;
        String str = this.f132797b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132798c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132799d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContactDetails(__typename=");
        sb3.append(this.f132796a);
        sb3.append(", phoneCountry=");
        sb3.append(this.f132797b);
        sb3.append(", phoneNumber=");
        sb3.append(this.f132798c);
        sb3.append(", email=");
        return a.a.p(sb3, this.f132799d, ")");
    }
}
