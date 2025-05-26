package sq;

import com.pinterest.api.model.f30;
import h32.g0;
import kotlin.jvm.internal.Intrinsics;
import nx.b0;
import nx.c0;
import nx.v;

/* loaded from: classes3.dex */
public interface f extends v {
    xk2.k getCloseupImpressionHelper();

    default oq.b getImpressionHelper(xr.a attributionReporting, b0 pinAuxHelper, ur.a adsCoreDependencies, es.a adFormats, boolean z13) {
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        return new oq.b(getImpressionLoggingParams().f114971b, attributionReporting, adsCoreDependencies, adFormats, g0.PIN_CLOSEUP_BODY, oq.a.f96941j, pinAuxHelper, z13);
    }

    /* renamed from: getImpressionParams */
    g getImpressionLoggingParams();

    f30 getPinForImpression();

    @Override // nx.v
    default c0 markImpressionEnd() {
        return ((oq.b) getCloseupImpressionHelper().getValue()).b(getImpressionLoggingParams().f114970a, Integer.valueOf(getImpressionLoggingParams().f114972c.W2()), Integer.valueOf(getImpressionLoggingParams().f114972c.e6()), getImpressionLoggingParams().f114973d);
    }

    @Override // nx.v
    default c0 markImpressionStart() {
        f30 pinForImpression = getPinForImpression();
        if (pinForImpression == null) {
            return null;
        }
        return ((oq.b) getCloseupImpressionHelper().getValue()).c(pinForImpression, getImpressionLoggingParams().f114970a, -1);
    }
}
