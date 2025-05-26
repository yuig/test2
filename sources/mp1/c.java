package mp1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.handshake.analytics.AdsHandshakeJsonLogger$AdsHandshakeErrorPayload;
import com.pinterest.handshake.analytics.AdsHandshakeJsonLogger$AdsHandshakeStepPayload;
import h32.f1;
import h32.i0;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f87923a;

    public c(a jsonLogger) {
        Intrinsics.checkNotNullParameter(jsonLogger, "jsonLogger");
        this.f87923a = jsonLogger;
    }

    public final zy.a a(String failReason, String errorCode, k kVar) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        i0 i0Var = new i0(null, null, null, null, null, null);
        f1 f1Var = f1.PIN_HANDSHAKE_ERROR;
        HashMap x13 = a.a.x("fail_reason", failReason, "handshake_error_code", errorCode);
        if (kVar != null) {
            String lowerCase = kVar.toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            x13.put("handshake_step", lowerCase);
        }
        x13.put("shopping_integration_type", String.valueOf(gb0.f.AMAZON_HANDSHAKE.getValue()));
        Unit unit = Unit.f80348a;
        zy.a aVar = new zy.a(i0Var, f1Var, null, x13, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP);
        a aVar2 = this.f87923a;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (aVar2.a()) {
            wr.c.a(aVar2.f87919a, new AdsHandshakeJsonLogger$AdsHandshakeErrorPayload("handshake_error", failReason, errorCode), null, null, 14);
        }
        return aVar;
    }

    public final zy.a b(k handshakeStep) {
        Intrinsics.checkNotNullParameter(handshakeStep, "step");
        i0 i0Var = new i0(null, null, null, null, null, null);
        f1 f1Var = f1.PIN_HANDSHAKE_STEP;
        HashMap hashMap = new HashMap();
        String kVar = handshakeStep.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = kVar.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        hashMap.put("handshake_step", lowerCase);
        hashMap.put("shopping_integration_type", String.valueOf(gb0.f.AMAZON_HANDSHAKE.getValue()));
        Unit unit = Unit.f80348a;
        zy.a aVar = new zy.a(i0Var, f1Var, null, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP);
        a aVar2 = this.f87923a;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(handshakeStep, "handshakeStep");
        if (aVar2.a()) {
            String lowerCase2 = handshakeStep.toString().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            wr.c.a(aVar2.f87919a, new AdsHandshakeJsonLogger$AdsHandshakeStepPayload("handshake_step", lowerCase2), null, null, 14);
        }
        return aVar;
    }

    public final zy.a c(String str, String errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        i0 i0Var = new i0(null, null, null, null, null, null);
        f1 f1Var = f1.PIN_HANDSHAKE_WEBVIEW_ERROR;
        HashMap hashMap = new HashMap();
        hashMap.put("fail_reason", str == null ? "pdp_failed_load" : str);
        hashMap.put("handshake_error_code", errorCode);
        hashMap.put("shopping_integration_type", String.valueOf(gb0.f.AMAZON_HANDSHAKE.getValue()));
        Unit unit = Unit.f80348a;
        zy.a aVar = new zy.a(i0Var, f1Var, null, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP);
        a aVar2 = this.f87923a;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (aVar2.a()) {
            if (str == null) {
                str = "";
            }
            wr.c.a(aVar2.f87919a, new AdsHandshakeJsonLogger$AdsHandshakeErrorPayload("handshake_webview_error", str, errorCode), null, null, 14);
        }
        return aVar;
    }
}
