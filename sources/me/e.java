package me;

import android.os.Bundle;
import com.bugsnag.android.a0;
import com.facebook.FacebookException;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import df.u0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import le.g0;
import org.json.JSONException;
import org.json.JSONObject;
import t3.s1;

/* loaded from: classes3.dex */
public final class e implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final HashSet f86979f = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f86980a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86981b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f86982c;

    /* renamed from: d, reason: collision with root package name */
    public final String f86983d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86984e;

    public e(String contextName, String eventName, Double d2, Bundle bundle, boolean z13, boolean z14, UUID uuid) {
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f86981b = z13;
        this.f86982c = z14;
        this.f86983d = eventName;
        a0.n(eventName);
        JSONObject jSONObject = new JSONObject();
        xe.b bVar = xe.b.f134644a;
        String str = null;
        if (!p001if.a.b(xe.b.class)) {
            try {
                Intrinsics.checkNotNullParameter(eventName, "eventName");
                if (xe.b.f134645b) {
                    xe.b bVar2 = xe.b.f134644a;
                    if (!p001if.a.b(bVar2)) {
                        try {
                            if (xe.b.f134647d.contains(eventName)) {
                                eventName = "_removed_";
                            }
                        } catch (Throwable th3) {
                            p001if.a.a(bVar2, th3);
                        }
                    }
                }
                str = eventName;
            } catch (Throwable th4) {
                p001if.a.a(xe.b.class, th4);
            }
        }
        jSONObject.put("_eventName", str);
        jSONObject.put("_eventName_md5", a0.m(str));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", contextName);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            HashMap parameters = new HashMap();
            for (String key : bundle.keySet()) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                a0.n(key);
                Object obj = bundle.get(key);
                if (!(obj instanceof String) && !(obj instanceof Number)) {
                    throw new FacebookException(s1.d(new Object[]{obj, key}, 2, "Parameter value '%s' for key '%s' should be a string or a numeric type.", "java.lang.String.format(format, *args)"));
                }
                parameters.put(key, obj.toString());
            }
            if (!p001if.a.b(te.a.class)) {
                try {
                    Intrinsics.checkNotNullParameter(parameters, "parameters");
                    if (te.a.f117477b && !parameters.isEmpty()) {
                        try {
                            List<String> F0 = CollectionsKt.F0(parameters.keySet());
                            JSONObject jSONObject2 = new JSONObject();
                            for (String str2 : F0) {
                                Object obj2 = parameters.get(str2);
                                if (obj2 == null) {
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                                String str3 = (String) obj2;
                                te.a aVar = te.a.f117476a;
                                if (!aVar.b(str2) && !aVar.b(str3)) {
                                }
                                parameters.remove(str2);
                                if (!te.a.f117478c) {
                                    str3 = "";
                                }
                                jSONObject2.put(str2, str3);
                            }
                            if (jSONObject2.length() != 0) {
                                String jSONObject3 = jSONObject2.toString();
                                Intrinsics.checkNotNullExpressionValue(jSONObject3, "restrictiveParamJson.toString()");
                                parameters.put("_onDeviceParams", jSONObject3);
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th5) {
                    p001if.a.a(te.a.class, th5);
                }
            }
            xe.b bVar3 = xe.b.f134644a;
            boolean b13 = p001if.a.b(xe.b.class);
            String eventName2 = this.f86983d;
            if (!b13) {
                try {
                    Intrinsics.checkNotNullParameter(parameters, "parameters");
                    Intrinsics.checkNotNullParameter(eventName2, "eventName");
                    if (xe.b.f134645b) {
                        HashMap hashMap = new HashMap();
                        Iterator it = new ArrayList(parameters.keySet()).iterator();
                        while (it.hasNext()) {
                            String str4 = (String) it.next();
                            String a13 = xe.b.f134644a.a(eventName2, str4);
                            if (a13 != null) {
                                hashMap.put(str4, a13);
                                parameters.remove(str4);
                            }
                        }
                        if (!hashMap.isEmpty()) {
                            try {
                                JSONObject jSONObject4 = new JSONObject();
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    jSONObject4.put((String) entry.getKey(), (String) entry.getValue());
                                }
                                parameters.put("_restrictedParams", jSONObject4.toString());
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                } catch (Throwable th6) {
                    p001if.a.a(xe.b.class, th6);
                }
            }
            re.b bVar4 = re.b.f107532a;
            if (!p001if.a.b(re.b.class)) {
                try {
                    Intrinsics.checkNotNullParameter(parameters, "parameters");
                    Intrinsics.checkNotNullParameter(eventName2, "eventName");
                    if (re.b.f107533b) {
                        ArrayList arrayList = new ArrayList(parameters.keySet());
                        Iterator it2 = new ArrayList(re.b.f107534c).iterator();
                        while (it2.hasNext()) {
                            re.a aVar2 = (re.a) it2.next();
                            if (Intrinsics.d(aVar2.f107530a, eventName2)) {
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    String str5 = (String) it3.next();
                                    if (aVar2.f107531b.contains(str5)) {
                                        parameters.remove(str5);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th7) {
                    p001if.a.a(re.b.class, th7);
                }
            }
            for (String str6 : parameters.keySet()) {
                jSONObject.put(str6, parameters.get(str6));
            }
        }
        if (d2 != null) {
            jSONObject.put("_valueToSum", d2.doubleValue());
        }
        if (this.f86982c) {
            jSONObject.put("_inBackground", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
        }
        if (this.f86981b) {
            jSONObject.put("_implicitlyLogged", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
        } else {
            wc.b bVar5 = u0.f54860d;
            g0 g0Var = g0.APP_EVENTS;
            String jSONObject5 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject5, "eventObject.toString()");
            wc.b.y(g0Var, "AppEvents", "Created app event '%s'", jSONObject5);
        }
        this.f86980a = jSONObject;
        String jSONObject6 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject6, "jsonObject.toString()");
        this.f86984e = a0.m(jSONObject6);
    }

    private final Object writeReplace() {
        String jSONObject = this.f86980a.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        return new d(jSONObject, this.f86984e, this.f86981b, this.f86982c);
    }

    public final String toString() {
        JSONObject jSONObject = this.f86980a;
        return s1.d(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.f86981b), jSONObject.toString()}, 3, "\"%s\", implicit: %b, json: %s", "java.lang.String.format(format, *args)");
    }

    public e(String str, boolean z13, boolean z14, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f86980a = jSONObject;
        this.f86981b = z13;
        String optString = jSONObject.optString("_eventName");
        Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f86983d = optString;
        this.f86984e = str2;
        this.f86982c = z14;
    }
}
