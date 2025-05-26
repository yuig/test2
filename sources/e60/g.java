package e60;

import com.pinterest.api.model.f30;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;
import wt1.c0;
import wt1.o;
import wt1.p;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57500i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f57501j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i13) {
        super(1);
        this.f57500i = i13;
        this.f57501j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        int i13 = this.f57500i;
        boolean z13 = false;
        i iVar = this.f57501j;
        switch (i13) {
            case 0:
                Pair pair = (Pair) obj;
                Object obj2 = pair.f80346a;
                Intrinsics.checkNotNullExpressionValue(obj2, "<get-first>(...)");
                c0 c0Var = (c0) obj2;
                Object obj3 = pair.f80347b;
                Intrinsics.checkNotNullExpressionValue(obj3, "<get-second>(...)");
                f30 f30Var = (f30) obj3;
                if (c0Var instanceof p) {
                    tl1.i iVar2 = c0Var.f131096b;
                    o oVar = iVar2 instanceof o ? (o) iVar2 : null;
                    list = oVar != null ? oVar.f131124b : null;
                    if (list != null) {
                        if (iVar.f120492d.isEmpty() && (!list.isEmpty())) {
                            z13 = true;
                        }
                        iVar.f120492d.add(f30Var);
                        Set set = iVar.f120492d;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof f30) {
                                arrayList.add(obj4);
                            }
                        }
                        set.addAll(arrayList);
                        if (z13) {
                            List b13 = e0.b(f30Var);
                            t42.b bVar = iVar.f57517s;
                            bVar.a0(CollectionsKt.l0(bVar.d(), b13));
                            d0 pinalytics = iVar.getPinalytics();
                            f1 f1Var = f1.AUTO_REFINE_BOARD_VIEW_BEGIN;
                            HashMap hashMap = new HashMap();
                            String str = iVar.f57510l;
                            if (str != null) {
                                hashMap.put("navigation_source", str);
                            }
                            Unit unit = Unit.f80348a;
                            d0.B(pinalytics, f1Var, null, null, hashMap, 22);
                        }
                    }
                    j jVar = (j) iVar.getViewIfBound();
                    if (jVar != null) {
                        ((d) jVar).o9(!iVar.f120492d.isEmpty());
                    }
                }
                break;
            default:
                c0 c0Var2 = (c0) obj;
                if (c0Var2 instanceof p) {
                    tl1.i iVar3 = c0Var2.f131096b;
                    o oVar2 = iVar3 instanceof o ? (o) iVar3 : null;
                    list = oVar2 != null ? oVar2.f131124b : null;
                    if (list != null) {
                        if (iVar.f120492d.isEmpty() && (!list.isEmpty())) {
                            z13 = true;
                        }
                        Set set2 = iVar.f120492d;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : list) {
                            if (obj5 instanceof f30) {
                                arrayList2.add(obj5);
                            }
                        }
                        set2.addAll(arrayList2);
                        if (z13) {
                            d0 pinalytics2 = iVar.getPinalytics();
                            f1 f1Var2 = f1.AUTO_REFINE_BOARD_VIEW_BEGIN;
                            HashMap hashMap2 = new HashMap();
                            String str2 = iVar.f57510l;
                            if (str2 != null) {
                                hashMap2.put("navigation_source", str2);
                            }
                            Unit unit2 = Unit.f80348a;
                            d0.B(pinalytics2, f1Var2, null, null, hashMap2, 22);
                        }
                    }
                    j jVar2 = (j) iVar.getViewIfBound();
                    if (jVar2 != null) {
                        ((d) jVar2).o9(!iVar.f120492d.isEmpty());
                    }
                }
                break;
        }
        return Unit.f80348a;
    }
}
