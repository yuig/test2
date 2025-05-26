package hx1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70524i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f70525j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i13) {
        super(1);
        this.f70524i = i13;
        this.f70525j = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f70524i;
        Object obj2 = this.f70525j;
        switch (i13) {
            case 0:
                ox1.a locationType = (ox1.a) obj;
                Intrinsics.checkNotNullParameter(locationType, "locationType");
                j jVar = ((f) obj2).f70540t0;
                if (jVar == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(locationType, "locationType");
                jVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : locationType == ox1.a.METROS ? u0.ANALYTICS_AUDIENCE_LOCATION_METROS_TAB : u0.ANALYTICS_AUDIENCE_LOCATION_COUNTRIES_TAB, (r18 & 4) != 0 ? null : g0.ANALYTICS_AUDIENCE_LOCATION_TABS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                return Unit.f80348a;
            default:
                ((f) ((a) ((j) obj2).getView())).b8(gx1.g.f66302f);
                return Unit.f80348a;
        }
    }
}
