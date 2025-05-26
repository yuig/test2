package r61;

import i01.r0;
import java.util.LinkedHashMap;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import m60.d;
import m60.e;
import nm.o;
import pq2.c1;
import wj2.c;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static String f106334d;

    /* renamed from: a, reason: collision with root package name */
    public final q20.a f106335a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f106336b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f106337c;

    public b(q20.b mixpanelServiceFactory, e applicationInfo) {
        Intrinsics.checkNotNullParameter(mixpanelServiceFactory, "mixpanelServiceFactory");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        c1 c1Var = new c1();
        c1Var.c("https://api.mixpanel.com/");
        c1Var.b(mixpanelServiceFactory.f102121a);
        c1Var.a(new qq2.e());
        Object b13 = c1Var.d().b(q20.a.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        this.f106335a = (q20.a) b13;
        this.f106336b = new LinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f106337c = linkedHashMap;
        ((d) applicationInfo).h();
        linkedHashMap.put("token", "72995dba3fbf2d67ef0c4b4878307d34");
        linkedHashMap.put("platform", "android");
        linkedHashMap.put("internal_logging_version", "v2");
    }

    public final void a(long j13, String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        LinkedHashMap linkedHashMap = this.f106337c;
        if (j13 > 0) {
            linkedHashMap.put("duration", String.valueOf(j13 / 1000.0d));
        }
        linkedHashMap.put("time", String.valueOf(System.currentTimeMillis()));
        if (f106334d == null) {
            p.W();
        }
        String str = f106334d;
        Intrinsics.f(str);
        linkedHashMap.put("distinct_id", str);
        LinkedHashMap linkedHashMap2 = this.f106336b;
        linkedHashMap2.put("event", event);
        linkedHashMap2.put("properties", linkedHashMap);
        String k13 = new o().k(linkedHashMap2);
        Intrinsics.f(k13);
        this.f106335a.a(1, k13).l(tk2.e.f118017c).h(c.a()).i(new r0(5), new u51.b(9, a.f106333i));
    }
}
