package je0;

import android.app.Activity;
import android.net.Uri;
import androidx.appcompat.widget.x;
import df.j1;
import h32.f1;
import h32.j;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import nm.s;
import nm.u;
import nx.d0;
import pk.a0;
import vy.m;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f75830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f75831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f75832c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f75833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f75834e;

    public /* synthetic */ a(x xVar, Activity activity, String str, Uri uri, boolean z13) {
        this.f75830a = xVar;
        this.f75831b = activity;
        this.f75832c = str;
        this.f75833d = uri;
        this.f75834e = z13;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        x xVar = this.f75830a;
        b bVar = (b) xVar.f16708a;
        bVar.getClass();
        Activity activity = this.f75831b;
        b.b(activity);
        String j13 = ((lb0.b) bVar.f75835a.f75839a).j("PREF_INSTALL_REFERRER_LATEST", null);
        xVar.f16712e = j13 != null ? j1.p1(j13).i() : new u();
        Uri uri = this.f75833d;
        String str = "";
        String uri2 = uri != null ? uri.toString() : "";
        String str2 = this.f75832c;
        if (str2 == null) {
            ((HashMap) xVar.f16709b).put("full_url", uri2);
            xVar.u();
            u uVar = (u) xVar.f16712e;
            if (uVar != null) {
                s v13 = uVar.v("from_play_install_referrer_link");
                if (v13 == null || !v13.b()) {
                    ((HashMap) xVar.f16709b).put("app_start_source", j.WEB_URL.toString());
                    str = "app_start.weburl";
                } else {
                    ((HashMap) xVar.f16709b).put("app_start_source", j.DEEPLINK.toString());
                    str = "app_start.deeplink";
                }
            }
        } else if ("PUSH_NOTIF".equals(str2) || "PULL_NOTIF".equals(str2)) {
            ((HashMap) xVar.f16709b).put("app_start_source", j.NOTIFICATION.toString());
            str = "app_start.notification";
        }
        HashMap hashMap = (HashMap) xVar.f16709b;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        hashMap.put("theme", a0.q0(activity) ? "dark" : "light");
        ((HashMap) xVar.f16709b).put("powerscore", Double.toString(((kz1.a) xVar.f16713f).a()));
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("mweb_unauth_id");
            String queryParameter2 = uri.getQueryParameter("amp_client_id");
            if (!((HashMap) xVar.f16709b).containsKey("mweb_unauth_id") && !a0.x0(queryParameter)) {
                ((HashMap) xVar.f16709b).put("mweb_unauth_id", queryParameter);
            }
            if (!((HashMap) xVar.f16709b).containsKey("amp_client_id") && !a0.x0(queryParameter2)) {
                ((HashMap) xVar.f16709b).put("amp_client_id", queryParameter2);
            }
        }
        ((d0) xVar.f16710c).g(f1.APP_START, null, (HashMap) xVar.f16709b, false);
        if (this.f75834e) {
            m mVar = (m) xVar.f16711d;
            String concat = "android.".concat(str);
            m mVar2 = (m) xVar.f16711d;
            HashMap hashMap2 = (HashMap) xVar.f16709b;
            mVar2.getClass();
            mVar.l(concat, m.c(mVar2, hashMap2, null, 2));
        }
        return null;
    }
}
