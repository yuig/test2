package vy;

import android.os.Build;
import com.pinterest.analytics.kibana.KibanaMetrics;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import ey.s1;
import java.text.DateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import le.t;
import m60.f0;
import nm.q;
import nm.u;
import t3.a0;
import t3.n1;
import xk2.v;

/* loaded from: classes.dex */
public final class m implements ox.b {

    /* renamed from: k, reason: collision with root package name */
    public static boolean f126873k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f126874l;

    /* renamed from: a, reason: collision with root package name */
    public final o f126877a;

    /* renamed from: b, reason: collision with root package name */
    public final o f126878b;

    /* renamed from: c, reason: collision with root package name */
    public final p f126879c;

    /* renamed from: d, reason: collision with root package name */
    public final p f126880d;

    /* renamed from: e, reason: collision with root package name */
    public final z10.a f126881e;

    /* renamed from: f, reason: collision with root package name */
    public final m60.e f126882f;

    /* renamed from: g, reason: collision with root package name */
    public final ob0.a f126883g;

    /* renamed from: h, reason: collision with root package name */
    public static final v f126870h = xk2.m.b(d.f126848j);

    /* renamed from: i, reason: collision with root package name */
    public static final n1 f126871i = new n1(6);

    /* renamed from: j, reason: collision with root package name */
    public static final ArrayList f126872j = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public static final v f126875m = xk2.m.b(d.f126850l);

    /* renamed from: n, reason: collision with root package name */
    public static final v f126876n = xk2.m.b(d.f126849k);

    public m(o authAnalyticsLoggingService, o unauthAnalyticsLoggingService, p authContextLoggingService, p unauthContextLoggingService, f0 authTokenProvider, m60.e applicationInfo, ob0.a crashReporter) {
        Intrinsics.checkNotNullParameter(authAnalyticsLoggingService, "authAnalyticsLoggingService");
        Intrinsics.checkNotNullParameter(unauthAnalyticsLoggingService, "unauthAnalyticsLoggingService");
        Intrinsics.checkNotNullParameter(authContextLoggingService, "authContextLoggingService");
        Intrinsics.checkNotNullParameter(unauthContextLoggingService, "unauthContextLoggingService");
        Intrinsics.checkNotNullParameter(authTokenProvider, "authTokenProvider");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        this.f126877a = authAnalyticsLoggingService;
        this.f126878b = unauthAnalyticsLoggingService;
        this.f126879c = authContextLoggingService;
        this.f126880d = unauthContextLoggingService;
        this.f126881e = authTokenProvider;
        this.f126882f = applicationInfo;
        this.f126883g = crashReporter;
    }

    public static HashMap c(m mVar, HashMap hashMap, Map map, int i13) {
        if ((i13 & 1) != 0) {
            hashMap = null;
        }
        if ((i13 & 2) != 0) {
            map = null;
        }
        mVar.getClass();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("platform", "android");
        pairArr[1] = new Pair("manufacturer", Build.MANUFACTURER);
        pairArr[2] = new Pair("device", Build.MODEL);
        String missingDelimiterValue = ((m60.d) mVar.f126882f).d();
        Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "getCurrentVersionNameFromCode(...)");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int M = StringsKt.M(missingDelimiterValue, '.', 0, 6);
        if (M != -1) {
            missingDelimiterValue = missingDelimiterValue.substring(0, M);
            Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "substring(...)");
        }
        pairArr[3] = new Pair("app_version", missingDelimiterValue);
        pairArr[4] = new Pair("os_version", Build.VERSION.RELEASE);
        HashMap f13 = z0.f(pairArr);
        if (map != null) {
            f13.putAll(map);
        }
        HashMap f14 = z0.f(new Pair("tags", f13));
        if (hashMap != null) {
            f14.putAll(hashMap);
        }
        return z0.f(new Pair("aux_data", new nm.p().a().k(f14)));
    }

    public static q d() {
        q qVar;
        synchronized (e.a()) {
            try {
                if (!e.a().isEmpty()) {
                    qVar = new q();
                    Iterator it = e.a().iterator();
                    while (it.hasNext()) {
                        qVar.t((u) it.next());
                    }
                    e.a().clear();
                } else {
                    qVar = null;
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return qVar;
    }

    public static re2.k e() {
        re2.k kVar;
        synchronized (e.b()) {
            try {
                if (!e.b().isEmpty()) {
                    kVar = new re2.k(CollectionsKt.F0(e.b()));
                    e.b().clear();
                } else {
                    kVar = null;
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return kVar;
    }

    public final void f(re2.k kVar, boolean z13) {
        List list;
        if (kVar == null || (list = kVar.f107720a) == null || list.isEmpty()) {
            return;
        }
        yk2.g builder = new yk2.g();
        DateFormat dateFormat = (DateFormat) f126871i.get();
        String format = dateFormat != null ? dateFormat.format(new Date()) : null;
        if (format == null) {
            format = "";
        }
        builder.put("Date", format);
        if (z13) {
            builder.put("X-B3-Flags", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        new kk2.m(new kk2.k(new t(kVar, 4), 1), new ir.j(7, new f(this, builder.c())), 0).r(tk2.e.f118017c).o(new mc.h(12, new g(0, this)), new mc.h(13, h.f126856j));
    }

    public final void g(q qVar) {
        if (qVar == null || qVar.f91364a.isEmpty()) {
            return;
        }
        new fk2.c(4, new kk2.k(new t(qVar, 3), 1), new ir.j(6, new g(1, this))).l(tk2.e.f118017c).i(new c(0), new mc.h(11, h.f126857k));
    }

    public final o h() {
        return this.f126881e.l() ? this.f126877a : this.f126878b;
    }

    public final void i(KibanaMetrics metrics, Function0 doAfterSend) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(doAfterSend, "doAfterSend");
        new kk2.h(new kk2.m(new kk2.k(new t(metrics, 2), 1), new ir.j(5, new k(this)), 0).r(tk2.e.f118017c), new b(0, doAfterSend), 0).o(new mc.h(9, h.f126858l), new mc.h(10, h.f126859m));
    }

    public final void j(List trace) {
        re2.k e13;
        Intrinsics.checkNotNullParameter(trace, "trace");
        ArrayDeque arrayDeque = s1.f60573a;
        synchronized (e.b()) {
            try {
                Iterator it = trace.iterator();
                while (it.hasNext()) {
                    e.b().add((re2.j) it.next());
                }
                if (e.b().size() >= 20 && (!e.b().isEmpty())) {
                    e13 = e();
                    Unit unit = Unit.f80348a;
                }
                e13 = null;
                Unit unit2 = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        f(e13, false);
    }

    public final void k(String event, Map params) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        e.c(new a0(2, new l(this, event, params, 0)), false);
    }

    public final void l(String event, Map params) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        e.c(new a0(2, new l(this, event, params, 1)), false);
    }
}
