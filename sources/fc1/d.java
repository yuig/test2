package fc1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import dc1.g;
import ec1.j;
import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mf0.l;
import va1.f1;
import va1.q;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61736i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f61737j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(1);
        this.f61736i = i13;
        this.f61737j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f61736i;
        e eVar = this.f61737j;
        switch (i13) {
            case 0:
                q item = (q) obj;
                Intrinsics.checkNotNullParameter(item, "item");
                j jVar = eVar.K0;
                if (jVar != null) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    if (item instanceof g) {
                        jVar.f58423a.d(new of0.a(new l()));
                        new ec1.d(jVar).b();
                    }
                }
                break;
            case 1:
                f1 item2 = (f1) obj;
                Intrinsics.checkNotNullParameter(item2, "item");
                j jVar2 = eVar.K0;
                if (jVar2 != null) {
                    Intrinsics.checkNotNullParameter(item2, "item");
                    jVar2.f58423a.d(Navigation.L(item2.j(), "", item2.c()));
                }
                break;
            default:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                eVar.s7().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : u0.EXTERNAL_LINK, (r18 & 4) != 0 ? null : g0.REQUEST_DATA_UI, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                break;
        }
        return Unit.f80348a;
    }
}
