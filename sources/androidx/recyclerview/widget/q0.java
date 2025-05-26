package androidx.recyclerview.widget;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q0 extends h2 implements m2 {
    public Rect A;
    public long B;

    /* renamed from: d, reason: collision with root package name */
    public float f19572d;

    /* renamed from: e, reason: collision with root package name */
    public float f19573e;

    /* renamed from: f, reason: collision with root package name */
    public float f19574f;

    /* renamed from: g, reason: collision with root package name */
    public float f19575g;

    /* renamed from: h, reason: collision with root package name */
    public float f19576h;

    /* renamed from: i, reason: collision with root package name */
    public float f19577i;

    /* renamed from: j, reason: collision with root package name */
    public float f19578j;

    /* renamed from: k, reason: collision with root package name */
    public float f19579k;

    /* renamed from: m, reason: collision with root package name */
    public final n0 f19581m;

    /* renamed from: o, reason: collision with root package name */
    public int f19583o;

    /* renamed from: q, reason: collision with root package name */
    public RecyclerView f19585q;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f19587s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f19588t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f19589u;

    /* renamed from: x, reason: collision with root package name */
    public q5.j f19592x;

    /* renamed from: y, reason: collision with root package name */
    public o0 f19593y;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19569a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final float[] f19570b = new float[2];

    /* renamed from: c, reason: collision with root package name */
    public y2 f19571c = null;

    /* renamed from: l, reason: collision with root package name */
    public int f19580l = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f19582n = 0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f19584p = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final androidx.appcompat.app.z f19586r = new androidx.appcompat.app.z(this, 15);

    /* renamed from: v, reason: collision with root package name */
    public View f19590v = null;

    /* renamed from: w, reason: collision with root package name */
    public int f19591w = -1;

    /* renamed from: z, reason: collision with root package name */
    public final k0 f19594z = new k0(this);

    public q0(ar0.c cVar) {
        this.f19581m = cVar;
    }

    public static boolean o(View view, float f13, float f14, float f15, float f16) {
        return f13 >= f15 && f13 <= f15 + ((float) view.getWidth()) && f14 >= f16 && f14 <= f16 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.m2
    public final void c(View view) {
        q(view);
        y2 t13 = this.f19585q.t1(view);
        if (t13 == null) {
            return;
        }
        y2 y2Var = this.f19571c;
        if (y2Var != null && t13 == y2Var) {
            r(null, 0);
            return;
        }
        l(t13, false);
        if (this.f19569a.remove(t13.f19717a)) {
            this.f19581m.a(this.f19585q, t13);
        }
    }

    @Override // androidx.recyclerview.widget.m2
    public final void d(View view) {
    }

    @Override // androidx.recyclerview.widget.h2
    public final void f(Rect rect, View view, RecyclerView recyclerView, w2 w2Var) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.h2
    public final void g(Canvas canvas, RecyclerView recyclerView, w2 w2Var) {
        float f13;
        float f14;
        this.f19591w = -1;
        if (this.f19571c != null) {
            float[] fArr = this.f19570b;
            n(fArr);
            f13 = fArr[0];
            f14 = fArr[1];
        } else {
            f13 = 0.0f;
            f14 = 0.0f;
        }
        y2 y2Var = this.f19571c;
        ArrayList arrayList = this.f19584p;
        this.f19581m.getClass();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            l0 l0Var = (l0) arrayList.get(i13);
            float f15 = l0Var.f19474a;
            float f16 = l0Var.f19476c;
            y2 y2Var2 = l0Var.f19478e;
            if (f15 == f16) {
                l0Var.f19482i = y2Var2.f19717a.getTranslationX();
            } else {
                l0Var.f19482i = ep.b.a(f16, f15, l0Var.f19486m, f15);
            }
            float f17 = l0Var.f19475b;
            float f18 = l0Var.f19477d;
            if (f17 == f18) {
                l0Var.f19483j = y2Var2.f19717a.getTranslationY();
            } else {
                l0Var.f19483j = ep.b.a(f18, f17, l0Var.f19486m, f17);
            }
            int save = canvas.save();
            n0.f(recyclerView, y2Var2, l0Var.f19482i, l0Var.f19483j, false);
            canvas.restoreToCount(save);
        }
        if (y2Var != null) {
            int save2 = canvas.save();
            n0.f(recyclerView, y2Var, f13, f14, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        boolean z13 = false;
        if (this.f19571c != null) {
            float[] fArr = this.f19570b;
            n(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
        }
        y2 y2Var = this.f19571c;
        ArrayList arrayList = this.f19584p;
        this.f19581m.getClass();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            l0 l0Var = (l0) arrayList.get(i13);
            int save = canvas.save();
            View view = l0Var.f19478e.f19717a;
            canvas.restoreToCount(save);
        }
        if (y2Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i14 = size - 1; i14 >= 0; i14--) {
            l0 l0Var2 = (l0) arrayList.get(i14);
            boolean z14 = l0Var2.f19485l;
            if (z14 && !l0Var2.f19481h) {
                arrayList.remove(i14);
            } else if (!z14) {
                z13 = true;
            }
        }
        if (z13) {
            recyclerView.invalidate();
        }
    }

    public final void i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f19585q;
        if (recyclerView2 == recyclerView) {
            return;
        }
        k0 k0Var = this.f19594z;
        if (recyclerView2 != null) {
            recyclerView2.t2(this);
            RecyclerView recyclerView3 = this.f19585q;
            recyclerView3.f19248q.remove(k0Var);
            if (recyclerView3.f19250r == k0Var) {
                recyclerView3.f19250r = null;
            }
            ArrayList arrayList = this.f19585q.C;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.f19584p;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                l0 l0Var = (l0) arrayList2.get(0);
                l0Var.f19480g.cancel();
                this.f19581m.a(this.f19585q, l0Var.f19478e);
            }
            arrayList2.clear();
            this.f19590v = null;
            this.f19591w = -1;
            VelocityTracker velocityTracker = this.f19587s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f19587s = null;
            }
            o0 o0Var = this.f19593y;
            if (o0Var != null) {
                o0Var.f19535b = false;
                this.f19593y = null;
            }
            if (this.f19592x != null) {
                this.f19592x = null;
            }
        }
        this.f19585q = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f19574f = resources.getDimension(ia.b.item_touch_helper_swipe_escape_velocity);
            this.f19575g = resources.getDimension(ia.b.item_touch_helper_swipe_escape_max_velocity);
            ViewConfiguration.get(this.f19585q.getContext()).getScaledTouchSlop();
            this.f19585q.m(this);
            this.f19585q.f19248q.add(k0Var);
            this.f19585q.n(this);
            this.f19593y = new o0(this);
            this.f19592x = new q5.j(this.f19585q.getContext(), this.f19593y);
        }
    }

    public final int j(int i13) {
        if ((i13 & 12) == 0) {
            return 0;
        }
        int i14 = this.f19576h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f19587s;
        n0 n0Var = this.f19581m;
        if (velocityTracker != null && this.f19580l > -1) {
            float f13 = this.f19575g;
            n0Var.getClass();
            velocityTracker.computeCurrentVelocity(1000, f13);
            float xVelocity = this.f19587s.getXVelocity(this.f19580l);
            float yVelocity = this.f19587s.getYVelocity(this.f19580l);
            int i15 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i15 & i13) != 0 && i14 == i15 && abs >= this.f19574f && abs > Math.abs(yVelocity)) {
                return i15;
            }
        }
        float width = this.f19585q.getWidth();
        n0Var.getClass();
        float f14 = width * 0.5f;
        if ((i13 & i14) == 0 || Math.abs(this.f19576h) <= f14) {
            return 0;
        }
        return i14;
    }

    public final int k(int i13) {
        if ((i13 & 3) == 0) {
            return 0;
        }
        int i14 = this.f19577i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f19587s;
        n0 n0Var = this.f19581m;
        if (velocityTracker != null && this.f19580l > -1) {
            float f13 = this.f19575g;
            n0Var.getClass();
            velocityTracker.computeCurrentVelocity(1000, f13);
            float xVelocity = this.f19587s.getXVelocity(this.f19580l);
            float yVelocity = this.f19587s.getYVelocity(this.f19580l);
            int i15 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i15 & i13) != 0 && i15 == i14 && abs >= this.f19574f && abs > Math.abs(xVelocity)) {
                return i15;
            }
        }
        float height = this.f19585q.getHeight();
        n0Var.getClass();
        float f14 = height * 0.5f;
        if ((i13 & i14) == 0 || Math.abs(this.f19577i) <= f14) {
            return 0;
        }
        return i14;
    }

    public final void l(y2 y2Var, boolean z13) {
        ArrayList arrayList = this.f19584p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l0 l0Var = (l0) arrayList.get(size);
            if (l0Var.f19478e == y2Var) {
                l0Var.f19484k |= z13;
                if (!l0Var.f19485l) {
                    l0Var.f19480g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View m(MotionEvent motionEvent) {
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        y2 y2Var = this.f19571c;
        if (y2Var != null) {
            float f13 = this.f19578j + this.f19576h;
            float f14 = this.f19579k + this.f19577i;
            View view = y2Var.f19717a;
            if (o(view, x13, y13, f13, f14)) {
                return view;
            }
        }
        ArrayList arrayList = this.f19584p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l0 l0Var = (l0) arrayList.get(size);
            View view2 = l0Var.f19478e.f19717a;
            if (o(view2, x13, y13, l0Var.f19482i, l0Var.f19483j)) {
                return view2;
            }
        }
        return this.f19585q.F0(x13, y13);
    }

    public final void n(float[] fArr) {
        if ((this.f19583o & 12) != 0) {
            fArr[0] = (this.f19578j + this.f19576h) - this.f19571c.f19717a.getLeft();
        } else {
            fArr[0] = this.f19571c.f19717a.getTranslationX();
        }
        if ((this.f19583o & 3) != 0) {
            fArr[1] = (this.f19579k + this.f19577i) - this.f19571c.f19717a.getTop();
        } else {
            fArr[1] = this.f19571c.f19717a.getTranslationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(y2 source) {
        int i13;
        int i14;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int abs4;
        l2 l2Var;
        int i15;
        int i16;
        int i17;
        char c13;
        if (!this.f19585q.isLayoutRequested() && this.f19582n == 2) {
            n0 n0Var = this.f19581m;
            n0Var.getClass();
            int i18 = (int) (this.f19578j + this.f19576h);
            int i19 = (int) (this.f19579k + this.f19577i);
            float abs5 = Math.abs(i19 - source.f19717a.getTop());
            View view = source.f19717a;
            if (abs5 >= view.getHeight() * 0.5f || Math.abs(i18 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList = this.f19588t;
                if (arrayList == null) {
                    this.f19588t = new ArrayList();
                    this.f19589u = new ArrayList();
                } else {
                    arrayList.clear();
                    this.f19589u.clear();
                }
                int round = Math.round(this.f19578j + this.f19576h);
                int round2 = Math.round(this.f19579k + this.f19577i);
                int width = view.getWidth() + round;
                int height = view.getHeight() + round2;
                int i23 = (round + width) / 2;
                int i24 = (round2 + height) / 2;
                l2 l2Var2 = this.f19585q.f19242n;
                int E = l2Var2.E();
                int i25 = 0;
                while (i25 < E) {
                    View D = l2Var2.D(i25);
                    if (D == view) {
                        i15 = round;
                        i16 = round2;
                        i17 = width;
                        l2Var = l2Var2;
                    } else {
                        l2Var = l2Var2;
                        if (D.getBottom() < round2 || D.getTop() > height || D.getRight() < round || D.getLeft() > width) {
                            i15 = round;
                            i16 = round2;
                            i17 = width;
                        } else {
                            y2 t13 = this.f19585q.t1(D);
                            c13 = 2;
                            int abs6 = Math.abs(i23 - ((D.getRight() + D.getLeft()) / 2));
                            int abs7 = Math.abs(i24 - ((D.getBottom() + D.getTop()) / 2));
                            int i26 = (abs7 * abs7) + (abs6 * abs6);
                            i15 = round;
                            int size = this.f19588t.size();
                            i16 = round2;
                            i17 = width;
                            int i27 = 0;
                            int i28 = 0;
                            while (i27 < size) {
                                int i29 = size;
                                if (i26 <= ((Integer) this.f19589u.get(i27)).intValue()) {
                                    break;
                                }
                                i28++;
                                i27++;
                                size = i29;
                            }
                            this.f19588t.add(i28, t13);
                            this.f19589u.add(i28, Integer.valueOf(i26));
                            i25++;
                            l2Var2 = l2Var;
                            round = i15;
                            round2 = i16;
                            width = i17;
                        }
                    }
                    c13 = 2;
                    i25++;
                    l2Var2 = l2Var;
                    round = i15;
                    round2 = i16;
                    width = i17;
                }
                ArrayList arrayList2 = this.f19588t;
                if (arrayList2.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i18;
                int height2 = view.getHeight() + i19;
                int left2 = i18 - view.getLeft();
                int top2 = i19 - view.getTop();
                int size2 = arrayList2.size();
                y2 target = null;
                int i33 = -1;
                int i34 = 0;
                while (i34 < size2) {
                    y2 y2Var = (y2) arrayList2.get(i34);
                    ArrayList arrayList3 = arrayList2;
                    if (left2 > 0) {
                        int right = y2Var.f19717a.getRight() - width2;
                        i13 = width2;
                        if (right < 0) {
                            i14 = size2;
                            if (y2Var.f19717a.getRight() > view.getRight() && (abs4 = Math.abs(right)) > i33) {
                                i33 = abs4;
                                target = y2Var;
                            }
                            if (left2 < 0 && (left = y2Var.f19717a.getLeft() - i18) > 0 && y2Var.f19717a.getLeft() < view.getLeft() && (abs3 = Math.abs(left)) > i33) {
                                i33 = abs3;
                                target = y2Var;
                            }
                            if (top2 < 0 && (top = y2Var.f19717a.getTop() - i19) > 0 && y2Var.f19717a.getTop() < view.getTop() && (abs2 = Math.abs(top)) > i33) {
                                i33 = abs2;
                                target = y2Var;
                            }
                            if (top2 > 0 && (bottom = y2Var.f19717a.getBottom() - height2) < 0 && y2Var.f19717a.getBottom() > view.getBottom() && (abs = Math.abs(bottom)) > i33) {
                                i33 = abs;
                                target = y2Var;
                            }
                            i34++;
                            arrayList2 = arrayList3;
                            width2 = i13;
                            size2 = i14;
                        }
                    } else {
                        i13 = width2;
                    }
                    i14 = size2;
                    if (left2 < 0) {
                        i33 = abs3;
                        target = y2Var;
                    }
                    if (top2 < 0) {
                        i33 = abs2;
                        target = y2Var;
                    }
                    if (top2 > 0) {
                        i33 = abs;
                        target = y2Var;
                    }
                    i34++;
                    arrayList2 = arrayList3;
                    width2 = i13;
                    size2 = i14;
                }
                if (target == null) {
                    this.f19588t.clear();
                    this.f19589u.clear();
                    return;
                }
                int j13 = target.j();
                source.j();
                RecyclerView recyclerView = this.f19585q;
                ar0.c cVar = (ar0.c) n0Var;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(target, "target");
                int i35 = source.f19722f;
                int i36 = target.f19722f;
                if (i35 != i36) {
                    Integer valueOf = Integer.valueOf(i35);
                    Set set = ar0.c.f20369d;
                    if (!set.contains(valueOf) || !set.contains(Integer.valueOf(i36))) {
                        return;
                    }
                }
                y92.e eVar = cVar.f20370b;
                if (eVar != null) {
                    eVar.c0(ar0.c.g(source), ar0.c.g(target));
                }
                RecyclerView recyclerView2 = this.f19585q;
                l2 l2Var3 = recyclerView2.f19242n;
                boolean z13 = l2Var3 instanceof p0;
                View view2 = target.f19717a;
                if (!z13) {
                    if (l2Var3.k()) {
                        if (l2.K(view2) <= recyclerView2.getPaddingLeft()) {
                            recyclerView2.G2(j13);
                        }
                        if (l2.N(view2) >= recyclerView2.getWidth() - recyclerView2.getPaddingRight()) {
                            recyclerView2.G2(j13);
                        }
                    }
                    if (l2Var3.l()) {
                        if (l2.O(view2) <= recyclerView2.getPaddingTop()) {
                            recyclerView2.G2(j13);
                        }
                        if (l2.I(view2) >= recyclerView2.getHeight() - recyclerView2.getPaddingBottom()) {
                            recyclerView2.G2(j13);
                            return;
                        }
                        return;
                    }
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((p0) l2Var3);
                linearLayoutManager.h("Cannot drop a view during a scroll or layout calculation");
                linearLayoutManager.f1();
                linearLayoutManager.z1();
                int Z = l2.Z(view);
                int Z2 = l2.Z(view2);
                char c14 = Z < Z2 ? (char) 1 : (char) 65535;
                if (linearLayoutManager.f19162u) {
                    if (c14 == 1) {
                        linearLayoutManager.B1(Z2, linearLayoutManager.f19159r.g() - (linearLayoutManager.f19159r.c(view) + linearLayoutManager.f19159r.e(view2)));
                        return;
                    } else {
                        linearLayoutManager.B1(Z2, linearLayoutManager.f19159r.g() - linearLayoutManager.f19159r.b(view2));
                        return;
                    }
                }
                if (c14 == 65535) {
                    linearLayoutManager.B1(Z2, linearLayoutManager.f19159r.e(view2));
                } else {
                    linearLayoutManager.B1(Z2, linearLayoutManager.f19159r.b(view2) - linearLayoutManager.f19159r.c(view));
                }
            }
        }
    }

    public final void q(View view) {
        if (view == this.f19590v) {
            this.f19590v = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0095, code lost:
    
        if (r2 > 0) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(androidx.recyclerview.widget.y2 r22, int r23) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.q0.r(androidx.recyclerview.widget.y2, int):void");
    }

    public final void s(y2 y2Var) {
        n0 n0Var = this.f19581m;
        RecyclerView recyclerView = this.f19585q;
        int d2 = n0Var.d(recyclerView, y2Var);
        WeakHashMap weakHashMap = q5.v0.f102521a;
        if (!((n0.b(d2, recyclerView.getLayoutDirection()) & 16711680) != 0)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (y2Var.f19717a.getParent() != this.f19585q) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker = this.f19587s;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f19587s = VelocityTracker.obtain();
        this.f19577i = 0.0f;
        this.f19576h = 0.0f;
        r(y2Var, 2);
    }

    public final void t(int i13, int i14, MotionEvent motionEvent) {
        float x13 = motionEvent.getX(i14);
        float y13 = motionEvent.getY(i14);
        float f13 = x13 - this.f19572d;
        this.f19576h = f13;
        this.f19577i = y13 - this.f19573e;
        if ((i13 & 4) == 0) {
            this.f19576h = Math.max(0.0f, f13);
        }
        if ((i13 & 8) == 0) {
            this.f19576h = Math.min(0.0f, this.f19576h);
        }
        if ((i13 & 1) == 0) {
            this.f19577i = Math.max(0.0f, this.f19577i);
        }
        if ((i13 & 2) == 0) {
            this.f19577i = Math.min(0.0f, this.f19577i);
        }
    }
}
