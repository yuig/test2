package ye;

import android.content.SharedPreferences;
import android.view.View;
import df.j1;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import le.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qe.h;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static SharedPreferences f138821c;

    /* renamed from: a, reason: collision with root package name */
    public static final b f138819a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f138820b = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f138822d = new AtomicBoolean(false);

    public static final void a(String pathID, String predictedEvent) {
        if (p001if.a.b(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(pathID, "pathID");
            Intrinsics.checkNotNullParameter(predictedEvent, "predictedEvent");
            if (!f138822d.get()) {
                f138819a.c();
            }
            LinkedHashMap linkedHashMap = f138820b;
            linkedHashMap.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = f138821c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", j1.m1(z0.n(linkedHashMap))).apply();
            } else {
                Intrinsics.r("shardPreferences");
                throw null;
            }
        } catch (Throwable th3) {
            p001if.a.a(b.class, th3);
        }
    }

    public static final String b(View view, String text) {
        if (p001if.a.b(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = h.h(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return j1.C1(jSONObject.toString());
        } catch (Throwable th3) {
            p001if.a.a(b.class, th3);
            return null;
        }
    }

    public final void c() {
        String str = "";
        if (p001if.a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f138822d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = v.a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            f138821c = sharedPreferences;
            LinkedHashMap linkedHashMap = f138820b;
            if (sharedPreferences == null) {
                Intrinsics.r("shardPreferences");
                throw null;
            }
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            linkedHashMap.putAll(j1.i1(str));
            atomicBoolean.set(true);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
