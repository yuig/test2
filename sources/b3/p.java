package b3;

import android.graphics.ColorFilter;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f21344a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21345b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21346c;

    public p(long j13, int i13, ColorFilter colorFilter) {
        this.f21344a = colorFilter;
        this.f21345b = j13;
        this.f21346c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return w.c(this.f21345b, pVar.f21345b) && s0.a(this.f21346c, pVar.f21346c);
    }

    public final int hashCode() {
        int i13 = w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Integer.hashCode(this.f21346c) + (Long.hashCode(this.f21345b) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BlendModeColorFilter(color=");
        jq.b.t(this.f21345b, sb3, ", blendMode=");
        int i13 = this.f21346c;
        sb3.append((Object) (s0.a(i13, 0) ? "Clear" : s0.a(i13, 1) ? "Src" : s0.a(i13, 2) ? "Dst" : s0.a(i13, 3) ? "SrcOver" : s0.a(i13, 4) ? "DstOver" : s0.a(i13, 5) ? "SrcIn" : s0.a(i13, 6) ? "DstIn" : s0.a(i13, 7) ? "SrcOut" : s0.a(i13, 8) ? "DstOut" : s0.a(i13, 9) ? "SrcAtop" : s0.a(i13, 10) ? "DstAtop" : s0.a(i13, 11) ? "Xor" : s0.a(i13, 12) ? "Plus" : s0.a(i13, 13) ? "Modulate" : s0.a(i13, 14) ? "Screen" : s0.a(i13, 15) ? "Overlay" : s0.a(i13, 16) ? "Darken" : s0.a(i13, 17) ? "Lighten" : s0.a(i13, 18) ? "ColorDodge" : s0.a(i13, 19) ? "ColorBurn" : s0.a(i13, 20) ? "HardLight" : s0.a(i13, 21) ? "Softlight" : s0.a(i13, 22) ? "Difference" : s0.a(i13, 23) ? "Exclusion" : s0.a(i13, 24) ? "Multiply" : s0.a(i13, 25) ? "Hue" : s0.a(i13, 26) ? "Saturation" : s0.a(i13, 27) ? "Color" : s0.a(i13, 28) ? "Luminosity" : "Unknown"));
        sb3.append(')');
        return sb3.toString();
    }
}
