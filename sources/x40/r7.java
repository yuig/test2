package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r7 implements z40.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133172a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f133173b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f133174c;

    public r7(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133172a = __typename;
        this.f133173b = num;
        this.f133174c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        return Intrinsics.d(this.f133172a, r7Var.f133172a) && Intrinsics.d(this.f133173b, r7Var.f133173b) && Intrinsics.d(this.f133174c, r7Var.f133174c);
    }

    public final int hashCode() {
        int hashCode = this.f133172a.hashCode() * 31;
        Integer num = this.f133173b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133174c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.a0
    public final Integer i() {
        return this.f133174c;
    }

    @Override // z40.a0
    public final Integer j() {
        return this.f133173b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageMediumSizePixels(__typename=");
        sb3.append(this.f133172a);
        sb3.append(", width=");
        sb3.append(this.f133173b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f133174c, ")");
    }
}
