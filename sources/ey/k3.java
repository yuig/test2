package ey;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    public final pb0.a f60520a;

    /* renamed from: b, reason: collision with root package name */
    public final rd.j f60521b;

    /* renamed from: c, reason: collision with root package name */
    public final c4 f60522c;

    /* renamed from: d, reason: collision with root package name */
    public final String f60523d;

    /* renamed from: e, reason: collision with root package name */
    public final qb0.e f60524e;

    /* renamed from: f, reason: collision with root package name */
    public String f60525f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f60526g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayDeque f60527h;

    public k3(pb0.a clock, rd.j spanSubmitter, c4 networkCellTypeProvider, String versionName, qb0.e networkUtils, String str) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(spanSubmitter, "spanSubmitter");
        Intrinsics.checkNotNullParameter(networkCellTypeProvider, "networkCellTypeProvider");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(networkUtils, "networkUtils");
        this.f60520a = clock;
        this.f60521b = spanSubmitter;
        this.f60522c = networkCellTypeProvider;
        this.f60523d = versionName;
        this.f60524e = networkUtils;
        this.f60525f = str;
        this.f60526g = new HashMap();
        this.f60527h = new ArrayDeque(50);
    }

    public static void a(o1 stopWatch, s92.o pwtResult, s92.l pwtCause, h32.d4 d4Var, h32.a4 a4Var, long j13, boolean z13) {
        Intrinsics.checkNotNullParameter(stopWatch, "stopWatch");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        m60.f0 f0Var = vb0.j.f125466a;
        f0Var.R(stopWatch.a().f85170i, a.a.k("The stopwatch with the id [", stopWatch.f60548b, "] is not active. We can only complete from the top and active stop watch!!"), tb0.p.ANALYTICS_OVERVIEW, new Object[0]);
        if (pwtResult == s92.o.ERROR) {
            stopWatch.g();
        }
        try {
            if (z13) {
                stopWatch.p(j13);
            } else {
                stopWatch.n(j13);
            }
        } catch (StackOverflowError unused) {
            stopWatch.f();
        }
        ly1.f a13 = stopWatch.a();
        ArrayList arrayList = a13.f85166e;
        ArrayList arrayList2 = (arrayList == null || arrayList.isEmpty()) ? null : a13.f85166e;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                ep.b.A(it.next());
                throw null;
            }
        }
        Intrinsics.f(pwtCause);
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        Intrinsics.checkNotNullParameter(pwtCause, "pwtCause");
        stopWatch.k("pwt.cause", (short) pwtCause.getValue());
        stopWatch.k("pwt.result", (short) pwtResult.getValue());
        f0Var.R(d4Var != null, "viewType cannot be null!", tb0.p.UNSPECIFIED, new Object[0]);
        if (d4Var != null) {
            stopWatch.h(d4Var.getValue(), "view.type");
        }
        if (a4Var != null) {
            stopWatch.h(a4Var.getValue(), "view.parameter");
        }
    }

    public final o1 b(String metricName, String str, String str2) {
        Intrinsics.checkNotNullParameter(metricName, "metricName");
        return (o1) this.f60526g.get(m60.f0.U(metricName, str, str2));
    }
}
