package tc0;

import c2.j1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uc0.a1;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements kl2.m {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117278i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f117279j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f117280k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13, List list, Function1 function1) {
        super(4);
        this.f117278i = i13;
        this.f117279j = list;
        this.f117280k = function1;
    }

    public final void b(r1.q items, int i13, i2.o oVar, int i14) {
        int i15;
        int i16;
        int i17;
        int i18 = this.f117278i;
        int i19 = 0;
        Function1 function1 = this.f117280k;
        List list = this.f117279j;
        switch (i18) {
            case 1:
                if ((i14 & 6) == 0) {
                    i15 = i14 | (((i2.s) oVar).h(items) ? 4 : 2);
                } else {
                    i15 = i14;
                }
                if ((i14 & 48) == 0) {
                    i15 |= ((i2.s) oVar).f(i13) ? 32 : 16;
                }
                if ((i15 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                a1 a1Var = (a1) list.get(i13);
                i2.s sVar2 = (i2.s) oVar;
                sVar2.W(626525380);
                kh2.n.l(a1Var, function1, sVar2, 0);
                sVar2.r(false);
                break;
            case 2:
                if ((i14 & 6) == 0) {
                    i16 = i14 | (((i2.s) oVar).h(items) ? 4 : 2);
                } else {
                    i16 = i14;
                }
                if ((i14 & 48) == 0) {
                    i16 |= ((i2.s) oVar).f(i13) ? 32 : 16;
                }
                if ((i16 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                yy0.f0 f0Var = (yy0.f0) list.get(i13);
                i2.s sVar4 = (i2.s) oVar;
                sVar4.W(-187695508);
                dn.c.j(f0Var, com.pinterest.framework.ui.a.a(new yy0.y(function1, f0Var, i19)), this.f117280k, sVar4, 8, 0);
                sVar4.r(false);
                break;
            default:
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i14 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
                    i17 = i14 | (((i2.s) oVar).f(i13) ? 32 : 16);
                } else {
                    i17 = i14;
                }
                if ((i17 & 721) == 144) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        break;
                    }
                }
                oe.f.g((Pair) list.get(i13), null, new mu0.i(function1, list, i13, 3), oVar, 0, 2);
                break;
        }
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13;
        switch (this.f117278i) {
            case 0:
                q1.c cVar = (q1.c) obj;
                int intValue = ((Number) obj2).intValue();
                i2.o oVar = (i2.o) obj3;
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
                uc0.x xVar = (uc0.x) this.f117279j.get(intValue);
                i2.s sVar2 = (i2.s) oVar;
                sVar2.W(1425423124);
                kh2.d.e(xVar, this.f117280k, sVar2, 0);
                j1.c(null, 0L, 0.0f, 0.0f, sVar2, 0, 15);
                sVar2.r(false);
            case 1:
                b((r1.q) obj, ((Number) obj2).intValue(), (i2.o) obj3, ((Number) obj4).intValue());
                break;
            case 2:
                b((r1.q) obj, ((Number) obj2).intValue(), (i2.o) obj3, ((Number) obj4).intValue());
                break;
            default:
                b((r1.q) obj, ((Number) obj2).intValue(), (i2.o) obj3, ((Number) obj4).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
