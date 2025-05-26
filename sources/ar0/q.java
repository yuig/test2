package ar0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import yn2.c0;

/* loaded from: classes.dex */
public final class q implements y, x {

    /* renamed from: a, reason: collision with root package name */
    public final j f20405a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f20406b;

    /* renamed from: c, reason: collision with root package name */
    public final qc2.d f20407c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f20408d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f20409e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f20410f;

    public q(j obstructionViewProvider) {
        Intrinsics.checkNotNullParameter(obstructionViewProvider, "obstructionViewProvider");
        this.f20405a = obstructionViewProvider;
        this.f20406b = new HashSet();
        this.f20407c = new qc2.d();
        this.f20408d = new LinkedHashSet();
        this.f20409e = new LinkedHashSet();
        this.f20410f = new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(ArrayList arrayList, View view) {
        List childImpressionViews;
        if (!(view instanceof nx.v) || (childImpressionViews = ((nx.v) view).getChildImpressionViews()) == null) {
            return;
        }
        arrayList.addAll(childImpressionViews);
        Iterator it = childImpressionViews.iterator();
        while (it.hasNext()) {
            e(arrayList, (View) it.next());
        }
    }

    public static void k(q qVar, RecyclerView viewParent) {
        HashSet hashSet;
        HashMap hashMap;
        LinkedHashSet linkedHashSet;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(viewParent, "recyclerView");
        Intrinsics.checkNotNullParameter(viewParent, "viewParent");
        LinkedHashSet linkedHashSet2 = qVar.f20409e;
        linkedHashSet2.clear();
        l2 l2Var = viewParent.f19242n;
        Intrinsics.f(l2Var);
        int E = l2Var.E();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Rect rect = new Rect();
        yn2.h hVar = new yn2.h(c0.j(CollectionsKt.K(qVar.f20405a.U4()), p.f20404i));
        while (hVar.hasNext()) {
            ((View) hVar.next()).getGlobalVisibleRect(rect);
            linkedHashSet3.add(new qc2.b(rect.left, rect.top, rect.right, rect.bottom));
        }
        int i13 = 0;
        while (true) {
            hashSet = qVar.f20406b;
            hashMap = qVar.f20410f;
            linkedHashSet = qVar.f20408d;
            if (i13 >= E) {
                break;
            }
            View D = l2Var.D(i13);
            Intrinsics.f(D);
            View z13 = l2Var.z(l2.Z(D));
            if (z13 != null) {
                ArrayList<View> l13 = f0.l(z13);
                e(l13, z13);
                for (View view : l13) {
                    Intrinsics.f(view);
                    float d2 = qVar.f20407c.d(view, viewParent, linkedHashSet3);
                    if (d2 > 0.0f) {
                        linkedHashSet2.add(view);
                        if (!linkedHashSet.contains(view)) {
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                ((s) it.next()).j(viewParent, view);
                            }
                            linkedHashSet.add(view);
                        }
                    }
                    qc2.c cVar = (qc2.c) qc2.f.DEFAULT.getCalculate().invoke(Double.valueOf(d2));
                    if (((qc2.c) hashMap.get(view)) != cVar) {
                        hashMap.put(view, cVar);
                    }
                }
            }
            i13++;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (!linkedHashSet2.contains((View) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            if (linkedHashSet.remove(view2)) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    ((s) it3.next()).k(viewParent, view2);
                }
            }
            hashMap.remove(view2);
        }
    }

    @Override // ar0.x
    public final void a(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        j(recyclerView);
    }

    @Override // ar0.x
    public final void b(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }

    @Override // ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        k(this, recyclerView);
    }

    @Override // ar0.y
    public final void d(RecyclerView recyclerView, int i13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }

    @Override // ar0.x
    public final void f(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        j(recyclerView);
    }

    @Override // ar0.y
    public final void g(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        k(this, recyclerView);
    }

    @Override // ar0.x
    public final void h(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        for (View view : this.f20409e) {
            Iterator it = this.f20406b.iterator();
            while (it.hasNext()) {
                ((s) it.next()).m(recyclerView, view);
            }
        }
        k(this, recyclerView);
    }

    @Override // ar0.x
    public final void i(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        k(this, recyclerView);
    }

    public final void j(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        for (View view : this.f20409e) {
            Iterator it = this.f20406b.iterator();
            while (it.hasNext()) {
                ((s) it.next()).l(recyclerView, view);
            }
        }
    }
}
