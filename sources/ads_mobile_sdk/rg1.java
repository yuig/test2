package ads_mobile_sdk;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.quikkly.android.ui.CameraPreview;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class rg1 extends v3 {

    /* renamed from: e, reason: collision with root package name */
    public WebView f10610e;

    /* renamed from: f, reason: collision with root package name */
    public Long f10611f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f10612g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10613h;

    public rg1(String str, String str2, Map map) {
        super(str);
        this.f10611f = null;
        this.f10612g = map;
        this.f10613h = str2;
    }

    @Override // ads_mobile_sdk.v3
    public final void a(t3 t3Var, r3 r3Var) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap(r3Var.f10426d);
        Iterator it = unmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            unmodifiableMap.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        a(t3Var, r3Var, jSONObject);
    }

    @Override // ads_mobile_sdk.v3
    public final void b() {
        this.f12300b.clear();
        new Handler().postDelayed(new qg1(this), Math.max(4000 - (this.f10611f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f10611f.longValue(), TimeUnit.NANOSECONDS)), CameraPreview.AUTOFOCUS_INTERVAL_MILLIS));
        this.f10610e = null;
    }

    @Override // ads_mobile_sdk.v3
    public final void c() {
        WebView webView = new WebView(yv0.f14420b.f14421a);
        this.f10610e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f10610e.getSettings().setAllowContentAccess(false);
        this.f10610e.getSettings().setAllowFileAccess(false);
        this.f10610e.setWebViewClient(new pg1(this));
        this.f12300b = new a.m3(this.f10610e);
        fr1.a(this.f10610e, this.f10613h);
        Iterator it = this.f10612g.keySet().iterator();
        if (!it.hasNext()) {
            this.f10611f = Long.valueOf(System.nanoTime());
        } else {
            this.f10612g.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
    }
}
