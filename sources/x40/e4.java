package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e4 implements z40.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132310a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f132311b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f132312c;

    public e4(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132310a = __typename;
        this.f132311b = num;
        this.f132312c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        return Intrinsics.d(this.f132310a, e4Var.f132310a) && Intrinsics.d(this.f132311b, e4Var.f132311b) && Intrinsics.d(this.f132312c, e4Var.f132312c);
    }

    public final int hashCode() {
        int hashCode = this.f132310a.hashCode() * 31;
        Integer num = this.f132311b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132312c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.a0
    public final Integer i() {
        return this.f132312c;
    }

    @Override // z40.a0
    public final Integer j() {
        return this.f132311b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageMediumSizePixels(__typename=");
        sb3.append(this.f132310a);
        sb3.append(", width=");
        sb3.append(this.f132311b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f132312c, ")");
    }
}
