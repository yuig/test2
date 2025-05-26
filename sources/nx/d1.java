package nx;

import com.pinterest.api.model.f30;
import h32.d4;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* loaded from: classes.dex */
public final class d1 implements p {

    /* renamed from: a */
    public final o0 f92386a;

    /* renamed from: b */
    public final LinkedHashMap f92387b;

    public d1(o0 pinalyticsManager) {
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        this.f92386a = pinalyticsManager;
        this.f92387b = new LinkedHashMap();
    }

    public static String a(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        String E6 = pin.E6();
        if (E6 == null) {
            return null;
        }
        if (E6.length() == 0) {
            E6 = null;
        } else if (!kotlin.text.z.h(E6, "~0", false)) {
            E6 = E6.concat("~0");
        }
        return E6;
    }

    public final String b(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        String pinId = pin.getId();
        Intrinsics.checkNotNullExpressionValue(pinId, "getUid(...)");
        String a13 = a(pin);
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        String c13 = c(pinId);
        if (c13 != null) {
            return c13;
        }
        if (a13 != null) {
            g(pinId, a13, this.f92386a.d());
        } else {
            a13 = null;
        }
        return a13;
    }

    public final String c(String pinId) {
        String str;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        o0 o0Var = this.f92386a;
        Iterator it = Util.A(o0Var.f92438a).iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            e1 m13 = bk.f.m((a) it.next(), pinId);
            str = m13 != null ? f(m13) : null;
            if (str != null) {
                break;
            }
        }
        if (str == null) {
            return null;
        }
        g(pinId, str, o0Var.d());
        return str;
    }

    public final String d(d0 pinalytics, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        String id3 = pin.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        String e13 = e(pinalytics, id3);
        return e13 == null ? a(pin) : e13;
    }

    public final String e(d0 pinalytics, String pinId) {
        d4 d4Var;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        h32.i0 p13 = pinalytics.p();
        e1 e1Var = (p13 == null || (d4Var = p13.f67081a) == null) ? null : new e1(p13.f67082b, d4Var, pinId, pinalytics.getUniqueScreenKey());
        if (e1Var != null) {
            return f(e1Var);
        }
        return null;
    }

    public final String f(e1 trackingParamKey) {
        Intrinsics.checkNotNullParameter(trackingParamKey, "trackingParamKey");
        return (String) this.f92387b.get(trackingParamKey);
    }

    public final void g(String pinId, String trackingParam, a aVar) {
        e1 m13;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(trackingParam, "trackingParam");
        if (aVar == null || (m13 = bk.f.m(aVar, pinId)) == null) {
            return;
        }
        this.f92387b.put(m13, trackingParam);
    }

    public final void h(d0 pinalytics, f30 pin) {
        d4 d4Var;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pin, "pin");
        String E6 = pin.E6();
        if (E6 == null || E6.length() == 0) {
            return;
        }
        String id3 = pin.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        h32.i0 p13 = pinalytics.p();
        e1 e1Var = null;
        if (p13 != null && (d4Var = p13.f67081a) != null) {
            e1Var = new e1(p13.f67082b, d4Var, id3, pinalytics.getUniqueScreenKey());
        }
        if (e1Var == null) {
            return;
        }
        this.f92387b.put(e1Var, E6);
    }
}
