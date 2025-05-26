package ads_mobile_sdk;

import a.d3;
import ao2.j0;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class od1 {

    /* renamed from: a, reason: collision with root package name */
    public final ub1 f9233a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f9234b;

    public od1(ub1 mraidAfmaDispatcher, j0 uiScope) {
        Intrinsics.checkNotNullParameter(mraidAfmaDispatcher, "mraidAfmaDispatcher");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.f9233a = mraidAfmaDispatcher;
        this.f9234b = uiScope;
    }

    public final Unit a(Map map, ym0 ym0Var) {
        String str;
        Boolean g03;
        d3 d3Var = ym0Var.f14327m;
        if (d3Var == null) {
            kotlin.jvm.internal.j.z(this.f9234b, null, null, new md1(this, ym0Var, null), 3);
            return Unit.f80348a;
        }
        String str2 = (String) map.get("forceOrientation");
        String str3 = (String) map.get("allowOrientationChange");
        boolean booleanValue = (str3 == null || (g03 = StringsKt.g0(str3)) == null) ? true : g03.booleanValue();
        if (str2 != null) {
            str = str2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        kotlin.jvm.internal.j.z(this.f9234b, null, null, new nd1(d3Var, Intrinsics.d(str, "landscape") ? 6 : Intrinsics.d(str, "portrait") ? 7 : booleanValue ? -1 : 14, null), 3);
        return Unit.f80348a;
    }
}
