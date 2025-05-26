package or1;

import android.os.Build;
import com.pinterest.api.model.wy0;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.identity.core.error.UnauthException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kh2.k3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import nm.s;
import nm.u;
import nm.v;
import nx.d0;
import v.f1;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final vy.m f97255a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.e f97256b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f97257c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f97258d;

    /* renamed from: e, reason: collision with root package name */
    public final Regex f97259e;

    public i(vy.m analyticsApi, m60.e applicationInfo, b60.b activeUserManager, d0 pinalytics) {
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f97255a = analyticsApi;
        this.f97256b = applicationInfo;
        this.f97257c = activeUserManager;
        this.f97258d = pinalytics;
        this.f97259e = new Regex("[^a-zA-Z0-9\\-_./]");
    }

    public static void a(u uVar, NetworkResponseError networkResponseError) {
        f1 f1Var = networkResponseError.f45043a;
        if (f1Var != null) {
            uVar.s(Integer.valueOf(f1Var.f123449b), "status_code");
            qz.d M = k3.M(f1Var);
            if (M != null) {
                uVar.s(Integer.valueOf(M.f105387g), "api_error_code");
                String str = M.f105384d;
                if (str != null) {
                    uVar.u("api_error_message", str);
                }
            }
        }
    }

    public static HashMap c(String str, qr1.m mVar, boolean z13, Throwable th3, Integer num) {
        HashMap o13 = bs1.c.o(new Pair("auth_handler", str), new Pair("method", mVar.f105013a), new Pair("is_auto", String.valueOf(z13)));
        if (th3 != null) {
        }
        if (num != null) {
            o13.put("api_error_code", String.valueOf(num.intValue()));
        }
        return o13;
    }

    public static /* synthetic */ HashMap d(String str, qr1.m mVar, boolean z13, Throwable th3, Integer num, int i13) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        if ((i13 & 8) != 0) {
            th3 = null;
        }
        if ((i13 & 16) != 0) {
            num = null;
        }
        return c(str, mVar, z13, th3, num);
    }

    public static void l(i iVar, e logEvent, Throwable th3, int i13) {
        if ((i13 & 2) != 0) {
            th3 = null;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(logEvent, "logEvent");
        String j13 = a.a.j("client.events.user_lookup.", logEvent.getLogValue());
        u b13 = iVar.b(th3);
        Unit unit = Unit.f80348a;
        iVar.f(j13, b13, null);
    }

    public static String m(Throwable th3) {
        String name;
        String R;
        String valueOf = String.valueOf(k0.f80436a.b(th3.getClass()).e());
        Package r23 = th3.getClass().getPackage();
        return (r23 == null || (name = r23.getName()) == null || (R = StringsKt.R(name.concat("."), valueOf)) == null) ? valueOf : R;
    }

    public final u b(Throwable th3) {
        u uVar = new u();
        String lowerCase = hf0.b.a().name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        uVar.u("app", lowerCase);
        wy0 f13 = ((b60.d) this.f97257c).f();
        uVar.u("app_version", ((m60.d) this.f97256b).c(Boolean.valueOf(f13 != null ? Intrinsics.d(f13.z3(), Boolean.TRUE) : false)));
        uVar.u("os_version", "android_" + Build.VERSION.RELEASE);
        if (th3 != null) {
            uVar.u("error", m(th3));
            String message = th3.getMessage();
            if (message != null) {
                uVar.u("error_message", message);
            }
        }
        if (th3 instanceof NetworkResponseError) {
            a(uVar, (NetworkResponseError) th3);
        } else if (th3 instanceof UnauthException) {
            UnauthException unauthException = (UnauthException) th3;
            unauthException.a(uVar);
            Throwable cause = unauthException.getCause();
            NetworkResponseError networkResponseError = cause instanceof NetworkResponseError ? (NetworkResponseError) cause : null;
            if (networkResponseError != null) {
                a(uVar, networkResponseError);
            }
        }
        uVar.toString();
        return uVar;
    }

    public final void e(e logEvent, d mode, p modeHandler, Throwable th3) {
        Intrinsics.checkNotNullParameter(logEvent, "logEvent");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeHandler, "modeHandler");
        String j13 = a.a.j("client.events.authenticate.", logEvent.getLogValue());
        u b13 = b(th3);
        b13.u("mode", mode.getLogValue());
        b13.u("mode_handler", modeHandler.a());
        Unit unit = Unit.f80348a;
        f(j13, b13, null);
    }

    public final void f(String eventName, u tags, Map map) {
        Regex regex;
        String p13;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        nm.o oVar = vd0.c.f125622b;
        Set keySet = tags.f91366a.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "keySet(...)");
        Iterator it = ((pm.l) keySet).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            regex = this.f97259e;
            if (!hasNext) {
                break;
            }
            String str = (String) it.next();
            s v13 = tags.v(str);
            v13.getClass();
            if (!(v13 instanceof v)) {
                v13 = null;
            }
            if (v13 != null && (p13 = v13.p()) != null) {
                tags.u(str, regex.replace(p13, "_"));
            }
        }
        u uVar = new u();
        uVar.r("tags", tags);
        if (map != null) {
            Iterator it2 = b1.s(map).iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                uVar.u((String) entry.getKey(), regex.replace((String) entry.getValue(), "_"));
            }
        }
        TreeMap treeMap = new TreeMap();
        treeMap.put("aux_data", oVar.l(uVar));
        ((m60.d) this.f97256b).h();
        this.f97255a.k(eventName, treeMap);
    }

    public final void g(e logEvent, f mode, Throwable th3) {
        Intrinsics.checkNotNullParameter(logEvent, "logEvent");
        Intrinsics.checkNotNullParameter(mode, "mode");
        String j13 = a.a.j("client.events.keychain.", logEvent.getLogValue());
        u b13 = b(th3);
        b13.u("mode", mode.getLogValue());
        Unit unit = Unit.f80348a;
        f(j13, b13, null);
    }

    public final void h(e logEvent, d mode, p modeHandler, Throwable th3) {
        Intrinsics.checkNotNullParameter(logEvent, "logEvent");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeHandler, "modeHandler");
        String j13 = a.a.j("client.events.link_account.", logEvent.getLogValue());
        u b13 = b(th3);
        b13.u("mode", mode.getLogValue());
        b13.u("mode_handler", modeHandler.a());
        Unit unit = Unit.f80348a;
        f(j13, b13, null);
    }

    public final void i(String event, String action, String phase) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(phase, "phase");
        HashMap hashMap = new HashMap();
        hashMap.put("action", action);
        hashMap.put("phase", phase);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("tags", hashMap);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("aux_data", new nm.p().a().k(hashMap2));
        ((m60.d) this.f97256b).h();
        this.f97255a.k(event, hashMap3);
    }

    public final void j(g action, Throwable th3, Function1 function1) {
        Intrinsics.checkNotNullParameter(action, "action");
        u b13 = b(th3);
        b13.u("event_action", action.getLogValue());
        if (function1 != null) {
            function1.invoke(b13);
        }
        Unit unit = Unit.f80348a;
        f("client.events.identity.track", b13, null);
    }

    public final void k(e logEvent, String reason, Throwable th3) {
        Intrinsics.checkNotNullParameter(logEvent, "logEvent");
        Intrinsics.checkNotNullParameter(reason, "reason");
        String j13 = a.a.j("client.events.logout.", logEvent.getLogValue());
        u b13 = b(th3);
        b13.u("logout_reason", reason);
        Unit unit = Unit.f80348a;
        f(j13, b13, null);
    }
}
