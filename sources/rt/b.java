package rt;

import android.net.Uri;
import com.pinterest.api.model.f30;
import du.d;
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
import rr.n0;
import sg0.f;
import tq.a0;
import uj2.q;
import x02.i2;
import x02.x0;

/* loaded from: classes3.dex */
public final class b extends g implements bt.a {

    /* renamed from: x, reason: collision with root package name */
    public final x0 f109948x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, l pinAnalytics, w eventManager, i2 pinRepository, q networkStateStream, c deepLinkAdUtil, j80.b carouselUtil, x0 boardRepository, d1 trackingParamAttacher, lh0.g adsExperiments, xr.a attributionReporting, f afterActionPlacementManager, es.a adFormats, b0 pinAuxHelper, ur.a adsDependencies, h adsCommonDisplay) {
        super(adsDependencies, attributionReporting, adFormats, adsCommonDisplay, pinAnalytics, pinAuxHelper, trackingParamAttacher, eventManager, carouselUtil, afterActionPlacementManager, adsExperiments, deepLinkAdUtil, pinRepository, networkStateStream, str);
        Intrinsics.checkNotNullParameter(pinAnalytics, "pinAnalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(adsExperiments, "adsExperiments");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(afterActionPlacementManager, "afterActionPlacementManager");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f109948x = boardRepository;
    }

    public final void G3() {
        List<String> pathSegments = Uri.parse(com.bumptech.glide.c.D(t3())).getPathSegments();
        Intrinsics.f(pathSegments);
        xj2.c o13 = this.f109948x.S(CollectionsKt.Z(pathSegments, "/", null, null, 0, null, null, 62)).s().o(new n0(25, new a0(this, 22)), new n0(26, a.f109947i));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    @Override // qt.g
    public final void v3(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.v3(pin);
        d dVar = (d) ((bt.b) getView());
        dVar.getClass();
        Intrinsics.checkNotNullParameter(this, "presenter");
        dVar.D0 = this;
    }
}
