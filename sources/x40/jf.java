package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jf {

    /* renamed from: a, reason: collision with root package name */
    public final String f132616a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f132617b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f132618c;

    public jf(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132616a = __typename;
        this.f132617b = num;
        this.f132618c = num2;
    }

    public final Integer a() {
        return this.f132618c;
    }

    public final Integer b() {
        return this.f132617b;
    }

    public final String c() {
        return this.f132616a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf)) {
            return false;
        }
        jf jfVar = (jf) obj;
        return Intrinsics.d(this.f132616a, jfVar.f132616a) && Intrinsics.d(this.f132617b, jfVar.f132617b) && Intrinsics.d(this.f132618c, jfVar.f132618c);
    }

    public final int hashCode() {
        int hashCode = this.f132616a.hashCode() * 31;
        Integer num = this.f132617b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132618c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageMediumSizePixels(__typename=");
        sb3.append(this.f132616a);
        sb3.append(", width=");
        sb3.append(this.f132617b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f132618c, ")");
    }
}
