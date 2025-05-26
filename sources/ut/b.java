package ut;

import android.net.Uri;
import com.pinterest.api.model.f30;
import es.h;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.b0;
import nx.d1;
import ps.l;
import qt.g;
import ro1.c;
import sg0.f;
import tq.a0;
import uj2.q;
import x02.i2;
import x02.x2;

/* loaded from: classes3.dex */
public final class b extends g implements et.a {

    /* renamed from: x, reason: collision with root package name */
    public final x2 f123085x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, l pinAnalytics, w eventManager, i2 pinRepository, q networkStateStream, j80.b carouselUtil, c deepLinkAdUtil, x2 userRepository, d1 trackingParamAttacher, lh0.g adsExperiments, xr.a attributionReporting, f afterActionPlacementManager, es.a adFormats, b0 pinAuxHelper, ur.a adsDependencies, h adsCommonDisplay) {
        super(adsDependencies, attributionReporting, adFormats, adsCommonDisplay, pinAnalytics, pinAuxHelper, trackingParamAttacher, eventManager, carouselUtil, afterActionPlacementManager, adsExperiments, deepLinkAdUtil, pinRepository, networkStateStream, str);
        Intrinsics.checkNotNullParameter(pinAnalytics, "pinAnalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(adsExperiments, "adsExperiments");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(afterActionPlacementManager, "afterActionPlacementManager");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f123085x = userRepository;
    }

    public final void G3() {
        List<String> pathSegments = Uri.parse(com.bumptech.glide.c.D(t3())).getPathSegments();
        Intrinsics.f(pathSegments);
        Object S = CollectionsKt.S(pathSegments);
        Intrinsics.checkNotNullExpressionValue(S, "first(...)");
        xj2.c o13 = this.f123085x.S((String) S).s().o(new st.c(1, new a0(this, 25)), new st.c(2, a.f123084i));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    @Override // qt.g
    public final void v3(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.v3(pin);
        ku.c cVar = (ku.c) ((et.b) getView());
        cVar.getClass();
        Intrinsics.checkNotNullParameter(this, "presenter");
        cVar.C0 = this;
    }
}
