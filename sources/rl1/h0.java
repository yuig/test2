package rl1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f108590a;

    /* renamed from: b, reason: collision with root package name */
    public final int f108591b;

    /* renamed from: c, reason: collision with root package name */
    public final float f108592c;

    public h0(String name, int i13, float f13) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f108590a = name;
        this.f108591b = i13;
        this.f108592c = f13;
    }

    public static h0 a(h0 h0Var, String name, int i13, float f13, int i14) {
        if ((i14 & 1) != 0) {
            name = h0Var.f108590a;
        }
        if ((i14 & 2) != 0) {
            i13 = h0Var.f108591b;
        }
        if ((i14 & 4) != 0) {
            f13 = h0Var.f108592c;
        }
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        return new h0(name, i13, f13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.d(this.f108590a, h0Var.f108590a) && this.f108591b == h0Var.f108591b && Float.compare(this.f108592c, h0Var.f108592c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f108592c) + ep.b.b(this.f108591b, this.f108590a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NameViewModel(name=");
        sb3.append(this.f108590a);
        sb3.append(", nameColor=");
        sb3.append(this.f108591b);
        sb3.append(", nameTextSize=");
        return d7.g.i(sb3, this.f108592c, ")");
    }
}
