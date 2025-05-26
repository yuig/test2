package ii1;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.u0;
import h32.z1;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m60.w;
import nx.d0;
import nx.d1;
import pb0.g;
import so.fa;
import yk1.n;
import yk1.v;

/* loaded from: classes5.dex */
public final class b extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final v f72303a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f72304b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f72305c;

    /* renamed from: d, reason: collision with root package name */
    public final zs1.a f72306d;

    /* renamed from: e, reason: collision with root package name */
    public final w f72307e;

    /* renamed from: f, reason: collision with root package name */
    public final fa f72308f;

    /* renamed from: g, reason: collision with root package name */
    public final a11.d f72309g;

    /* renamed from: h, reason: collision with root package name */
    public final d1 f72310h;

    /* renamed from: i, reason: collision with root package name */
    public final gz1.b f72311i;

    /* renamed from: j, reason: collision with root package name */
    public final ur.a f72312j;

    /* renamed from: k, reason: collision with root package name */
    public final g f72313k;

    /* renamed from: l, reason: collision with root package name */
    public f30 f72314l;

    /* renamed from: m, reason: collision with root package name */
    public z1 f72315m;

    /* renamed from: n, reason: collision with root package name */
    public int f72316n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v viewResources, uk1.d presenterPinalytics, HashMap auxData, f0 impressionDebugUtils, w eventManager, fa adEventHandlerFactory, a11.d clickthroughHelperFactory, d1 trackingParamAttacher, gz1.b googlePlayServices, ur.a adsCoreDependencies) {
        super(0);
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(impressionDebugUtils, "impressionDebugUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(adEventHandlerFactory, "adEventHandlerFactory");
        Intrinsics.checkNotNullParameter(clickthroughHelperFactory, "clickthroughHelperFactory");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(googlePlayServices, "googlePlayServices");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        this.f72303a = viewResources;
        this.f72304b = presenterPinalytics;
        this.f72305c = auxData;
        this.f72306d = impressionDebugUtils;
        this.f72307e = eventManager;
        this.f72308f = adEventHandlerFactory;
        this.f72309g = clickthroughHelperFactory;
        this.f72310h = trackingParamAttacher;
        this.f72311i = googlePlayServices;
        this.f72312j = adsCoreDependencies;
        this.f72313k = g.f99432a;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        hi1.b view = (hi1.b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        q3();
    }

    public final void p3(f1 f1Var) {
        f30 f30Var = this.f72314l;
        if (f30Var != null) {
            d0 d0Var = this.f72304b.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0.DIGEST_PIN, (r18 & 4) != 0 ? null : g0.FLOWED_PIN, (r18 & 8) != 0 ? null : f30Var.getUid(), (r18 & 32) != 0 ? null : this.f72305c, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q3() {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ii1.b.q3():void");
    }
}
