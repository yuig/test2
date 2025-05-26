package wm1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130277i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f130278j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(n nVar, int i13) {
        super(1);
        this.f130277i = i13;
        this.f130278j = nVar;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f130277i;
        n nVar = this.f130278j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                e eVar = (e) nVar;
                u50.i0 i0Var = eVar.f130279c;
                yl1.c cVar = yl1.c.SMALL;
                yl1.e eVar2 = yl1.e.INLINE;
                return yl1.b.f(it, i0Var, eVar.f130280d, null, null, eVar.f130282f, cVar, null, null, ho1.b.list_action_button, eVar2, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                u50.i0 i0Var2 = ((f) nVar).f130286d;
                yl1.c cVar2 = yl1.c.SMALL;
                return yl1.b.f(it, i0Var2, false, null, null, yl1.i.c(), cVar2, null, null, ho1.b.list_action_button_toggle, yl1.e.INLINE, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        bm1.l bVar;
        int i13 = this.f130277i;
        n nVar = this.f130278j;
        switch (i13) {
            case 0:
                return b((yl1.b) obj);
            case 1:
                bm1.m it = (bm1.m) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                f fVar = (f) nVar;
                int i14 = e0.f130284a[fVar.f130285c.ordinal()];
                if (i14 == 1) {
                    bVar = new bm1.b(fVar.f130286d);
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new bm1.j();
                }
                bm1.l lVar = bVar;
                return bm1.m.e(it, bm1.o.SMALL, fVar.f130287e, lVar, fVar.f130288f, null, ho1.b.list_action_button_toggle, null, 80);
            case 2:
                em1.d it2 = (em1.d) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                g gVar = (g) nVar;
                return em1.d.e(it2, gVar.f130294c, gVar.f130295d, gVar.f130296e, null, null, null, 0, null, false, ho1.b.list_action_checkbox, 504);
            case 3:
                return b((yl1.b) obj);
            default:
                on1.b it3 = (on1.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                k kVar = (k) nVar;
                boolean z13 = kVar.f130307c;
                int i15 = ho1.b.list_action_switch;
                return on1.b.e(it3, z13, kVar.f130308d, kVar.f130309e, i15, null, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER);
        }
    }
}
