package ja;

import gk2.k1;
import gk2.p0;
import gk2.w2;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f75246a = new Object();

    public static p0 a(d0 d0Var, String[] strArr, zd0.c cVar) {
        Executor h10 = d0Var.h();
        uj2.a0 a0Var = tk2.e.f118015a;
        mk2.k kVar = new mk2.k(h10);
        hk2.p pVar = new hk2.p(cVar);
        sp2.i iVar = new sp2.i(21, strArr, d0Var);
        uj2.a aVar = uj2.a.LATEST;
        int i13 = uj2.h.f122339a;
        ck2.i.b(aVar, "mode is null");
        k1 i14 = new w2(new gk2.r(iVar, aVar).n(kVar), kVar, 3).i(kVar);
        androidx.appcompat.widget.q qVar = new androidx.appcompat.widget.q(pVar, 0);
        ck2.i.c(Integer.MAX_VALUE, "maxConcurrency");
        return new p0(i14, qVar);
    }

    public static kk2.b b(Callable callable) {
        return new kk2.b(new t5.e(callable, 23), 0);
    }
}
