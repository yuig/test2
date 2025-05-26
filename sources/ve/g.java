package ve;

import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.internal.p;
import df.v;
import df.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import le.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ql2.k;
import ql2.s;
import wc.j;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f125671a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f125672b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final List f125673c = f0.j("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: d, reason: collision with root package name */
    public static final List f125674d = f0.j("none", "address", "health");

    public static final File d(d task) {
        if (p001if.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            e eVar = (e) f125672b.get(task.toUseCase());
            if (eVar == null) {
                return null;
            }
            return eVar.f125667f;
        } catch (Throwable th3) {
            p001if.a.a(g.class, th3);
            return null;
        }
    }

    public static final String[] g(d task, float[][] denses, String[] texts) {
        if (p001if.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(denses, "denses");
            Intrinsics.checkNotNullParameter(texts, "texts");
            e eVar = (e) f125672b.get(task.toUseCase());
            b bVar = eVar == null ? null : eVar.f125668g;
            if (bVar == null) {
                return null;
            }
            float[] fArr = eVar.f125666e;
            int length = texts.length;
            int length2 = denses[0].length;
            a aVar = new a(new int[]{length, length2});
            if (length > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    System.arraycopy(denses[i13], 0, aVar.a(), i13 * length2, length2);
                    if (i14 >= length) {
                        break;
                    }
                    i13 = i14;
                }
            }
            a a13 = bVar.a(aVar, texts, task.toKey());
            if (a13 != null && fArr != null && a13.a().length != 0 && fArr.length != 0) {
                int i15 = f.f125670a[task.ordinal()];
                g gVar = f125671a;
                if (i15 == 1) {
                    return gVar.i(a13, fArr);
                }
                if (i15 == 2) {
                    return gVar.h(a13, fArr);
                }
                throw new NoWhenBranchMatchedException();
            }
            return null;
        } catch (Throwable th3) {
            p001if.a.a(g.class, th3);
            return null;
        }
    }

    public final void a(JSONObject jSONObject) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    e o13 = j.o(jSONObject.getJSONObject(keys.next()));
                    if (o13 != null) {
                        f125672b.put(o13.f125662a, o13);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void b() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String str = null;
            int i13 = 0;
            for (Map.Entry entry : f125672b.entrySet()) {
                String str2 = (String) entry.getKey();
                e eVar = (e) entry.getValue();
                if (Intrinsics.d(str2, d.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    String str3 = eVar.f125663b;
                    int max = Math.max(i13, eVar.f125665d);
                    y yVar = y.f54881a;
                    if (y.b(v.SuggestedEvents) && e()) {
                        eVar.f125669h = new p(5);
                        arrayList.add(eVar);
                    }
                    str = str3;
                    i13 = max;
                }
                if (Intrinsics.d(str2, d.MTML_INTEGRITY_DETECT.toUseCase())) {
                    str = eVar.f125663b;
                    i13 = Math.max(i13, eVar.f125665d);
                    y yVar2 = y.f54881a;
                    if (y.b(v.IntelligentIntegrity)) {
                        eVar.f125669h = new p(6);
                        arrayList.add(eVar);
                    }
                }
            }
            if (str == null || i13 <= 0 || arrayList.isEmpty()) {
                return;
            }
            j.r(new e("MTML", str, null, i13, null), arrayList);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final JSONObject c() {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            String str = a0.f83002j;
            a0 A = wc.b.A(null, "app/model_asset", null);
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            A.f83009d = bundle;
            JSONObject jSONObject = A.d().f83045b;
            if (jSONObject == null) {
                return null;
            }
            return f(jSONObject);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final boolean e() {
        Locale locale;
        if (p001if.a.b(this)) {
            return false;
        }
        try {
            try {
                locale = le.v.a().getResources().getConfiguration().locale;
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
                return false;
            }
        } catch (Exception unused) {
            locale = null;
        }
        if (locale != null) {
            String language = locale.getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "locale.language");
            if (!StringsKt.E(language, "en", false)) {
                return false;
            }
        }
        return true;
    }

    public final JSONObject f(JSONObject jSONObject) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                if (length <= 0) {
                    return jSONObject2;
                }
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i13);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                    if (i14 >= length) {
                        return jSONObject2;
                    }
                    i13 = i14;
                }
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final String[] h(a aVar, float[] fArr) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            int b13 = aVar.b(0);
            int b14 = aVar.b(1);
            float[] a13 = aVar.a();
            if (b14 != fArr.length) {
                return null;
            }
            IntRange q13 = s.q(0, b13);
            ArrayList arrayList = new ArrayList(g0.q(q13, 10));
            k it = q13.iterator();
            while (it.f104109c) {
                int b15 = it.b();
                Object obj = "none";
                int length = fArr.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length) {
                    int i15 = i14 + 1;
                    if (a13[(b15 * b14) + i14] >= fArr[i13]) {
                        obj = f125674d.get(i14);
                    }
                    i13++;
                    i14 = i15;
                }
                arrayList.add((String) obj);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final String[] i(a aVar, float[] fArr) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            int b13 = aVar.b(0);
            int b14 = aVar.b(1);
            float[] a13 = aVar.a();
            if (b14 != fArr.length) {
                return null;
            }
            IntRange q13 = s.q(0, b13);
            ArrayList arrayList = new ArrayList(g0.q(q13, 10));
            k it = q13.iterator();
            while (it.f104109c) {
                int b15 = it.b();
                Object obj = "other";
                int length = fArr.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length) {
                    int i15 = i14 + 1;
                    if (a13[(b15 * b14) + i14] >= fArr[i13]) {
                        obj = f125673c.get(i14);
                    }
                    i13++;
                    i14 = i15;
                }
                arrayList.add((String) obj);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }
}
