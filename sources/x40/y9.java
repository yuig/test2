package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133734a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f133735b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f133736c;

    public y9(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133734a = __typename;
        this.f133735b = num;
        this.f133736c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9)) {
            return false;
        }
        y9 y9Var = (y9) obj;
        return Intrinsics.d(this.f133734a, y9Var.f133734a) && Intrinsics.d(this.f133735b, y9Var.f133735b) && Intrinsics.d(this.f133736c, y9Var.f133736c);
    }

    public final int hashCode() {
        int hashCode = this.f133734a.hashCode() * 31;
        Integer num = this.f133735b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133736c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageLargeSizePixels(__typename=");
        sb3.append(this.f133734a);
        sb3.append(", width=");
        sb3.append(this.f133735b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f133736c, ")");
    }
}
