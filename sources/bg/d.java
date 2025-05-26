package bg;

import android.content.Context;
import bb.p;
import bg.d;
import com.bugsnag.android.Breadcrumb;
import com.bugsnag.android.Severity;
import com.bugsnag.android.f2;
import com.bugsnag.android.g2;
import com.bugsnag.android.i1;
import com.bugsnag.android.j1;
import com.bugsnag.android.u2;
import com.bugsnag.android.x0;
import com.bugsnag.android.y1;
import com.github.mustachejava.MustacheNotFoundException;
import io.reactivex.exceptions.UndeliverableException;
import java.io.Reader;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lb0.n;
import tb0.o;
import tb0.r;

/* loaded from: classes3.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f22757a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f22758b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f22759c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22760d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f22761e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f22762f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22763g;

    /* renamed from: h, reason: collision with root package name */
    public Object f22764h;

    public d(r releaseStage) {
        Intrinsics.checkNotNullParameter("2bf6075d2aea98d30d4c992f2d8df241", "apiKey");
        Intrinsics.checkNotNullParameter(releaseStage, "releaseStage");
        this.f22758b = "2bf6075d2aea98d30d4c992f2d8df241";
        this.f22759c = releaseStage;
        this.f22760d = new LinkedHashMap();
        this.f22757a = 100;
        this.f22761e = "owner";
        this.f22762f = "product_flow";
        this.f22763g = "extra_values";
    }

    public final void a(String name, String variant) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(variant, "variant");
        ((Map) this.f22760d).put(name, new i1(name, variant));
        g2 d2 = d();
        if (d2 != null) {
            j1 j1Var = d2.f29369c;
            j1Var.f29285a.a(name, variant);
            if (j1Var.getObservers$bugsnag_android_core_release().isEmpty()) {
                return;
            }
            u2 u2Var = new u2(name, variant);
            Iterator<T> it = j1Var.getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((hd.m) it.next()).onStateChange(u2Var);
            }
        }
    }

    public final void b(String tabName, String keyName, Object value) {
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(value, "value");
        g2 d2 = d();
        if (d2 != null) {
            if (tabName == null || keyName == null) {
                d2.c("addMetadata");
                return;
            }
            y1 y1Var = d2.f29368b;
            y1Var.f29700a.a(tabName, keyName, value);
            y1Var.b(tabName, keyName, value);
        }
    }

    public final cg.c c(String str) {
        Map map = (Map) ((ThreadLocal) this.f22764h).get();
        cg.c cVar = (cg.c) map.get(str);
        if (cVar != null) {
            cVar.f27678l = true;
            return cVar;
        }
        try {
            j jVar = (j) this.f22761e;
            Reader d2 = ((k) ((d) jVar.f22774a).f22762f).d(str);
            if (d2 == null) {
                throw new MustacheNotFoundException(str);
            }
            cg.c a13 = jVar.a(d2, null, new AtomicInteger(0), str, "{{", "}}", true);
            map.put(str, a13);
            a13.a();
            return a13;
        } finally {
            map.remove(str);
        }
    }

    public final g2 d() {
        if (com.bugsnag.android.l.f29323b != null) {
            return (g2) this.f22764h;
        }
        return null;
    }

    public final void e(Context androidContext, tb0.d config, AtomicReference userCountry) {
        Intrinsics.checkNotNullParameter(androidContext, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        p config2 = new p((String) this.f22758b);
        r rVar = r.PRODUCTION;
        String namespace = rVar.getNamespace();
        r rVar2 = r.ALPHA;
        String namespace2 = rVar2.getNamespace();
        r rVar3 = r.OTA;
        String namespace3 = rVar3.getNamespace();
        r rVar4 = r.DEBUG;
        Set f13 = h1.f(namespace, namespace2, namespace3, rVar4.getNamespace());
        Object obj = config2.f22464b;
        ((com.bugsnag.android.r) obj).A = f13;
        ((com.bugsnag.android.r) obj).f29440n.f29672a = true;
        ((com.bugsnag.android.r) obj).f29440n.f29673b = true;
        ((com.bugsnag.android.r) obj).f29440n.f29674c = true;
        int i13 = d80.c.f53993a[((r) this.f22759c).ordinal()];
        if (i13 == 1) {
            ((com.bugsnag.android.r) config2.f22464b).f29433g = rVar2.getNamespace();
        } else if (i13 == 2) {
            ((com.bugsnag.android.r) config2.f22464b).f29433g = rVar3.getNamespace();
        } else if (i13 == 3) {
            ((com.bugsnag.android.r) config2.f22464b).f29433g = rVar.getNamespace();
        } else if (i13 == 4) {
            ((com.bugsnag.android.r) config2.f22464b).f29433g = rVar4.getNamespace();
        }
        int i14 = this.f22757a;
        if (i14 < 0 || i14 > 500) {
            config2.e().h("Invalid configuration value detected. Option maxBreadcrumbs should be an integer between 0-500. Supplied value is " + i14);
        } else {
            ((com.bugsnag.android.r) config2.f22464b).f29446t = i14;
        }
        ((com.bugsnag.android.r) config2.f22464b).f29438l = true;
        String str = (String) userCountry.get();
        if (str == null) {
            str = qb0.b.e(androidContext);
        }
        if (z.j(str)) {
            str = qb0.b.e(androidContext);
        }
        int i15 = 0;
        if (!z.j(str)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String W = df.j1.W(lowerCase, new Object[0]);
            y1 y1Var = ((com.bugsnag.android.r) config2.f22464b).f29430d;
            y1Var.f29700a.a("account", "user_set_country_code", W);
            y1Var.b("account", "user_set_country_code", W);
        }
        String str2 = (String) o.f117107n.get();
        if (str2 == null) {
            str2 = ((lb0.b) n.f82724c.a()).j("PREF_LAST_CRASH_API_STAGE", "");
        }
        if (str2 != null && z.j(str2)) {
            y1 y1Var2 = ((com.bugsnag.android.r) config2.f22464b).f29430d;
            y1Var2.f29700a.a("account", "api_release_stage", str2);
            y1Var2.b("account", "api_release_stage", str2);
        }
        int i16 = g2.C;
        m60.k kVar = config.f117071a;
        Intrinsics.checkNotNullParameter(androidContext, "androidContext");
        Intrinsics.checkNotNullParameter(config2, "config");
        g2 g2Var = new g2(androidContext, config2, kVar);
        com.bugsnag.android.l.f29323b = g2Var;
        this.f22764h = g2Var;
        g2 d2 = d();
        if (d2 != null) {
            d80.b bVar = new d80.b(this, i15);
            com.bugsnag.android.m mVar = d2.f29372f;
            if (mVar.f29333a.add(bVar)) {
                mVar.f29337e.M();
            }
        }
    }

    public final void f(String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        g2 d2 = d();
        if (d2 != null) {
            if (log == null) {
                d2.c("leaveBreadcrumb");
            } else {
                d2.f29378l.add(new Breadcrumb(log, d2.f29383q));
            }
        }
    }

    public final void g(Throwable t13, final tb0.p productFlow) {
        Intrinsics.checkNotNullParameter(t13, "t");
        Intrinsics.checkNotNullParameter(productFlow, "productFlow");
        g2 d2 = d();
        if (d2 != null) {
            d2.d(t13, new f2() { // from class: d80.a
                @Override // com.bugsnag.android.f2
                public final boolean a(x0 event) {
                    d this$0 = d.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    tb0.p productFlow2 = productFlow;
                    Intrinsics.checkNotNullParameter(productFlow2, "$productFlow");
                    Intrinsics.checkNotNullParameter(event, "event");
                    Severity severity = Severity.WARNING;
                    if (severity != null) {
                        event.f29685a.f29716a.f29417e = severity;
                    } else {
                        event.b("severity");
                    }
                    event.a((String) this$0.f22761e, (String) this$0.f22762f, productFlow2.toString());
                    return true;
                }
            });
        }
    }

    public final void h(UndeliverableException undeliverableException) {
        Intrinsics.checkNotNullParameter(undeliverableException, "undeliverableException");
        g2 d2 = d();
        if (d2 != null) {
            d2.d(undeliverableException, new d80.b(this, 1));
        }
    }

    public final void i() {
        Intrinsics.checkNotNullParameter("account", "tabName");
        Intrinsics.checkNotNullParameter("FeatureFlow", "keyName");
        g2 d2 = d();
        if (d2 != null) {
            y1 y1Var = d2.f29368b;
            Map map = y1Var.f29700a.f29687a;
            Map map2 = (Map) map.get("account");
            if (map2 != null) {
                map2.remove("FeatureFlow");
            }
            if (map2 == null || map2.isEmpty()) {
                map.remove("account");
            }
            y1Var.a("account", "FeatureFlow");
        }
    }

    public d() {
        this.f22758b = new ConcurrentHashMap();
        this.f22760d = new dg.g();
        this.f22761e = new j(this);
        this.f22759c = new ConcurrentHashMap();
        this.f22757a = 100;
        this.f22764h = ThreadLocal.withInitial(new b(0));
        this.f22762f = new androidx.appcompat.app.d(26);
    }
}
