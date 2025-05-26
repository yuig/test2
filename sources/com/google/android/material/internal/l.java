package com.google.android.material.internal;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
public final class l extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f32768d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public n.q f32769e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f32771g;

    public l(t tVar) {
        this.f32771g = tVar;
        C();
    }

    public final void C() {
        boolean z13;
        if (this.f32770f) {
            return;
        }
        this.f32770f = true;
        ArrayList arrayList = this.f32768d;
        arrayList.clear();
        arrayList.add(new m());
        t tVar = this.f32771g;
        int size = tVar.f32779c.m().size();
        boolean z14 = false;
        int i13 = -1;
        int i14 = 0;
        boolean z15 = false;
        int i15 = 0;
        while (i14 < size) {
            n.q qVar = (n.q) tVar.f32779c.m().get(i14);
            if (qVar.isChecked()) {
                D(qVar);
            }
            if (qVar.isCheckable()) {
                qVar.g(z14);
            }
            if (qVar.hasSubMenu()) {
                n.g0 g0Var = qVar.f88689o;
                if (g0Var.hasVisibleItems()) {
                    if (i14 != 0) {
                        arrayList.add(new o(tVar.A, z14 ? 1 : 0));
                    }
                    arrayList.add(new p(qVar));
                    int size2 = g0Var.f88653f.size();
                    int i16 = z14 ? 1 : 0;
                    int i17 = i16;
                    while (i16 < size2) {
                        n.q qVar2 = (n.q) g0Var.getItem(i16);
                        if (qVar2.isVisible()) {
                            if (i17 == 0 && qVar2.getIcon() != null) {
                                i17 = 1;
                            }
                            if (qVar2.isCheckable()) {
                                qVar2.g(z14);
                            }
                            if (qVar.isChecked()) {
                                D(qVar);
                            }
                            arrayList.add(new p(qVar2));
                        }
                        i16++;
                        z14 = false;
                    }
                    if (i17 != 0) {
                        int size3 = arrayList.size();
                        for (int size4 = arrayList.size(); size4 < size3; size4++) {
                            ((p) arrayList.get(size4)).f32775b = true;
                        }
                    }
                }
                z13 = true;
            } else {
                int i18 = qVar.f88676b;
                if (i18 != i13) {
                    i15 = arrayList.size();
                    z15 = qVar.getIcon() != null;
                    if (i14 != 0) {
                        i15++;
                        int i19 = tVar.A;
                        arrayList.add(new o(i19, i19));
                    }
                } else if (!z15 && qVar.getIcon() != null) {
                    int size5 = arrayList.size();
                    for (int i23 = i15; i23 < size5; i23++) {
                        ((p) arrayList.get(i23)).f32775b = true;
                    }
                    z13 = true;
                    z15 = true;
                    p pVar = new p(qVar);
                    pVar.f32775b = z15;
                    arrayList.add(pVar);
                    i13 = i18;
                }
                z13 = true;
                p pVar2 = new p(qVar);
                pVar2.f32775b = z15;
                arrayList.add(pVar2);
                i13 = i18;
            }
            i14++;
            z14 = false;
        }
        this.f32770f = z14 ? 1 : 0;
    }

    public final void D(n.q qVar) {
        if (this.f32769e == qVar || !qVar.isCheckable()) {
            return;
        }
        n.q qVar2 = this.f32769e;
        if (qVar2 != null) {
            qVar2.setChecked(false);
        }
        this.f32769e = qVar;
        qVar.setChecked(true);
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f32768d.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final long f(int i13) {
        return i13;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        n nVar = (n) this.f32768d.get(i13);
        if (nVar instanceof o) {
            return 2;
        }
        if (nVar instanceof m) {
            return 3;
        }
        if (nVar instanceof p) {
            return ((p) nVar).f32774a.hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        int g13 = g(i13);
        ArrayList arrayList = this.f32768d;
        View view = ((s) y2Var).f19717a;
        t tVar = this.f32771g;
        if (g13 != 0) {
            if (g13 != 1) {
                if (g13 != 2) {
                    return;
                }
                o oVar = (o) arrayList.get(i13);
                view.setPadding(tVar.f32795s, oVar.f32772a, tVar.f32796t, oVar.f32773b);
                return;
            }
            TextView textView = (TextView) view;
            textView.setText(((p) arrayList.get(i13)).f32774a.f88679e);
            textView.setTextAppearance(tVar.f32783g);
            textView.setPadding(tVar.f32797u, textView.getPaddingTop(), tVar.f32798v, textView.getPaddingBottom());
            ColorStateList colorStateList = tVar.f32784h;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            v0.o(textView, new k(this, i13, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        ColorStateList colorStateList2 = tVar.f32788l;
        navigationMenuItemView.C = colorStateList2;
        navigationMenuItemView.D = colorStateList2 != null;
        n.q qVar = navigationMenuItemView.B;
        if (qVar != null) {
            navigationMenuItemView.t(qVar.getIcon());
        }
        int i14 = tVar.f32785i;
        CheckedTextView checkedTextView = navigationMenuItemView.f32683z;
        checkedTextView.setTextAppearance(i14);
        ColorStateList colorStateList3 = tVar.f32787k;
        if (colorStateList3 != null) {
            checkedTextView.setTextColor(colorStateList3);
        }
        Drawable drawable = tVar.f32789m;
        Drawable newDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
        WeakHashMap weakHashMap = v0.f102521a;
        navigationMenuItemView.setBackground(newDrawable);
        RippleDrawable rippleDrawable = tVar.f32790n;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        p pVar = (p) arrayList.get(i13);
        navigationMenuItemView.f32680w = pVar.f32775b;
        int i15 = tVar.f32791o;
        int i16 = tVar.f32792p;
        navigationMenuItemView.setPadding(i15, i16, i15, i16);
        checkedTextView.setCompoundDrawablePadding(tVar.f32793q);
        if (tVar.f32799w) {
            navigationMenuItemView.f32679v = tVar.f32794r;
        }
        checkedTextView.setMaxLines(tVar.f32801y);
        navigationMenuItemView.f32682y = tVar.f32786j;
        navigationMenuItemView.e(pVar.f32774a);
        v0.o(navigationMenuItemView, new k(this, i13, false));
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView recyclerView, int i13) {
        y2 rVar;
        t tVar = this.f32771g;
        if (i13 == 0) {
            LayoutInflater layoutInflater = tVar.f32782f;
            androidx.appcompat.app.c cVar = tVar.C;
            View inflate = layoutInflater.inflate(fj.i.design_navigation_item, (ViewGroup) recyclerView, false);
            rVar = new r(inflate);
            inflate.setOnClickListener(cVar);
        } else if (i13 == 1) {
            rVar = new j(2, tVar.f32782f, recyclerView);
        } else {
            if (i13 != 2) {
                if (i13 != 3) {
                    return null;
                }
                return new j(tVar.f32778b);
            }
            rVar = new j(1, tVar.f32782f, recyclerView);
        }
        return rVar;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void y(y2 y2Var) {
        s sVar = (s) y2Var;
        if (sVar instanceof r) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) sVar.f19717a;
            FrameLayout frameLayout = navigationMenuItemView.A;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.f32683z.setCompoundDrawables(null, null, null, null);
        }
    }
}
