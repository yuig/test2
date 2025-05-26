package i2;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f71132a;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f71134c;

    /* renamed from: b, reason: collision with root package name */
    public final Object f71133b = new Object();

    /* renamed from: d, reason: collision with root package name */
    public List f71135d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public List f71136e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final g f71137f = new g(0);

    public j(androidx.activity.a0 a0Var) {
        this.f71132a = a0Var;
    }

    public static final void a(j jVar, Throwable th3) {
        synchronized (jVar.f71133b) {
            try {
                if (jVar.f71134c != null) {
                    return;
                }
                jVar.f71134c = th3;
                List list = jVar.f71135d;
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    bl2.c cVar = ((h) list.get(i13)).f71122b;
                    xk2.q qVar = xk2.s.f135225b;
                    cVar.resumeWith(ue.c.m(th3));
                }
                jVar.f71135d.clear();
                jVar.f71137f.set(0);
                Unit unit = Unit.f80348a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void b(long j13) {
        Object m13;
        synchronized (this.f71133b) {
            try {
                List list = this.f71135d;
                this.f71135d = this.f71136e;
                this.f71136e = list;
                this.f71137f.set(0);
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    h hVar = (h) list.get(i13);
                    hVar.getClass();
                    try {
                        xk2.q qVar = xk2.s.f135225b;
                        m13 = hVar.f71121a.invoke(Long.valueOf(j13));
                    } catch (Throwable th3) {
                        xk2.q qVar2 = xk2.s.f135225b;
                        m13 = ue.c.m(th3);
                    }
                    hVar.f71122b.resumeWith(m13);
                }
                list.clear();
                Unit unit = Unit.f80348a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // i2.i1
    public final Object d(Function1 function1, bl2.c frame) {
        Function0 function0;
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        h hVar = new h(function1, oVar);
        synchronized (this.f71133b) {
            Throwable th3 = this.f71134c;
            if (th3 != null) {
                xk2.q qVar = xk2.s.f135225b;
                oVar.resumeWith(ue.c.m(th3));
            } else {
                boolean isEmpty = this.f71135d.isEmpty();
                boolean z13 = !isEmpty;
                this.f71135d.add(hVar);
                if (!z13) {
                    this.f71137f.set(1);
                }
                oVar.e(new i(0, this, hVar));
                if (isEmpty && (function0 = this.f71132a) != null) {
                    try {
                        function0.invoke();
                    } catch (Throwable th4) {
                        a(this, th4);
                    }
                }
            }
        }
        Object u13 = oVar.u();
        if (u13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return kotlin.coroutines.g.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.h hVar) {
        return kotlin.coroutines.g.b(this, hVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.h hVar) {
        return kotlin.coroutines.g.c(this, hVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.g.d(coroutineContext, this);
    }
}
