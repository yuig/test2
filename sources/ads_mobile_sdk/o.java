package ads_mobile_sdk;

import a.w3;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o implements w3 {

    /* renamed from: f, reason: collision with root package name */
    public static final o f9079f = new o(new hg());

    /* renamed from: a, reason: collision with root package name */
    public final a.e5 f9080a = new a.e5();

    /* renamed from: b, reason: collision with root package name */
    public Date f9081b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9082c;

    /* renamed from: d, reason: collision with root package name */
    public final hg f9083d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9084e;

    public o(hg hgVar) {
        this.f9083d = hgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.w3
    public final void a(boolean z13) {
        if (!this.f9084e && z13) {
            this.f9080a.getClass();
            Date date = new Date();
            Date date2 = this.f9081b;
            if (date2 == null || date.after(date2)) {
                this.f9081b = date;
                if (this.f9082c) {
                    Iterator it = Collections.unmodifiableCollection(u3.f11813c.f11815b).iterator();
                    while (it.hasNext()) {
                        v3 v3Var = ((t3) it.next()).f11329d;
                        Date date3 = this.f9081b;
                        Date date4 = date3 != null ? (Date) date3.clone() : null;
                        v3Var.getClass();
                        if (date4 != null) {
                            JSONObject jSONObject = new JSONObject();
                            wr1.a(jSONObject, "timestamp", Long.valueOf(date4.getTime()));
                            fr1.f5252a.a((WebView) v3Var.f12300b.get(), "setLastActivity", jSONObject);
                        }
                    }
                }
            }
        }
        this.f9084e = z13;
    }
}
