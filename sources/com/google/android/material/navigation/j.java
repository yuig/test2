package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.transition.AutoTransition;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.internal.ParcelableSparseArray;
import n.a0;
import n.g0;
import n.o;
import n.q;
import ua.t0;

/* loaded from: classes3.dex */
public final class j implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public h f32904a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32905b;

    /* renamed from: c, reason: collision with root package name */
    public int f32906c;

    @Override // n.a0
    public final void b(o oVar, boolean z13) {
    }

    @Override // n.a0
    public final boolean c(g0 g0Var) {
        return false;
    }

    @Override // n.a0
    public final void d(Parcelable parcelable) {
        SparseArray sparseArray;
        if (parcelable instanceof NavigationBarPresenter$SavedState) {
            h hVar = this.f32904a;
            NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = (NavigationBarPresenter$SavedState) parcelable;
            int i13 = navigationBarPresenter$SavedState.f32824a;
            int size = hVar.D.f88653f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    break;
                }
                MenuItem item = hVar.D.getItem(i14);
                if (i13 == item.getItemId()) {
                    hVar.f32884g = i13;
                    hVar.f32885h = i14;
                    item.setChecked(true);
                    break;
                }
                i14++;
            }
            Context context = this.f32904a.getContext();
            ParcelableSparseArray parcelableSparseArray = navigationBarPresenter$SavedState.f32825b;
            SparseArray sparseArray2 = new SparseArray(parcelableSparseArray.size());
            for (int i15 = 0; i15 < parcelableSparseArray.size(); i15++) {
                int keyAt = parcelableSparseArray.keyAt(i15);
                BadgeState$State badgeState$State = (BadgeState$State) parcelableSparseArray.valueAt(i15);
                sparseArray2.put(keyAt, badgeState$State != null ? new hj.a(context, badgeState$State) : null);
            }
            h hVar2 = this.f32904a;
            hVar2.getClass();
            int i16 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = hVar2.f32895r;
                if (i16 >= size2) {
                    break;
                }
                int keyAt2 = sparseArray2.keyAt(i16);
                if (sparseArray.indexOfKey(keyAt2) < 0) {
                    sparseArray.append(keyAt2, (hj.a) sparseArray2.get(keyAt2));
                }
                i16++;
            }
            f[] fVarArr = hVar2.f32883f;
            if (fVarArr != null) {
                for (f fVar : fVarArr) {
                    hj.a aVar = (hj.a) sparseArray.get(fVar.getId());
                    if (aVar != null) {
                        fVar.h(aVar);
                    }
                }
            }
        }
    }

    @Override // n.a0
    public final boolean e(q qVar) {
        return false;
    }

    @Override // n.a0
    public final Parcelable f() {
        NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = new NavigationBarPresenter$SavedState();
        h hVar = this.f32904a;
        navigationBarPresenter$SavedState.f32824a = hVar.f32884g;
        SparseArray sparseArray = hVar.f32895r;
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i13 = 0; i13 < sparseArray.size(); i13++) {
            int keyAt = sparseArray.keyAt(i13);
            hj.a aVar = (hj.a) sparseArray.valueAt(i13);
            parcelableSparseArray.put(keyAt, aVar != null ? aVar.e() : null);
        }
        navigationBarPresenter$SavedState.f32825b = parcelableSparseArray;
        return navigationBarPresenter$SavedState;
    }

    @Override // n.a0
    public final boolean g(q qVar) {
        return false;
    }

    @Override // n.a0
    public final int getId() {
        return this.f32906c;
    }

    @Override // n.a0
    public final void h(boolean z13) {
        AutoTransition autoTransition;
        if (this.f32905b) {
            return;
        }
        if (z13) {
            this.f32904a.b();
            return;
        }
        h hVar = this.f32904a;
        o oVar = hVar.D;
        if (oVar == null || hVar.f32883f == null) {
            return;
        }
        int size = oVar.f88653f.size();
        if (size != hVar.f32883f.length) {
            hVar.b();
            return;
        }
        int i13 = hVar.f32884g;
        for (int i14 = 0; i14 < size; i14++) {
            MenuItem item = hVar.D.getItem(i14);
            if (item.isChecked()) {
                hVar.f32884g = item.getItemId();
                hVar.f32885h = i14;
            }
        }
        if (i13 != hVar.f32884g && (autoTransition = hVar.f32878a) != null) {
            t0.a(hVar, autoTransition);
        }
        boolean f13 = h.f(hVar.f32882e, hVar.D.m().size());
        for (int i15 = 0; i15 < size; i15++) {
            hVar.C.f32905b = true;
            hVar.f32883f[i15].j(hVar.f32882e);
            f fVar = hVar.f32883f[i15];
            if (fVar.f32861k != f13) {
                fVar.f32861k = f13;
                fVar.c();
            }
            hVar.f32883f[i15].e((q) hVar.D.getItem(i15));
            hVar.C.f32905b = false;
        }
    }

    @Override // n.a0
    public final void i(Context context, o oVar) {
        this.f32904a.D = oVar;
    }

    @Override // n.a0
    public final boolean j() {
        return false;
    }
}
