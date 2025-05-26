package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r0 {

    /* renamed from: e, reason: collision with root package name */
    public static final kp.n f67213e = new kp.n(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f67214a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67215b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f67216c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f67217d;

    public r0(String str, String str2, Double d2, Integer num) {
        this.f67214a = str;
        this.f67215b = str2;
        this.f67216c = d2;
        this.f67217d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.d(this.f67214a, r0Var.f67214a) && Intrinsics.d(this.f67215b, r0Var.f67215b) && Intrinsics.d(this.f67216c, r0Var.f67216c) && Intrinsics.d(this.f67217d, r0Var.f67217d);
    }

    public final int hashCode() {
        String str = this.f67214a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f67215b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d2 = this.f67216c;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.f67217d;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DynamicAdDataEventData(dynamicAdPrice=");
        sb3.append(this.f67214a);
        sb3.append(", dynamicAdStrikethroughPrice=");
        sb3.append(this.f67215b);
        sb3.append(", dynamicAdRatings=");
        sb3.append(this.f67216c);
        sb3.append(", dynamicAdRatingCount=");
        return a.c.i(sb3, this.f67217d, ")");
    }
}
