package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132426a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f132427b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f132428c;

    public g2(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132426a = __typename;
        this.f132427b = num;
        this.f132428c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return Intrinsics.d(this.f132426a, g2Var.f132426a) && Intrinsics.d(this.f132427b, g2Var.f132427b) && Intrinsics.d(this.f132428c, g2Var.f132428c);
    }

    public final int hashCode() {
        int hashCode = this.f132426a.hashCode() * 31;
        Integer num = this.f132427b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132428c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageLargeSizePixels(__typename=");
        sb3.append(this.f132426a);
        sb3.append(", width=");
        sb3.append(this.f132427b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f132428c, ")");
    }
}
