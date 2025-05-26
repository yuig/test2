package jn;

import android.webkit.WebView;
import fn.i;
import hn.h;
import java.util.Date;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f77069a;

    /* renamed from: b, reason: collision with root package name */
    public nn.a f77070b;

    /* renamed from: c, reason: collision with root package name */
    public com.iab.omid.library.pinterest.adsession.media.b f77071c;

    /* renamed from: d, reason: collision with root package name */
    public com.iab.omid.library.pinterest.adsession.media.b f77072d;

    /* renamed from: e, reason: collision with root package name */
    public a f77073e;

    /* renamed from: f, reason: collision with root package name */
    public long f77074f;

    public b(String str) {
        g();
        this.f77069a = str;
        this.f77070b = new nn.a(null);
    }

    public final void a(float f13) {
        h.f69603a.a(j(), "setDeviceVolume", Float.valueOf(f13), this.f77069a);
    }

    public void b(i iVar, android.support.v4.media.a aVar) {
        c(iVar, aVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f0 A[LOOP:0: B:15:0x00ea->B:17:0x00f0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(fn.i r6, android.support.v4.media.a r7, org.json.JSONObject r8) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jn.b.c(fn.i, android.support.v4.media.a, org.json.JSONObject):void");
    }

    public final void d(String str, JSONObject jSONObject) {
        h.f69603a.a(j(), "publishMediaEvent", str, jSONObject, this.f77069a);
    }

    public final void e(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        kn.b.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        h.f69603a.a(j(), "setLastActivity", jSONObject);
    }

    public final void f(boolean z13) {
        if (this.f77070b.get() != 0) {
            h.f69603a.a(j(), "setState", z13 ? "foregrounded" : "backgrounded", this.f77069a);
        }
    }

    public final void g() {
        this.f77074f = System.nanoTime();
        this.f77073e = a.AD_STATE_IDLE;
    }

    public void h() {
        this.f77070b.clear();
    }

    public final void i(boolean z13) {
        if (this.f77070b.get() != 0) {
            h.f69603a.a(j(), "setDeviceLockState", z13 ? "locked" : "unlocked");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView j() {
        return (WebView) this.f77070b.get();
    }

    public void k() {
    }
}
