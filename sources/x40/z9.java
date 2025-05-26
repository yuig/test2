package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z9 implements z40.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133812a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f133813b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f133814c;

    public z9(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133812a = __typename;
        this.f133813b = num;
        this.f133814c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9)) {
            return false;
        }
        z9 z9Var = (z9) obj;
        return Intrinsics.d(this.f133812a, z9Var.f133812a) && Intrinsics.d(this.f133813b, z9Var.f133813b) && Intrinsics.d(this.f133814c, z9Var.f133814c);
    }

    public final int hashCode() {
        int hashCode = this.f133812a.hashCode() * 31;
        Integer num = this.f133813b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133814c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.a0
    public final Integer i() {
        return this.f133814c;
    }

    @Override // z40.a0
    public final Integer j() {
        return this.f133813b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageMediumSizePixels(__typename=");
        sb3.append(this.f133812a);
        sb3.append(", width=");
        sb3.append(this.f133813b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f133814c, ")");
    }
}
