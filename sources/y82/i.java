package y82;

import com.pinterest.targethandshake.analytics.AdsTargetAccountLinkingLogger$AdsTargetAccountLinkingErrorPayload;
import com.pinterest.targethandshake.analytics.AdsTargetAccountLinkingLogger$AdsTargetAccountLinkingStepPayload;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import nx.d0;

/* loaded from: classes2.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f138079a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f138080b;

    /* renamed from: c, reason: collision with root package name */
    public final a f138081c;

    public i(d0 pinalytics, f0 handshakeEventGenerator, a adsTargetAccountLinkingLogger) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(handshakeEventGenerator, "handshakeEventGenerator");
        Intrinsics.checkNotNullParameter(adsTargetAccountLinkingLogger, "adsTargetAccountLinkingLogger");
        this.f138079a = pinalytics;
        this.f138080b = handshakeEventGenerator;
        this.f138081c = adsTargetAccountLinkingLogger;
    }

    public final void b(String failReason, String errorCode) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f138080b.getClass();
        zy.a b03 = f0.b0(failReason, errorCode);
        this.f138079a.g(b03.f143049b, b03.f143050c, b03.f143051d, b03.f143054g);
        a aVar = this.f138081c;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        AdsTargetAccountLinkingLogger$AdsTargetAccountLinkingErrorPayload adsTargetAccountLinkingLogger$AdsTargetAccountLinkingErrorPayload = new AdsTargetAccountLinkingLogger$AdsTargetAccountLinkingErrorPayload("PIN_HANDSHAKE_ERROR", failReason, errorCode);
        if (aVar.a()) {
            wr.c.a(aVar.f138064a, adsTargetAccountLinkingLogger$AdsTargetAccountLinkingErrorPayload, null, null, 14);
        }
    }

    public final void c(g handshakeStep) {
        Intrinsics.checkNotNullParameter(handshakeStep, "step");
        this.f138080b.getClass();
        zy.a c03 = f0.c0(handshakeStep);
        this.f138079a.g(c03.f143049b, c03.f143050c, c03.f143051d, c03.f143054g);
        a aVar = this.f138081c;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(handshakeStep, "handshakeStep");
        String lowerCase = handshakeStep.toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        AdsTargetAccountLinkingLogger$AdsTargetAccountLinkingStepPayload adsTargetAccountLinkingLogger$AdsTargetAccountLinkingStepPayload = new AdsTargetAccountLinkingLogger$AdsTargetAccountLinkingStepPayload("PIN_HANDSHAKE_STEP", lowerCase);
        if (aVar.a()) {
            wr.c.a(aVar.f138064a, adsTargetAccountLinkingLogger$AdsTargetAccountLinkingStepPayload, null, null, 14);
        }
    }
}
