package ads_mobile_sdk;

import a.cf;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class wt2 implements cf {

    /* renamed from: g, reason: collision with root package name */
    public static final wt2 f13249g = new wt2();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f13250h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static Handler f13251i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final a.ae f13252j = new a.ae();

    /* renamed from: k, reason: collision with root package name */
    public static final a.me f13253k = new a.me();

    /* renamed from: f, reason: collision with root package name */
    public long f13259f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13254a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13255b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final g6 f13257d = new g6();

    /* renamed from: c, reason: collision with root package name */
    public final l12 f13256c = new l12();

    /* renamed from: e, reason: collision with root package name */
    public final an2 f13258e = new an2(new dr1());

    public final void a(View view, a.rf rfVar, JSONObject jSONObject, boolean z13) {
        Object obj;
        boolean z14;
        if (ph.a.c(view) == null) {
            g6 g6Var = this.f13257d;
            char c13 = g6Var.f5453d.contains(view) ? (char) 1 : g6Var.f5459j ? (char) 2 : (char) 3;
            if (c13 == 3) {
                return;
            }
            JSONObject a13 = rfVar.a(view);
            wr1.a(jSONObject, a13);
            g6 g6Var2 = this.f13257d;
            if (g6Var2.f5450a.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) g6Var2.f5450a.get(view);
                if (obj2 != null) {
                    g6Var2.f5450a.remove(view);
                }
                obj = obj2;
            }
            boolean z15 = false;
            if (obj != null) {
                try {
                    a13.put("adSessionId", obj);
                } catch (JSONException e13) {
                    Log.e("OMIDLIB", "Error with setting ad session id", e13);
                }
                g6 g6Var3 = this.f13257d;
                if (g6Var3.f5458i.containsKey(view)) {
                    g6Var3.f5458i.put(view, Boolean.TRUE);
                } else {
                    z15 = true;
                }
                try {
                    a13.put("hasWindowFocus", Boolean.valueOf(z15));
                } catch (JSONException e14) {
                    Log.e("OMIDLIB", "Error with setting has window focus", e14);
                }
                boolean contains = this.f13257d.f5457h.contains(obj);
                Object valueOf = Boolean.valueOf(contains);
                if (contains) {
                    try {
                        a13.put("isPipActive", valueOf);
                    } catch (JSONException e15) {
                        Log.e("OMIDLIB", "Error with setting is picture-in-picture active", e15);
                    }
                }
                this.f13257d.f5459j = true;
                return;
            }
            g6 g6Var4 = this.f13257d;
            f6 f6Var = (f6) g6Var4.f5451b.get(view);
            if (f6Var != null) {
                g6Var4.f5451b.remove(view);
            }
            if (f6Var != null) {
                wh0 wh0Var = f6Var.f5063a;
                JSONArray jSONArray = new JSONArray();
                Iterator it = f6Var.f5064b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                try {
                    a13.put("isFriendlyObstructionFor", jSONArray);
                    a13.put("friendlyObstructionClass", wh0Var.f13040b);
                    a13.put("friendlyObstructionPurpose", wh0Var.f13041c);
                    a13.put("friendlyObstructionReason", wh0Var.f13042d);
                } catch (JSONException e16) {
                    Log.e("OMIDLIB", "Error with setting friendly obstruction", e16);
                }
                z14 = true;
            } else {
                z14 = false;
            }
            rfVar.a(view, a13, this, c13 == 1, z13 || z14);
        }
    }
}
