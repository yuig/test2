package mv0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import u50.k0;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88391i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f88392j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, int i13) {
        super(1);
        this.f88391i = i13;
        this.f88392j = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f1 f1Var;
        int i13 = this.f88391i;
        r rVar = this.f88392j;
        switch (i13) {
            case 0:
                zd1.g model = (zd1.g) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                lv0.g gVar = rVar.f88402n1;
                if (gVar != null) {
                    Intrinsics.checkNotNullParameter(model, "model");
                    gVar.f85020v = true;
                    model.f141719j = true ^ model.f141719j;
                    HashSet hashSet = gVar.f85018t;
                    String str = model.f141716g;
                    if (hashSet.contains(str)) {
                        hashSet.remove(str);
                        f1Var = f1.UNSELECT;
                    } else {
                        hashSet.add(str);
                        f1Var = f1.SELECT;
                    }
                    f1 f1Var2 = f1Var;
                    nm.u uVar = new nm.u();
                    uVar.u("domain", str);
                    d0 pinalytics = gVar.getPinalytics();
                    g0 g0Var = g0.SHOPPING_BRAND_FILTER;
                    u0 u0Var = u0.SHOPPING_BRAND_FILTER_OPTION;
                    HashMap hashMap = new HashMap();
                    hashMap.put("commerce_data", uVar.toString());
                    pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var2, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    LinkedHashMap linkedHashMap = gVar.f85017s;
                    linkedHashMap.put("domains", CollectionsKt.Z(hashSet, null, null, null, 0, null, null, 63));
                    List list = zd1.o.f141736j;
                    kv0.n nVar = gVar.f85022x;
                    nVar.h0(list, linkedHashMap);
                    nVar.Z();
                    nVar.i2();
                }
                break;
            default:
                cn1.d0 bind = (cn1.d0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                int i14 = i42.c.search_view_story_product_hint;
                bind.getClass();
                bind.f28172b = new k0(i14);
                String str2 = rVar.f88403o1;
                if (str2 != null) {
                    bind.a(str2);
                }
                break;
        }
        return Unit.f80348a;
    }
}
