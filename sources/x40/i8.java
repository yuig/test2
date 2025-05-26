package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i8 implements z40.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132544a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f132545b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f132546c;

    public i8(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132544a = __typename;
        this.f132545b = num;
        this.f132546c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return Intrinsics.d(this.f132544a, i8Var.f132544a) && Intrinsics.d(this.f132545b, i8Var.f132545b) && Intrinsics.d(this.f132546c, i8Var.f132546c);
    }

    public final int hashCode() {
        int hashCode = this.f132544a.hashCode() * 31;
        Integer num = this.f132545b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132546c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.a0
    public final Integer i() {
        return this.f132546c;
    }

    @Override // z40.a0
    public final Integer j() {
        return this.f132545b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageMediumSizePixels(__typename=");
        sb3.append(this.f132544a);
        sb3.append(", width=");
        sb3.append(this.f132545b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f132546c, ")");
    }
}
