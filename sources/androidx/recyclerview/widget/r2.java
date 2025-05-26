package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r2 extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f19616a;

    public r2(RecyclerView recyclerView) {
        this.f19616a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.d2
    public final void a() {
        RecyclerView recyclerView = this.f19616a;
        recyclerView.s(null);
        recyclerView.f19231h0.f19682f = true;
        recyclerView.k2(true);
        if (recyclerView.f19224e.i()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.d2
    public final void c(int i13, Object obj, int i14) {
        RecyclerView recyclerView = this.f19616a;
        recyclerView.s(null);
        b bVar = recyclerView.f19224e;
        if (i14 < 1) {
            bVar.getClass();
            return;
        }
        ArrayList arrayList = bVar.f19322b;
        arrayList.add(bVar.k(4, i13, obj, i14));
        bVar.f19326f |= 4;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // androidx.recyclerview.widget.d2
    public final void d(int i13, int i14) {
        RecyclerView recyclerView = this.f19616a;
        recyclerView.s(null);
        b bVar = recyclerView.f19224e;
        if (i14 < 1) {
            bVar.getClass();
            return;
        }
        ArrayList arrayList = bVar.f19322b;
        arrayList.add(bVar.k(1, i13, null, i14));
        bVar.f19326f |= 1;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // androidx.recyclerview.widget.d2
    public final void e(int i13, int i14) {
        RecyclerView recyclerView = this.f19616a;
        recyclerView.s(null);
        b bVar = recyclerView.f19224e;
        bVar.getClass();
        if (i13 == i14) {
            return;
        }
        ArrayList arrayList = bVar.f19322b;
        arrayList.add(bVar.k(8, i13, null, i14));
        bVar.f19326f |= 8;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // androidx.recyclerview.widget.d2
    public final void f(int i13, int i14) {
        RecyclerView recyclerView = this.f19616a;
        recyclerView.s(null);
        b bVar = recyclerView.f19224e;
        if (i14 < 1) {
            bVar.getClass();
            return;
        }
        ArrayList arrayList = bVar.f19322b;
        arrayList.add(bVar.k(2, i13, null, i14));
        bVar.f19326f |= 2;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // androidx.recyclerview.widget.d2
    public final void g() {
        b2 b2Var;
        RecyclerView recyclerView = this.f19616a;
        if (recyclerView.f19222d == null || (b2Var = recyclerView.f19240m) == null || !b2Var.b()) {
            return;
        }
        recyclerView.requestLayout();
    }

    public final void h() {
        boolean z13 = RecyclerView.D0;
        RecyclerView recyclerView = this.f19616a;
        if (z13 && recyclerView.f19254t && recyclerView.f19252s) {
            WeakHashMap weakHashMap = q5.v0.f102521a;
            recyclerView.postOnAnimation(recyclerView.f19232i);
        } else {
            recyclerView.A = true;
            recyclerView.requestLayout();
        }
    }
}
