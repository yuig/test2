package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f121782a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121783b;

    /* renamed from: c, reason: collision with root package name */
    public final int f121784c;

    public g1(String name, int i13, int i14) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f121782a = name;
        this.f121783b = i13;
        this.f121784c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.d(this.f121782a, g1Var.f121782a) && this.f121783b == g1Var.f121783b && this.f121784c == g1Var.f121784c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121784c) + ep.b.b(this.f121783b, this.f121782a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IconItemDisplayState(name=");
        sb3.append(this.f121782a);
        sb3.append(", contentDescription=");
        sb3.append(this.f121783b);
        sb3.append(", id=");
        return a.a.n(sb3, this.f121784c, ")");
    }
}
