package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class x2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f19700a;

    /* renamed from: b, reason: collision with root package name */
    public int f19701b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f19702c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f19703d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19704e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19705f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f19706g;

    public x2(RecyclerView recyclerView) {
        this.f19706g = recyclerView;
        x1 x1Var = RecyclerView.G0;
        this.f19703d = x1Var;
        this.f19704e = false;
        this.f19705f = false;
        this.f19702c = new OverScroller(recyclerView.getContext(), x1Var);
    }

    public final void a(int i13, int i14) {
        RecyclerView recyclerView = this.f19706g;
        recyclerView.W2(2);
        this.f19701b = 0;
        this.f19700a = 0;
        Interpolator interpolator = this.f19703d;
        x1 x1Var = RecyclerView.G0;
        if (interpolator != x1Var) {
            this.f19703d = x1Var;
            this.f19702c = new OverScroller(recyclerView.getContext(), x1Var);
        }
        this.f19702c.fling(0, 0, i13, i14, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f19704e) {
            this.f19705f = true;
            return;
        }
        RecyclerView recyclerView = this.f19706g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = q5.v0.f102521a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i13, int i14, int i15, Interpolator interpolator) {
        RecyclerView recyclerView = this.f19706g;
        if (i15 == Integer.MIN_VALUE) {
            int abs = Math.abs(i13);
            int abs2 = Math.abs(i14);
            boolean z13 = abs > abs2;
            int width = z13 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z13) {
                abs = abs2;
            }
            i15 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i16 = i15;
        if (interpolator == null) {
            interpolator = RecyclerView.G0;
        }
        if (this.f19703d != interpolator) {
            this.f19703d = interpolator;
            this.f19702c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f19701b = 0;
        this.f19700a = 0;
        recyclerView.W2(2);
        this.f19702c.startScroll(0, 0, i13, i14, i16);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13;
        int i14;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f19706g;
        if (recyclerView.f19242n == null) {
            recyclerView.removeCallbacks(this);
            this.f19702c.abortAnimation();
            return;
        }
        this.f19705f = false;
        this.f19704e = true;
        recyclerView.L();
        OverScroller overScroller = this.f19702c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f19700a;
            int i16 = currY - this.f19701b;
            this.f19700a = currX;
            this.f19701b = currY;
            int D = RecyclerView.D(i15, recyclerView.I, recyclerView.K, recyclerView.getWidth());
            int D2 = RecyclerView.D(i16, recyclerView.f19215J, recyclerView.L, recyclerView.getHeight());
            int[] iArr = recyclerView.f19255t0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean d2 = recyclerView.M1().d(D, D2, 1, iArr, null);
            int[] iArr2 = recyclerView.f19255t0;
            if (d2) {
                D -= iArr2[0];
                D2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.C(D, D2);
            }
            if (recyclerView.f19240m != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.E2(D, D2, iArr2);
                i13 = iArr2[0];
                i14 = iArr2[1];
                D -= i13;
                D2 -= i14;
                v2 v2Var = recyclerView.f19242n.f19497e;
                if (v2Var != null && !v2Var.c() && v2Var.d()) {
                    int b13 = recyclerView.f19231h0.b();
                    if (b13 == 0) {
                        v2Var.j();
                    } else if (v2Var.b() >= b13) {
                        v2Var.h(b13 - 1);
                        v2Var.e(i13, i14);
                    } else {
                        v2Var.e(i13, i14);
                    }
                }
            } else {
                i13 = 0;
                i14 = 0;
            }
            if (!recyclerView.f19246p.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f19255t0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.M1().e(i13, i14, D, D2, 1, null, iArr3);
            int i17 = D - iArr2[0];
            int i18 = D2 - iArr2[1];
            if (i13 != 0 || i14 != 0) {
                recyclerView.g0(i13, i14);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z13 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i17 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i18 != 0));
            v2 v2Var2 = recyclerView.f19242n.f19497e;
            if ((v2Var2 == null || !v2Var2.c()) && z13) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i19 = i17 < 0 ? -currVelocity : i17 > 0 ? currVelocity : 0;
                    if (i18 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i18 <= 0) {
                        currVelocity = 0;
                    }
                    if (i19 < 0) {
                        recyclerView.o0();
                        if (recyclerView.I.isFinished()) {
                            recyclerView.I.onAbsorb(-i19);
                        }
                    } else if (i19 > 0) {
                        recyclerView.r0();
                        if (recyclerView.K.isFinished()) {
                            recyclerView.K.onAbsorb(i19);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.t0();
                        if (recyclerView.f19215J.isFinished()) {
                            recyclerView.f19215J.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.k0();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(currVelocity);
                        }
                    }
                    if (i19 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = q5.v0.f102521a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.E0) {
                    g1.i iVar = recyclerView.f19229g0;
                    int[] iArr4 = iVar.f63273c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    iVar.f63274d = 0;
                }
            } else {
                b();
                h0 h0Var = recyclerView.f19227f0;
                if (h0Var != null) {
                    h0Var.a(recyclerView, i13, i14);
                }
            }
        }
        v2 v2Var3 = recyclerView.f19242n.f19497e;
        if (v2Var3 != null && v2Var3.c()) {
            v2Var3.e(0, 0);
        }
        this.f19704e = false;
        if (!this.f19705f) {
            recyclerView.W2(0);
            recyclerView.M1().s(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = q5.v0.f102521a;
            recyclerView.postOnAnimation(this);
        }
    }
}
