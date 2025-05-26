package le;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83023b;

    public /* synthetic */ c(Object obj, int i13) {
        this.f83022a = i13;
        this.f83023b = obj;
    }

    @Override // le.x
    public final void a(e0 response) {
        int i13 = this.f83022a;
        Boolean bool = null;
        Object obj = this.f83023b;
        switch (i13) {
            case 0:
                h0.i refreshResult = (h0.i) obj;
                Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
                Intrinsics.checkNotNullParameter(response, "response");
                JSONObject jSONObject = response.f83047d;
                if (jSONObject != null) {
                    refreshResult.f66408c = jSONObject.optString("access_token");
                    refreshResult.f66406a = jSONObject.optInt("expires_at");
                    refreshResult.f66407b = jSONObject.optInt("expires_in");
                    refreshResult.f66409d = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                    refreshResult.f66410e = jSONObject.optString("graph_domain", null);
                    break;
                }
                break;
            case 1:
                ep.b.A(obj);
                Intrinsics.checkNotNullParameter(response, "response");
                break;
            case 2:
                ff.d instrumentData = (ff.d) obj;
                Intrinsics.checkNotNullParameter(instrumentData, "$instrumentData");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    if (response.f83046c == null) {
                        JSONObject jSONObject2 = response.f83047d;
                        if (jSONObject2 != null) {
                            bool = Boolean.valueOf(jSONObject2.getBoolean("success"));
                        }
                        if (Intrinsics.d(bool, Boolean.TRUE)) {
                            kh2.m0.q(instrumentData.f62092a);
                            break;
                        }
                    }
                } catch (JSONException unused) {
                    return;
                }
                break;
            default:
                ArrayList validReports = (ArrayList) obj;
                Intrinsics.checkNotNullParameter(validReports, "$validReports");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    if (response.f83046c == null) {
                        JSONObject jSONObject3 = response.f83047d;
                        if (jSONObject3 != null) {
                            bool = Boolean.valueOf(jSONObject3.getBoolean("success"));
                        }
                        if (Intrinsics.d(bool, Boolean.TRUE)) {
                            Iterator it = validReports.iterator();
                            while (it.hasNext()) {
                                kh2.m0.q(((jf.a) it.next()).f75855a);
                            }
                            break;
                        }
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
        }
    }
}
