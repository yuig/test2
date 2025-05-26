package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pa {

    /* renamed from: a, reason: collision with root package name */
    public final String f133033a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f133034b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f133035c;

    public pa(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133033a = __typename;
        this.f133034b = num;
        this.f133035c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa)) {
            return false;
        }
        pa paVar = (pa) obj;
        return Intrinsics.d(this.f133033a, paVar.f133033a) && Intrinsics.d(this.f133034b, paVar.f133034b) && Intrinsics.d(this.f133035c, paVar.f133035c);
    }

    public final int hashCode() {
        int hashCode = this.f133033a.hashCode() * 31;
        Integer num = this.f133034b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133035c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageLargeSizePixels(__typename=");
        sb3.append(this.f133033a);
        sb3.append(", width=");
        sb3.append(this.f133034b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f133035c, ")");
    }
}
