package ao2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class d0 {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z13) {
        boolean b13 = b(coroutineContext);
        boolean b14 = b(coroutineContext2);
        if (!b13 && !b14) {
            return coroutineContext.plus(coroutineContext2);
        }
        final kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        j0Var.f80434a = coroutineContext2;
        kotlin.coroutines.j jVar = kotlin.coroutines.j.f80412a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(jVar, new Function2() { // from class: ao2.c0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineContext coroutineContext4 = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof a0)) {
                    return coroutineContext4.plus(element);
                }
                kotlin.jvm.internal.j0 j0Var2 = kotlin.jvm.internal.j0.this;
                CoroutineContext.Element element2 = ((CoroutineContext) j0Var2.f80434a).get(element.getKey());
                if (element2 != null) {
                    j0Var2.f80434a = ((CoroutineContext) j0Var2.f80434a).minusKey(element.getKey());
                    return coroutineContext4.plus(((a0) element).mergeForChild(element2));
                }
                a0 a0Var = (a0) element;
                if (z13) {
                    a0Var = a0Var.copyForChild();
                }
                return coroutineContext4.plus(a0Var);
            }
        });
        if (b14) {
            j0Var.f80434a = ((CoroutineContext) j0Var.f80434a).fold(jVar, new b0(1));
        }
        return coroutineContext3.plus((CoroutineContext) j0Var.f80434a);
    }

    public static final boolean b(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new b0(0))).booleanValue();
    }

    public static final CoroutineContext c(j0 j0Var, CoroutineContext coroutineContext) {
        CoroutineContext a13 = a(j0Var.getCoroutineContext(), coroutineContext, true);
        ko2.f fVar = v0.f20219a;
        return (a13 == fVar || a13.get(kotlin.coroutines.f.Ho) != null) ? a13 : a13.plus(fVar);
    }

    public static final t2 d(bl2.c cVar, CoroutineContext coroutineContext, Object obj) {
        t2 t2Var = null;
        if (!(cVar instanceof dl2.e)) {
            return null;
        }
        if (coroutineContext.get(u2.f20218a) != null) {
            dl2.e eVar = (dl2.e) cVar;
            while (true) {
                if ((eVar instanceof s0) || (eVar = eVar.getCallerFrame()) == null) {
                    break;
                }
                if (eVar instanceof t2) {
                    t2Var = (t2) eVar;
                    break;
                }
            }
            if (t2Var != null) {
                t2Var.h0(coroutineContext, obj);
            }
        }
        return t2Var;
    }
}
