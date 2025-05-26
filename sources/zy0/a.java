package zy0;

import ao2.j0;
import com.pinterest.api.model.qz;
import dl2.j;
import do2.t2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.collections.s0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yy0.p;
import yy0.q;
import yy0.r;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f143126r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f143127s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f143128t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f143129u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j0 f143130v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r rVar, d dVar, u50.r rVar2, j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f143127s = rVar;
        this.f143128t = dVar;
        this.f143129u = rVar2;
        this.f143130v = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f143127s, this.f143128t, this.f143129u, this.f143130v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        t2 t2Var;
        Object value;
        qy0.a aVar;
        ArrayList h03;
        ArrayList arrayList;
        Pair pair;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f143126r;
        if (i13 == 0) {
            ue.c.H(obj);
            r rVar = this.f143127s;
            boolean z13 = rVar instanceof p;
            d dVar = this.f143128t;
            if (z13) {
                int i14 = ((p) rVar).f140469a;
                this.f143126r = 1;
                if (d.j(dVar, i14, this.f143129u, this) == aVar2) {
                    return aVar2;
                }
            } else if (rVar instanceof q) {
                q qVar = (q) rVar;
                String id3 = qVar.f140470a;
                boolean z14 = qVar.f140471b;
                qy0.b bVar = dVar.f143142d;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(id3, "id");
                Set set = s0.f80394a;
                do {
                    t2Var = bVar.f105350b;
                    value = t2Var.getValue();
                    aVar = (qy0.a) value;
                    boolean contains = aVar.f105340b.contains(id3);
                    List list = aVar.f105340b;
                    h03 = contains ? CollectionsKt.h0(list, id3) : CollectionsKt.m0(id3, list);
                    Map map = aVar.f105339a;
                    arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        qz qzVar = (qz) entry.getKey();
                        List list2 = (List) entry.getValue();
                        if (contains && Intrinsics.d(qzVar.getF39332b(), id3)) {
                            List list3 = list2;
                            ArrayList arrayList2 = new ArrayList(g0.q(list3, 10));
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((qy0.d) it.next()).f105352a.getF39332b());
                            }
                            set = CollectionsKt.J0(arrayList2);
                            pair = new Pair(qzVar, q0.f80391a);
                        } else {
                            pair = new Pair(qzVar, list2);
                        }
                        arrayList.add(pair);
                    }
                } while (!t2Var.h(value, qy0.a.a(aVar, z0.m(arrayList), h03, null, 0, 12)));
                Set set2 = set;
                if (z14) {
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        dVar.f143143e.e(this.f143130v, new py0.a((String) it2.next()), c.f143138a);
                    }
                }
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
