package i11;

import com.pinterest.feature.pin.RepinAnimationData;
import h32.d4;
import i01.p0;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import lh0.a3;
import lh0.z2;
import m60.w;
import nx.b0;
import nx.d1;
import x02.i2;
import x02.x0;
import x02.y;
import yk1.v;

/* loaded from: classes5.dex */
public final class q extends m {

    /* renamed from: l0, reason: collision with root package name */
    public final String f71034l0;

    /* renamed from: m0, reason: collision with root package name */
    public final boolean f71035m0;

    /* renamed from: n0, reason: collision with root package name */
    public final Date f71036n0;

    /* renamed from: o0, reason: collision with root package name */
    public final boolean f71037o0;

    /* renamed from: p0, reason: collision with root package name */
    public final k11.h f71038p0;

    /* renamed from: q0, reason: collision with root package name */
    public final k11.m f71039q0;

    /* renamed from: r0, reason: collision with root package name */
    public final n22.a f71040r0;

    /* renamed from: s0, reason: collision with root package name */
    public final b0 f71041s0;

    /* renamed from: t0, reason: collision with root package name */
    public final g70.h f71042t0;

    /* renamed from: u0, reason: collision with root package name */
    public final k11.f f71043u0;

    /* renamed from: v0, reason: collision with root package name */
    public final qj0.b f71044v0;

    /* renamed from: w0, reason: collision with root package name */
    public final o f71045w0;

    /* renamed from: x0, reason: collision with root package name */
    public p0 f71046x0;

    /* renamed from: y0, reason: collision with root package name */
    public k11.d f71047y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, String str2, String str3, boolean z13, d4 d4Var, d4 viewType, Boolean bool, String str4, boolean z14, boolean z15, boolean z16, String str5, String str6, boolean z17, Date date, boolean z18, String str7, String str8, String str9, boolean z19, RepinAnimationData repinAnimationData, k11.k kVar, boolean z23, String str10, String str11, Boolean bool2, boolean z24, gp1.k repinSource, b60.b activeUserManager, uk1.d pinalytics, y feedRepository, i2 pinRepository, x0 boardRepository, uj2.q networkStateStream, w eventManager, v viewResources, z2 repinExperiments, a3 repinLibraryExperiments, i92.k toastUtils, f21.e repinToProfileHelper, com.pinterest.feature.pin.r repinAnimationUtil, rg0.s experiences, zf0.f educationHelper, qj0.b boardMoreIdeasToastUpsellManager, d1 trackingParamAttacher, k11.h repinFollowUpsellManager, k11.m repinShareUpsellManager, n22.a scheduledPinService, b0 pinAuxHelper, es.a adFormats, g70.h boardNavigator) {
        super(feedRepository, pinRepository, boardRepository, activeUserManager, pinalytics, networkStateStream, eventManager, viewResources, repinExperiments, toastUtils, experiences, educationHelper, repinToProfileHelper, repinAnimationUtil, str2, str3, true, z13, viewType, bool, str4, z14, z15, z16, str5, str6, str7, str8, str9, z19, repinAnimationData, kVar, z23, str10, str11, bool2, z24, repinSource);
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(repinSource, "repinSource");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(feedRepository, "feedRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(repinExperiments, "repinExperiments");
        Intrinsics.checkNotNullParameter(repinLibraryExperiments, "repinLibraryExperiments");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(repinToProfileHelper, "repinToProfileHelper");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(educationHelper, "educationHelper");
        Intrinsics.checkNotNullParameter(boardMoreIdeasToastUpsellManager, "boardMoreIdeasToastUpsellManager");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(repinFollowUpsellManager, "repinFollowUpsellManager");
        Intrinsics.checkNotNullParameter(repinShareUpsellManager, "repinShareUpsellManager");
        Intrinsics.checkNotNullParameter(scheduledPinService, "scheduledPinService");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f71034l0 = str;
        this.f71035m0 = z17;
        this.f71036n0 = date;
        this.f71037o0 = z18;
        this.f71038p0 = repinFollowUpsellManager;
        this.f71039q0 = repinShareUpsellManager;
        this.f71040r0 = scheduledPinService;
        this.f71041s0 = pinAuxHelper;
        this.f71042t0 = boardNavigator;
        this.f71045w0 = new o(this);
        this.O = true;
        this.f71044v0 = boardMoreIdeasToastUpsellManager;
        this.f71043u0 = new k11.f(d4Var, activeUserManager, z13, adFormats, repinLibraryExperiments);
    }

    @Override // i11.m, vq0.g
    /* renamed from: Q3 */
    public final void r3(f11.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        this.f71001g.h(this.f71045w0);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d2  */
    @Override // i11.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U3(h11.d r28) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i11.q.U3(h11.d):void");
    }

    @Override // i11.m, vq0.g, yk1.p, yk1.b
    public final void onUnbind() {
        this.f71001g.j(this.f71045w0);
        super.onUnbind();
    }
}
