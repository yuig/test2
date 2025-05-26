package yl1;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f139324a;

    /* renamed from: b, reason: collision with root package name */
    public final int f139325b;

    public g(int i13, int i14) {
        this.f139324a = i13;
        this.f139325b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f139324a == gVar.f139324a && this.f139325b == gVar.f139325b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139325b) + (Integer.hashCode(this.f139324a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GestaltButtonColorPalette(backgroundColor=");
        sb3.append(this.f139324a);
        sb3.append(", textColor=");
        return a.a.n(sb3, this.f139325b, ")");
    }
}
