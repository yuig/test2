package qb0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import m60.f0;
import net.quikkly.android.ui.CameraPreview;
import wo2.m;
import xk2.k;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Integer f103397a;

    /* renamed from: b, reason: collision with root package name */
    public m f103398b;

    /* renamed from: c, reason: collision with root package name */
    public String f103399c;

    /* renamed from: d, reason: collision with root package name */
    public String f103400d;

    /* renamed from: e, reason: collision with root package name */
    public long f103401e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f103402f;

    /* renamed from: g, reason: collision with root package name */
    public ConnectivityManager f103403g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f103404h;

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("page_size") + 10;
        int indexOf2 = str.indexOf("&", indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        return str.substring(indexOf, indexOf2);
    }

    public static String f(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        int length = str2.length() + str.indexOf(str2) + 1;
        int indexOf = str.indexOf("&", length);
        if (indexOf == -1) {
            indexOf = str.length();
        }
        return str.substring(0, length) + str3 + str.substring(indexOf);
    }

    public final String b() {
        String networkOperatorName;
        if (this.f103400d == null) {
            k kVar = vb0.f.f125456e;
            if (vb0.e.d().b()) {
                networkOperatorName = "wifi";
            } else {
                Context context = kb0.a.f79058b;
                TelephonyManager telephonyManager = (TelephonyManager) f0.X().getSystemService("phone");
                networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : "Unknown";
            }
            this.f103400d = networkOperatorName;
        }
        String str = this.f103400d;
        return str == null ? "Unknown" : str;
    }

    public final boolean c() {
        return d() && this.f103404h;
    }

    public final boolean d() {
        boolean k13;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f103401e >= CameraPreview.AUTOFOCUS_INTERVAL_MILLIS) {
            k kVar = vb0.f.f125456e;
            vb0.e.d().getClass();
            synchronized (vb0.e.a()) {
                k13 = bs1.c.k1(vb0.e.a());
            }
            this.f103402f = k13;
            this.f103401e = elapsedRealtime;
        }
        return this.f103402f;
    }

    public final String e() {
        String str;
        if (c()) {
            k kVar = vb0.f.f125456e;
            str = vb0.e.d().b() ? "WiFi" : vb0.e.d().a() ? "mobile" : "unknown";
        } else {
            str = "none";
        }
        this.f103399c = str;
        return str;
    }
}
