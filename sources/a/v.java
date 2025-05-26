package a;

import ads_mobile_sdk.an2;
import ads_mobile_sdk.fr1;
import ads_mobile_sdk.wr1;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class v extends ads_mobile_sdk.h {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f174f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(an2 an2Var, HashSet hashSet, JSONObject jSONObject, long j13, int i13) {
        super(an2Var, hashSet, jSONObject, j13);
        this.f174f = i13;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f174f) {
            case 0:
                if (wr1.c(this.f5773d, ((an2) this.f4009b).f2448a)) {
                    return null;
                }
                o0 o0Var = this.f4009b;
                JSONObject jSONObject = this.f5773d;
                ((an2) o0Var).f2448a = jSONObject;
                return jSONObject.toString();
            default:
                return this.f5773d.toString();
        }
    }

    @Override // ads_mobile_sdk.cr1, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f174f) {
            case 0:
                onPostExecute((String) obj);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.cr1
    public final void onPostExecute(String str) {
        ads_mobile_sdk.u3 u3Var;
        switch (this.f174f) {
            case 0:
                if (!TextUtils.isEmpty(str) && (u3Var = ads_mobile_sdk.u3.f11813c) != null) {
                    for (ads_mobile_sdk.t3 t3Var : Collections.unmodifiableCollection(u3Var.f11814a)) {
                        if (this.f5772c.contains(t3Var.f11332g)) {
                            ads_mobile_sdk.v3 v3Var = t3Var.f11329d;
                            if (this.f5774e >= v3Var.f12302d) {
                                v3Var.f12301c = 2;
                                fr1.f5252a.a((WebView) v3Var.f12300b.get(), "setNativeViewHierarchy", str, v3Var.f12299a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
            default:
                ads_mobile_sdk.u3 u3Var2 = ads_mobile_sdk.u3.f11813c;
                if (u3Var2 != null) {
                    for (ads_mobile_sdk.t3 t3Var2 : Collections.unmodifiableCollection(u3Var2.f11814a)) {
                        if (this.f5772c.contains(t3Var2.f11332g)) {
                            ads_mobile_sdk.v3 v3Var2 = t3Var2.f11329d;
                            if (this.f5774e >= v3Var2.f12302d && v3Var2.f12301c != 3) {
                                v3Var2.f12301c = 3;
                                fr1.f5252a.a((WebView) v3Var2.f12300b.get(), "setNativeViewHierarchy", str, v3Var2.f12299a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }
}
