package iv1;

import android.content.Context;
import b60.d;
import com.pinterest.api.model.oc;
import com.pinterest.api.model.wy0;
import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb0.m;
import lb0.o;
import lh0.i2;
import m60.w;
import nx.c1;
import nx.d0;
import tb0.h;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final o f73731a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f73732b;

    /* renamed from: c, reason: collision with root package name */
    public final h f73733c;

    /* renamed from: d, reason: collision with root package name */
    public final w f73734d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f73735e;

    /* renamed from: f, reason: collision with root package name */
    public final b60.b f73736f;

    public b(o preferencesManager, i2 experiments, h crashReporting, w eventManager, Context applicationContext, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f73731a = preferencesManager;
        this.f73732b = experiments;
        this.f73733c = crashReporting;
        this.f73734d = eventManager;
        this.f73735e = applicationContext;
        this.f73736f = activeUserManager;
    }

    public final void a(f1 f1Var, oc ocVar, String str, String str2) {
        String uid;
        String f13;
        String e13;
        d0 a13 = c1.a();
        HashMap o13 = ep.b.o("repin_id", str2);
        if (ocVar != null && (e13 = ocVar.e()) != null) {
        }
        if (ocVar != null && (f13 = ocVar.f()) != null) {
        }
        if (ocVar != null) {
        }
        wy0 f14 = ((d) this.f73736f).f();
        if (f14 != null && (uid = f14.getUid()) != null) {
            o13.put("user_id", uid);
        }
        Unit unit = Unit.f80348a;
        a13.g(f1Var, str, o13, false);
    }

    public final void b(f1 eventType, oc clusterMatch, String repinId) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(clusterMatch, "clusterMatch");
        Intrinsics.checkNotNullParameter(repinId, "repinId");
        a(eventType, clusterMatch, repinId, repinId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0049, code lost:
    
        if ((java.lang.System.currentTimeMillis() - ((lb0.b) r20.f73731a).g("nrt_auto_org_last_opt_out_time", 0)) < 2592000000L) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.pinterest.api.model.oc r21, rg0.n r22, iv1.a r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: iv1.b.c(com.pinterest.api.model.oc, rg0.n, iv1.a, java.lang.String):boolean");
    }

    public final void d() {
        m c13 = ((lb0.b) this.f73731a).c();
        c13.putLong("nrt_auto_org_last_opt_out_time", System.currentTimeMillis());
        c13.commit();
    }
}
