package kv0;

import com.pinterest.api.model.mp0;
import com.pinterest.api.model.ro0;
import com.pinterest.api.model.st;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.wo0;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jk2.h0;
import jk2.j1;
import jk2.u0;
import kh2.b0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t3.d0;
import x02.i2;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80963i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f80964j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i13) {
        super(1);
        this.f80963i = i13;
        this.f80964j = iVar;
    }

    public final j1 b(st itemData) {
        int i13 = this.f80963i;
        i iVar = this.f80964j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(itemData, "itemData");
                String s13 = itemData.s();
                if (s13 != null) {
                    return new j1(iVar.f80970c.P(s13), new bv0.k(18, new au0.f(itemData, 17)), 0);
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(itemData, "itemData");
                String s14 = itemData.s();
                if (s14 != null) {
                    return new j1(iVar.f80970c.P(s14), new bv0.k(19, a.f80933t), 0);
                }
                return null;
        }
    }

    public final u e(x it) {
        int i13 = this.f80963i;
        i iVar = this.f80964j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return u.a(b0.R(iVar.f80969b, it.f81023a, false), it.f81024b);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List o13;
        int i13 = this.f80963i;
        i iVar = this.f80964j;
        switch (i13) {
            case 0:
                h22.d it = (h22.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                xk2.v vVar = uv0.n.f123180a;
                Intrinsics.checkNotNullParameter(it, "<this>");
                ArrayList arrayList = new ArrayList();
                uv0.m mVar = new uv0.m(arrayList, Unit.f80348a, 1);
                List list = it.f66582b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof wo0) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(g0.q(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((wo0) it2.next()).f43310a);
                }
                Iterator it3 = arrayList3.iterator();
                int i14 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    List o14 = ((uo0) next).o();
                    if (o14 != null) {
                        Iterator it4 = o14.iterator();
                        while (it4.hasNext()) {
                            ((ro0) it4.next()).a(mVar);
                        }
                    }
                    i14 = i15;
                }
                Intrinsics.checkNotNullParameter(it, "<this>");
                ArrayList arrayList4 = new ArrayList();
                uv0.m mVar2 = new uv0.m(arrayList4, Unit.f80348a, 0);
                List list2 = it.f66582b;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof wo0) {
                        arrayList5.add(obj3);
                    }
                }
                ArrayList arrayList6 = new ArrayList(g0.q(arrayList5, 10));
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(((wo0) it5.next()).f43310a);
                }
                uo0 uo0Var = (uo0) CollectionsKt.U(0, arrayList6);
                if (uo0Var != null && (o13 = uo0Var.o()) != null) {
                    Iterator it6 = o13.iterator();
                    while (it6.hasNext()) {
                        ((ro0) it6.next()).a(mVar2);
                    }
                }
                iVar.getClass();
                ArrayList H0 = CollectionsKt.H0(arrayList4);
                Iterator it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    mp0 mp0Var = (mp0) it7.next();
                    if (!arrayList.isEmpty()) {
                        Iterator it8 = arrayList.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                break;
                            }
                            if (Intrinsics.d(((mp0) it8.next()).l(), mp0Var.l())) {
                                H0.remove(mp0Var);
                            }
                        }
                    }
                }
                ArrayList l03 = CollectionsKt.l0(arrayList, H0);
                HashSet hashSet = new HashSet();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj4 : l03) {
                    if (hashSet.add(((mp0) obj4).l())) {
                        arrayList7.add(obj4);
                    }
                }
                return arrayList7;
            case 1:
                mp0 block = (mp0) obj;
                Intrinsics.checkNotNullParameter(block, "block");
                i2 i2Var = iVar.f80970c;
                String l13 = block.l();
                Intrinsics.checkNotNullExpressionValue(l13, "getPinId(...)");
                return new u0(new j1(new j1(i2Var.P(l13).C(h0.f76488a), new bv0.k(17, new r0(17, iVar, block)), 0).O().u(), new androidx.appcompat.widget.q(new d0(1, h.f80965j), 2), 0), ck2.i.f27921a, 0);
            case 2:
                return b((st) obj);
            case 3:
                return e((x) obj);
            case 4:
                return b((st) obj);
            default:
                return e((x) obj);
        }
    }
}
