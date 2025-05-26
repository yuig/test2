package ze;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import df.j1;
import java.util.Iterator;
import le.a0;
import le.v;
import me.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f141799c = 0;

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f141800a;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f141801b;

    public static void a(Context context, String str, b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", "DEFERRED_APP_LINK");
            j1.z1(jSONObject, wc.b.q(context), l.f86994b.p(context), v.g(context), context);
            j1.A1(jSONObject, v.a());
            jSONObject.put("application_package_name", context.getPackageName());
            String C = a.a.C(str, "/activities");
            c cVar = null;
            try {
                String str2 = a0.f83002j;
                JSONObject jSONObject2 = wc.b.B(null, C, jSONObject, null).d().f83045b;
                if (jSONObject2 != null) {
                    String optString = jSONObject2.optString("applink_args");
                    long optLong = jSONObject2.optLong("click_time", -1L);
                    String optString2 = jSONObject2.optString("applink_class");
                    String optString3 = jSONObject2.optString("applink_url");
                    if (!TextUtils.isEmpty(optString) && (cVar = b(optString)) != null) {
                        if (optLong != -1) {
                            try {
                                JSONObject jSONObject3 = cVar.f141800a;
                                if (jSONObject3 != null) {
                                    jSONObject3.put("com.facebook.platform.APPLINK_TAP_TIME_UTC", optLong);
                                }
                                Bundle bundle = cVar.f141801b;
                                if (bundle != null) {
                                    bundle.putString("com.facebook.platform.APPLINK_TAP_TIME_UTC", Long.toString(optLong));
                                }
                            } catch (JSONException unused) {
                                v vVar = v.f83104a;
                            }
                        }
                        if (optString2 != null) {
                            try {
                                JSONObject jSONObject4 = cVar.f141800a;
                                if (jSONObject4 != null) {
                                    jSONObject4.put("com.facebook.platform.APPLINK_NATIVE_CLASS", optString2);
                                }
                                Bundle bundle2 = cVar.f141801b;
                                if (bundle2 != null) {
                                    bundle2.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", optString2);
                                }
                            } catch (JSONException unused2) {
                                v vVar2 = v.f83104a;
                            }
                        }
                        if (optString3 != null) {
                            try {
                                JSONObject jSONObject5 = cVar.f141800a;
                                if (jSONObject5 != null) {
                                    jSONObject5.put("com.facebook.platform.APPLINK_NATIVE_URL", optString3);
                                }
                                Bundle bundle3 = cVar.f141801b;
                                if (bundle3 != null) {
                                    bundle3.putString("com.facebook.platform.APPLINK_NATIVE_URL", optString3);
                                }
                            } catch (JSONException unused3) {
                                v vVar3 = v.f83104a;
                            }
                        }
                    }
                }
            } catch (Exception unused4) {
                v vVar4 = v.f83104a;
            }
            bVar.e(cVar);
        } catch (JSONException e13) {
            throw new FacebookException(e13);
        }
    }

    public static c b(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            if (jSONObject.getJSONObject("bridge_args").getString("method").equals("applink") && string.equals("2")) {
                c cVar = new c();
                JSONObject jSONObject2 = jSONObject.getJSONObject("method_args");
                cVar.f141800a = jSONObject2;
                if (jSONObject2.has("ref")) {
                    cVar.f141800a.getString("ref");
                } else if (cVar.f141800a.has("referer_data")) {
                    JSONObject jSONObject3 = cVar.f141800a.getJSONObject("referer_data");
                    if (jSONObject3.has("fb_ref")) {
                        jSONObject3.getString("fb_ref");
                    }
                }
                if (cVar.f141800a.has("target_url")) {
                    Uri parse = Uri.parse(cVar.f141800a.getString("target_url"));
                    if (!p001if.a.b(c.class) && parse != null) {
                        try {
                            String queryParameter = parse.getQueryParameter("al_applink_data");
                            if (queryParameter != null) {
                                try {
                                    new JSONObject(queryParameter);
                                } catch (JSONException unused) {
                                }
                            }
                        } catch (Throwable th3) {
                            p001if.a.a(c.class, th3);
                        }
                    }
                }
                if (cVar.f141800a.has("extras")) {
                    JSONObject jSONObject4 = cVar.f141800a.getJSONObject("extras");
                    if (jSONObject4.has("deeplink_context")) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("deeplink_context");
                        if (jSONObject5.has("promo_code")) {
                            jSONObject5.getString("promo_code");
                        }
                    }
                }
                cVar.f141801b = c(cVar.f141800a);
                return cVar;
            }
        } catch (FacebookException unused2) {
            v vVar = v.f83104a;
        } catch (JSONException unused3) {
            v vVar2 = v.f83104a;
        }
        return null;
    }

    public static Bundle c(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                bundle.putBundle(next, c((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i13 = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(next, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i13 < jSONArray.length()) {
                            bundleArr[i13] = c(jSONArray.getJSONObject(i13));
                            i13++;
                        }
                        bundle.putParcelableArray(next, bundleArr);
                    } else {
                        if (obj2 instanceof JSONArray) {
                            throw new FacebookException("Nested arrays are not supported.");
                        }
                        String[] strArr = new String[jSONArray.length()];
                        while (i13 < jSONArray.length()) {
                            strArr[i13] = jSONArray.get(i13).toString();
                            i13++;
                        }
                        bundle.putStringArray(next, strArr);
                    }
                }
            } else {
                bundle.putString(next, obj.toString());
            }
        }
        return bundle;
    }
}
