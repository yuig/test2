package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132492a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f132493b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f132494c;

    public h8(Integer num, Integer num2, String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132492a = __typename;
        this.f132493b = num;
        this.f132494c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        return Intrinsics.d(this.f132492a, h8Var.f132492a) && Intrinsics.d(this.f132493b, h8Var.f132493b) && Intrinsics.d(this.f132494c, h8Var.f132494c);
    }

    public final int hashCode() {
        int hashCode = this.f132492a.hashCode() * 31;
        Integer num = this.f132493b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132494c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageLargeSizePixels(__typename=");
        sb3.append(this.f132492a);
        sb3.append(", width=");
        sb3.append(this.f132493b);
        sb3.append(", height=");
        return a.c.i(sb3, this.f132494c, ")");
    }
}
