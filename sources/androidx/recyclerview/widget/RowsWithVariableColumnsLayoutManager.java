package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class RowsWithVariableColumnsLayoutManager extends l2 implements u0 {

    /* renamed from: r */
    public final t0 f19276r;

    /* renamed from: s */
    public int f19277s;

    /* renamed from: t */
    public int f19278t;

    /* renamed from: u */
    public int f19279u;

    /* renamed from: v */
    public int f19280v;

    /* renamed from: w */
    public int f19281w;

    /* renamed from: x */
    public int f19282x;

    /* renamed from: y */
    public boolean f19283y;

    /* renamed from: p */
    public final SparseIntArray f19274p = new SparseIntArray();

    /* renamed from: q */
    public final SparseIntArray f19275q = new SparseIntArray();

    /* renamed from: z */
    public boolean f19284z = false;
    public final boolean A = true;

    public RowsWithVariableColumnsLayoutManager(r0 r0Var) {
        this.f19276r = r0Var;
    }

    @Override // androidx.recyclerview.widget.l2
    public final RecyclerView.LayoutParams A() {
        return new RowLayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.l2
    public final RecyclerView.LayoutParams B(Context context, AttributeSet attributeSet) {
        return new RowLayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.l2
    public final RecyclerView.LayoutParams C(ViewGroup.LayoutParams layoutParams) {
        return new RowLayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.l2
    public final int N0(int i13, q2 q2Var, w2 w2Var) {
        int i14;
        if (E() != 0 && i13 != 0) {
            View D = D(0);
            View D2 = D(E() - 1);
            if (D != null && D2 != null) {
                int i15 = -i13;
                SparseIntArray sparseIntArray = this.f19274p;
                if (i13 > 0) {
                    int height = D2.getHeight() + ((int) D2.getY());
                    if (sparseIntArray.get(this.f19280v, 0) + (E() - 1) == P() - 1 && height <= this.f19507o - T()) {
                        return 0;
                    }
                } else if (sparseIntArray.get(this.f19280v, 0) == 0 && D.getY() >= 0.0f) {
                    j0(Math.min(Y() - ((int) D.getY()), i15));
                    return 0;
                }
                int i16 = -i15;
                this.f19280v = this.f19278t;
                int y13 = (int) D.getY();
                if (i16 > 0) {
                    i14 = Math.abs((y13 - i16) / this.f19277s);
                    int i17 = this.f19278t + i14;
                    this.f19278t = i17;
                    if (i17 >= b1()) {
                        int b13 = b1();
                        this.f19278t = b13;
                        i14 = b13 - this.f19280v;
                        int i18 = this.f19277s * i14;
                        int T = this.f19507o - T();
                        int i19 = this.f19277s;
                        this.f19282x = i18 + (T % i19 == 0 ? 0 : i19 - ((this.f19507o - T()) % this.f19277s)) + y13;
                        this.f19283y = true;
                    }
                } else {
                    int abs = Math.abs(i16) + y13;
                    if (abs > 0) {
                        int i23 = this.f19277s;
                        int i24 = abs / i23;
                        if (abs % i23 > 0) {
                            i24++;
                        }
                        i14 = i24;
                    } else {
                        i14 = 0;
                    }
                    int i25 = this.f19278t - i14;
                    this.f19278t = i25;
                    if (i25 < 0) {
                        this.f19278t = 0;
                        i14 = this.f19280v;
                        this.f19282x = y13 - (this.f19277s * i14);
                        this.f19283y = true;
                    }
                }
                this.f19279u = sparseIntArray.get(this.f19278t, 0);
                if (this.f19283y) {
                    i15 = -this.f19282x;
                }
                j0(i15);
                this.f19283y = false;
                Z0(q2Var, i14, i13 > 0);
                return i13;
            }
        }
        return 0;
    }

    public final void Z0(q2 q2Var, int i13, boolean z13) {
        SparseIntArray sparseIntArray;
        int Y;
        SparseIntArray sparseIntArray2;
        SparseArray sparseArray = new SparseArray(E());
        int i14 = 0;
        View D = D(0);
        int E = E();
        int i15 = 0;
        while (true) {
            sparseIntArray = this.f19274p;
            if (i15 >= E) {
                break;
            }
            sparseArray.put(sparseIntArray.get(this.f19280v, 0) + i15, D(i15));
            i15++;
        }
        int size = sparseArray.size();
        for (int i16 = 0; i16 < size; i16++) {
            int h10 = this.f19493a.h((View) sparseArray.valueAt(i16));
            if (h10 >= 0) {
                this.f19493a.c(h10);
            }
        }
        if (this.f19284z) {
            Y = this.f19281w;
            this.f19281w = 0;
            this.f19284z = false;
        } else {
            Y = z13 ? Y() : ((int) D.getY()) - (this.f19277s * i13);
        }
        int i17 = this.f19278t;
        int i18 = this.f19279u;
        int P = P();
        int i19 = 0;
        while (i18 < P) {
            View view = (View) sparseArray.get(i18);
            if (view == null) {
                View f13 = q2Var.f(i18);
                g0(f13);
                int M = l2.M(f13) + i19;
                int i23 = this.f19506n;
                boolean z14 = this.A;
                if (M > i23) {
                    i17++;
                    Y += l2.L(f13);
                    if (z14 || sparseIntArray.get(i17, -1) == -1) {
                        sparseIntArray.put(i17, i18);
                    }
                    i19 = i14;
                }
                SparseIntArray sparseIntArray3 = this.f19275q;
                int i24 = sparseIntArray3.get(i18, -1);
                if (!z14 && i24 != -1 && i24 > i17) {
                    Y += l2.L(f13) * (i24 - i17);
                    if (sparseIntArray.get(i24, -1) == -1) {
                        sparseIntArray.put(i24, i18);
                    }
                    i19 = i14;
                    i17 = i24;
                }
                ((RowLayoutParams) f13.getLayoutParams()).f19273e = i17;
                f(f13);
                int M2 = l2.M(f13) + i19;
                int L = l2.L(f13) + Y;
                Rect rect = ((RecyclerView.LayoutParams) f13.getLayoutParams()).f19269b;
                sparseIntArray2 = sparseIntArray;
                int i25 = Y;
                f13.layout(rect.left + i19, rect.top + Y, M2 - rect.right, L - rect.bottom);
                if (z14 || sparseIntArray3.get(i18, -1) == -1) {
                    sparseIntArray3.put(i18, i17);
                }
                Y = i25;
                i19 = l2.M(f13) + i19;
            } else {
                sparseIntArray2 = sparseIntArray;
                i(view, -1);
                sparseArray.remove(i18);
                int M3 = l2.M(view) + ((int) view.getX());
                int y13 = (int) view.getY();
                i17 = ((RowLayoutParams) view.getLayoutParams()).f19273e;
                i19 = M3;
                Y = y13;
            }
            i18++;
            sparseIntArray = sparseIntArray2;
            i14 = 0;
        }
        int size2 = sparseArray.size();
        for (int i26 = 0; i26 < size2; i26++) {
            q2Var.l((View) sparseArray.valueAt(i26));
        }
    }

    public final int a1() {
        return this.f19274p.get(this.f19280v, 0) + (E() - 1);
    }

    @Override // androidx.recyclerview.widget.u0
    public final void b(Exception exc) {
        LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException a13;
        t0 t0Var = this.f19276r;
        if (t0Var instanceof r0) {
            String value = ((r0) t0Var).value();
            StringBuilder sb3 = new StringBuilder("[debugTag: ");
            String message = exc.getMessage();
            sb3.append(value);
            sb3.append("] ");
            sb3.append(message);
            a13 = new LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException(sb3.toString(), exc);
        } else {
            a13 = t0Var instanceof s0 ? ((s0) t0Var).a(exc) : new LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException(HiddenActivity$$ExternalSyntheticOutline0.m(exc, new StringBuilder("[debugTag: unknown] ")), exc);
        }
        vb0.j.f125466a.J(a13, tb0.p.PLATFORM);
    }

    public final int b1() {
        int size = this.f19274p.size();
        int T = (this.f19507o - T()) / this.f19277s;
        if ((this.f19507o - T()) % this.f19277s > 0) {
            T++;
        }
        return size - T;
    }

    @Override // androidx.recyclerview.widget.u0
    /* renamed from: c */
    public final t0 getF19172p() {
        return this.f19276r;
    }

    public final void c1(q2 q2Var) {
        if (P() <= 0) {
            for (int E = E() - 1; E >= 0; E--) {
                this.f19493a.j(E);
            }
            return;
        }
        if (this.f19277s == 0) {
            View f13 = q2Var.f(0);
            g0(f13);
            f(f13);
            this.f19277s = l2.L(f13);
            K0(q2Var, this.f19493a.h(f13), f13);
        }
        w(q2Var);
        if (!this.f19284z) {
            this.f19278t = 0;
            this.f19279u = 0;
            this.f19274p.put(0, 0);
        }
        int i13 = this.f19507o;
        int i14 = this.f19277s;
        int i15 = i13 / i14;
        if (i13 % i14 > 0) {
            i15++;
        }
        Z0(q2Var, i15 + 2, true);
    }

    @Override // androidx.recyclerview.widget.l2
    public final void s0(RecyclerView recyclerView, int i13, int i14) {
        this.f19284z = true;
        View D = D(0);
        if (D != null) {
            this.f19281w = (int) D.getY();
        }
    }

    @Override // androidx.recyclerview.widget.l2
    public final void x0(q2 q2Var, w2 w2Var) {
        try {
            c1(q2Var);
        } catch (Exception e13) {
            b(e13);
        }
    }
}
