package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qa implements z40.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133112a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f133113b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f133114c;

    public qa(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133112a = __typename;
        this.f133113b = num;
        this.f133114c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        return Intrinsics.d(this.f133112a, qaVar.f133112a) && Intrinsics.d(this.f133113b, qaVar.f133113b) && Intrinsics.d(this.f133114c, qaVar.f133114c);
    }

    public final int hashCode() {
        int hashCode = this.f133112a.hashCode() * 31;
        Integer num = this.f133113b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133114c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // z40.a0
    public final Integer i() {
        return this.f133114c;
    }

    @Override // z40.a0
    public final Integer j() {
        return this.f133113b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageMediumSizePixels(__typename=");
        sb3.append(this.f133112a);
        sb3.append(", width=");
        sb3.append(this.f133113b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f133114c, ")");
    }
}
