package bs;

import android.os.Build;
import android.webkit.CookieManager;
import com.pinterest.api.model.f30;
import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import nx.d0;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final zr.b f23840a;

    /* renamed from: b, reason: collision with root package name */
    public final lh0.d f23841b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f23842c;

    public b(zr.b adsSystemUtils, lh0.d experiments, d0 pinalytics) {
        Intrinsics.checkNotNullParameter(adsSystemUtils, "adsSystemUtils");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f23840a = adsSystemUtils;
        this.f23841b = experiments;
        this.f23842c = pinalytics;
    }

    public final boolean a(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (b7.c.A(pin) && d()) {
            lh0.d dVar = this.f23841b;
            dVar.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) dVar.f83323a;
            if (g1Var.o("android_ad_handshake", "enabled", z3Var) || g1Var.l("android_ad_handshake")) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return a(pin) || c(pin);
    }

    public final boolean c(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.g t33 = pin.t3();
        if (t33 != null) {
            Integer k03 = t33.k0();
            if (k03.intValue() == gb0.f.TARGET_HANDSHAKE.getValue() && d()) {
                lh0.d dVar = this.f23841b;
                dVar.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) dVar.f83323a;
                if (g1Var.o("android_target_account_linking", "enabled", z3Var) || g1Var.l("android_target_account_linking")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d() {
        zr.b bVar = this.f23840a;
        bVar.getClass();
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                try {
                    CookieManager.getInstance();
                    if (dl2.b.z1(bVar.f142746a, "com.android.chrome")) {
                        return true;
                    }
                    e("quarantine_failed_chrome_disabled");
                    return false;
                } catch (Exception unused) {
                    e("quarantine_failed_webview_disabled");
                    return false;
                }
            }
        } catch (Exception unused2) {
        }
        e("quarantine_failed_api_level");
        return false;
    }

    public final void e(String str) {
        f1 f1Var = f1.PIN_HANDSHAKE_ERROR;
        HashMap x13 = a.a.x("fail_reason", str, "handshake_error_code", "");
        Unit unit = Unit.f80348a;
        this.f23842c.g(f1Var, null, x13, false);
    }
}
