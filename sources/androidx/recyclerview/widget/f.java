package androidx.recyclerview.widget;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    public static final j5.f f19369h = new j5.f();

    /* renamed from: a, reason: collision with root package name */
    public final g1 f19370a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.d f19371b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f19372c;

    /* renamed from: e, reason: collision with root package name */
    public List f19374e;

    /* renamed from: g, reason: collision with root package name */
    public int f19376g;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f19373d = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public List f19375f = Collections.emptyList();

    public f(g1 g1Var, androidx.appcompat.app.d dVar) {
        this.f19370a = g1Var;
        this.f19371b = dVar;
        Executor executor = (Executor) dVar.f15966b;
        if (executor != null) {
            this.f19372c = executor;
        } else {
            this.f19372c = f19369h;
        }
    }

    public final void a(Runnable runnable) {
        Iterator it = this.f19373d.iterator();
        while (it.hasNext()) {
            ((e1) it.next()).f19368a.getClass();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, p4.a aVar) {
        int i13 = this.f19376g + 1;
        this.f19376g = i13;
        List list2 = this.f19374e;
        if (list == list2) {
            if (aVar != null) {
                aVar.run();
                return;
            }
            return;
        }
        g1 g1Var = this.f19370a;
        if (list == null) {
            int size = list2.size();
            this.f19374e = null;
            this.f19375f = Collections.emptyList();
            g1Var.m(0, size);
            a(aVar);
            return;
        }
        if (list2 != null) {
            ((Executor) this.f19371b.f15967c).execute(new e(this, list2, list, i13, aVar));
            return;
        }
        this.f19374e = list;
        this.f19375f = Collections.unmodifiableList(list);
        g1Var.j(0, list.size());
        a(aVar);
    }
}
