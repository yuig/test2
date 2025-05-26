package ads_mobile_sdk;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import ao2.j0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class yb1 {

    /* renamed from: a, reason: collision with root package name */
    public final y80 f14183a;

    /* renamed from: b, reason: collision with root package name */
    public final ub1 f14184b;

    /* renamed from: c, reason: collision with root package name */
    public final cm0 f14185c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f14186d;

    /* renamed from: e, reason: collision with root package name */
    public final x f14187e;

    public yb1(y80 deviceProperties, ub1 mraidAfmaDispatcher, cm0 gmaUtil, j0 uiScope, x activityTracker) {
        Intrinsics.checkNotNullParameter(deviceProperties, "deviceProperties");
        Intrinsics.checkNotNullParameter(mraidAfmaDispatcher, "mraidAfmaDispatcher");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        this.f14183a = deviceProperties;
        this.f14184b = mraidAfmaDispatcher;
        this.f14185c = gmaUtil;
        this.f14186d = uiScope;
        this.f14187e = activityTracker;
    }

    public final Unit a(ym0 ym0Var, Map map) {
        String str;
        String str2;
        String str3;
        String str4;
        Activity c13 = this.f14187e.c();
        if (c13 == null) {
            kotlin.jvm.internal.j.z(this.f14186d, null, null, new wb1(this, ym0Var, "Activity context is required to show calendar event alert.", null), 3);
            return Unit.f80348a;
        }
        y80 y80Var = this.f14183a;
        y80Var.getClass();
        Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
        Intrinsics.checkNotNullExpressionValue(type, "setType(...)");
        if (!y80Var.a(type)) {
            kotlin.jvm.internal.j.z(this.f14186d, null, null, new wb1(this, ym0Var, "This feature is not available on the device.", null), 3);
            return Unit.f80348a;
        }
        String str5 = (String) map.get("start_ticks");
        Long h03 = str5 != null ? StringsKt.h0(str5) : null;
        String str6 = (String) map.get("end_ticks");
        Long h04 = str6 != null ? StringsKt.h0(str6) : null;
        String str7 = (String) map.get("description");
        String str8 = str7 == null ? "" : str7;
        String str9 = (String) map.get("summary");
        String str10 = str9 == null ? "" : str9;
        String str11 = (String) map.get("location");
        String str12 = str11 == null ? "" : str11;
        Resources resources = c13.getResources();
        if (resources == null || (str = resources.getString(ui.a.mraid_create_calendar_event)) == null) {
            str = "Create calendar event";
        }
        if (resources == null || (str2 = resources.getString(ui.a.mraid_allow_calendar_event)) == null) {
            str2 = "Allow Ad to create a calendar event?";
        }
        if (resources == null || (str3 = resources.getString(ui.a.mraid_alert_accept)) == null) {
            str3 = "Accept";
        }
        if (resources == null || (str4 = resources.getString(ui.a.mraid_alert_decline)) == null) {
            str4 = "Decline";
        }
        kotlin.jvm.internal.j.z(this.f14186d, null, null, new xb1(c13, str, str2, str3, str4, str8, str12, str10, h03, h04, this, ym0Var, null), 3);
        return Unit.f80348a;
    }
}
