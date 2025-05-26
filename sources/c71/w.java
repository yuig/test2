package c71;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26831i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f26832j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(z zVar, int i13) {
        super(1);
        this.f26831i = i13;
        this.f26832j = zVar;
    }

    public final void b(f30 pin) {
        sr srVar;
        String j13;
        String str;
        int i13 = this.f26831i;
        z zVar = this.f26832j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(pin, "pin");
                Map A4 = pin.A4();
                if (A4 != null && (srVar = (sr) A4.get("200x")) != null && (j13 = srVar.j()) != null && (str = zVar.Q.S) != null) {
                    ((h61.k) zVar.getView()).R5(j13, str);
                    break;
                }
                break;
            default:
                k61.h z33 = zVar.z3();
                String uid = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                z33.X(uid);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f26831i;
        z zVar = this.f26832j;
        switch (i13) {
            case 0:
                b((f30) obj);
                return Unit.f80348a;
            case 1:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List d2 = zVar.z3().d();
                ArrayList arrayList = new ArrayList(g0.q(d2, 10));
                Iterator it2 = d2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((dl1.s) it2.next()).getUid());
                }
                ArrayList H0 = CollectionsKt.H0(arrayList);
                gb2.f fVar = gb2.f.f64747a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = H0.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (Intrinsics.d((String) next, ((gb2.l) d7.b.j0(it)).a())) {
                        arrayList2.add(next);
                    }
                }
                if (arrayList2.size() != 1) {
                    return new ArrayList();
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = H0.iterator();
                int i14 = 0;
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    String str = (String) next2;
                    int i16 = -1;
                    int i17 = 0;
                    for (Object obj2 : it) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            f0.p();
                            throw null;
                        }
                        gb2.l lVar = (gb2.l) obj2;
                        if (Intrinsics.d(lVar.a(), str)) {
                            arrayList3.add(new Pair(Integer.valueOf(i14), lVar));
                            i16 = i17;
                        }
                        i17 = i18;
                    }
                    if (i16 > 0) {
                        it.remove(i16);
                    }
                    it.isEmpty();
                    i14 = i15;
                }
                return arrayList3;
            case 2:
                List<Pair> list = (List) obj;
                Intrinsics.f(list);
                for (Pair pair : list) {
                    Object obj3 = pair.f80346a;
                    gb2.k update = (gb2.k) pair.f80347b;
                    int intValue = ((Number) obj3).intValue();
                    k61.h z33 = zVar.z3();
                    dl1.s item = z33.getItem(intValue);
                    if (item != null) {
                        Intrinsics.checkNotNullParameter(update, "update");
                        z33.f78411d0.put(update.f64758a, update);
                        z33.u1(intValue, item);
                    }
                }
                return Unit.f80348a;
            case 3:
                b((f30) obj);
                return Unit.f80348a;
            default:
                wy0 wy0Var = (wy0) obj;
                Iterator it5 = zVar.z3().d().iterator();
                int i19 = 0;
                while (true) {
                    if (!it5.hasNext()) {
                        i19 = -1;
                    } else if (!Intrinsics.d(((dl1.s) it5.next()).getUid(), wy0Var.getUid())) {
                        i19++;
                    }
                }
                if (i19 >= 0) {
                    k61.h z34 = zVar.z3();
                    Intrinsics.f(wy0Var);
                    z34.u1(i19, wy0Var);
                }
                List d13 = zVar.z3().d();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : d13) {
                    if (obj4 instanceof vh) {
                        arrayList4.add(obj4);
                    }
                }
                Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    vh vhVar = (vh) it6.next();
                    if (vhVar.S() || vhVar.T() || vhVar.U()) {
                        List list2 = vhVar.f42865w;
                        Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
                        Iterator it7 = list2.iterator();
                        int i23 = 0;
                        while (true) {
                            if (!it7.hasNext()) {
                                i23 = -1;
                            } else if (!Intrinsics.d(((dl1.s) it7.next()).getUid(), wy0Var.getUid())) {
                                i23++;
                            }
                        }
                        if (i23 >= 0) {
                            vhVar.f42865w.set(i23, wy0Var);
                        }
                    }
                }
                return Unit.f80348a;
        }
    }
}
