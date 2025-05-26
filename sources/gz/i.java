package gz;

import ao2.j0;
import ao2.v0;
import com.pinterest.api.model.es0;
import com.pinterest.api.model.ur0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.j1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final cz.e f66345a;

    public i(cz.e anketManager) {
        Intrinsics.checkNotNullParameter(anketManager, "anketManager");
        this.f66345a = anketManager;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        List list;
        Object obj;
        m request = (m) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = request instanceof k;
        cz.e eVar = this.f66345a;
        if (z13) {
            k kVar = (k) request;
            eVar.d(kVar.f66347a, kVar.f66348b);
            return;
        }
        if (!(request instanceof j)) {
            if (request instanceof l) {
                eVar.b(((l) request).f66349a);
                return;
            }
            return;
        }
        ur0 ur0Var = eVar.f53460h;
        if (ur0Var == null || (list = ur0Var.f42632f) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((es0) obj).f37337d, ((j) request).f66346a)) {
                    break;
                }
            }
        }
        es0 es0Var = (es0) obj;
        if (es0Var != null) {
            jz.d J1 = j1.J1(es0Var);
            HashMap hashMap = eVar.f53461i;
            String str = es0Var.f37337d;
            cz.b bVar = (cz.b) hashMap.get(str);
            Object obj2 = eVar.f53464l.get(str);
            om1.e eVar2 = obj2 instanceof om1.e ? (om1.e) obj2 : null;
            ur0 ur0Var2 = eVar.f53460h;
            eventIntake.a(new g(J1, bVar, eVar2, ur0Var2 != null ? ur0Var2.f42628b : null, (List) eVar.f53463k.get(str)));
        }
    }

    @Override // l82.g
    public final CoroutineContext f(l82.h hVar) {
        m effectRequest = (m) hVar;
        Intrinsics.checkNotNullParameter(effectRequest, "effectRequest");
        ko2.f fVar = v0.f20219a;
        return ho2.q.f69782a;
    }
}
