package a11;

import android.net.Uri;
import android.webkit.URLUtil;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import df.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w {
    public static void a(f30 f30Var, y urlInfoHelper, m60.w eventManager, ws1.a linkValidation, z70.f chromeSettings, androidx.lifecycle.u scope, boolean z13) {
        String d2;
        Intrinsics.checkNotNullParameter(urlInfoHelper, "urlInfoHelper");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(linkValidation, "linkValidation");
        Intrinsics.checkNotNullParameter(chromeSettings, "chromeSettings");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (f30Var == null || !com.bumptech.glide.c.f1(f30Var) || (d2 = d(f30Var, linkValidation, chromeSettings)) == null) {
            return;
        }
        ((ws1.b) linkValidation).getClass();
        if (URLUtil.isValidUrl(d2)) {
            kotlin.jvm.internal.j.z(scope, null, null, new v(urlInfoHelper, d2, f30Var, eventManager, z13, null), 3);
        }
    }

    public static void b(tb0.h crashReporting, boolean z13, boolean z14, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        crashReporting.s("viewAdapterExists", String.valueOf(z13));
        crashReporting.s("isResumed", String.valueOf(z14));
        if (num != null) {
            crashReporting.s("viewAdapterCount", String.valueOf(num.intValue()));
            if (num2 != null) {
                crashReporting.s("pinFeedCount", String.valueOf(num2.intValue()));
            }
            if (num3 != null) {
                crashReporting.s("pinFeedAbsCount", String.valueOf(num3.intValue()));
            }
        }
    }

    public static String c(f30 f30Var, String apdId) {
        Intrinsics.checkNotNullParameter(apdId, "apdId");
        f3 z33 = f30Var.z3();
        String uid = z33 != null ? z33.getUid() : null;
        return uid == null ? apdId : uid;
    }

    public static String d(f30 pin, ws1.a linkValidation, z70.f settings) {
        Intrinsics.checkNotNullParameter(pin, "currentPin");
        Intrinsics.checkNotNullParameter(linkValidation, "linkValidation");
        Intrinsics.checkNotNullParameter(settings, "chromeSettings");
        String M5 = pin.M5();
        ((ws1.b) linkValidation).getClass();
        boolean z13 = false;
        if (M5 != null && (!kotlin.text.z.j(M5))) {
            Uri parse = Uri.parse(M5);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            z13 = j1.f1(parse);
        }
        boolean isValidUrl = URLUtil.isValidUrl(pin.u3());
        String y03 = bs1.c.y0(pin);
        String B0 = bs1.c.B0(pin);
        Intrinsics.checkNotNullParameter(settings, "settings");
        boolean z14 = settings.f140992a;
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (z13 && pin.n6()) {
            if (pin.m6().intValue() != v22.c.APP_STORE_TRIGGER.getValue()) {
                return pin.M5();
            }
        }
        if (isValidUrl) {
            return pin.u3();
        }
        String x53 = pin.x5();
        if (x53 != null && !kotlin.text.z.j(x53) && !z14) {
            return pin.x5();
        }
        String I6 = pin.I6();
        if (I6 != null && !kotlin.text.z.j(I6)) {
            return pin.I6();
        }
        String D6 = pin.D6();
        if (D6 != null && !kotlin.text.z.j(D6)) {
            return pin.D6();
        }
        String s53 = pin.s5();
        return (s53 == null || kotlin.text.z.j(s53)) ? (y03 == null || kotlin.text.z.j(y03)) ? B0 : y03 : pin.s5();
    }

    public static ArrayList e(PinFeed feed, String str, boolean z13) {
        Intrinsics.checkNotNullParameter(feed, "feed");
        List q13 = feed.q();
        Intrinsics.checkNotNullExpressionValue(q13, "getItems(...)");
        return f(str, q13, z13);
    }

    public static ArrayList f(String str, List list, boolean z13) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            f30 f30Var = (f30) obj;
            if (f30Var != null && (!f30Var.V5().booleanValue() || Intrinsics.d(f30Var.getUid(), str))) {
                if (!z13 || !f30Var.d5().booleanValue() || list.size() < 2 || Intrinsics.d(f30Var.getUid(), str)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public static int g(String pinUid, List list) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        int i13 = 0;
        if (list == null) {
            return 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((f30) it.next()).getUid(), pinUid)) {
                return i13;
            }
            i13++;
        }
        return -1;
    }
}
