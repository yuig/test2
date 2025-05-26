package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c1 implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132070a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132071b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132072c;

    public c1(String __typename, String id3, String str) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f132070a = __typename;
        this.f132071b = id3;
        this.f132072c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Intrinsics.d(this.f132070a, c1Var.f132070a) && Intrinsics.d(this.f132071b, c1Var.f132071b) && Intrinsics.d(this.f132072c, c1Var.f132072c);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132071b, this.f132070a.hashCode() * 31, 31);
        String str = this.f132072c;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardNode(__typename=");
        sb3.append(this.f132070a);
        sb3.append(", id=");
        sb3.append(this.f132071b);
        sb3.append(", name=");
        return a.a.p(sb3, this.f132072c, ")");
    }
}
