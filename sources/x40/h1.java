package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h1 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132462a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132463b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132464c;

    public h1(String __typename, String id3, String str) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f132462a = __typename;
        this.f132463b = id3;
        this.f132464c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.d(this.f132462a, h1Var.f132462a) && Intrinsics.d(this.f132463b, h1Var.f132463b) && Intrinsics.d(this.f132464c, h1Var.f132464c);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132463b, this.f132462a.hashCode() * 31, 31);
        String str = this.f132464c;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardSectionNode(__typename=");
        sb3.append(this.f132462a);
        sb3.append(", id=");
        sb3.append(this.f132463b);
        sb3.append(", title=");
        return a.a.p(sb3, this.f132464c, ")");
    }
}
