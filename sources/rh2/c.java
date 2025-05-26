package rh2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import xk2.q;
import xk2.s;

/* loaded from: classes4.dex */
public final class c implements yh2.b {

    /* renamed from: a, reason: collision with root package name */
    public final sg2.a f108339a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f108340b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f108341c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f108342d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f108343e;

    /* renamed from: f, reason: collision with root package name */
    public int f108344f;

    /* renamed from: g, reason: collision with root package name */
    public LinkedHashMap f108345g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f108346h;

    public c(sg2.a configService) {
        Intrinsics.checkNotNullParameter(configService, "configService");
        this.f108339a = configService;
        this.f108340b = new ConcurrentHashMap();
        this.f108341c = new ConcurrentHashMap();
        this.f108342d = new AtomicInteger(0);
        this.f108343e = new AtomicInteger(0);
        sg2.b bVar = (sg2.b) configService;
        this.f108344f = bVar.f112883h.c();
        this.f108345g = bVar.f112883h.a();
        this.f108346h = new Object();
    }

    public final void a(String str) {
        ConcurrentHashMap concurrentHashMap;
        try {
            q qVar = s.f135225b;
            Iterator it = this.f108345g.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                concurrentHashMap = this.f108340b;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                int intValue = ((Number) entry.getValue()).intValue();
                if (z.h(str, str2, false)) {
                    concurrentHashMap.put(str, new b(intValue, str2));
                }
            }
            if (!concurrentHashMap.containsKey(str)) {
                concurrentHashMap.put(str, new b(this.f108344f, str));
            }
            Unit unit = Unit.f80348a;
            q qVar2 = s.f135225b;
        } catch (Throwable th3) {
            q qVar3 = s.f135225b;
            ue.c.m(th3);
        }
    }

    @Override // yh2.b
    public final void c() {
        synchronized (this.f108346h) {
            this.f108340b.clear();
            this.f108341c.clear();
            this.f108342d.set(0);
            this.f108343e.set(0);
            this.f108344f = ((sg2.b) this.f108339a).f112883h.c();
            this.f108345g = ((sg2.b) this.f108339a).f112883h.a();
            Unit unit = Unit.f80348a;
        }
    }
}
