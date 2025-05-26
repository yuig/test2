package bb;

import ai.q;
import android.database.Cursor;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bugsnag.android.r;
import com.bugsnag.android.u1;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.c6;
import com.google.android.gms.internal.measurement.g5;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.o5;
import com.google.android.gms.internal.measurement.q5;
import com.google.android.gms.internal.measurement.qb;
import com.google.android.gms.internal.recaptcha.u;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import i01.r0;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import je.p1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import oi.a4;
import oi.f5;
import oi.h7;
import oi.j4;
import oi.k4;
import oi.k5;
import oi.u4;
import org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface;
import ql2.s;
import zq1.c0;

/* loaded from: classes3.dex */
public final class p implements WebViewStartUpConfigBoundaryInterface, td.e, g.a, jh.d, com.google.android.gms.common.api.internal.o, com.google.android.gms.common.api.internal.k, h7 {

    /* renamed from: a */
    public final /* synthetic */ int f22463a;

    /* renamed from: b */
    public final Object f22464b;

    public p(int i13) {
        this.f22463a = i13;
        if (i13 != 5) {
            if (i13 == 9) {
                this.f22464b = new com.google.android.engage.common.datamodel.d();
                return;
            }
            if (i13 == 23) {
                this.f22464b = new com.google.android.gms.internal.recaptcha.g();
            } else if (i13 != 26) {
                this.f22464b = new StringBuilder();
            } else {
                this.f22464b = new EnumMap(f5.class);
            }
        }
    }

    public static p i(String str) {
        EnumMap enumMap = new EnumMap(f5.class);
        if (str.length() >= f5.values().length) {
            int i13 = 0;
            if (str.charAt(0) == '1') {
                f5[] values = f5.values();
                int length = values.length;
                int i14 = 1;
                while (i13 < length) {
                    enumMap.put((EnumMap) values[i13], (f5) oi.h.zza(str.charAt(i14)));
                    i13++;
                    i14++;
                }
                return new p(enumMap);
            }
        }
        return new p(26);
    }

    public final void A(int i13, long j13) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.s(i13, 0);
        q5Var.o((j13 >> 63) ^ (j13 << 1));
    }

    public final void B(int i13, int i14) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.s(i13, 0);
        q5Var.r((i14 >> 31) ^ (i14 << 1));
    }

    public final void C(int i13, long j13) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.s(i13, 0);
        q5Var.o(j13);
    }

    public final void D(int i13, int i14) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.s(i13, 0);
        q5Var.r(i14);
    }

    @Override // oi.h7
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            ((u4) ((k5) this.f22464b).f24333a).getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        k5 k5Var = (k5) this.f22464b;
        ((oh.b) k5Var.zzb()).getClass();
        k5Var.H("auto", str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // com.google.android.gms.common.api.internal.o
    public final void accept(Object obj, Object obj2) {
        switch (this.f22463a) {
            case 13:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                kh.a aVar = (kh.a) ((kh.c) obj).getService();
                TelemetryData telemetryData = (TelemetryData) this.f22464b;
                aVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(aVar.f141968c);
                int i13 = bi.b.f22820a;
                if (telemetryData == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    telemetryData.writeToParcel(obtain, 0);
                }
                try {
                    aVar.f141967b.transact(1, obtain, null, 1);
                    obtain.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th3) {
                    obtain.recycle();
                    throw th3;
                }
            default:
                ai.g gVar = (ai.g) this.f22464b;
                gVar.getClass();
                ai.e eVar = new ai.e((TaskCompletionSource) obj2);
                q qVar = (q) ((ai.h) obj).getService();
                Parcel C = qVar.C();
                int i14 = ai.l.f15231a;
                C.writeStrongBinder(eVar);
                C.writeString(gVar.f15223k);
                qVar.D(C, 2);
                return;
        }
    }

    @Override // jh.d
    public final void b(ConnectionResult connectionResult) {
        jh.c cVar;
        jh.c cVar2;
        if (connectionResult.f30732g == 0) {
            jh.f fVar = (jh.f) this.f22464b;
            fVar.getRemoteService(null, fVar.getScopes());
            return;
        }
        cVar = ((jh.f) this.f22464b).zzx;
        if (cVar != null) {
            cVar2 = ((jh.f) this.f22464b).zzx;
            cVar2.onConnectionFailed(connectionResult);
        }
    }

    @Override // g.a
    public final /* bridge */ /* synthetic */ void c(Object obj) {
    }

    public final void d(Object obj, String str) {
        ((StringBuilder) this.f22464b).append(str + '=' + obj);
        ((StringBuilder) this.f22464b).append("\n");
    }

    public final u1 e() {
        return ((r) this.f22464b).f29443q;
    }

    public final void f(Object obj) {
        switch (this.f22463a) {
            case 17:
                is1.i iVar = (is1.i) obj;
                LocationResult locationResult = (LocationResult) this.f22464b;
                if (locationResult != null) {
                    locationResult.e();
                }
                is1.l lVar = iVar.f73602a;
                lVar.getClass();
                if (locationResult != null) {
                    Location location = locationResult.e();
                    Intrinsics.checkNotNullExpressionValue(location, "getLastLocation(...)");
                    Intrinsics.checkNotNullParameter(location, "location");
                    float latitude = (float) location.getLatitude();
                    float longitude = (float) location.getLongitude();
                    if ((s.l(latitude, is1.m.f73634e) && s.l(longitude, is1.m.f73635f)) || ((s.l(latitude, is1.m.f73630a) && s.l(longitude, is1.m.f73631b)) || (s.l(latitude, is1.m.f73632c) && s.l(longitude, is1.m.f73633d)))) {
                        Location e13 = locationResult.e();
                        Intrinsics.checkNotNullExpressionValue(e13, "getLastLocation(...)");
                        String str = "lat=" + e13.getLatitude() + "&lon=" + e13.getLongitude();
                        uk.f fVar = (uk.f) uk.n.e(uk.g.f(iVar.f73604c.f125623a.toString())).c(uk.f.class);
                        Charset charset = Charsets.UTF_8;
                        byte[] bytes = str.getBytes(charset);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        byte[] bytes2 = "CtxInfo".getBytes(charset);
                        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                        String encodeToString = Base64.encodeToString(fVar.a(bytes, bytes2), 2);
                        float accuracy = e13.getAccuracy();
                        float verticalAccuracyMeters = e13.getVerticalAccuracyMeters();
                        float speed = e13.getSpeed();
                        Intrinsics.f(encodeToString);
                        iVar.f73603b.u(encodeToString, accuracy, verticalAccuracyMeters, speed).l(lVar.f73626g).h(lVar.f73627h).i(new r0(17), new c0(23, is1.j.f73611l));
                        break;
                    }
                }
                break;
            default:
                break;
        }
    }

    public final void g() {
        ke.c cVar = (ke.c) ((ke.b) this.f22464b);
        WebView webView = cVar.f79283a;
        if (webView == null) {
            Log.d("c", "AndroidRadar is missing a WebView to work with. This may be due to runtime requirements not being met or an exception occurring during WebView creation.");
            return;
        }
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        if (cVar.f79284b == null) {
            cVar.f79284b = new ke.a();
        }
        webView.setWebViewClient(cVar.f79284b);
        Locale.getDefault();
        Log.d("c", "Radar URL: ".concat("https://radar.cedexis.com/0/0/radar.html"));
        webView.loadUrl("https://radar.cedexis.com/0/0/radar.html");
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public final Executor getBackgroundExecutor() {
        return ((ab.f) this.f22464b).f1689a;
    }

    public final int h() {
        switch (this.f22463a) {
            case 21:
                return 1;
            case 22:
                return ((o5) this.f22464b).j();
            default:
                return ((u) this.f22464b).e();
        }
    }

    public final Object j() {
        n4 n4Var = (n4) this.f22464b;
        Cursor query = n4Var.f31546a.query(n4Var.f31547b, n4.f31545i, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map gVar = count <= 256 ? new g1.g(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                gVar.put(query.getString(0), query.getString(1));
            }
            query.close();
            return gVar;
        } finally {
            query.close();
        }
    }

    public final void k(int i13, double d2) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.getClass();
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2);
        q5Var.s(i13, 1);
        q5Var.e(doubleToRawLongBits);
    }

    public final void l(int i13, float f13) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.getClass();
        int floatToRawIntBits = Float.floatToRawIntBits(f13);
        q5Var.s(i13, 5);
        q5Var.d(floatToRawIntBits);
    }

    public final void m(int i13, int i14) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.s(i13, 0);
        q5Var.n(i14);
    }

    public final void n(int i13, long j13) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.s(i13, 1);
        q5Var.e(j13);
    }

    public final void o(int i13, o5 o5Var) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.s(i13, 2);
        q5Var.f(o5Var);
    }

    public final void p(int i13, n7 n7Var, Object obj) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.s(i13, 3);
        n7Var.f((a7) obj, q5Var.f31598c);
        q5Var.s(i13, 4);
    }

    public final void q(int i13, boolean z13) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.s(i13, 0);
        q5Var.c(z13 ? (byte) 1 : (byte) 0);
    }

    public final void r(qb qbVar, String str, List list, boolean z13, boolean z14) {
        int i13 = oi.n4.f94967a[qbVar.ordinal()];
        a4 a4Var = i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? ((k4) this.f22464b).zzj().f95274l : ((k4) this.f22464b).zzj().f95276n : z13 ? ((k4) this.f22464b).zzj().f95272j : !z14 ? ((k4) this.f22464b).zzj().f95273k : ((k4) this.f22464b).zzj().f95271i : z13 ? ((k4) this.f22464b).zzj().f95269g : !z14 ? ((k4) this.f22464b).zzj().f95270h : ((k4) this.f22464b).zzj().f95268f : ((k4) this.f22464b).zzj().f95275m;
        int size = list.size();
        if (size == 1) {
            a4Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            a4Var.a(list.get(0), list.get(1), str);
        } else if (size != 3) {
            a4Var.c(str);
        } else {
            a4Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public final void s(f5 f5Var, int i13) {
        oi.h hVar = oi.h.UNSET;
        if (i13 != -20) {
            if (i13 == -10) {
                hVar = oi.h.MANIFEST;
            } else if (i13 != 0) {
                if (i13 == 30) {
                    hVar = oi.h.INITIALIZATION;
                }
            }
            ((EnumMap) this.f22464b).put((EnumMap) f5Var, (f5) hVar);
        }
        hVar = oi.h.API;
        ((EnumMap) this.f22464b).put((EnumMap) f5Var, (f5) hVar);
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public final boolean shouldRunUiThreadStartUpTasks() {
        return ((ab.f) this.f22464b).f1690b;
    }

    public final void t(f5 f5Var, oi.h hVar) {
        ((EnumMap) this.f22464b).put((EnumMap) f5Var, (f5) hVar);
    }

    public final String toString() {
        char c13;
        switch (this.f22463a) {
            case 2:
                return ((StringBuilder) this.f22464b).toString();
            case 5:
                p1 p1Var = (p1) this.f22464b;
                return p1Var != null ? a.a.m("<", p1Var.n(), " id=\"", ((p1) this.f22464b).f75734c, "\">") : "";
            case 26:
                StringBuilder sb3 = new StringBuilder(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
                for (f5 f5Var : f5.values()) {
                    oi.h hVar = (oi.h) ((EnumMap) this.f22464b).get(f5Var);
                    if (hVar == null) {
                        hVar = oi.h.UNSET;
                    }
                    c13 = hVar.zzj;
                    sb3.append(c13);
                }
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public final void u(int i13, int i14) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.s(i13, 5);
        q5Var.d(i14);
    }

    public final void v(int i13, long j13) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.s(i13, 0);
        q5Var.o(j13);
    }

    public final void w(int i13, n7 n7Var, Object obj) {
        q5 q5Var = (q5) this.f22464b;
        a7 a7Var = (a7) obj;
        q5Var.s(i13, 2);
        q5Var.r(((g5) a7Var).a(n7Var));
        n7Var.f(a7Var, q5Var.f31598c);
    }

    public final void x(int i13, int i14) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.s(i13, 0);
        q5Var.n(i14);
    }

    public final void y(int i13, long j13) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.s(i13, 1);
        q5Var.e(j13);
    }

    public final void z(int i13, int i14) {
        q5 q5Var = (q5) this.f22464b;
        q5Var.s(i13, 5);
        q5Var.d(i14);
    }

    public /* synthetic */ p(SignInHubActivity signInHubActivity) {
        this.f22463a = 11;
        this.f22464b = signInHubActivity;
    }

    public /* synthetic */ p(AbstractSafeParcelable abstractSafeParcelable, int i13) {
        this.f22463a = i13;
        this.f22464b = abstractSafeParcelable;
    }

    public /* synthetic */ p(Object obj, int i13) {
        this.f22463a = i13;
        this.f22464b = obj;
    }

    public p(j4 j4Var) {
        this.f22463a = 27;
        com.bumptech.glide.d.t(j4Var);
        this.f22464b = j4Var;
    }

    public p(rh.a aVar) {
        this.f22463a = 25;
        com.bumptech.glide.d.t(aVar);
        this.f22464b = aVar;
    }

    public p(q5 q5Var) {
        this.f22463a = 21;
        Charset charset = c6.f31325a;
        if (q5Var != null) {
            this.f22464b = q5Var;
            q5Var.f31598c = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public p(EnumMap enumMap) {
        this.f22463a = 26;
        EnumMap enumMap2 = new EnumMap(f5.class);
        this.f22464b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public p(String str) {
        this.f22463a = 1;
        this.f22464b = new r(str);
    }

    public p(WebView webView) {
        this.f22463a = 6;
        ke.c cVar = new ke.c();
        cVar.f79283a = webView;
        webView.setVisibility(8);
        this.f22464b = cVar;
    }
}
