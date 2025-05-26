package hx1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.partnerAnalytics.feature.audience.top.locations.TopLocationsView;
import h32.f1;
import h32.g0;
import h32.u0;
import jc0.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;

/* loaded from: classes4.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70527i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f70528j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ gx1.e f70529k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, gx1.e eVar, int i13) {
        super(0);
        this.f70527i = i13;
        this.f70528j = fVar;
        this.f70529k = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f70527i) {
            case 0:
                m152invoke();
                break;
            default:
                m152invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m152invoke() {
        int i13 = this.f70527i;
        gx1.e audienceViewData = this.f70529k;
        f fVar = this.f70528j;
        switch (i13) {
            case 0:
                j jVar = fVar.f70540t0;
                if (jVar != null) {
                    Intrinsics.checkNotNullParameter(audienceViewData, "audienceViewData");
                    jVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.SEE_MORE_BUTTON, (r18 & 4) != 0 ? null : g0.INSIGHTS_INTEREST_TABLE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    d0 pinalytics = jVar.getPinalytics();
                    gx1.f fVar2 = audienceViewData.f66287c;
                    jVar.f70549d.d(new v(new lx1.j(pinalytics, fVar2.f66298g, audienceViewData.f66291g, fVar2.f66300i, jVar.f70549d), false, 0L, 30));
                    return;
                }
                Intrinsics.r("listener");
                throw null;
            default:
                j jVar2 = fVar.f70540t0;
                if (jVar2 == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                TopLocationsView topLocationsView = fVar.f70538r0;
                if (topLocationsView != null) {
                    ox1.a topLocationSelected = topLocationsView.f50164i;
                    Intrinsics.checkNotNullParameter(topLocationSelected, "topLocationSelected");
                    Intrinsics.checkNotNullParameter(audienceViewData, "audienceViewData");
                    jVar2.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.SEE_MORE_BUTTON, (r18 & 4) != 0 ? null : g0.INSIGHTS_LOCATION_TABLE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    d0 pinalytics2 = jVar2.getPinalytics();
                    gx1.f fVar3 = audienceViewData.f66287c;
                    jVar2.f70549d.d(new v(new nx1.a(pinalytics2, fVar3.f66298g, topLocationSelected, audienceViewData.f66291g, fVar3.f66301j, jVar2.f70549d), false, 0L, 30));
                    return;
                }
                Intrinsics.r("topLocationsCard");
                throw null;
        }
    }
}
