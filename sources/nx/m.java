package nx;

import com.pinterest.api.model.gw;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f92426a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f92427b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.e f92428c;

    /* renamed from: d, reason: collision with root package name */
    public final tb0.h f92429d;

    /* renamed from: e, reason: collision with root package name */
    public final vy.m f92430e;

    /* renamed from: f, reason: collision with root package name */
    public final gw f92431f;

    /* renamed from: g, reason: collision with root package name */
    public final vb0.c f92432g;

    /* renamed from: h, reason: collision with root package name */
    public final b60.b f92433h;

    /* renamed from: i, reason: collision with root package name */
    public final gz1.b f92434i;

    public m(e0 pinalyticsManager, d1 trackingParamAttacher, m60.e applicationInfoProvider, tb0.h crashReporting, vy.m analyticsApi, gw modelHelper, vb0.c applicationUtils, b60.b activeUserManager, gz1.b googlePlayServices) {
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        Intrinsics.checkNotNullParameter(applicationUtils, "applicationUtils");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(googlePlayServices, "googlePlayServices");
        this.f92426a = pinalyticsManager;
        this.f92427b = trackingParamAttacher;
        this.f92428c = applicationInfoProvider;
        this.f92429d = crashReporting;
        this.f92430e = analyticsApi;
        this.f92431f = modelHelper;
        this.f92432g = applicationUtils;
        this.f92433h = activeUserManager;
        this.f92434i = googlePlayServices;
    }

    public final j0 a(a contextProvider) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        return new j0(contextProvider, this.f92426a, this.f92427b, this.f92428c, this.f92429d, this.f92430e, this.f92431f, this.f92432g, this.f92433h, this.f92434i);
    }
}
