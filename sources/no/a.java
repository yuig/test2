package no;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f91651a;

    public a() {
        JSONObject jSONObject = new JSONObject();
        this.f91651a = jSONObject;
        a(0, "autoplay");
        a(0, "controls");
        a(1, "enablejsapi");
        a(0, "fs");
        try {
            jSONObject.put("origin", "https://www.youtube.com");
            a(0, "rel");
            a(0, "showinfo");
            a(3, "iv_load_policy");
            a(1, "modestbranding");
            a(0, "cc_load_policy");
        } catch (JSONException unused) {
            throw new RuntimeException("Illegal JSON value origin: https://www.youtube.com");
        }
    }

    public final void a(int i13, String str) {
        try {
            this.f91651a.put(str, i13);
        } catch (JSONException unused) {
            throw new RuntimeException("Illegal JSON value " + str + ": " + i13);
        }
    }
}
