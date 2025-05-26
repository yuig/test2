package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q1 implements z40.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133060a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f133061b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f133062c;

    public q1(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133060a = __typename;
        this.f133061b = num;
        this.f133062c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return Intrinsics.d(this.f133060a, q1Var.f133060a) && Intrinsics.d(this.f133061b, q1Var.f133061b) && Intrinsics.d(this.f133062c, q1Var.f133062c);
    }

    public final int hashCode() {
        int hashCode = this.f133060a.hashCode() * 31;
        Integer num = this.f133061b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133062c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.a0
    public final Integer i() {
        return this.f133062c;
    }

    @Override // z40.a0
    public final Integer j() {
        return this.f133061b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageMediumSizePixels(__typename=");
        sb3.append(this.f133060a);
        sb3.append(", width=");
        sb3.append(this.f133061b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f133062c, ")");
    }
}
