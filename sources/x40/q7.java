package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133108a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f133109b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f133110c;

    public q7(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133108a = __typename;
        this.f133109b = num;
        this.f133110c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj;
        return Intrinsics.d(this.f133108a, q7Var.f133108a) && Intrinsics.d(this.f133109b, q7Var.f133109b) && Intrinsics.d(this.f133110c, q7Var.f133110c);
    }

    public final int hashCode() {
        int hashCode = this.f133108a.hashCode() * 31;
        Integer num = this.f133109b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133110c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageLargeSizePixels(__typename=");
        sb3.append(this.f133108a);
        sb3.append(", width=");
        sb3.append(this.f133109b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f133110c, ")");
    }
}
