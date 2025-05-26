package jg;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.appcompat.widget.c2;
import com.appsflyer.AdRevenueScheme;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kg.c;
import kg.e;
import kg.f;
import kg.h;
import kg.i;
import kg.j;
import kg.k;
import kg.l;
import kg.m;
import kg.n;
import kg.o;
import kg.p;
import kg.q;
import kg.r;
import kg.s;
import kg.t;
import mg.g;
import xl.d;

/* loaded from: classes3.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f75895a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f75896b;

    public b(Context context) {
        d dVar = new d();
        c cVar = c.f79370a;
        dVar.a(n.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f79373a;
        dVar.a(q.class, fVar);
        dVar.a(l.class, fVar);
        kg.d dVar2 = kg.d.f79371a;
        dVar.a(o.class, dVar2);
        dVar.a(j.class, dVar2);
        kg.b bVar = kg.b.f79369a;
        dVar.a(kg.a.class, bVar);
        dVar.a(h.class, bVar);
        e eVar = e.f79372a;
        dVar.a(p.class, eVar);
        dVar.a(k.class, eVar);
        kg.g gVar = kg.g.f79374a;
        dVar.a(t.class, gVar);
        dVar.a(m.class, gVar);
        this.f75896b = context;
        this.f75895a = (ConnectivityManager) context.getSystemService("connectivity");
        String str = a.f75890c;
        try {
            new URL(str);
        } catch (MalformedURLException e13) {
            throw new IllegalArgumentException(a.a.j("Invalid url: ", str), e13);
        }
    }

    public final lg.a a(lg.a aVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f75895a.getActiveNetworkInfo();
        aVar.getClass();
        c2 c2Var = new c2(7);
        String str = aVar.f83172a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c2Var.f16531b = str;
        c2Var.f16532c = aVar.f83173b;
        lg.e eVar = aVar.f83174c;
        if (eVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c2Var.f16533d = eVar;
        c2Var.f16534e = Long.valueOf(aVar.f83175d);
        c2Var.f16535f = Long.valueOf(aVar.f83176e);
        HashMap hashMap = new HashMap(aVar.f83177f);
        c2Var.f16536g = hashMap;
        hashMap.put("sdk-version", String.valueOf(Build.VERSION.SDK_INT));
        c2Var.a("model", Build.MODEL);
        c2Var.a("hardware", Build.HARDWARE);
        c2Var.a("device", Build.DEVICE);
        c2Var.a("product", Build.PRODUCT);
        c2Var.a("os-uild", Build.ID);
        c2Var.a("manufacturer", Build.MANUFACTURER);
        c2Var.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        Map map = (Map) c2Var.f16536g;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("tz-offset", String.valueOf(offset));
        int value = activeNetworkInfo == null ? s.NONE.getValue() : activeNetworkInfo.getType();
        Map map2 = (Map) c2Var.f16536g;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("net-type", String.valueOf(value));
        int i13 = -1;
        if (activeNetworkInfo == null) {
            subtype = r.UNKNOWN_MOBILE_SUBTYPE.getValue();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = r.COMBINED.getValue();
            } else if (r.forNumber(subtype) == null) {
                subtype = 0;
            }
        }
        Map map3 = (Map) c2Var.f16536g;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("mobile-subtype", String.valueOf(subtype));
        c2Var.a(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
        c2Var.a("locale", Locale.getDefault().getLanguage());
        Context context = this.f75896b;
        c2Var.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
        try {
            i13 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e13) {
            String concat = "TRuntime.".concat("CctTransportBackend");
            if (Log.isLoggable(concat, 6)) {
                Log.e(concat, "Unable to find version code for package", e13);
            }
        }
        c2Var.a("application_build", Integer.toString(i13));
        return c2Var.e();
    }
}
