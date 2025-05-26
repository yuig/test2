package androidx.recyclerview.widget;

import a.cb;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a */
    public final ArrayList f19602a;

    /* renamed from: b */
    public ArrayList f19603b;

    /* renamed from: c */
    public final ArrayList f19604c;

    /* renamed from: d */
    public final List f19605d;

    /* renamed from: e */
    public int f19606e;

    /* renamed from: f */
    public int f19607f;

    /* renamed from: g */
    public e5.d f19608g;

    /* renamed from: h */
    public a0 f19609h;

    /* renamed from: i */
    public final /* synthetic */ RecyclerView f19610i;

    public q2(RecyclerView recyclerView) {
        this.f19610i = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f19602a = arrayList;
        this.f19603b = null;
        this.f19604c = new ArrayList();
        this.f19605d = Collections.unmodifiableList(arrayList);
        this.f19606e = 2;
        this.f19607f = 2;
    }

    public final void a(y2 it, boolean z13) {
        RecyclerView.x(it);
        RecyclerView recyclerView = this.f19610i;
        a3 a3Var = recyclerView.f19243n0;
        View view = it.f19717a;
        if (a3Var != null) {
            z2 z2Var = (z2) a3Var.f19320f;
            q5.v0.o(view, z2Var instanceof z2 ? (q5.b) z2Var.f19755e.remove(view) : null);
        }
        if (z13) {
            ArrayList arrayList = recyclerView.f19244o;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                rk0.j this$0 = ((rk0.e) arrayList.get(i13)).f108457a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.f108473v = SystemClock.elapsedRealtime();
            }
            b2 b2Var = recyclerView.f19240m;
            if (b2Var != null) {
                b2Var.y(it);
            }
            if (recyclerView.f19231h0 != null) {
                recyclerView.f19228g.n(it);
            }
            int[] iArr = RecyclerView.A0;
        }
        it.f19735s = null;
        it.f19734r = null;
        e5.d c13 = c();
        c13.getClass();
        int i14 = it.f19722f;
        ArrayList arrayList2 = c13.e(i14).f19559a;
        if (((p2) ((SparseArray) c13.f57216c).get(i14)).f19560b <= arrayList2.size()) {
            x5.a.a(view);
        } else {
            it.Z();
            arrayList2.add(it);
        }
    }

    public final int b(int i13) {
        RecyclerView recyclerView = this.f19610i;
        if (i13 >= 0 && i13 < recyclerView.f19231h0.b()) {
            return !recyclerView.f19231h0.f19683g ? i13 : recyclerView.f19224e.h(i13, 0);
        }
        StringBuilder s13 = a.a.s("invalid position ", i13, ". State item count is ");
        s13.append(recyclerView.f19231h0.b());
        s13.append(recyclerView.z0());
        throw new IndexOutOfBoundsException(s13.toString());
    }

    public final e5.d c() {
        if (this.f19608g == null) {
            this.f19608g = new e5.d();
            g();
        }
        return this.f19608g;
    }

    public final List d() {
        return this.f19605d;
    }

    public final View e(int i13) {
        return ((y2) this.f19602a.get(i13)).f19717a;
    }

    public final View f(int i13) {
        return o(i13, Long.MAX_VALUE).f19717a;
    }

    public final void g() {
        RecyclerView recyclerView;
        b2 b2Var;
        e5.d dVar = this.f19608g;
        if (dVar == null || (b2Var = (recyclerView = this.f19610i).f19240m) == null || !recyclerView.f19252s) {
            return;
        }
        ((Set) dVar.f57217d).add(b2Var);
    }

    public final void h(b2 b2Var, boolean z13) {
        e5.d dVar = this.f19608g;
        if (dVar != null) {
            ((Set) dVar.f57217d).remove(b2Var);
            if (((Set) dVar.f57217d).size() != 0 || z13) {
                return;
            }
            for (int i13 = 0; i13 < ((SparseArray) dVar.f57216c).size(); i13++) {
                SparseArray sparseArray = (SparseArray) dVar.f57216c;
                ArrayList arrayList = ((p2) sparseArray.get(sparseArray.keyAt(i13))).f19559a;
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    x5.a.a(((y2) arrayList.get(i14)).f19717a);
                }
            }
        }
    }

    public final void i(View view) {
        y2 w13 = RecyclerView.w1(view);
        w13.f19730n = null;
        w13.f19731o = false;
        w13.f19726j &= -33;
        m(w13);
    }

    public final void j() {
        ArrayList arrayList = this.f19604c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k(size);
        }
        arrayList.clear();
        if (RecyclerView.E0) {
            g1.i iVar = this.f19610i.f19229g0;
            int[] iArr = iVar.f63273c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            iVar.f63274d = 0;
        }
    }

    public final void k(int i13) {
        int[] iArr = RecyclerView.A0;
        ArrayList arrayList = this.f19604c;
        a((y2) arrayList.get(i13), true);
        arrayList.remove(i13);
    }

    public final void l(View view) {
        y2 w13 = RecyclerView.w1(view);
        boolean L = w13.L();
        RecyclerView recyclerView = this.f19610i;
        if (L) {
            recyclerView.removeDetachedView(view, false);
        }
        if (w13.D()) {
            w13.f19730n.p(w13);
        } else if (w13.g0()) {
            w13.f19726j &= -33;
        }
        m(w13);
        if (recyclerView.M == null || w13.x()) {
            return;
        }
        recyclerView.M.j(w13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a9, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(androidx.recyclerview.widget.y2 r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.q2.m(androidx.recyclerview.widget.y2):void");
    }

    public final void n(View view) {
        y2 w13 = RecyclerView.w1(view);
        boolean o13 = w13.o(12);
        RecyclerView recyclerView = this.f19610i;
        if (!o13 && w13.T() && !recyclerView.t(w13)) {
            if (this.f19603b == null) {
                this.f19603b = new ArrayList();
            }
            w13.f19730n = this;
            w13.f19731o = true;
            this.f19603b.add(w13);
            return;
        }
        if (w13.t() && !w13.z() && !recyclerView.f19240m.f19332b) {
            throw new IllegalArgumentException(cb.f(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        w13.f19730n = this;
        w13.f19731o = false;
        this.f19602a.add(w13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x015e, code lost:
    
        if (r3.f19683g == false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018e, code lost:
    
        if (r10.f19721e != r5.f(r10.f19719c)) goto L434;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.y2 o(int r26, long r27) {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.q2.o(int, long):androidx.recyclerview.widget.y2");
    }

    public final void p(y2 y2Var) {
        if (y2Var.f19731o) {
            this.f19603b.remove(y2Var);
        } else {
            this.f19602a.remove(y2Var);
        }
        y2Var.f19730n = null;
        y2Var.f19731o = false;
        y2Var.f19726j &= -33;
    }

    public final void q() {
        l2 l2Var = this.f19610i.f19242n;
        this.f19607f = this.f19606e + (l2Var != null ? l2Var.f19502j : 0);
        ArrayList arrayList = this.f19604c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f19607f; size--) {
            k(size);
        }
    }
}
