package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pg {

    /* renamed from: a, reason: collision with root package name */
    public final String f133044a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133045b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133046c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f133047d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f133048e;

    /* renamed from: f, reason: collision with root package name */
    public final String f133049f;

    public pg(String __typename, String str, String str2, Integer num, Integer num2, String str3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133044a = __typename;
        this.f133045b = str;
        this.f133046c = str2;
        this.f133047d = num;
        this.f133048e = num2;
        this.f133049f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg)) {
            return false;
        }
        pg pgVar = (pg) obj;
        return Intrinsics.d(this.f133044a, pgVar.f133044a) && Intrinsics.d(this.f133045b, pgVar.f133045b) && Intrinsics.d(this.f133046c, pgVar.f133046c) && Intrinsics.d(this.f133047d, pgVar.f133047d) && Intrinsics.d(this.f133048e, pgVar.f133048e) && Intrinsics.d(this.f133049f, pgVar.f133049f);
    }

    public final int hashCode() {
        int hashCode = this.f133044a.hashCode() * 31;
        String str = this.f133045b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133046c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f133047d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133048e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f133049f;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageLargeDetails(__typename=");
        sb3.append(this.f133044a);
        sb3.append(", type=");
        sb3.append(this.f133045b);
        sb3.append(", dominantColor=");
        sb3.append(this.f133046c);
        sb3.append(", width=");
        sb3.append(this.f133047d);
        sb3.append(", height=");
        sb3.append(this.f133048e);
        sb3.append(", url=");
        return a.a.p(sb3, this.f133049f, ")");
    }
}
