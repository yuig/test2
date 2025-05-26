package androidx.compose.foundation.relocation;

import a3.d;
import com.bumptech.glide.c;
import k1.v0;
import kh2.b0;
import kotlin.Unit;
import q3.x;
import s3.q1;
import t1.b;
import t1.k;
import t1.l;
import u2.p;
import u2.q;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static final d a(q1 q1Var, x xVar, d dVar) {
        d J2 = q1Var.J(xVar, false);
        return dVar.h(c.d(J2.f484a, J2.f485b));
    }

    public static final q b(q qVar, b bVar) {
        return qVar.j(new BringIntoViewRequesterElement(bVar));
    }

    public static final Object c(p pVar, d dVar, bl2.c cVar) {
        t1.a aVar;
        Object j13;
        if (!pVar.f120042a.f120054m) {
            return Unit.f80348a;
        }
        q1 T0 = c.T0(pVar);
        if (pVar.f120042a.f120054m) {
            t1.a aVar2 = (t1.a) b0.f0(pVar, k.f115760p);
            if (aVar2 == null) {
                aVar2 = new l(pVar);
            }
            aVar = aVar2;
        } else {
            aVar = null;
        }
        return (aVar != null && (j13 = aVar.j(T0, new v0(3, dVar, T0), cVar)) == cl2.a.COROUTINE_SUSPENDED) ? j13 : Unit.f80348a;
    }
}
