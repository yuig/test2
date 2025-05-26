package gq1;

import a11.e;
import android.content.Context;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.f30;
import es.h;
import gs0.k;
import h32.c1;
import java.util.HashMap;
import k11.p;
import kotlin.jvm.internal.Intrinsics;
import ku1.j;
import lh0.z;
import m60.w;
import np0.d;
import nx.b0;
import nx.d0;
import nx.d1;
import zf0.f;

/* loaded from: classes5.dex */
public final class b extends d {

    /* renamed from: w, reason: collision with root package name */
    public final a11.d f65980w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c2 sharesheetUtils, ur.a ads, xr.a attributionReporting, es.a adFormats, h adsCommonDisplay, b0 pinAuxHelper, d1 trackingParamAttacher, b60.b activeUserManager, w eventManager, j80.b carouselUtil, f educationHelper, z closeupExperiments, k pinOverflowMenuModalProvider, a11.d clickThroughHelperFactory, k11.k repinSessionDataManager, p repinUtils, ni1.d deepLinkHelper, il1.a fragmentFactory, ro1.c deepLinkAdUtil, j navigationManager, nu1.a inAppNavigator, e02.a boardRouter, c82.d siteApi, yb2.c shufflesUtils) {
        super(sharesheetUtils, ads, attributionReporting, adFormats, adsCommonDisplay, pinAuxHelper, trackingParamAttacher, activeUserManager, eventManager, carouselUtil, educationHelper, closeupExperiments, pinOverflowMenuModalProvider, clickThroughHelperFactory, repinSessionDataManager, repinUtils, deepLinkHelper, fragmentFactory, deepLinkAdUtil, navigationManager, inAppNavigator, boardRouter, siteApi, shufflesUtils);
        Intrinsics.checkNotNullParameter(clickThroughHelperFactory, "clickThroughHelperFactory");
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(educationHelper, "educationHelper");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(siteApi, "siteApi");
        Intrinsics.checkNotNullParameter(pinOverflowMenuModalProvider, "pinOverflowMenuModalProvider");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(boardRouter, "boardRouter");
        Intrinsics.checkNotNullParameter(repinUtils, "repinUtils");
        Intrinsics.checkNotNullParameter(closeupExperiments, "closeupExperiments");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(shufflesUtils, "shufflesUtils");
        Intrinsics.checkNotNullParameter(repinSessionDataManager, "repinSessionDataManager");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(ads, "ads");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(deepLinkHelper, "deepLinkHelper");
        this.f65980w = clickThroughHelperFactory;
    }

    @Override // np0.d, np0.g
    public final void a(Context context, f30 pin, String str, String navigationSource, d0 pinalytics, c82.a aVar, xj2.b disposables, c1 c1Var, Boolean bool, HashMap auxData, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(disposables, "disposables");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        if (str != null) {
            g(context, pinalytics, pin, null, auxData);
            disposables.a(e.c(this.f65980w.a(pinalytics), str, pin, false, 0, 0, null, false, false, null, null, null, false, false, null, false, false, false, 131064));
        }
    }
}
