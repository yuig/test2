package oi;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.q9;
import com.google.android.gms.internal.measurement.t9;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class e extends c0.s0 {

    /* renamed from: b, reason: collision with root package name */
    public Boolean f94733b;

    /* renamed from: c, reason: collision with root package name */
    public f f94734c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f94735d;

    public static long A() {
        return ((Long) s.D.a(null)).longValue();
    }

    public final boolean B() {
        Boolean y13 = y("google_analytics_automatic_screen_reporting_enabled");
        return y13 == null || y13.booleanValue();
    }

    public final boolean C() {
        if (this.f94733b == null) {
            Boolean y13 = y("app_measurement_lite");
            this.f94733b = y13;
            if (y13 == null) {
                this.f94733b = Boolean.FALSE;
            }
        }
        return this.f94733b.booleanValue() || !((u4) this.f24333a).f95201e;
    }

    public final Bundle D() {
        try {
            if (zza().getPackageManager() == null) {
                zzj().f95268f.c("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c13 = ph.b.a(zza()).c(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, zza().getPackageName());
            if (c13 != null) {
                return c13.metaData;
            }
            zzj().f95268f.c("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e13) {
            zzj().f95268f.b(e13, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final double q(String str, s3 s3Var) {
        if (str == null) {
            return ((Double) s3Var.a(null)).doubleValue();
        }
        String a13 = this.f94734c.a(str, s3Var.f95143a);
        if (TextUtils.isEmpty(a13)) {
            return ((Double) s3Var.a(null)).doubleValue();
        }
        try {
            return ((Double) s3Var.a(Double.valueOf(Double.parseDouble(a13)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) s3Var.a(null)).doubleValue();
        }
    }

    public final String r(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            com.bumptech.glide.d.t(str2);
            return str2;
        } catch (ClassNotFoundException e13) {
            zzj().f95268f.b(e13, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e14) {
            zzj().f95268f.b(e14, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e15) {
            zzj().f95268f.b(e15, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e16) {
            zzj().f95268f.b(e16, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final boolean s(s3 s3Var) {
        return x(null, s3Var);
    }

    public final int t(String str) {
        ((t9) q9.f31610b.get()).getClass();
        return l().x(null, s.Q0) ? 500 : 100;
    }

    public final int u(String str, s3 s3Var) {
        if (str == null) {
            return ((Integer) s3Var.a(null)).intValue();
        }
        String a13 = this.f94734c.a(str, s3Var.f95143a);
        if (TextUtils.isEmpty(a13)) {
            return ((Integer) s3Var.a(null)).intValue();
        }
        try {
            return ((Integer) s3Var.a(Integer.valueOf(Integer.parseInt(a13)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) s3Var.a(null)).intValue();
        }
    }

    public final long v(String str, s3 s3Var) {
        if (str == null) {
            return ((Long) s3Var.a(null)).longValue();
        }
        String a13 = this.f94734c.a(str, s3Var.f95143a);
        if (TextUtils.isEmpty(a13)) {
            return ((Long) s3Var.a(null)).longValue();
        }
        try {
            return ((Long) s3Var.a(Long.valueOf(Long.parseLong(a13)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) s3Var.a(null)).longValue();
        }
    }

    public final String w(String str, s3 s3Var) {
        return str == null ? (String) s3Var.a(null) : (String) s3Var.a(this.f94734c.a(str, s3Var.f95143a));
    }

    public final boolean x(String str, s3 s3Var) {
        if (str == null) {
            return ((Boolean) s3Var.a(null)).booleanValue();
        }
        String a13 = this.f94734c.a(str, s3Var.f95143a);
        return TextUtils.isEmpty(a13) ? ((Boolean) s3Var.a(null)).booleanValue() : ((Boolean) s3Var.a(Boolean.valueOf(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE.equals(a13)))).booleanValue();
    }

    public final Boolean y(String str) {
        com.bumptech.glide.d.o(str);
        Bundle D = D();
        if (D == null) {
            zzj().f95268f.c("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (D.containsKey(str)) {
            return Boolean.valueOf(D.getBoolean(str));
        }
        return null;
    }

    public final boolean z(String str) {
        return SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE.equals(this.f94734c.a(str, "measurement.event_sampling_enabled"));
    }
}
