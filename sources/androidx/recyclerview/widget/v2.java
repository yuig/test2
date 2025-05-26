package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class v2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19651a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f19652b;

    /* renamed from: c, reason: collision with root package name */
    public l2 f19653c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19654d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19655e;

    /* renamed from: f, reason: collision with root package name */
    public View f19656f;

    /* renamed from: g, reason: collision with root package name */
    public final t2 f19657g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19658h;

    public v2() {
        t2 t2Var = new t2();
        t2Var.f19635d = -1;
        t2Var.f19637f = false;
        t2Var.f19638g = 0;
        t2Var.f19632a = 0;
        t2Var.f19633b = 0;
        t2Var.f19634c = Integer.MIN_VALUE;
        t2Var.f19636e = null;
        this.f19657g = t2Var;
    }

    public PointF a(int i13) {
        Object obj = this.f19653c;
        if (obj instanceof u2) {
            return ((u2) obj).a(i13);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + u2.class.getCanonicalName());
        return null;
    }

    public final int b() {
        return this.f19651a;
    }

    public final boolean c() {
        return this.f19654d;
    }

    public final boolean d() {
        return this.f19655e;
    }

    public final void e(int i13, int i14) {
        PointF a13;
        RecyclerView recyclerView = this.f19652b;
        if (this.f19651a == -1 || recyclerView == null) {
            j();
        }
        if (this.f19654d && this.f19656f == null && this.f19653c != null && (a13 = a(this.f19651a)) != null) {
            float f13 = a13.x;
            if (f13 != 0.0f || a13.y != 0.0f) {
                recyclerView.E2((int) Math.signum(f13), (int) Math.signum(a13.y), null);
            }
        }
        this.f19654d = false;
        View view = this.f19656f;
        t2 t2Var = this.f19657g;
        if (view != null) {
            this.f19652b.getClass();
            if (RecyclerView.s1(view) == this.f19651a) {
                g(this.f19656f, recyclerView.f19231h0, t2Var);
                t2Var.a(recyclerView);
                j();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f19656f = null;
            }
        }
        if (this.f19655e) {
            w2 w2Var = recyclerView.f19231h0;
            c1 c1Var = (c1) this;
            if (c1Var.f19652b.f19242n.E() == 0) {
                c1Var.j();
            } else {
                int i15 = c1Var.f19348o;
                int i16 = i15 - i13;
                if (i15 * i16 <= 0) {
                    i16 = 0;
                }
                c1Var.f19348o = i16;
                int i17 = c1Var.f19349p;
                int i18 = i17 - i14;
                if (i17 * i18 <= 0) {
                    i18 = 0;
                }
                c1Var.f19349p = i18;
                if (i16 == 0 && i18 == 0) {
                    PointF a14 = c1Var.a(c1Var.f19651a);
                    if (a14 != null) {
                        if (a14.x != 0.0f || a14.y != 0.0f) {
                            float f14 = a14.y;
                            float sqrt = (float) Math.sqrt((f14 * f14) + (r9 * r9));
                            float f15 = a14.x / sqrt;
                            a14.x = f15;
                            float f16 = a14.y / sqrt;
                            a14.y = f16;
                            c1Var.f19344k = a14;
                            c1Var.f19348o = (int) (f15 * 10000.0f);
                            c1Var.f19349p = (int) (f16 * 10000.0f);
                            t2Var.b((int) (c1Var.f19348o * 1.2f), (int) (c1Var.f19349p * 1.2f), (int) (c1Var.p(10000) * 1.2f), c1Var.f19342i);
                        }
                    }
                    t2Var.f19635d = c1Var.f19651a;
                    c1Var.j();
                }
            }
            boolean z13 = t2Var.f19635d >= 0;
            t2Var.a(recyclerView);
            if (z13 && this.f19655e) {
                this.f19654d = true;
                recyclerView.f19225e0.b();
            }
        }
    }

    public final void f(View view) {
        this.f19652b.getClass();
        if (RecyclerView.s1(view) == this.f19651a) {
            this.f19656f = view;
        }
    }

    public abstract void g(View view, w2 w2Var, t2 t2Var);

    public final void h(int i13) {
        this.f19651a = i13;
    }

    public final void i(RecyclerView recyclerView, l2 l2Var) {
        x2 x2Var = recyclerView.f19225e0;
        x2Var.f19706g.removeCallbacks(x2Var);
        x2Var.f19702c.abortAnimation();
        if (this.f19658h) {
            Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        this.f19652b = recyclerView;
        this.f19653c = l2Var;
        int i13 = this.f19651a;
        if (i13 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f19231h0.f19677a = i13;
        this.f19655e = true;
        this.f19654d = true;
        this.f19656f = recyclerView.f19242n.z(i13);
        this.f19652b.f19225e0.b();
        this.f19658h = true;
    }

    public final void j() {
        if (this.f19655e) {
            this.f19655e = false;
            c1 c1Var = (c1) this;
            c1Var.f19349p = 0;
            c1Var.f19348o = 0;
            c1Var.f19344k = null;
            this.f19652b.f19231h0.f19677a = -1;
            this.f19656f = null;
            this.f19651a = -1;
            this.f19654d = false;
            l2 l2Var = this.f19653c;
            if (l2Var.f19497e == this) {
                l2Var.f19497e = null;
            }
            this.f19653c = null;
            this.f19652b = null;
        }
    }
}
