package e72;

import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* renamed from: a, reason: collision with root package name */
    public final int f57627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57628b;

    public c0(int i13, int i14, int i15) {
        if (3 != (i13 & 3)) {
            kg.t.b1(i13, 3, a0.f57625b);
            throw null;
        }
        this.f57627a = i14;
        this.f57628b = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f57627a == c0Var.f57627a && this.f57628b == c0Var.f57628b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57628b) + (Integer.hashCode(this.f57627a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageSize(width=");
        sb3.append(this.f57627a);
        sb3.append(", height=");
        return a.a.n(sb3, this.f57628b, ")");
    }

    public c0(int i13, int i14) {
        this.f57627a = i13;
        this.f57628b = i14;
    }
}
