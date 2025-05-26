package ho2;

import ao2.d0;
import ao2.f0;
import ao2.f1;
import ao2.g0;
import ao2.o1;
import ao2.o2;
import ao2.t2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final fi.b f69758a = new fi.b("UNDEFINED", 4);

    /* renamed from: b, reason: collision with root package name */
    public static final fi.b f69759b = new fi.b("REUSABLE_CLAIMED", 4);

    public static final void a(Object obj, bl2.c cVar) {
        if (!(cVar instanceof e)) {
            cVar.resumeWith(obj);
            return;
        }
        e eVar = (e) cVar;
        Throwable a13 = xk2.s.a(obj);
        Object zVar = a13 == null ? obj : new ao2.z(false, a13);
        f0 f0Var = eVar.f69754d;
        bl2.c cVar2 = eVar.f69755e;
        if (f0Var.k(cVar2.getContext())) {
            eVar.f69756f = zVar;
            eVar.f20207c = 1;
            eVar.f69754d.g(cVar2.getContext(), eVar);
            return;
        }
        f1 a14 = o2.a();
        if (a14.J()) {
            eVar.f69756f = zVar;
            eVar.f20207c = 1;
            a14.w(eVar);
            return;
        }
        a14.A(true);
        try {
            o1 o1Var = (o1) cVar2.getContext().get(g0.f20154b);
            if (o1Var == null || o1Var.isActive()) {
                Object obj2 = eVar.f69757g;
                CoroutineContext context = cVar2.getContext();
                Object c13 = y.c(context, obj2);
                t2 d2 = c13 != y.f69792a ? d0.d(cVar2, context, c13) : null;
                try {
                    cVar2.resumeWith(obj);
                    Unit unit = Unit.f80348a;
                } finally {
                    if (d2 == null || d2.g0()) {
                        y.a(context, c13);
                    }
                }
            } else {
                eVar.resumeWith(ue.c.m(o1Var.getCancellationException()));
            }
            while (a14.L()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
