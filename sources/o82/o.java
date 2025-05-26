package o82;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class o implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final sq0.f f93677a = new sq0.f(hs1.t.a(), new hf0.b(), new m60.h0(hf0.b.q()), (List) null, 24);

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        d2 request = (d2) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof a2) {
            a2 a2Var = (a2) request;
            int i13 = a2Var.f93529d;
            sq0.f fVar = this.f93677a;
            sq0.y yVar = a2Var.f93528c;
            int i14 = a2Var.f93526a;
            List list = a2Var.f93527b;
            if (i13 == Integer.MIN_VALUE) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object j13 = j((l82.i0) it.next());
                    if (j13 != null) {
                        arrayList.add(j13);
                    }
                }
                sq0.f.l(fVar, arrayList, i14, yVar);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object j14 = j((l82.i0) it2.next());
                if (j14 != null) {
                    arrayList2.add(j14);
                }
            }
            fVar.k(i14, a2Var.f93529d, yVar, arrayList2);
        }
    }

    public abstract Object j(l82.i0 i0Var);
}
