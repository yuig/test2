package b91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f22236a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f22237b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22238c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22239d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f22240e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22241f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22242g;

    /* renamed from: h, reason: collision with root package name */
    public final String f22243h;

    /* renamed from: i, reason: collision with root package name */
    public final String f22244i;

    public a(String str, Integer num, int i13, String str2, Boolean bool, int i14, String str3, String str4, String str5) {
        this.f22236a = str;
        this.f22237b = num;
        this.f22238c = i13;
        this.f22239d = str2;
        this.f22240e = bool;
        this.f22241f = i14;
        this.f22242g = str3;
        this.f22243h = str4;
        this.f22244i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!Intrinsics.d(this.f22236a, aVar.f22236a) || !Intrinsics.d(this.f22237b, aVar.f22237b)) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        return Intrinsics.d(bool, bool) && this.f22238c == aVar.f22238c && Intrinsics.d(this.f22239d, aVar.f22239d) && Intrinsics.d(this.f22240e, aVar.f22240e) && this.f22241f == aVar.f22241f && Intrinsics.d(this.f22242g, aVar.f22242g) && Intrinsics.d(this.f22243h, aVar.f22243h) && Intrinsics.d(this.f22244i, aVar.f22244i);
    }

    public final int hashCode() {
        String str = this.f22236a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f22237b;
        int b13 = ep.b.b(this.f22238c, (Boolean.FALSE.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31);
        String str2 = this.f22239d;
        int hashCode2 = (b13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f22240e;
        int b14 = ep.b.b(this.f22241f, (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        String str3 = this.f22242g;
        int hashCode3 = (b14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f22243h;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f22244i;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MakeupProductsRequestParams(pinId=");
        sb3.append(this.f22236a);
        sb3.append(", productCategory=");
        sb3.append(this.f22237b);
        sb3.append(", centerResults=");
        sb3.append(Boolean.FALSE);
        sb3.append(", feedSource=");
        sb3.append(this.f22238c);
        sb3.append(", sourceQuery=");
        sb3.append(this.f22239d);
        sb3.append(", enableProductFilters=");
        sb3.append(this.f22240e);
        sb3.append(", productFiltersRequestType=");
        sb3.append(this.f22241f);
        sb3.append(", colorBucketFilters=");
        sb3.append(this.f22242g);
        sb3.append(", priceBucketFilters=");
        sb3.append(this.f22243h);
        sb3.append(", brandNameFilters=");
        return a.a.p(sb3, this.f22244i, ")");
    }
}
