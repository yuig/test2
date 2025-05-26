package oi;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.eb;
import com.google.android.gms.internal.measurement.fb;

/* loaded from: classes3.dex */
public final class x6 extends w6 {
    public final androidx.camera.core.impl.x2 t(String str) {
        ((eb) fb.f31397b.get()).getClass();
        androidx.camera.core.impl.x2 x2Var = null;
        if (l().x(null, s.f95126t0)) {
            zzj().f95276n.c("sgtm feature flag enabled.");
            p4 d03 = r().d0(str);
            if (d03 == null) {
                return new androidx.camera.core.impl.x2(u(str));
            }
            if (d03.h()) {
                zzj().f95276n.c("sgtm upload enabled in manifest.");
                com.google.android.gms.internal.measurement.s2 G = s().G(d03.M());
                if (G != null) {
                    String C = G.C();
                    if (!TextUtils.isEmpty(C)) {
                        String B = G.B();
                        zzj().f95276n.a(C, TextUtils.isEmpty(B) ? "Y" : "N", "sgtm configured with upload_url, server_info");
                        x2Var = TextUtils.isEmpty(B) ? new androidx.camera.core.impl.x2(C) : new androidx.camera.core.impl.x2(C, ep.b.o("x-google-sgtm-server-info", B));
                    }
                }
            }
            if (x2Var != null) {
                return x2Var;
            }
        }
        return new androidx.camera.core.impl.x2(u(str));
    }

    public final String u(String str) {
        k4 s13 = s();
        s13.p();
        s13.L(str);
        String str2 = (String) s13.f94903l.get(str);
        if (TextUtils.isEmpty(str2)) {
            return (String) s.f95121r.a(null);
        }
        Uri parse = Uri.parse((String) s.f95121r.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.authority(str2 + "." + parse.getAuthority());
        return buildUpon.build().toString();
    }
}
