package b3;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f21354a;

    /* renamed from: b, reason: collision with root package name */
    public float f21355b;

    /* renamed from: c, reason: collision with root package name */
    public float f21356c;

    /* renamed from: d, reason: collision with root package name */
    public float f21357d;

    /* renamed from: e, reason: collision with root package name */
    public float f21358e;

    /* renamed from: f, reason: collision with root package name */
    public float f21359f;

    /* renamed from: g, reason: collision with root package name */
    public float f21360g;

    /* renamed from: h, reason: collision with root package name */
    public long f21361h;

    /* renamed from: i, reason: collision with root package name */
    public long f21362i;

    /* renamed from: j, reason: collision with root package name */
    public float f21363j;

    /* renamed from: k, reason: collision with root package name */
    public float f21364k;

    /* renamed from: l, reason: collision with root package name */
    public float f21365l;

    /* renamed from: m, reason: collision with root package name */
    public float f21366m;

    /* renamed from: n, reason: collision with root package name */
    public long f21367n;

    /* renamed from: o, reason: collision with root package name */
    public x0 f21368o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21369p;

    /* renamed from: q, reason: collision with root package name */
    public int f21370q;

    /* renamed from: r, reason: collision with root package name */
    public long f21371r;

    /* renamed from: s, reason: collision with root package name */
    public n4.b f21372s;

    /* renamed from: t, reason: collision with root package name */
    public n4.k f21373t;

    /* renamed from: u, reason: collision with root package name */
    public m0 f21374u;

    public final void B(long j13) {
        if (w.c(this.f21362i, j13)) {
            return;
        }
        this.f21354a |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        this.f21362i = j13;
    }

    public final void D(long j13) {
        if (b1.a(this.f21367n, j13)) {
            return;
        }
        this.f21354a |= 4096;
        this.f21367n = j13;
    }

    public final void E(float f13) {
        if (this.f21358e == f13) {
            return;
        }
        this.f21354a |= 8;
        this.f21358e = f13;
    }

    public final void F(float f13) {
        if (this.f21359f == f13) {
            return;
        }
        this.f21354a |= 16;
        this.f21359f = f13;
    }

    public final long a() {
        return this.f21361h;
    }

    @Override // n4.b
    public final float b() {
        return this.f21372s.b();
    }

    public final int c() {
        return this.f21370q;
    }

    public final float d() {
        return this.f21360g;
    }

    public final long e() {
        return this.f21362i;
    }

    public final void f(float f13) {
        if (this.f21357d == f13) {
            return;
        }
        this.f21354a |= 4;
        this.f21357d = f13;
    }

    public final void h(long j13) {
        if (w.c(this.f21361h, j13)) {
            return;
        }
        this.f21354a |= 64;
        this.f21361h = j13;
    }

    public final void i(boolean z13) {
        if (this.f21369p != z13) {
            this.f21354a |= 16384;
            this.f21369p = z13;
        }
    }

    public final void j(float f13) {
        if (this.f21365l == f13) {
            return;
        }
        this.f21354a |= 1024;
        this.f21365l = f13;
    }

    @Override // n4.b
    public final float j0() {
        return this.f21372s.j0();
    }

    public final void l(float f13) {
        if (this.f21355b == f13) {
            return;
        }
        this.f21354a |= 1;
        this.f21355b = f13;
    }

    public final void n(float f13) {
        if (this.f21356c == f13) {
            return;
        }
        this.f21354a |= 2;
        this.f21356c = f13;
    }

    public final void x(float f13) {
        if (this.f21360g == f13) {
            return;
        }
        this.f21354a |= 32;
        this.f21360g = f13;
    }

    public final void z(x0 x0Var) {
        if (Intrinsics.d(this.f21368o, x0Var)) {
            return;
        }
        this.f21354a |= 8192;
        this.f21368o = x0Var;
    }
}
