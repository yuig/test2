package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qg {

    /* renamed from: a, reason: collision with root package name */
    public final String f133124a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f133125b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f133126c;

    public qg(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133124a = __typename;
        this.f133125b = num;
        this.f133126c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg)) {
            return false;
        }
        qg qgVar = (qg) obj;
        return Intrinsics.d(this.f133124a, qgVar.f133124a) && Intrinsics.d(this.f133125b, qgVar.f133125b) && Intrinsics.d(this.f133126c, qgVar.f133126c);
    }

    public final int hashCode() {
        int hashCode = this.f133124a.hashCode() * 31;
        Integer num = this.f133125b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133126c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageLargeSizePixels(__typename=");
        sb3.append(this.f133124a);
        sb3.append(", width=");
        sb3.append(this.f133125b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f133126c, ")");
    }
}
