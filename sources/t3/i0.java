package t3;

import android.R;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class i0 {
    public static final void a(@NotNull r5.e eVar, @NotNull z3.q qVar) {
        if (ao2.m0.d(qVar)) {
            z3.x xVar = z3.i.f140696w;
            z3.j jVar = qVar.f140714d;
            z3.a aVar = (z3.a) bs1.c.M0(jVar, xVar);
            if (aVar != null) {
                eVar.b(new r5.d(R.id.accessibilityActionPageUp, aVar.b()));
            }
            z3.x xVar2 = z3.i.f140698y;
            LinkedHashMap linkedHashMap = jVar.f140700a;
            Object obj = linkedHashMap.get(xVar2);
            if (obj == null) {
                obj = null;
            }
            z3.a aVar2 = (z3.a) obj;
            if (aVar2 != null) {
                eVar.b(new r5.d(R.id.accessibilityActionPageDown, aVar2.b()));
            }
            Object obj2 = linkedHashMap.get(z3.i.f140697x);
            if (obj2 == null) {
                obj2 = null;
            }
            z3.a aVar3 = (z3.a) obj2;
            if (aVar3 != null) {
                eVar.b(new r5.d(R.id.accessibilityActionPageLeft, aVar3.b()));
            }
            Object obj3 = linkedHashMap.get(z3.i.f140699z);
            z3.a aVar4 = (z3.a) (obj3 != null ? obj3 : null);
            if (aVar4 != null) {
                eVar.b(new r5.d(R.id.accessibilityActionPageRight, aVar4.b()));
            }
        }
    }
}
