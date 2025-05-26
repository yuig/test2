package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132803a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f132804b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f132805c;

    public m3(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132803a = __typename;
        this.f132804b = num;
        this.f132805c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        return Intrinsics.d(this.f132803a, m3Var.f132803a) && Intrinsics.d(this.f132804b, m3Var.f132804b) && Intrinsics.d(this.f132805c, m3Var.f132805c);
    }

    public final int hashCode() {
        int hashCode = this.f132803a.hashCode() * 31;
        Integer num = this.f132804b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132805c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageLargeSizePixels(__typename=");
        sb3.append(this.f132803a);
        sb3.append(", width=");
        sb3.append(this.f132804b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f132805c, ")");
    }
}
