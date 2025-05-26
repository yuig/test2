package n90;

import com.pinterest.api.model.ih;
import com.pinterest.api.model.pi;
import com.pinterest.api.model.xk;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.o;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements kl2.m {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90003i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f90004j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f90005k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f90006l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xk2.g f90007m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, Object obj3, xk2.g gVar, int i13) {
        super(4);
        this.f90003i = i13;
        this.f90004j = obj;
        this.f90005k = obj2;
        this.f90006l = obj3;
        this.f90007m = gVar;
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13;
        gd1.d dVar;
        int i14 = this.f90003i;
        xk2.g gVar = this.f90007m;
        Object obj5 = this.f90006l;
        Object obj6 = this.f90005k;
        Object obj7 = this.f90004j;
        switch (i14) {
            case 0:
                q1.c cVar = (q1.c) obj;
                int intValue = ((Number) obj2).intValue();
                o oVar = (o) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i13 = (((i2.s) oVar).h(cVar) ? 4 : 2) | intValue2;
                } else {
                    i13 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i13 |= ((i2.s) oVar).f(intValue) ? 32 : 16;
                }
                if ((i13 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                a aVar = (a) ((List) obj7).get(intValue);
                i2.s sVar2 = (i2.s) oVar;
                sVar2.W(1472077505);
                l.a(aVar, intValue == 0 ? (b) obj6 : (b) obj5, null, (Function1) gVar, sVar2, 8, 4);
                sVar2.r(false);
            default:
                ih action = (ih) obj;
                String bubbleUid = (String) obj2;
                xk bubble = (xk) obj4;
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(bubbleUid, "bubbleUid");
                Intrinsics.checkNotNullParameter(bubble, "bubble");
                HashMap f13 = z0.f(new Pair("com.pinterest.EXTRA_SEARCH_ENTERED_QUERY", (String) obj3), new Pair("com.pinterest.EXTRA_SEARCH_ARTICLE", bubbleUid));
                f13.putAll(c0.d.Y((ze1.c) obj7, action, (pi) obj6, (oe1.a) obj5, null, null));
                ih ihVar = bubble.f43728t;
                if (ihVar != null && Intrinsics.d(ihVar.u(), Boolean.TRUE)) {
                    f13.put("com.pinterest.STRUCTURED_FEED_LANDING_PAGE_IMAGES", bubble.f43722n);
                }
                String e13 = action.e();
                if (e13 != null && (dVar = (gd1.d) ((Function0) gVar).invoke()) != null) {
                    dVar.O5(e13, f13);
                }
                break;
        }
        return Unit.f80348a;
    }
}
