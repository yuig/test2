package we1;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129603i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t2 f129604j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x02.i2 f129605k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(t2 t2Var, x02.i2 i2Var, int i13) {
        super(0);
        this.f129603i = i13;
        this.f129604j = t2Var;
        this.f129605k = i2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i13 = this.f129603i;
        t2 t2Var = this.f129604j;
        switch (i13) {
            case 0:
                oj0.h hVar = t2Var.f129617e;
                String D3 = t2Var.D3();
                uk1.d dVar = hVar.f95387a;
                oj0.a aVar = (oj0.a) t2Var.f129626n.getValue();
                ue1.a0 a0Var = (ue1.a0) CollectionsKt.firstOrNull(t2Var.d());
                h32.g0 g0Var = ((a0Var instanceof ue1.w) && ((ue1.w) a0Var).f122071j) ? h32.g0.BOARD_SHOP_MODULE : h32.g0.SHOP_TOOL_STL_MODULE;
                h32.u0 u0Var = h32.u0.ONE_TAP_SAVE_BUTTON;
                HashMap hashMap = new HashMap();
                hashMap.put("board_id", t2Var.D3());
                ue1.a0 a0Var2 = (ue1.a0) CollectionsKt.firstOrNull(t2Var.d());
                String str2 = "";
                if ((a0Var2 instanceof ue1.w) && (str = ((ue1.w) a0Var2).f122068g) != null) {
                    str2 = str;
                }
                hashMap.put("board_session_id", str2);
                Unit unit = Unit.f80348a;
                return new oj0.f(D3, null, dVar, hVar.f95388b, this.f129605k, hVar.f95389c, t2Var.f129615c, hVar.f95390d, new oj0.b(g0Var, u0Var, hashMap), aVar, null, null, t2Var.f129620h, 7168);
            default:
                oj0.h hVar2 = t2Var.f129617e;
                uk1.d dVar2 = hVar2.f95387a;
                oj0.a aVar2 = (oj0.a) t2Var.f129626n.getValue();
                oj0.b bVar = oj0.b.f95357d;
                h32.g0 componentType = h32.g0.PRODUCT_CATEGORY_BASED_PRODUCTS_STORY;
                h32.u0 elementType = bVar.f95359b;
                Intrinsics.checkNotNullParameter(componentType, "componentType");
                Intrinsics.checkNotNullParameter(elementType, "elementType");
                HashMap auxData = bVar.f95360c;
                Intrinsics.checkNotNullParameter(auxData, "auxData");
                oj0.b bVar2 = new oj0.b(componentType, elementType, auxData);
                auxData.put("is_saved_to_wishlist", "true");
                return new oj0.g(dVar2, hVar2.f95388b, this.f129605k, hVar2.f95389c, t2Var.f129615c, hVar2.f95390d, bVar2, aVar2, hVar2.f95391e, hVar2.f95392f, t2Var.f129620h);
        }
    }
}
