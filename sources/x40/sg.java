package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sg implements z40.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133274a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f133275b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f133276c;

    public sg(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133274a = __typename;
        this.f133275b = num;
        this.f133276c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg)) {
            return false;
        }
        sg sgVar = (sg) obj;
        return Intrinsics.d(this.f133274a, sgVar.f133274a) && Intrinsics.d(this.f133275b, sgVar.f133275b) && Intrinsics.d(this.f133276c, sgVar.f133276c);
    }

    public final int hashCode() {
        int hashCode = this.f133274a.hashCode() * 31;
        Integer num = this.f133275b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133276c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.a0
    public final Integer i() {
        return this.f133276c;
    }

    @Override // z40.a0
    public final Integer j() {
        return this.f133275b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageMediumSizePixels(__typename=");
        sb3.append(this.f133274a);
        sb3.append(", width=");
        sb3.append(this.f133275b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f133276c, ")");
    }
}
