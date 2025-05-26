package gf;

import ff.d;
import java.util.Iterator;
import java.util.List;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;
import le.e0;
import le.x;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f64863b;

    public /* synthetic */ b(List list, int i13) {
        this.f64862a = i13;
        this.f64863b = list;
    }

    @Override // le.x
    public final void a(e0 response) {
        int i13 = this.f64862a;
        Boolean bool = null;
        List validReports = this.f64863b;
        switch (i13) {
            case 0:
                if (!p001if.a.b(c.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(validReports, "$validReports");
                        Intrinsics.checkNotNullParameter(response, "response");
                        try {
                            if (response.f83046c == null) {
                                JSONObject jSONObject = response.f83047d;
                                if (jSONObject != null) {
                                    bool = Boolean.valueOf(jSONObject.getBoolean("success"));
                                }
                                if (Intrinsics.d(bool, Boolean.TRUE)) {
                                    Iterator it = validReports.iterator();
                                    while (it.hasNext()) {
                                        m0.q(((d) it.next()).f62092a);
                                    }
                                    break;
                                }
                            }
                        } catch (JSONException unused) {
                            return;
                        }
                    } catch (Throwable th3) {
                        p001if.a.a(c.class, th3);
                        return;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(validReports, "$validReports");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    if (response.f83046c == null) {
                        JSONObject jSONObject2 = response.f83047d;
                        if (jSONObject2 != null) {
                            bool = Boolean.valueOf(jSONObject2.getBoolean("success"));
                        }
                        if (Intrinsics.d(bool, Boolean.TRUE)) {
                            Iterator it2 = validReports.iterator();
                            while (it2.hasNext()) {
                                m0.q(((d) it2.next()).f62092a);
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
