package d3;

import b3.p0;
import b3.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l extends i {

    /* renamed from: a, reason: collision with root package name */
    public final float f53661a;

    /* renamed from: b, reason: collision with root package name */
    public final float f53662b;

    /* renamed from: c, reason: collision with root package name */
    public final int f53663c;

    /* renamed from: d, reason: collision with root package name */
    public final int f53664d;

    /* renamed from: e, reason: collision with root package name */
    public final p0 f53665e;

    public l(float f13, float f14, int i13, int i14, b3.l lVar, int i15) {
        f14 = (i15 & 2) != 0 ? 4.0f : f14;
        i13 = (i15 & 4) != 0 ? 0 : i13;
        i14 = (i15 & 8) != 0 ? 0 : i14;
        lVar = (i15 & 16) != 0 ? null : lVar;
        this.f53661a = f13;
        this.f53662b = f14;
        this.f53663c = i13;
        this.f53664d = i14;
        this.f53665e = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f53661a == lVar.f53661a && this.f53662b == lVar.f53662b && s0.d(this.f53663c, lVar.f53663c) && s0.e(this.f53664d, lVar.f53664d) && Intrinsics.d(this.f53665e, lVar.f53665e);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f53664d, ep.b.b(this.f53663c, a.a.a(this.f53662b, Float.hashCode(this.f53661a) * 31, 31), 31), 31);
        p0 p0Var = this.f53665e;
        return b13 + (p0Var != null ? p0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Stroke(width=");
        sb3.append(this.f53661a);
        sb3.append(", miter=");
        sb3.append(this.f53662b);
        sb3.append(", cap=");
        int i13 = this.f53663c;
        String str = "Unknown";
        sb3.append((Object) (s0.d(i13, 0) ? "Butt" : s0.d(i13, 1) ? "Round" : s0.d(i13, 2) ? "Square" : "Unknown"));
        sb3.append(", join=");
        int i14 = this.f53664d;
        if (s0.e(i14, 0)) {
            str = "Miter";
        } else if (s0.e(i14, 1)) {
            str = "Round";
        } else if (s0.e(i14, 2)) {
            str = "Bevel";
        }
        sb3.append((Object) str);
        sb3.append(", pathEffect=");
        sb3.append(this.f53665e);
        sb3.append(')');
        return sb3.toString();
    }
}
