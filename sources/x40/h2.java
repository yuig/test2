package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h2 implements z40.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132465a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f132466b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f132467c;

    public h2(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132465a = __typename;
        this.f132466b = num;
        this.f132467c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return Intrinsics.d(this.f132465a, h2Var.f132465a) && Intrinsics.d(this.f132466b, h2Var.f132466b) && Intrinsics.d(this.f132467c, h2Var.f132467c);
    }

    public final int hashCode() {
        int hashCode = this.f132465a.hashCode() * 31;
        Integer num = this.f132466b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132467c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.a0
    public final Integer i() {
        return this.f132467c;
    }

    @Override // z40.a0
    public final Integer j() {
        return this.f132466b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageMediumSizePixels(__typename=");
        sb3.append(this.f132465a);
        sb3.append(", width=");
        sb3.append(this.f132466b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f132467c, ")");
    }
}
