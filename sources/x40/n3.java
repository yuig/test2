package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n3 implements z40.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132870a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f132871b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f132872c;

    public n3(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132870a = __typename;
        this.f132871b = num;
        this.f132872c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return Intrinsics.d(this.f132870a, n3Var.f132870a) && Intrinsics.d(this.f132871b, n3Var.f132871b) && Intrinsics.d(this.f132872c, n3Var.f132872c);
    }

    public final int hashCode() {
        int hashCode = this.f132870a.hashCode() * 31;
        Integer num = this.f132871b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132872c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.a0
    public final Integer i() {
        return this.f132872c;
    }

    @Override // z40.a0
    public final Integer j() {
        return this.f132871b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageMediumSizePixels(__typename=");
        sb3.append(this.f132870a);
        sb3.append(", width=");
        sb3.append(this.f132871b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f132872c, ")");
    }
}
