package oj0;

import androidx.appcompat.widget.c2;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.feature.pin.j;
import com.pinterest.feature.pin.r;
import h32.k2;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.b0;
import nx.d0;
import nx.d1;
import x02.i2;

/* loaded from: classes5.dex */
public final class g extends d {

    /* renamed from: q, reason: collision with root package name */
    public final uk1.d f95384q;

    /* renamed from: r, reason: collision with root package name */
    public final k11.b f95385r;

    /* renamed from: s, reason: collision with root package name */
    public final c2 f95386s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(uk1.d presenterPinalytics, d1 trackingParamAttacher, i2 pinRepository, r repinAnimationUtil, w eventManager, j pinAction, b saveActionLoggingData, a delegate, k11.b bVar, c2 repinToastHelper, b0 pinAuxHelper) {
        super(null, null, presenterPinalytics, trackingParamAttacher, pinRepository, repinAnimationUtil, eventManager, pinAction, saveActionLoggingData, delegate, false, pinAuxHelper);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinAction, "pinAction");
        Intrinsics.checkNotNullParameter(saveActionLoggingData, "saveActionLoggingData");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(repinToastHelper, "repinToastHelper");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f95384q = presenterPinalytics;
        this.f95385r = bVar;
        this.f95386s = repinToastHelper;
    }

    @Override // oj0.d
    public final x02.c2 d(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        x02.c2 d2 = super.d(pin);
        v7 D3 = pin.D3();
        if (D3 != null && D3.h1() != null) {
            d2.f131311p = k2.FEATURED_BOARD_FEED;
        }
        return d2;
    }

    @Override // oj0.d
    public final void e(f30 pin, f30 newPin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(newPin, "newPin");
        k11.b bVar = this.f95385r;
        if (bVar != null) {
            bVar.b(pin, newPin);
        }
    }

    @Override // oj0.d
    public final void f(f30 shownPin, f30 repinnedPin) {
        Intrinsics.checkNotNullParameter(shownPin, "shownPin");
        Intrinsics.checkNotNullParameter(repinnedPin, "repinnedPin");
        d0 d0Var = this.f95384q.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        this.f95386s.k(shownPin, repinnedPin, d0Var);
    }
}
