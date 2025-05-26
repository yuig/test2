package ey1;

import ck2.i;
import ek2.j;
import java.util.concurrent.TimeUnit;
import jk2.l1;
import k1.p;
import kotlin.jvm.internal.Intrinsics;
import tk2.e;
import uj2.q;
import yx1.l;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public j f60662a;

    /* renamed from: b, reason: collision with root package name */
    public a f60663b;

    public abstract long a();

    public abstract boolean b();

    public final void c(long j13) {
        if (!b()) {
            e();
            return;
        }
        j jVar = this.f60662a;
        if (jVar == null || !jVar.isDisposed()) {
            return;
        }
        l1 A = q.x(j13, j13, TimeUnit.SECONDS, e.f118016b).A(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(A, "observeOn(...)");
        Intrinsics.checkNotNullParameter(A, "<this>");
        this.f60662a = (j) A.F(new l(2, new p(this, j13, 8)), new l(3, b.f60661i), i.f27923c, i.f27924d);
    }

    public final void d(a onDataPollingRefreshListener) {
        Intrinsics.checkNotNullParameter(onDataPollingRefreshListener, "onDataPollingRefreshListener");
        Intrinsics.checkNotNullParameter(onDataPollingRefreshListener, "<set-?>");
        this.f60663b = onDataPollingRefreshListener;
        c(a());
    }

    public final void e() {
        j jVar = this.f60662a;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        this.f60662a = null;
    }
}
