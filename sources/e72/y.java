package e72;

import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* renamed from: a, reason: collision with root package name */
    public final int f57694a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57695b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57696c;

    /* renamed from: d, reason: collision with root package name */
    public final int f57697d;

    public y(int i13, int i14, int i15, int i16, int i17) {
        if (15 != (i13 & 15)) {
            kg.t.b1(i13, 15, w.f57693b);
            throw null;
        }
        this.f57694a = i14;
        this.f57695b = i15;
        this.f57696c = i16;
        this.f57697d = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f57694a == yVar.f57694a && this.f57695b == yVar.f57695b && this.f57696c == yVar.f57696c && this.f57697d == yVar.f57697d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57697d) + ep.b.b(this.f57696c, ep.b.b(this.f57695b, Integer.hashCode(this.f57694a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoundingBox(x=");
        sb3.append(this.f57694a);
        sb3.append(", y=");
        sb3.append(this.f57695b);
        sb3.append(", width=");
        sb3.append(this.f57696c);
        sb3.append(", height=");
        return a.a.n(sb3, this.f57697d, ")");
    }

    public y(int i13, int i14, int i15, int i16) {
        this.f57694a = i13;
        this.f57695b = i14;
        this.f57696c = i15;
        this.f57697d = i16;
    }
}
