package ln;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.internal.measurement.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import kh2.n;
import ll.j;
import m.h;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b implements in.a {

    /* renamed from: g, reason: collision with root package name */
    public static final b f83970g = new b();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f83971h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static Handler f83972i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final a f83973j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f83974k = new a(1);

    /* renamed from: f, reason: collision with root package name */
    public long f83980f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f83975a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f83976b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final c f83978d = new c();

    /* renamed from: c, reason: collision with root package name */
    public final bh.b f83977c = new bh.b(19);

    /* renamed from: e, reason: collision with root package name */
    public final x f83979e = new x(new h(22));

    public static void b() {
        Handler handler = f83972i;
        if (handler != null) {
            handler.removeCallbacks(f83974k);
            f83972i = null;
        }
    }

    public static void c() {
        if (f83972i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f83972i = handler;
            handler.post(f83973j);
            f83972i.postDelayed(f83974k, 200L);
        }
    }

    public final void a(View view, in.b bVar, JSONObject jSONObject) {
        String str;
        if (n.k(view) == null) {
            c cVar = this.f83978d;
            d dVar = cVar.f83984d.contains(view) ? d.PARENT_VIEW : cVar.f83990j ? d.OBSTRUCTION_VIEW : d.UNDERLYING_VIEW;
            if (dVar == d.UNDERLYING_VIEW) {
                return;
            }
            j jVar = (j) bVar;
            JSONObject a13 = jVar.a(view);
            kn.b.c(jSONObject, a13);
            HashMap hashMap = cVar.f83981a;
            if (hashMap.size() == 0) {
                str = null;
            } else {
                String str2 = (String) hashMap.get(view);
                if (str2 != null) {
                    hashMap.remove(view);
                }
                str = str2;
            }
            if (str == null) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(cVar.f83982b.get(view));
                jVar.b(view, a13, this, dVar == d.PARENT_VIEW);
                return;
            }
            try {
                a13.put("adSessionId", str);
            } catch (JSONException e13) {
                el.a.k("Error with setting ad session id", e13);
            }
            WeakHashMap weakHashMap = cVar.f83989i;
            if (weakHashMap.containsKey(view)) {
                weakHashMap.put(view, Boolean.TRUE);
            } else {
                r3 = true;
            }
            try {
                a13.put("hasWindowFocus", Boolean.valueOf(r3));
            } catch (JSONException e14) {
                el.a.k("Error with setting has window focus", e14);
            }
            boolean contains = cVar.f83988h.contains(str);
            Boolean valueOf = Boolean.valueOf(contains);
            if (contains) {
                try {
                    a13.put("isPipActive", valueOf);
                } catch (JSONException e15) {
                    el.a.k("Error with setting is picture-in-picture active", e15);
                }
            }
            cVar.f83990j = true;
        }
    }
}
