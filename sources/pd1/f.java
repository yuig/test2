package pd1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f99813a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f99814b;

    /* renamed from: c, reason: collision with root package name */
    public final String f99815c;

    /* renamed from: d, reason: collision with root package name */
    public final String f99816d;

    /* renamed from: e, reason: collision with root package name */
    public final String f99817e;

    /* renamed from: f, reason: collision with root package name */
    public final String f99818f;

    /* renamed from: g, reason: collision with root package name */
    public final String f99819g;

    /* renamed from: h, reason: collision with root package name */
    public final String f99820h;

    /* renamed from: i, reason: collision with root package name */
    public final String f99821i;

    /* renamed from: j, reason: collision with root package name */
    public final String f99822j;

    public f(String pinId, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f99813a = pinId;
        this.f99814b = bool;
        this.f99815c = str;
        this.f99816d = str2;
        this.f99817e = str3;
        this.f99818f = str4;
        this.f99819g = str5;
        this.f99820h = str6;
        this.f99821i = str7;
        this.f99822j = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f99813a, fVar.f99813a) && Intrinsics.d(this.f99814b, fVar.f99814b) && Intrinsics.d(this.f99815c, fVar.f99815c) && Intrinsics.d(this.f99816d, fVar.f99816d) && Intrinsics.d(this.f99817e, fVar.f99817e) && Intrinsics.d(this.f99818f, fVar.f99818f) && Intrinsics.d(this.f99819g, fVar.f99819g) && Intrinsics.d(this.f99820h, fVar.f99820h) && Intrinsics.d(this.f99821i, fVar.f99821i) && Intrinsics.d(this.f99822j, fVar.f99822j);
    }

    public final int hashCode() {
        int hashCode = this.f99813a.hashCode() * 31;
        Boolean bool = this.f99814b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f99815c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f99816d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f99817e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f99818f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f99819g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f99820h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f99821i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f99822j;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("STLLandingPageLoaderArgs(pinId=");
        sb3.append(this.f99813a);
        sb3.append(", isShopping=");
        sb3.append(this.f99814b);
        sb3.append(", entrySource=");
        sb3.append(this.f99815c);
        sb3.append(", entryPoint=");
        sb3.append(this.f99816d);
        sb3.append(", cropSource=");
        sb3.append(this.f99817e);
        sb3.append(", requestParams=");
        sb3.append(this.f99818f);
        sb3.append(", x=");
        sb3.append(this.f99819g);
        sb3.append(", y=");
        sb3.append(this.f99820h);
        sb3.append(", w=");
        sb3.append(this.f99821i);
        sb3.append(", h=");
        return a.a.p(sb3, this.f99822j, ")");
    }
}
