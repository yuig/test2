package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ni {

    /* renamed from: a, reason: collision with root package name */
    public final String f132901a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132902b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132903c;

    /* renamed from: d, reason: collision with root package name */
    public final String f132904d;

    /* renamed from: e, reason: collision with root package name */
    public final String f132905e;

    /* renamed from: f, reason: collision with root package name */
    public final String f132906f;

    /* renamed from: g, reason: collision with root package name */
    public final String f132907g;

    /* renamed from: h, reason: collision with root package name */
    public final Double f132908h;

    /* renamed from: i, reason: collision with root package name */
    public final Double f132909i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132910j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132911k;

    public ni(String __typename, String id3, String entityId, String str, String str2, String str3, String str4, Double d2, Double d13, String str5, String str6) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132901a = __typename;
        this.f132902b = id3;
        this.f132903c = entityId;
        this.f132904d = str;
        this.f132905e = str2;
        this.f132906f = str3;
        this.f132907g = str4;
        this.f132908h = d2;
        this.f132909i = d13;
        this.f132910j = str5;
        this.f132911k = str6;
    }

    public final String a() {
        return this.f132906f;
    }

    public final String b() {
        return this.f132903c;
    }

    public final String c() {
        return this.f132904d;
    }

    public final String d() {
        return this.f132902b;
    }

    public final Double e() {
        return this.f132908h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni)) {
            return false;
        }
        ni niVar = (ni) obj;
        return Intrinsics.d(this.f132901a, niVar.f132901a) && Intrinsics.d(this.f132902b, niVar.f132902b) && Intrinsics.d(this.f132903c, niVar.f132903c) && Intrinsics.d(this.f132904d, niVar.f132904d) && Intrinsics.d(this.f132905e, niVar.f132905e) && Intrinsics.d(this.f132906f, niVar.f132906f) && Intrinsics.d(this.f132907g, niVar.f132907g) && Intrinsics.d(this.f132908h, niVar.f132908h) && Intrinsics.d(this.f132909i, niVar.f132909i) && Intrinsics.d(this.f132910j, niVar.f132910j) && Intrinsics.d(this.f132911k, niVar.f132911k);
    }

    public final String f() {
        return this.f132910j;
    }

    public final Double g() {
        return this.f132909i;
    }

    public final String h() {
        return this.f132905e;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132903c, a.cb.d(this.f132902b, this.f132901a.hashCode() * 31, 31), 31);
        String str = this.f132904d;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132905e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132906f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132907g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d13 = this.f132908h;
        int hashCode5 = (hashCode4 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f132909i;
        int hashCode6 = (hashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str5 = this.f132910j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132911k;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String i() {
        return this.f132911k;
    }

    public final String j() {
        return this.f132907g;
    }

    public final String k() {
        return this.f132901a;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProfilePlace(__typename=");
        sb3.append(this.f132901a);
        sb3.append(", id=");
        sb3.append(this.f132902b);
        sb3.append(", entityId=");
        sb3.append(this.f132903c);
        sb3.append(", extraStreet=");
        sb3.append(this.f132904d);
        sb3.append(", postalCode=");
        sb3.append(this.f132905e);
        sb3.append(", country=");
        sb3.append(this.f132906f);
        sb3.append(", street=");
        sb3.append(this.f132907g);
        sb3.append(", latitude=");
        sb3.append(this.f132908h);
        sb3.append(", longitude=");
        sb3.append(this.f132909i);
        sb3.append(", locality=");
        sb3.append(this.f132910j);
        sb3.append(", region=");
        return a.a.p(sb3, this.f132911k, ")");
    }
}
