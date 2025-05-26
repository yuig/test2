package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class t implements n.a0 {
    public int A;

    /* renamed from: a, reason: collision with root package name */
    public NavigationMenuView f32777a;

    /* renamed from: b, reason: collision with root package name */
    public LinearLayout f32778b;

    /* renamed from: c, reason: collision with root package name */
    public n.o f32779c;

    /* renamed from: d, reason: collision with root package name */
    public int f32780d;

    /* renamed from: e, reason: collision with root package name */
    public l f32781e;

    /* renamed from: f, reason: collision with root package name */
    public LayoutInflater f32782f;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f32784h;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f32787k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f32788l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f32789m;

    /* renamed from: n, reason: collision with root package name */
    public RippleDrawable f32790n;

    /* renamed from: o, reason: collision with root package name */
    public int f32791o;

    /* renamed from: p, reason: collision with root package name */
    public int f32792p;

    /* renamed from: q, reason: collision with root package name */
    public int f32793q;

    /* renamed from: r, reason: collision with root package name */
    public int f32794r;

    /* renamed from: s, reason: collision with root package name */
    public int f32795s;

    /* renamed from: t, reason: collision with root package name */
    public int f32796t;

    /* renamed from: u, reason: collision with root package name */
    public int f32797u;

    /* renamed from: v, reason: collision with root package name */
    public int f32798v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f32799w;

    /* renamed from: y, reason: collision with root package name */
    public int f32801y;

    /* renamed from: z, reason: collision with root package name */
    public int f32802z;

    /* renamed from: g, reason: collision with root package name */
    public int f32783g = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f32785i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32786j = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f32800x = true;
    public int B = -1;
    public final androidx.appcompat.app.c C = new androidx.appcompat.app.c(this, 6);

    @Override // n.a0
    public final void b(n.o oVar, boolean z13) {
    }

    @Override // n.a0
    public final boolean c(n.g0 g0Var) {
        return false;
    }

    @Override // n.a0
    public final void d(Parcelable parcelable) {
        n.q qVar;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        n.q qVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f32777a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                l lVar = this.f32781e;
                lVar.getClass();
                int i13 = bundle2.getInt("android:menu:checked", 0);
                ArrayList arrayList = lVar.f32768d;
                if (i13 != 0) {
                    lVar.f32770f = true;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            break;
                        }
                        n nVar = (n) arrayList.get(i14);
                        if ((nVar instanceof p) && (qVar2 = ((p) nVar).f32774a) != null && qVar2.f88675a == i13) {
                            lVar.D(qVar2);
                            break;
                        }
                        i14++;
                    }
                    lVar.f32770f = false;
                    lVar.C();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        n nVar2 = (n) arrayList.get(i15);
                        if ((nVar2 instanceof p) && (qVar = ((p) nVar2).f32774a) != null && (actionView = qVar.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(qVar.f88675a)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f32778b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // n.a0
    public final boolean e(n.q qVar) {
        return false;
    }

    @Override // n.a0
    public final Parcelable f() {
        Bundle bundle = new Bundle();
        if (this.f32777a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f32777a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        l lVar = this.f32781e;
        if (lVar != null) {
            lVar.getClass();
            Bundle bundle2 = new Bundle();
            n.q qVar = lVar.f32769e;
            if (qVar != null) {
                bundle2.putInt("android:menu:checked", qVar.f88675a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList arrayList = lVar.f32768d;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                n nVar = (n) arrayList.get(i13);
                if (nVar instanceof p) {
                    n.q qVar2 = ((p) nVar).f32774a;
                    View actionView = qVar2 != null ? qVar2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(qVar2.f88675a, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f32778b != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f32778b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // n.a0
    public final boolean g(n.q qVar) {
        return false;
    }

    @Override // n.a0
    public final int getId() {
        return this.f32780d;
    }

    @Override // n.a0
    public final void h(boolean z13) {
        l lVar = this.f32781e;
        if (lVar != null) {
            lVar.C();
            lVar.h();
        }
    }

    @Override // n.a0
    public final void i(Context context, n.o oVar) {
        this.f32782f = LayoutInflater.from(context);
        this.f32779c = oVar;
        this.A = context.getResources().getDimensionPixelOffset(fj.e.design_navigation_separator_vertical_padding);
    }

    @Override // n.a0
    public final boolean j() {
        return false;
    }
}
