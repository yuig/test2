package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class y1 implements nk.f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19715a;

    public /* synthetic */ y1(Object obj) {
        this.f19715a = obj;
    }

    public static y1 i(int i13, int i14, int i15) {
        return new y1(AccessibilityNodeInfo.CollectionInfo.obtain(i13, i14, false, i15));
    }

    public static y1 j(int i13, int i14, int i15, int i16, boolean z13, boolean z14) {
        return new y1(AccessibilityNodeInfo.CollectionItemInfo.obtain(i13, i14, i15, i16, z13, z14));
    }

    @Override // nk.g
    public Object a() {
        return this.f19715a;
    }

    public void b(int i13, r5.e eVar, String str, Bundle bundle) {
    }

    public r5.e c(int i13) {
        return null;
    }

    public void d(a aVar) {
        int i13 = aVar.f19313a;
        Object obj = this.f19715a;
        if (i13 == 1) {
            RecyclerView recyclerView = (RecyclerView) obj;
            recyclerView.f19242n.s0(recyclerView, aVar.f19314b, aVar.f19316d);
            return;
        }
        if (i13 == 2) {
            RecyclerView recyclerView2 = (RecyclerView) obj;
            recyclerView2.f19242n.v0(recyclerView2, aVar.f19314b, aVar.f19316d);
        } else if (i13 == 4) {
            RecyclerView recyclerView3 = (RecyclerView) obj;
            recyclerView3.f19242n.w0(recyclerView3, aVar.f19314b, aVar.f19316d);
        } else {
            if (i13 != 8) {
                return;
            }
            RecyclerView recyclerView4 = (RecyclerView) obj;
            recyclerView4.f19242n.u0(recyclerView4, aVar.f19314b, aVar.f19316d);
        }
    }

    public r5.e e(int i13) {
        return null;
    }

    public View f(int i13) {
        return ((RecyclerView) this.f19715a).getChildAt(i13);
    }

    public int g() {
        return ((RecyclerView) this.f19715a).getChildCount();
    }

    public void h(int i13, Object obj, int i14) {
        int i15;
        int i16;
        Object obj2 = this.f19715a;
        RecyclerView recyclerView = (RecyclerView) obj2;
        int g13 = recyclerView.f19226f.f19441a.g();
        int i17 = i14 + i13;
        for (int i18 = 0; i18 < g13; i18++) {
            View f13 = recyclerView.f19226f.f19441a.f(i18);
            y2 w13 = RecyclerView.w1(f13);
            if (w13 != null && !w13.d0() && (i16 = w13.f19719c) >= i13 && i16 < i17) {
                w13.g(2);
                w13.b(obj);
                ((RecyclerView.LayoutParams) f13.getLayoutParams()).f19270c = true;
            }
        }
        q2 q2Var = recyclerView.f19220c;
        ArrayList arrayList = q2Var.f19604c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y2 y2Var = (y2) arrayList.get(size);
            if (y2Var != null && (i15 = y2Var.f19719c) >= i13 && i15 < i17) {
                y2Var.g(2);
                q2Var.k(size);
            }
        }
        ((RecyclerView) obj2).f19237k0 = true;
    }

    public void k(int i13, int i14) {
        Object obj = this.f19715a;
        RecyclerView recyclerView = (RecyclerView) obj;
        int g13 = recyclerView.f19226f.f19441a.g();
        for (int i15 = 0; i15 < g13; i15++) {
            y2 w13 = RecyclerView.w1(recyclerView.f19226f.f19441a.f(i15));
            if (w13 != null && !w13.d0() && w13.f19719c >= i13) {
                w13.Y(i14, false);
                recyclerView.f19231h0.f19682f = true;
            }
        }
        ArrayList arrayList = recyclerView.f19220c.f19604c;
        int size = arrayList.size();
        for (int i16 = 0; i16 < size; i16++) {
            y2 y2Var = (y2) arrayList.get(i16);
            if (y2Var != null && y2Var.f19719c >= i13) {
                y2Var.Y(i14, false);
            }
        }
        recyclerView.requestLayout();
        ((RecyclerView) obj).f19235j0 = true;
    }

    public void l(int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        int i24;
        Object obj = this.f19715a;
        RecyclerView recyclerView = (RecyclerView) obj;
        int g13 = recyclerView.f19226f.f19441a.g();
        int i25 = -1;
        if (i13 < i14) {
            i16 = i13;
            i15 = i14;
            i17 = -1;
        } else {
            i15 = i13;
            i16 = i14;
            i17 = 1;
        }
        for (int i26 = 0; i26 < g13; i26++) {
            y2 w13 = RecyclerView.w1(recyclerView.f19226f.f19441a.f(i26));
            if (w13 != null && (i24 = w13.f19719c) >= i16 && i24 <= i15) {
                if (i24 == i13) {
                    w13.Y(i14 - i13, false);
                } else {
                    w13.Y(i17, false);
                }
                recyclerView.f19231h0.f19682f = true;
            }
        }
        q2 q2Var = recyclerView.f19220c;
        q2Var.getClass();
        if (i13 < i14) {
            i19 = i13;
            i18 = i14;
        } else {
            i18 = i13;
            i19 = i14;
            i25 = 1;
        }
        ArrayList arrayList = q2Var.f19604c;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            y2 y2Var = (y2) arrayList.get(i27);
            if (y2Var != null && (i23 = y2Var.f19719c) >= i19 && i23 <= i18) {
                if (i23 == i13) {
                    y2Var.Y(i14 - i13, false);
                } else {
                    y2Var.Y(i25, false);
                }
            }
        }
        recyclerView.requestLayout();
        ((RecyclerView) obj).f19235j0 = true;
    }

    public boolean m(int i13, int i14, Bundle bundle) {
        return false;
    }

    public void n(y2 y2Var, f2 f2Var, f2 f2Var2) {
        RecyclerView recyclerView = (RecyclerView) this.f19715a;
        recyclerView.f19220c.p(y2Var);
        recyclerView.l(y2Var);
        y2Var.a0(false);
        if (recyclerView.M.c(y2Var, f2Var, f2Var2)) {
            recyclerView.g2();
        }
    }

    public void o(int i13) {
        Object obj = this.f19715a;
        View childAt = ((RecyclerView) obj).getChildAt(i13);
        if (childAt != null) {
            ((RecyclerView) obj).X(childAt);
            childAt.clearAnimation();
        }
        ((RecyclerView) obj).removeViewAt(i13);
    }

    public void p(y2 y2Var) {
        Object obj = this.f19715a;
        ((RecyclerView) obj).f19242n.F0(y2Var.f19717a, ((RecyclerView) obj).f19220c);
    }

    public y1() {
        this.f19715a = new r5.g(this);
    }
}
