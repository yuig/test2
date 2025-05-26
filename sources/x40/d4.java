package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132206a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f132207b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f132208c;

    public d4(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132206a = __typename;
        this.f132207b = num;
        this.f132208c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        return Intrinsics.d(this.f132206a, d4Var.f132206a) && Intrinsics.d(this.f132207b, d4Var.f132207b) && Intrinsics.d(this.f132208c, d4Var.f132208c);
    }

    public final int hashCode() {
        int hashCode = this.f132206a.hashCode() * 31;
        Integer num = this.f132207b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132208c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageLargeSizePixels(__typename=");
        sb3.append(this.f132206a);
        sb3.append(", width=");
        sb3.append(this.f132207b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f132208c, ")");
    }
}
