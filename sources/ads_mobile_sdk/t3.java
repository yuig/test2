package ads_mobile_sdk;

import a.bc;
import a.r2;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t3 extends a.e9 {

    /* renamed from: a */
    public final r3 f11326a;

    /* renamed from: c */
    public r2 f11328c;

    /* renamed from: d */
    public v3 f11329d;

    /* renamed from: g */
    public final String f11332g;

    /* renamed from: b */
    public final yh0 f11327b = new yh0();

    /* renamed from: e */
    public boolean f11330e = false;

    /* renamed from: f */
    public boolean f11331f = false;

    public t3(q3 q3Var, r3 r3Var, String str) {
        this.f11326a = r3Var;
        this.f11332g = str;
        c();
        if (r3Var.a() == s3.f10908b || r3Var.a() == s3.f10909c) {
            WebView d2 = r3Var.d();
            bc bcVar = new bc(str);
            if (d2 != null && !d2.getSettings().getJavaScriptEnabled()) {
                d2.getSettings().setJavaScriptEnabled(true);
            }
            bcVar.a(d2);
            this.f11329d = bcVar;
        } else {
            this.f11329d = new rg1(str, r3Var.c(), r3Var.b());
        }
        this.f11329d.c();
        u3.a().a(this);
        this.f11329d.a(q3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.e9
    public final void a() {
        if (this.f11331f) {
            return;
        }
        this.f11328c.clear();
        if (!this.f11331f) {
            this.f11327b.f14246a.clear();
        }
        this.f11331f = true;
        v3 v3Var = this.f11329d;
        fr1.f5252a.a((WebView) v3Var.f12300b.get(), "finishSession", v3Var.f12299a);
        u3 u3Var = u3.f11813c;
        boolean z13 = u3Var.f11815b.size() > 0;
        u3Var.f11814a.remove(this);
        u3Var.f11815b.remove(this);
        if (z13 && u3Var.f11815b.size() <= 0) {
            fs1 a13 = fs1.a();
            a13.getClass();
            wt2 wt2Var = wt2.f13249g;
            wt2Var.getClass();
            Handler handler = wt2.f13251i;
            if (handler != null) {
                handler.removeCallbacks(wt2.f13253k);
                wt2.f13251i = null;
            }
            wt2Var.f13254a.clear();
            wt2.f13250h.post(new tt2(wt2Var));
            p3 p3Var = p3.f9528d;
            p3Var.f5949a = false;
            p3Var.f5951c = null;
            h90 h90Var = a13.f5272d;
            h90Var.f5891a.getContentResolver().unregisterContentObserver(h90Var);
        }
        this.f11329d.b();
        this.f11329d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.e9
    public final void b() {
        if (this.f11330e || this.f11329d == null) {
            return;
        }
        this.f11330e = true;
        u3 u3Var = u3.f11813c;
        boolean z13 = u3Var.f11815b.size() > 0;
        u3Var.f11815b.add(this);
        if (!z13) {
            fs1 a13 = fs1.a();
            a13.getClass();
            p3 p3Var = p3.f9528d;
            p3Var.f5951c = a13;
            p3Var.b();
            wt2.f13249g.getClass();
            if (wt2.f13251i == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                wt2.f13251i = handler;
                handler.post(wt2.f13252j);
                wt2.f13251i.postDelayed(wt2.f13253k, 200L);
            }
            h90 h90Var = a13.f5272d;
            h90Var.getClass();
            new Thread(new g90(h90Var)).start();
            h90Var.f5891a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, h90Var);
        }
        float f13 = fs1.a().f5269a;
        v3 v3Var = this.f11329d;
        fr1 fr1Var = fr1.f5252a;
        fr1Var.a((WebView) v3Var.f12300b.get(), "setDeviceVolume", Float.valueOf(f13), v3Var.f12299a);
        v3 v3Var2 = this.f11329d;
        Date date = o.f9079f.f9081b;
        Date date2 = date != null ? (Date) date.clone() : null;
        v3Var2.getClass();
        if (date2 != null) {
            JSONObject jSONObject = new JSONObject();
            wr1.a(jSONObject, "timestamp", Long.valueOf(date2.getTime()));
            fr1Var.a((WebView) v3Var2.f12300b.get(), "setLastActivity", jSONObject);
        }
        this.f11329d.a(this, this.f11326a);
    }

    public final void c() {
        this.f11328c = new r2(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.e9
    public final void a(View view) {
        if (this.f11331f || ((View) this.f11328c.get()) == view) {
            return;
        }
        this.f11328c = new r2(view);
        this.f11329d.a();
        Collection<t3> unmodifiableCollection = Collections.unmodifiableCollection(u3.f11813c.f11814a);
        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
            return;
        }
        for (t3 t3Var : unmodifiableCollection) {
            if (t3Var != this && ((View) t3Var.f11328c.get()) == view) {
                t3Var.f11328c.clear();
            }
        }
    }
}
