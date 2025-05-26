package g3;

import a3.f;
import b3.f0;
import b3.h;
import b3.p;
import b3.s0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import n4.j;

/* loaded from: classes2.dex */
public final class a extends b {

    /* renamed from: e, reason: collision with root package name */
    public final f0 f63402e;

    /* renamed from: f, reason: collision with root package name */
    public final long f63403f;

    /* renamed from: g, reason: collision with root package name */
    public final long f63404g;

    /* renamed from: h, reason: collision with root package name */
    public final int f63405h;

    /* renamed from: i, reason: collision with root package name */
    public final long f63406i;

    /* renamed from: j, reason: collision with root package name */
    public float f63407j;

    /* renamed from: k, reason: collision with root package name */
    public p f63408k;

    public a(f0 f0Var) {
        int i13;
        int i14;
        h hVar = (h) f0Var;
        long d2 = l0.d(hVar.f21320a.getWidth(), hVar.f21320a.getHeight());
        this.f63402e = f0Var;
        this.f63403f = 0L;
        this.f63404g = d2;
        this.f63405h = 1;
        if (((int) 0) >= 0 && ((int) 0) >= 0 && (i13 = (int) (d2 >> 32)) >= 0 && (i14 = (int) (4294967295L & d2)) >= 0) {
            h hVar2 = (h) f0Var;
            if (i13 <= hVar2.f21320a.getWidth() && i14 <= hVar2.f21320a.getHeight()) {
                this.f63406i = d2;
                this.f63407j = 1.0f;
                return;
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // g3.b
    public final void a(float f13) {
        this.f63407j = f13;
    }

    @Override // g3.b
    public final void b(p pVar) {
        this.f63408k = pVar;
    }

    @Override // g3.b
    public final long d() {
        return l0.y1(this.f63406i);
    }

    @Override // g3.b
    public final void e(d3.h hVar) {
        long d2 = l0.d(Math.round(f.d(hVar.g())), Math.round(f.b(hVar.g())));
        float f13 = this.f63407j;
        p pVar = this.f63408k;
        d3.h.k(hVar, this.f63402e, this.f63403f, this.f63404g, d2, f13, pVar, this.f63405h, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f63402e, aVar.f63402e) && n4.h.a(this.f63403f, aVar.f63403f) && j.a(this.f63404g, aVar.f63404g) && s0.c(this.f63405h, aVar.f63405h);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63405h) + a.a.c(this.f63404g, a.a.c(this.f63403f, this.f63402e.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BitmapPainter(image=");
        sb3.append(this.f63402e);
        sb3.append(", srcOffset=");
        sb3.append((Object) n4.h.d(this.f63403f));
        sb3.append(", srcSize=");
        sb3.append((Object) j.d(this.f63404g));
        sb3.append(", filterQuality=");
        int i13 = this.f63405h;
        sb3.append((Object) (s0.c(i13, 0) ? "None" : s0.c(i13, 1) ? "Low" : s0.c(i13, 2) ? "Medium" : s0.c(i13, 3) ? "High" : "Unknown"));
        sb3.append(')');
        return sb3.toString();
    }
}
