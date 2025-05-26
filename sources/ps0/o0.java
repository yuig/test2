package ps0;

import androidx.recyclerview.widget.b2;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import dl1.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101288i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0 f101289j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(r0 r0Var, int i13) {
        super(1);
        this.f101288i = i13;
        this.f101289j = r0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object adapter;
        int i13 = this.f101288i;
        int i14 = 0;
        r0 r0Var = this.f101289j;
        switch (i13) {
            case 0:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List d2 = r0Var.d();
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(d2, 10));
                Iterator it2 = d2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((dl1.s) it2.next()).getId());
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
                int i15 = 0;
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    String str = (String) next2;
                    int i17 = -1;
                    int i18 = 0;
                    for (Object obj2 : it) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kotlin.collections.f0.p();
                            throw null;
                        }
                        gb2.l lVar = (gb2.l) obj2;
                        if (Intrinsics.d(lVar.a(), str)) {
                            arrayList3.add(new Pair(Integer.valueOf(i15), lVar));
                            i17 = i18;
                        }
                        i18 = i19;
                    }
                    if (i17 > 0) {
                        it.remove(i17);
                    }
                    it.isEmpty();
                    i15 = i16;
                }
                return arrayList3;
            case 1:
                List<Pair> list = (List) obj;
                Intrinsics.f(list);
                for (Pair pair : list) {
                    Object obj3 = pair.f80346a;
                    gb2.k kVar = (gb2.k) pair.f80347b;
                    int intValue = ((Number) obj3).intValue();
                    if (((gb2.k) dn.c.h0(r0Var.N, kVar.f64758a, kVar)) != null && (adapter = r0Var.getAdapter()) != null) {
                        ((b2) adapter).i(intValue);
                    }
                }
                return Unit.f80348a;
            case 2:
                v0 v0Var = (v0) obj;
                Intrinsics.f(v0Var);
                r0Var.getClass();
                f30 f30Var = (f30) v0Var.f55289a;
                int e03 = f30Var != null ? b40.e0(f30Var) : 0;
                dl1.s sVar = v0Var.f55290b;
                int e04 = b40.e0((f30) sVar);
                if (e03 != e04 && (((e03 <= 0 && e04 > 0) || (e03 > 0 && e04 <= 0)) && !b40.X0((f30) sVar))) {
                    String id3 = sVar.getId();
                    if (!pk.a0.x0(id3)) {
                        ArrayList arrayList4 = r0Var.f109906r;
                        int size = arrayList4.size();
                        while (true) {
                            if (i14 < size) {
                                dl1.s sVar2 = (dl1.s) arrayList4.get(i14);
                                if (sVar2 == null || !id3.equals(sVar2.getId())) {
                                    i14++;
                                } else {
                                    r0Var.U3(i14, sVar);
                                }
                            }
                        }
                    }
                }
                return Unit.f80348a;
            default:
                r0Var.isBound();
                return Unit.f80348a;
        }
    }
}
