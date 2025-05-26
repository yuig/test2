package ar0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m2;
import androidx.recyclerview.widget.o2;
import i1.e1;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import k1.u2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends o2 implements m2, x, u {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f20397a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f20398b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f20399c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f20400d;

    /* renamed from: e, reason: collision with root package name */
    public final q f20401e;

    public n(j obstructionViewProvider) {
        Intrinsics.checkNotNullParameter(obstructionViewProvider, "obstructionViewProvider");
        this.f20397a = new HashSet();
        this.f20398b = new HashSet();
        this.f20399c = new HashSet();
        this.f20400d = new HashSet();
        this.f20401e = new q(obstructionViewProvider);
    }

    public static void m(HashSet hashSet, Function1 function1) {
        int size = hashSet.size();
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
                if (hashSet.size() != size) {
                    StackTraceElement[] customTrace = new StackTraceElement[0];
                    Intrinsics.checkNotNullParameter(customTrace, "customTrace");
                    gi.c cVar = new gi.c();
                    cVar.setStackTrace(customTrace);
                    vb0.j.f125466a.J(new ConcurrentModificationException(cVar), tb0.p.PLATFORM);
                }
            }
        }
    }

    @Override // ar0.x
    public final void a(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        m(this.f20397a, new k(recyclerView, 1));
    }

    @Override // ar0.x
    public final void b(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        q qVar = this.f20401e;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        qVar.f20410f.clear();
        q.k(qVar, recyclerView);
        m(this.f20397a, new k(recyclerView, 2));
    }

    @Override // androidx.recyclerview.widget.m2
    public final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m(this.f20399c, new l(view, 1));
    }

    @Override // androidx.recyclerview.widget.m2
    public final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m(this.f20399c, new l(view, 0));
    }

    @Override // ar0.u
    public final void e(RecyclerView recyclerView, boolean z13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        m(this.f20400d, new e1(recyclerView, z13, 1));
    }

    @Override // ar0.x
    public final void f(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        m(this.f20397a, new jm0.i(recyclerView, 1));
    }

    @Override // androidx.recyclerview.widget.o2
    public final void g(RecyclerView recyclerView, int i13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        m(this.f20398b, new m(recyclerView, i13, 1));
    }

    @Override // ar0.x
    public final void h(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        m(this.f20397a, new k(recyclerView, 0));
    }

    @Override // ar0.x
    public final void i(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        m(this.f20397a, new jm0.i(recyclerView, 2));
    }

    @Override // androidx.recyclerview.widget.o2
    public final void j(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        m(this.f20398b, new u2(recyclerView, i13, i14, 1));
    }

    public final void k(y scrollListener) {
        Intrinsics.checkNotNullParameter(scrollListener, "scrollListener");
        this.f20398b.add(scrollListener);
    }

    public final void l(w listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        q lifecycleListener = this.f20401e;
        if (!(!lifecycleListener.f20406b.isEmpty())) {
            k(lifecycleListener);
            Intrinsics.checkNotNullParameter(lifecycleListener, "lifecycleListener");
            this.f20397a.add(lifecycleListener);
        }
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (listener instanceof s) {
            lifecycleListener.f20406b.add(listener);
        }
    }

    public final void n(w listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        q lifecycleListener = this.f20401e;
        lifecycleListener.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        boolean z13 = listener instanceof s;
        HashSet hashSet = lifecycleListener.f20406b;
        if (z13) {
            hashSet.remove(listener);
        }
        if (!hashSet.isEmpty()) {
            return;
        }
        Intrinsics.checkNotNullParameter(lifecycleListener, "scrollListener");
        this.f20398b.remove(lifecycleListener);
        Intrinsics.checkNotNullParameter(lifecycleListener, "lifecycleListener");
        this.f20397a.remove(lifecycleListener);
    }
}
