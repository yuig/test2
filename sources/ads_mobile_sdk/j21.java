package ads_mobile_sdk;

import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j21 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l21 f6608a;

    public j21(l21 l21Var) {
        this.f6608a = l21Var;
    }

    public final void onPostMessage(WebView webView, ab.b bVar, Uri uri, boolean z13, ab.a aVar) {
        int i13 = bVar.f1687b;
        if (i13 != 0) {
            StringBuilder sb3 = new StringBuilder("Wrong data accessor type detected. ");
            sb3.append(i13 != 0 ? i13 != 1 ? "Unknown" : "ArrayBuffer" : "String");
            sb3.append(" expected, but got ");
            sb3.append("String");
            throw new IllegalStateException(sb3.toString());
        }
        try {
            JSONObject jSONObject = new JSONObject(bVar.f1686a);
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                this.f6608a.a(string2);
            } else if (string.equals("finishSession")) {
                l21 l21Var = this.f6608a;
                a.e9 e9Var = (a.e9) l21Var.f7624e.get(string2);
                if (e9Var != null) {
                    e9Var.a();
                    l21Var.f7624e.remove(string2);
                }
            }
        } catch (JSONException e13) {
            Log.e("OMIDLIB", "Error parsing JS message in JavaScriptSessionService.", e13);
        }
    }
}
