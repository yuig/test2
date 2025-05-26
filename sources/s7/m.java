package s7;

import a.a4;
import d7.n0;
import g8.e0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f111327a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f111328b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f111329c;

    public m(CopyOnWriteArrayList copyOnWriteArrayList, int i13, e0 e0Var) {
        this.f111329c = copyOnWriteArrayList;
        this.f111327a = i13;
        this.f111328b = e0Var;
    }

    public final void a() {
        Iterator it = this.f111329c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            n0.c0(lVar.f111325a, new k(this, lVar.f111326b, 3));
        }
    }

    public final void b() {
        Iterator it = this.f111329c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            n0.c0(lVar.f111325a, new k(this, lVar.f111326b, 1));
        }
    }

    public final void c() {
        Iterator it = this.f111329c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            n0.c0(lVar.f111325a, new k(this, lVar.f111326b, 2));
        }
    }

    public final void d(int i13) {
        Iterator it = this.f111329c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            n0.c0(lVar.f111325a, new v.j(this, lVar.f111326b, i13, 5));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.f111329c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            n0.c0(lVar.f111325a, new a4(this, lVar.f111326b, exc, 23));
        }
    }

    public final void f() {
        Iterator it = this.f111329c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            n0.c0(lVar.f111325a, new k(this, lVar.f111326b, 0));
        }
    }
}
