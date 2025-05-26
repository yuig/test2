package rm2;

import am2.v0;
import am2.w0;
import dm2.c1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f108752a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f108753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym2.g f108754c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f108755d;

    public m(o oVar, ym2.g gVar, n nVar) {
        this.f108753b = oVar;
        this.f108754c = gVar;
        this.f108755d = nVar;
    }

    @Override // rm2.d0
    public final void a() {
        ArrayList elements = this.f108752a;
        n nVar = this.f108755d;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(elements, "elements");
        ym2.g gVar = this.f108754c;
        if (gVar == null) {
            return;
        }
        am2.p n03 = lb.l0.n0(gVar, nVar.f108759d);
        if (n03 != null) {
            HashMap hashMap = nVar.f108757b;
            List value = wn2.k.e(elements);
            pn2.b0 type = ((c1) n03).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(type, "type");
            hashMap.put(gVar, new dn2.y(value, type));
            return;
        }
        if (nVar.f108758c.o(nVar.f108760e) && Intrinsics.d(gVar.b(), "value")) {
            ArrayList arrayList = new ArrayList();
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof dn2.a) {
                    arrayList.add(next);
                }
            }
            List list = nVar.f108761f;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                list.add((bm2.c) ((dn2.a) it2.next()).f55623a);
            }
        }
    }

    @Override // rm2.d0
    public final c0 b(ym2.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        ArrayList arrayList = new ArrayList();
        v0 NO_SOURCE = w0.f15602a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return new l(this.f108753b.p(classId, NO_SOURCE, arrayList), this, arrayList);
    }

    @Override // rm2.d0
    public final void c(ym2.b enumClassId, ym2.g enumEntryName) {
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        this.f108752a.add(new dn2.i(enumClassId, enumEntryName));
    }

    @Override // rm2.d0
    public final void d(dn2.f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f108752a.add(new dn2.t(value));
    }

    @Override // rm2.d0
    public final void e(Object obj) {
        this.f108752a.add(o.t(this.f108753b, this.f108754c, obj));
    }
}
