package e92;

import android.webkit.CookieManager;
import df.j1;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.z;
import lh0.a4;
import lh0.g1;
import lh0.g4;
import lh0.z3;
import tu1.u;
import xk2.k;
import xk2.m;
import xk2.n;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final lv.a f57919a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57920b;

    /* renamed from: c, reason: collision with root package name */
    public final g4 f57921c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57922d;

    /* renamed from: e, reason: collision with root package name */
    public final k f57923e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f57924f;

    public d(lv.a adsQuarantine, int i13, g4 experiments) {
        Intrinsics.checkNotNullParameter(adsQuarantine, "adsQuarantine");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        c cookieManagerDelegate = c.f57918i;
        Intrinsics.checkNotNullParameter(adsQuarantine, "adsQuarantine");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(cookieManagerDelegate, "cookieManagerDelegate");
        this.f57919a = adsQuarantine;
        this.f57920b = i13;
        this.f57921c = experiments;
        this.f57922d = "accessToken";
        this.f57923e = m.a(n.NONE, new u(this, 6));
        this.f57924f = new LinkedHashSet();
    }

    public final void a() {
        List<String> split$default;
        int K;
        this.f57919a.getClass();
        if (lv.a.a()) {
            g4 g4Var = this.f57921c;
            g4Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) g4Var.f83375a;
            if (g1Var.o("ex_target_delete_all_cookies_killswitch", "enabled", z3Var) || g1Var.l("ex_target_delete_all_cookies_killswitch")) {
                b().setCookie("https://.target.com", "x-aa-api-key=; Max-Age=-1");
                b().setCookie("https://.target.com", this.f57922d + "=; Max-Age=-1");
                b().setCookie("https://.target.com", "session-aa-os-name=; Max-Age=-1");
                b().setCookie("https://.target.com", "session-aa-os-version=; Max-Age=-1");
            } else {
                String cookie = b().getCookie("https://.target.com");
                if (cookie != null) {
                    split$default = StringsKt__StringsKt.split$default(cookie, new String[]{"; "}, false, 0, 6, null);
                    boolean c13 = c("enabled_preserve_visitor_id");
                    for (String str : split$default) {
                        if (j1.U0(str) && (K = StringsKt.K(str, '=', 0, false, 6)) != -1) {
                            String substring = str.substring(0, K);
                            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                            if (c13 || !z.i(substring, "visitorId", true)) {
                                b().setCookie("https://.target.com", a.a.C(substring, "=; Max-Age=-1"));
                            }
                        }
                    }
                }
            }
            this.f57924f.clear();
        }
    }

    public final CookieManager b() {
        return (CookieManager) this.f57923e.getValue();
    }

    public final boolean c(String str) {
        String str2 = (String) ((g1) this.f57921c.f83375a).j().get("ex_target_cookiemanagement_killswitch");
        return Intrinsics.d(str2, "enabled") || Intrinsics.d(str2, str);
    }

    public final void d(String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f57919a.getClass();
        if (lv.a.a()) {
            b().setCookie("https://.target.com", "x-aa-api-key=" + apiKey + "; secure");
            this.f57924f.add("x-aa-api-key");
        }
    }
}
