package r4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Object f106122a;

    /* renamed from: b, reason: collision with root package name */
    public l f106123b;

    /* renamed from: c, reason: collision with root package name */
    public n f106124c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f106125d;

    public final void a(Runnable runnable, Executor executor) {
        n nVar = this.f106124c;
        if (nVar != null) {
            nVar.d(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.f106125d = true;
        l lVar = this.f106123b;
        boolean z13 = lVar != null && lVar.f106128b.j(obj);
        if (z13) {
            this.f106122a = null;
            this.f106123b = null;
            this.f106124c = null;
        }
        return z13;
    }

    public final void c() {
        this.f106125d = true;
        l lVar = this.f106123b;
        if (lVar == null || !lVar.f106128b.cancel(true)) {
            return;
        }
        this.f106122a = null;
        this.f106123b = null;
        this.f106124c = null;
    }

    public final boolean d(Throwable th3) {
        this.f106125d = true;
        l lVar = this.f106123b;
        boolean z13 = lVar != null && lVar.f106128b.k(th3);
        if (z13) {
            this.f106122a = null;
            this.f106123b = null;
            this.f106124c = null;
        }
        return z13;
    }

    public final void finalize() {
        n nVar;
        l lVar = this.f106123b;
        if (lVar != null && !lVar.f106128b.isDone()) {
            lVar.a(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f106122a, 1));
        }
        if (this.f106125d || (nVar = this.f106124c) == null) {
            return;
        }
        nVar.j(null);
    }
}
