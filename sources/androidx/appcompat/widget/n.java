package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class n extends n.c {

    /* renamed from: j, reason: collision with root package name */
    public l f16650j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16651k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16652l;

    /* renamed from: m, reason: collision with root package name */
    public int f16653m;

    /* renamed from: n, reason: collision with root package name */
    public int f16654n;

    /* renamed from: o, reason: collision with root package name */
    public int f16655o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16656p;

    /* renamed from: q, reason: collision with root package name */
    public final SparseBooleanArray f16657q;

    /* renamed from: r, reason: collision with root package name */
    public h f16658r;

    /* renamed from: s, reason: collision with root package name */
    public h f16659s;

    /* renamed from: t, reason: collision with root package name */
    public j f16660t;

    /* renamed from: u, reason: collision with root package name */
    public i f16661u;

    /* renamed from: v, reason: collision with root package name */
    public final i f16662v;

    /* renamed from: w, reason: collision with root package name */
    public int f16663w;

    public n(Context context) {
        int i13 = i.g.abc_action_menu_layout;
        int i14 = i.g.abc_action_menu_item_layout;
        this.f88561a = context;
        this.f88564d = LayoutInflater.from(context);
        this.f88566f = i13;
        this.f88567g = i14;
        this.f16657q = new SparseBooleanArray();
        this.f16662v = new i(this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [n.b0] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(n.q qVar, View view, ViewGroup viewGroup) {
        View actionView = qVar.getActionView();
        if (actionView == null || qVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof n.b0 ? (n.b0) view : (n.b0) this.f88564d.inflate(this.f88567g, viewGroup, false);
            actionMenuItemView.e(qVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.f16168d = (ActionMenuView) this.f88568h;
            if (this.f16661u == null) {
                this.f16661u = new i(this, 0);
            }
            actionMenuItemView2.f16170f = this.f16661u;
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(qVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.LayoutParams)) {
            actionView.setLayoutParams(ActionMenuView.u(layoutParams));
        }
        return actionView;
    }

    @Override // n.a0
    public final void b(n.o oVar, boolean z13) {
        k();
        h hVar = this.f16659s;
        if (hVar != null && hVar.b()) {
            hVar.f88722j.dismiss();
        }
        n.z zVar = this.f88565e;
        if (zVar != null) {
            zVar.b(oVar, z13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n.a0
    public final boolean c(n.g0 g0Var) {
        boolean z13;
        if (!g0Var.hasVisibleItems()) {
            return false;
        }
        n.g0 g0Var2 = g0Var;
        while (true) {
            n.o oVar = g0Var2.f88603z;
            if (oVar == this.f88563c) {
                break;
            }
            g0Var2 = (n.g0) oVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f88568h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i13);
                if ((childAt instanceof n.b0) && ((n.b0) childAt).g() == g0Var2.A) {
                    view = childAt;
                    break;
                }
                i13++;
            }
        }
        if (view == null) {
            return false;
        }
        this.f16663w = g0Var.A.f88675a;
        int size = g0Var.f88653f.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                z13 = false;
                break;
            }
            MenuItem item = g0Var.getItem(i14);
            if (item.isVisible() && item.getIcon() != null) {
                z13 = true;
                break;
            }
            i14++;
        }
        h hVar = new h(this, this.f88562b, g0Var, view);
        this.f16659s = hVar;
        hVar.f88720h = z13;
        n.w wVar = hVar.f88722j;
        if (wVar != null) {
            wVar.q(z13);
        }
        h hVar2 = this.f16659s;
        if (!hVar2.b()) {
            if (hVar2.f88718f == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            hVar2.d(0, 0, false, false);
        }
        n.z zVar = this.f88565e;
        if (zVar != null) {
            zVar.c(g0Var);
        }
        return true;
    }

    @Override // n.a0
    public final void d(Parcelable parcelable) {
        int i13;
        MenuItem findItem;
        if ((parcelable instanceof ActionMenuPresenter$SavedState) && (i13 = ((ActionMenuPresenter$SavedState) parcelable).f16249a) > 0 && (findItem = this.f88563c.findItem(i13)) != null) {
            c((n.g0) findItem.getSubMenu());
        }
    }

    @Override // n.a0
    public final Parcelable f() {
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.f16249a = this.f16663w;
        return actionMenuPresenter$SavedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n.a0
    public final void h(boolean z13) {
        int size;
        int i13;
        ViewGroup viewGroup = (ViewGroup) this.f88568h;
        ArrayList arrayList = null;
        if (viewGroup != null) {
            n.o oVar = this.f88563c;
            if (oVar != null) {
                oVar.j();
                ArrayList m13 = this.f88563c.m();
                int size2 = m13.size();
                i13 = 0;
                for (int i14 = 0; i14 < size2; i14++) {
                    n.q qVar = (n.q) m13.get(i14);
                    if (qVar.f()) {
                        View childAt = viewGroup.getChildAt(i13);
                        n.q g13 = childAt instanceof n.b0 ? ((n.b0) childAt).g() : null;
                        View a13 = a(qVar, childAt, viewGroup);
                        if (qVar != g13) {
                            a13.setPressed(false);
                            a13.jumpDrawablesToCurrentState();
                        }
                        if (a13 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a13.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a13);
                            }
                            ((ViewGroup) this.f88568h).addView(a13, i13);
                        }
                        i13++;
                    }
                }
            } else {
                i13 = 0;
            }
            while (i13 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i13) == this.f16650j) {
                    i13++;
                } else {
                    viewGroup.removeViewAt(i13);
                }
            }
        }
        ((View) this.f88568h).requestLayout();
        n.o oVar2 = this.f88563c;
        if (oVar2 != null) {
            oVar2.j();
            ArrayList arrayList2 = oVar2.f88656i;
            int size3 = arrayList2.size();
            for (int i15 = 0; i15 < size3; i15++) {
                n.r rVar = ((n.q) arrayList2.get(i15)).A;
            }
        }
        n.o oVar3 = this.f88563c;
        if (oVar3 != null) {
            oVar3.j();
            arrayList = oVar3.f88657j;
        }
        if (!this.f16651k || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!((n.q) arrayList.get(0)).C))) {
            l lVar = this.f16650j;
            if (lVar != null) {
                Object parent = lVar.getParent();
                Object obj = this.f88568h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f16650j);
                }
            }
        } else {
            if (this.f16650j == null) {
                this.f16650j = new l(this, this.f88561a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f16650j.getParent();
            if (viewGroup3 != this.f88568h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f16650j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f88568h;
                l lVar2 = this.f16650j;
                actionMenuView.getClass();
                ActionMenuView.LayoutParams t13 = ActionMenuView.t();
                t13.f16261a = true;
                actionMenuView.addView(lVar2, t13);
            }
        }
        ((ActionMenuView) this.f88568h).f16253s = this.f16651k;
    }

    @Override // n.a0
    public final void i(Context context, n.o oVar) {
        this.f88562b = context;
        LayoutInflater.from(context);
        this.f88563c = oVar;
        Resources resources = context.getResources();
        if (!this.f16652l) {
            this.f16651k = true;
        }
        int i13 = 2;
        this.f16653m = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i14 = configuration.screenWidthDp;
        int i15 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i14 > 600 || ((i14 > 960 && i15 > 720) || (i14 > 720 && i15 > 960))) {
            i13 = 5;
        } else if (i14 >= 500 || ((i14 > 640 && i15 > 480) || (i14 > 480 && i15 > 640))) {
            i13 = 4;
        } else if (i14 >= 360) {
            i13 = 3;
        }
        this.f16655o = i13;
        int i16 = this.f16653m;
        if (this.f16651k) {
            if (this.f16650j == null) {
                this.f16650j = new l(this, this.f88561a);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f16650j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i16 -= this.f16650j.getMeasuredWidth();
        } else {
            this.f16650j = null;
        }
        this.f16654n = i16;
        float f13 = resources.getDisplayMetrics().density;
    }

    @Override // n.a0
    public final boolean j() {
        int i13;
        ArrayList arrayList;
        int i14;
        boolean z13;
        n.o oVar = this.f88563c;
        if (oVar != null) {
            arrayList = oVar.m();
            i13 = arrayList.size();
        } else {
            i13 = 0;
            arrayList = null;
        }
        int i15 = this.f16655o;
        int i16 = this.f16654n;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f88568h;
        int i17 = 0;
        boolean z14 = false;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i14 = 2;
            z13 = true;
            if (i17 >= i13) {
                break;
            }
            n.q qVar = (n.q) arrayList.get(i17);
            int i23 = qVar.f88699y;
            if ((i23 & 2) == 2) {
                i18++;
            } else if ((i23 & 1) == 1) {
                i19++;
            } else {
                z14 = true;
            }
            if (this.f16656p && qVar.C) {
                i15 = 0;
            }
            i17++;
        }
        if (this.f16651k && (z14 || i19 + i18 > i15)) {
            i15--;
        }
        int i24 = i15 - i18;
        SparseBooleanArray sparseBooleanArray = this.f16657q;
        sparseBooleanArray.clear();
        int i25 = 0;
        int i26 = 0;
        while (i25 < i13) {
            n.q qVar2 = (n.q) arrayList.get(i25);
            int i27 = qVar2.f88699y;
            boolean z15 = (i27 & 2) == i14 ? z13 : false;
            int i28 = qVar2.f88676b;
            if (z15) {
                View a13 = a(qVar2, null, viewGroup);
                a13.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a13.getMeasuredWidth();
                i16 -= measuredWidth;
                if (i26 == 0) {
                    i26 = measuredWidth;
                }
                if (i28 != 0) {
                    sparseBooleanArray.put(i28, z13);
                }
                qVar2.h(z13);
            } else if ((i27 & 1) == z13) {
                boolean z16 = sparseBooleanArray.get(i28);
                boolean z17 = ((i24 > 0 || z16) && i16 > 0) ? z13 : false;
                if (z17) {
                    View a14 = a(qVar2, null, viewGroup);
                    a14.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a14.getMeasuredWidth();
                    i16 -= measuredWidth2;
                    if (i26 == 0) {
                        i26 = measuredWidth2;
                    }
                    z17 &= i16 + i26 > 0;
                }
                if (z17 && i28 != 0) {
                    sparseBooleanArray.put(i28, true);
                } else if (z16) {
                    sparseBooleanArray.put(i28, false);
                    for (int i29 = 0; i29 < i25; i29++) {
                        n.q qVar3 = (n.q) arrayList.get(i29);
                        if (qVar3.f88676b == i28) {
                            if (qVar3.f()) {
                                i24++;
                            }
                            qVar3.h(false);
                        }
                    }
                }
                if (z17) {
                    i24--;
                }
                qVar2.h(z17);
            } else {
                qVar2.h(false);
                i25++;
                i14 = 2;
                z13 = true;
            }
            i25++;
            i14 = 2;
            z13 = true;
        }
        return z13;
    }

    public final boolean k() {
        Object obj;
        j jVar = this.f16660t;
        if (jVar != null && (obj = this.f88568h) != null) {
            ((View) obj).removeCallbacks(jVar);
            this.f16660t = null;
            return true;
        }
        h hVar = this.f16658r;
        if (hVar == null) {
            return false;
        }
        if (hVar.b()) {
            hVar.f88722j.dismiss();
        }
        return true;
    }

    public final boolean l() {
        h hVar = this.f16658r;
        return hVar != null && hVar.b();
    }

    public final boolean n() {
        n.o oVar;
        if (this.f16651k && !l() && (oVar = this.f88563c) != null && this.f88568h != null && this.f16660t == null) {
            oVar.j();
            if (!oVar.f88657j.isEmpty()) {
                j jVar = new j(0, this, new h(this, this.f88562b, this.f88563c, this.f16650j));
                this.f16660t = jVar;
                ((View) this.f88568h).post(jVar);
                return true;
            }
        }
        return false;
    }
}
