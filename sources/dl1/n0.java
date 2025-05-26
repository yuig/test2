package dl1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jk2.j1;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55257i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f55258j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q0 f55259k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(l lVar, ArrayList arrayList, int i13) {
        super(1);
        this.f55257i = i13;
        this.f55259k = lVar;
        this.f55258j = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        s a13;
        int i13 = 0;
        int i14 = this.f55257i;
        int i15 = 1;
        List localModels = this.f55258j;
        q0 q0Var = this.f55259k;
        switch (i14) {
            case 0:
                s model = (s) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullExpressionValue(localModels, "$localModels");
                Iterator it = localModels.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.d(((s) obj2).getUid(), model.getUid())) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                s sVar = (s) obj2;
                return (sVar == null || (a13 = q0Var.f55273f.a(sVar, model)) == null) ? model : a13;
            case 1:
                List localModels2 = (List) obj;
                Intrinsics.checkNotNullParameter(localModels2, "localModels");
                return new j1(uj2.q.w(localModels), new b0(10, new n0(localModels2, q0Var, i13)), 0);
            case 2:
                Map paramsMap = (Map) obj;
                Intrinsics.checkNotNullParameter(paramsMap, "paramsMap");
                uj2.b0 i16 = q0Var.f55268a.i(CollectionsKt.F0(paramsMap.values()));
                b0 b0Var = new b0(7, g0.f55228o);
                i16.getClass();
                return new j1(new pn.c(1, new kk2.m(i16, b0Var, 2), new b0(8, new n0(localModels, q0Var, i15))), new b0(9, new u00.h(1, paramsMap)), 0);
            default:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                List list = (List) pair.f80346a;
                List list2 = (List) pair.f80347b;
                boolean a14 = q0Var.f55268a.a();
                p pVar = q0Var.f55268a;
                if (a14) {
                    HashSet hashSet = new HashSet();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        hashSet.add(((s) it2.next()).getUid());
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : localModels) {
                        if (hashSet.contains(((s) obj3).getUid())) {
                            arrayList.add(obj3);
                        }
                    }
                    if (true ^ arrayList.isEmpty()) {
                        pVar.f(list, arrayList);
                    }
                }
                return Boolean.valueOf(pVar.f(list, list2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(List list, q0 q0Var, int i13) {
        super(1);
        this.f55257i = i13;
        this.f55258j = list;
        this.f55259k = q0Var;
    }
}
