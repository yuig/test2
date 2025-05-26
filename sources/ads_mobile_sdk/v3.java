package ads_mobile_sdk;

import android.os.Build;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class v3 {

    /* renamed from: a */
    public final String f12299a;

    /* renamed from: b */
    public a.m3 f12300b;

    /* renamed from: c */
    public int f12301c;

    /* renamed from: d */
    public long f12302d;

    public v3(String str) {
        a();
        this.f12299a = str;
        this.f12300b = new a.m3(null);
    }

    public final void a() {
        this.f12302d = System.nanoTime();
        this.f12301c = 1;
    }

    public void b() {
        this.f12300b.clear();
    }

    public void c() {
    }

    public void a(t3 t3Var, r3 r3Var) {
        a(t3Var, r3Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(t3 t3Var, r3 r3Var, JSONObject jSONObject) {
        String str;
        String str2 = t3Var.f11332g;
        JSONObject jSONObject2 = new JSONObject();
        wr1.a(jSONObject2, "environment", "app");
        wr1.a(jSONObject2, "adSessionType", r3Var.f10430h);
        JSONObject jSONObject3 = new JSONObject();
        wr1.a(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        wr1.a(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        wr1.a(jSONObject3, "os", "Android");
        wr1.a(jSONObject2, "deviceInfo", jSONObject3);
        int a13 = hr1.a();
        if (a13 == 1) {
            str = "ctv";
        } else if (a13 == 2) {
            str = "mobile";
        } else {
            if (a13 != 3) {
                throw null;
            }
            str = "other";
        }
        wr1.a(jSONObject2, "deviceCategory", str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        wr1.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        wr1.a(jSONObject4, "partnerName", r3Var.f10423a.f10818a);
        wr1.a(jSONObject4, "partnerVersion", r3Var.f10423a.f10819b);
        wr1.a(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        wr1.a(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        wr1.a(jSONObject5, "appId", yv0.f14420b.f14421a.getApplicationContext().getPackageName());
        wr1.a(jSONObject2, "app", jSONObject5);
        String str3 = r3Var.f10429g;
        if (str3 != null) {
            wr1.a(jSONObject2, "contentUrl", str3);
        }
        String str4 = r3Var.f10428f;
        if (str4 != null) {
            wr1.a(jSONObject2, "customReferenceData", str4);
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = Collections.unmodifiableList(r3Var.f10425c).iterator();
        if (!it.hasNext()) {
            fr1.f5252a.a((WebView) this.f12300b.get(), "startSession", str2, jSONObject2, jSONObject6, jSONObject);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void a(WebView webView) {
        this.f12300b = new a.m3(webView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(q3 q3Var) {
        fr1 fr1Var = fr1.f5252a;
        WebView webView = (WebView) this.f12300b.get();
        String str = this.f12299a;
        JSONObject jSONObject = new JSONObject();
        wr1.a(jSONObject, "impressionOwner", q3Var.f9917a);
        wr1.a(jSONObject, "mediaEventsOwner", q3Var.f9918b);
        wr1.a(jSONObject, "creativeType", q3Var.f9920d);
        wr1.a(jSONObject, "impressionType", q3Var.f9921e);
        wr1.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(q3Var.f9919c));
        fr1Var.a(webView, "init", jSONObject, str);
    }
}
