package ff;

import android.os.Build;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f62092a;

    /* renamed from: b, reason: collision with root package name */
    public b f62093b;

    /* renamed from: c, reason: collision with root package name */
    public JSONArray f62094c;

    /* renamed from: d, reason: collision with root package name */
    public String f62095d;

    /* renamed from: e, reason: collision with root package name */
    public String f62096e;

    /* renamed from: f, reason: collision with root package name */
    public String f62097f;

    /* renamed from: g, reason: collision with root package name */
    public Long f62098g;

    public final boolean a() {
        b bVar = this.f62093b;
        int i13 = bVar == null ? -1 : c.f62091a[bVar.ordinal()];
        Long l13 = this.f62098g;
        if (i13 != 1) {
            String str = this.f62097f;
            if (i13 != 2) {
                if ((i13 != 3 && i13 != 4 && i13 != 5) || str == null || l13 == null) {
                    return false;
                }
            } else if (str == null || this.f62096e == null || l13 == null) {
                return false;
            }
        } else if (this.f62094c == null || l13 == null) {
            return false;
        }
        return true;
    }

    public final void b() {
        if (a()) {
            m0.Z0(this.f62092a, toString());
        }
    }

    public final String toString() {
        b bVar = this.f62093b;
        int i13 = bVar == null ? -1 : c.f62091a[bVar.ordinal()];
        Long l13 = this.f62098g;
        JSONObject jSONObject = null;
        try {
            if (i13 == 1) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = this.f62094c;
                if (jSONArray != null) {
                    jSONObject2.put("feature_names", jSONArray);
                }
                if (l13 != null) {
                    jSONObject2.put("timestamp", l13);
                }
                jSONObject = jSONObject2;
            } else if (i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("device_os_version", Build.VERSION.RELEASE);
                jSONObject3.put("device_model", Build.MODEL);
                String str = this.f62095d;
                if (str != null) {
                    jSONObject3.put("app_version", str);
                }
                if (l13 != null) {
                    jSONObject3.put("timestamp", l13);
                }
                String str2 = this.f62096e;
                if (str2 != null) {
                    jSONObject3.put("reason", str2);
                }
                String str3 = this.f62097f;
                if (str3 != null) {
                    jSONObject3.put("callstack", str3);
                }
                if (bVar != null) {
                    jSONObject3.put("type", bVar);
                }
                jSONObject = jSONObject3;
            }
        } catch (JSONException unused) {
        }
        if (jSONObject == null) {
            String jSONObject4 = new JSONObject().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject4, "JSONObject().toString()");
            return jSONObject4;
        }
        String jSONObject5 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject5, "params.toString()");
        return jSONObject5;
    }
}
