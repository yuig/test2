package zx1;

import ay1.b0;
import ay1.c0;
import ay1.f0;
import ay1.g0;
import ay1.h0;
import ay1.i0;
import ay1.j0;
import ay1.k0;
import com.pinterest.feature.home.view.InitialLoadSwipeRefreshLayout;
import com.pinterest.partnerAnalytics.components.feedback.InfoAboutDataView;
import com.pinterest.partnerAnalytics.components.toplinemetrics.ToplineMetricsCard;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.PinMetadataCard;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.PinVideoMetricsEmptyCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f143031r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f143032s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, bl2.c cVar) {
        super(2, cVar);
        this.f143032s = kVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c cVar2 = new c(this.f143032s, cVar);
        cVar2.f143031r = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ay1.g) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ay1.g gVar = (ay1.g) this.f143031r;
        int i13 = k.f143044x0;
        k kVar = this.f143032s;
        kVar.getClass();
        ay1.c cVar = gVar.f20667a;
        if (cVar instanceof ay1.a) {
            cy1.d pinStats = ((ay1.a) cVar).f20657a;
            Intrinsics.checkNotNullParameter(pinStats, "pinStats");
            PinMetadataCard pinMetadataCard = kVar.f126833e0;
            if (pinMetadataCard == null) {
                Intrinsics.r("pinMetadata");
                throw null;
            }
            pinMetadataCard.j(pinStats);
            String string = kVar.getString(((Boolean) kVar.f126831c0.getValue()).booleanValue() ? com.pinterest.partnerAnalytics.g.detail_screen_chart_data : com.pinterest.partnerAnalytics.g.overview_screen_chart_data_basic_info);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            InfoAboutDataView infoAboutDataView = kVar.f126840l0;
            if (infoAboutDataView == null) {
                Intrinsics.r("aboutChartData");
                throw null;
            }
            infoAboutDataView.i(string);
            InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout = kVar.f126832d0;
            if (initialLoadSwipeRefreshLayout == null) {
                Intrinsics.r("swipeRefresh");
                throw null;
            }
            initialLoadSwipeRefreshLayout.n(false);
        }
        c0 c0Var = gVar.f20668b;
        if (c0Var instanceof b0) {
            PinMetadataCard pinMetadataCard2 = kVar.f126833e0;
            if (pinMetadataCard2 == null) {
                Intrinsics.r("pinMetadata");
                throw null;
            }
            pinMetadataCard2.i(((b0) c0Var).f20660a);
        }
        ay1.f fVar = gVar.f20669c;
        if (fVar instanceof ay1.e) {
            ToplineMetricsCard toplineMetricsCard = kVar.f126834f0;
            if (toplineMetricsCard == null) {
                Intrinsics.r("pinMetrics");
                throw null;
            }
            toplineMetricsCard.a(((ay1.e) fVar).f20663a);
        }
        k0 k0Var = gVar.f20670d;
        int i14 = 8;
        if (k0Var instanceof i0) {
            kVar.Y7().setVisibility(0);
            kVar.Z7().setVisibility(8);
            kVar.Y7().a(((i0) k0Var).f20675a);
        } else if (Intrinsics.d(k0Var, h0.f20673a)) {
            kVar.Y7().setVisibility(8);
            kVar.Z7().setVisibility(8);
        } else if (k0Var instanceof j0) {
            kVar.Y7().setVisibility(8);
            PinVideoMetricsEmptyCard Z7 = kVar.Z7();
            yv1.i callback = new yv1.i(kVar, i14);
            Intrinsics.checkNotNullParameter(callback, "callback");
            Z7.f50222b = callback;
            kVar.Z7().a(((j0) k0Var).f20677a);
            kVar.Z7().setVisibility(0);
        }
        g0 g0Var = gVar.f20671e;
        if (g0Var instanceof f0) {
            kVar.W7().setVisibility(0);
            f0 f0Var = (f0) g0Var;
            kVar.W7().f50228e = f0Var.f20665a;
            kVar.W7().b(f0Var.f20666b);
        } else {
            kVar.W7().setVisibility(8);
        }
        return Unit.f80348a;
    }
}
