package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rg {

    /* renamed from: a, reason: collision with root package name */
    public final String f133210a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133211b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133212c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f133213d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f133214e;

    /* renamed from: f, reason: collision with root package name */
    public final String f133215f;

    public rg(String __typename, String str, String str2, Integer num, Integer num2, String str3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133210a = __typename;
        this.f133211b = str;
        this.f133212c = str2;
        this.f133213d = num;
        this.f133214e = num2;
        this.f133215f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg)) {
            return false;
        }
        rg rgVar = (rg) obj;
        return Intrinsics.d(this.f133210a, rgVar.f133210a) && Intrinsics.d(this.f133211b, rgVar.f133211b) && Intrinsics.d(this.f133212c, rgVar.f133212c) && Intrinsics.d(this.f133213d, rgVar.f133213d) && Intrinsics.d(this.f133214e, rgVar.f133214e) && Intrinsics.d(this.f133215f, rgVar.f133215f);
    }

    public final int hashCode() {
        int hashCode = this.f133210a.hashCode() * 31;
        String str = this.f133211b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133212c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f133213d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133214e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f133215f;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageMediumDetails(__typename=");
        sb3.append(this.f133210a);
        sb3.append(", type=");
        sb3.append(this.f133211b);
        sb3.append(", dominantColor=");
        sb3.append(this.f133212c);
        sb3.append(", width=");
        sb3.append(this.f133213d);
        sb3.append(", height=");
        sb3.append(this.f133214e);
        sb3.append(", url=");
        return a.a.p(sb3, this.f133215f, ")");
    }
}
