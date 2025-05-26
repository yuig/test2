package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133016a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f133017b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f133018c;

    public p1(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133016a = __typename;
        this.f133017b = num;
        this.f133018c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return Intrinsics.d(this.f133016a, p1Var.f133016a) && Intrinsics.d(this.f133017b, p1Var.f133017b) && Intrinsics.d(this.f133018c, p1Var.f133018c);
    }

    public final int hashCode() {
        int hashCode = this.f133016a.hashCode() * 31;
        Integer num = this.f133017b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133018c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageLargeSizePixels(__typename=");
        sb3.append(this.f133016a);
        sb3.append(", width=");
        sb3.append(this.f133017b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f133018c, ")");
    }
}
