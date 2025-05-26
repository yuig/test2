package wk1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import rh1.q1;
import sq0.e0;
import sq0.f0;
import x02.a2;

/* loaded from: classes5.dex */
public final class i implements f0, vq0.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f130156a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f130157b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final xj2.b f130158c = new xj2.b();

    /* renamed from: d, reason: collision with root package name */
    public p f130159d;

    @Override // sq0.f0
    public final int a() {
        Iterator it = this.f130156a.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            e eVar = (e) it.next();
            i13 += eVar.s() ? 0 : eVar.a();
        }
        return i13;
    }

    public final void b(e dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f130156a.add(dataSource);
        this.f130158c.a(dataSource.m().B(wt1.p.class).F(new q1(28, new g(dataSource, this, 0)), new q1(29, f.f130144k), ck2.i.f27923c, ck2.i.f27924d));
    }

    public final void c() {
        Object obj;
        Iterator it = this.f130156a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((e) obj).t0()) {
                    break;
                }
            }
        }
        e eVar = (e) obj;
        if (eVar != null) {
            eVar.j1();
        }
    }

    public final void d() {
        ArrayList arrayList = this.f130156a;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            e eVar = (e) it.next();
            if (eVar.i() && !eVar.s()) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 < 0) {
            return;
        }
        e eVar2 = (e) arrayList.get(i13);
        int size = arrayList.size();
        xj2.b bVar = this.f130158c;
        bVar.d();
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            a2 a2Var = ck2.i.f27924d;
            ck2.c cVar = ck2.i.f27923c;
            if (!hasNext) {
                bVar.a(eVar2.m().B(wt1.p.class).I(1L).F(new q1(26, new h(i13, size, this)), new q1(27, f.f130146m), cVar, a2Var));
                eVar2.i2();
                return;
            } else {
                e eVar3 = (e) it2.next();
                bVar.a(eVar3.m().B(wt1.p.class).F(new q1(24, new g(eVar3, this, 1)), new q1(25, f.f130145l), cVar, a2Var));
            }
        }
    }

    @Override // sq0.f0
    public final int getItemViewType(int i13) {
        sq0.o r13 = r(i13);
        if (r13 != null) {
            return ((e) r13.f115027a).getItemViewType(r13.f115028b);
        }
        return -2;
    }

    @Override // sq0.f0
    public final void p(int i13, yk1.n view) {
        Unit unit;
        Intrinsics.checkNotNullParameter(view, "view");
        sq0.o r13 = r(i13);
        if (r13 != null) {
            ((e) r13.f115027a).p(r13.f115028b, view);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            vb0.j.f125466a.G("Cannot bind to " + view + " at position " + i13, new Object[0]);
        }
    }

    @Override // sq0.f0
    public final e0 q(int i13) {
        e eVar = (e) this.f130157b.get(Integer.valueOf(i13));
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException(a.a.d("DataSource not found for type ", i13));
    }

    @Override // sq0.f0
    public final sq0.o r(int i13) {
        ArrayList arrayList;
        if (i13 < 0 || i13 >= a()) {
            return null;
        }
        int i14 = -1;
        int i15 = 0;
        do {
            i14++;
            arrayList = this.f130156a;
            if (!((e) arrayList.get(i14)).s()) {
                i15 = ((e) arrayList.get(i14)).a() + i15;
            }
        } while (i13 >= i15);
        return new sq0.o((e0) arrayList.get(i14), i13 - (i15 - ((e) arrayList.get(i14)).a()));
    }

    @Override // sq0.f0
    public final List s() {
        return CollectionsKt.F0(this.f130156a);
    }
}
