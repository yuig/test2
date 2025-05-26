package fn;

import android.app.ActivityManager;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.app.z;
import bk.q;
import e2.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.a f62591a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f62592b;

    /* renamed from: c, reason: collision with root package name */
    public final hn.f f62593c;

    /* renamed from: d, reason: collision with root package name */
    public nn.a f62594d;

    /* renamed from: e, reason: collision with root package name */
    public jn.b f62595e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f62596f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f62597g;

    /* renamed from: h, reason: collision with root package name */
    public final String f62598h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f62599i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f62600j;

    public i(g0 g0Var, android.support.v4.media.a aVar) {
        jn.b cVar;
        String uuid = UUID.randomUUID().toString();
        this.f62593c = new hn.f();
        this.f62596f = false;
        this.f62597g = false;
        this.f62592b = g0Var;
        this.f62591a = aVar;
        this.f62598h = uuid;
        this.f62594d = new nn.a(null);
        a aVar2 = (a) aVar.f15844h;
        if (aVar2 == a.HTML || aVar2 == a.JAVASCRIPT) {
            WebView webView = (WebView) aVar.f15839c;
            cVar = new jn.c(uuid);
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            cVar.f77070b = new nn.a(webView);
        } else {
            cVar = new jn.d(uuid, (String) aVar.f15837a, Collections.unmodifiableMap((Map) aVar.f15841e));
        }
        this.f62595e = cVar;
        this.f62595e.k();
        hn.c.f69594c.f69595a.add(this);
        jn.b bVar = this.f62595e;
        hn.h hVar = hn.h.f69603a;
        WebView j13 = bVar.j();
        JSONObject jSONObject = new JSONObject();
        kn.b.b(jSONObject, "impressionOwner", (f) g0Var.f56857b);
        kn.b.b(jSONObject, "mediaEventsOwner", (f) g0Var.f56858c);
        kn.b.b(jSONObject, "creativeType", (b) g0Var.f56859d);
        kn.b.b(jSONObject, "impressionType", (d) g0Var.f56860e);
        kn.b.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(g0Var.f56856a));
        hVar.a(j13, "init", jSONObject, bVar.f77069a);
    }

    public static i b(g0 g0Var, android.support.v4.media.a aVar) {
        if (en.a.f59641a.f59642a) {
            return new i(g0Var, aVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a() {
        return (View) this.f62594d.get();
    }

    public final void c() {
        if (this.f62597g) {
            return;
        }
        this.f62594d.clear();
        if (!this.f62597g) {
            this.f62593c.f69600a.clear();
        }
        this.f62597g = true;
        jn.b bVar = this.f62595e;
        hn.h.f69603a.a(bVar.j(), "finishSession", bVar.f77069a);
        hn.c cVar = hn.c.f69594c;
        boolean z13 = cVar.f69596b.size() > 0;
        cVar.f69595a.remove(this);
        ArrayList arrayList = cVar.f69596b;
        arrayList.remove(this);
        if (z13 && arrayList.size() <= 0) {
            q b13 = q.b();
            b13.getClass();
            ln.b bVar2 = ln.b.f83970g;
            bVar2.getClass();
            ln.b.b();
            bVar2.f83975a.clear();
            ln.b.f83971h.post(new z(bVar2, 29));
            hn.b bVar3 = hn.b.f69593d;
            bVar3.f69597a = false;
            bVar3.f69599c = null;
            gn.a aVar = (gn.a) b13.f23108d;
            aVar.f65795a.getContentResolver().unregisterContentObserver(aVar);
        }
        this.f62595e.h();
        this.f62595e = null;
    }

    public final jn.b d() {
        return this.f62595e;
    }

    public final void e(View view) {
        if (this.f62597g || a() == view) {
            return;
        }
        this.f62594d = new nn.a(view);
        this.f62595e.g();
        Collection<i> unmodifiableCollection = Collections.unmodifiableCollection(hn.c.f69594c.f69595a);
        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
            return;
        }
        for (i iVar : unmodifiableCollection) {
            if (iVar != this && iVar.a() == view) {
                iVar.f62594d.clear();
            }
        }
    }

    public final void f() {
        if (this.f62596f || this.f62595e == null) {
            return;
        }
        this.f62596f = true;
        hn.c cVar = hn.c.f69594c;
        boolean z13 = cVar.f69596b.size() > 0;
        cVar.f69596b.add(this);
        if (!z13) {
            q b13 = q.b();
            b13.getClass();
            hn.b bVar = hn.b.f69593d;
            bVar.f69599c = b13;
            bVar.f69597a = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z14 = runningAppProcessInfo.importance == 100 || bVar.b();
            bVar.f69598b = z14;
            bVar.a(z14);
            ln.b.f83970g.getClass();
            ln.b.c();
            gn.a aVar = (gn.a) b13.f23108d;
            aVar.f65799e = aVar.a();
            aVar.b();
            aVar.f65795a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, aVar);
        }
        this.f62595e.a(q.b().f23105a);
        this.f62595e.e(hn.a.f69587f.b());
        this.f62595e.b(this, this.f62591a);
    }
}
