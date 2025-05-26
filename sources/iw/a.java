package iw;

import ew.n;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final pb0.a f73737a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f73738b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f73739c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f73740d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f73741e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f73742f;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f73743g;

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f73744h;

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f73745i;

    public a(pb0.a clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f73737a = clock;
        this.f73738b = new ConcurrentHashMap();
        this.f73739c = new ConcurrentHashMap();
        this.f73740d = new ConcurrentHashMap();
        this.f73741e = new ConcurrentHashMap();
        this.f73742f = new ConcurrentHashMap();
        this.f73743g = new ConcurrentHashMap();
        this.f73744h = new ConcurrentHashMap();
        this.f73745i = new ConcurrentHashMap();
    }

    public final void a(int i13, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ConcurrentHashMap concurrentHashMap = this.f73739c;
                Integer num = (Integer) concurrentHashMap.get(str);
                if (num == null) {
                    num = 0;
                }
                int intValue = num.intValue();
                Object obj = concurrentHashMap.get(str);
                if (obj == null && (obj = concurrentHashMap.putIfAbsent(str, 0)) == null) {
                    obj = 0;
                }
                concurrentHashMap.put(str, Integer.valueOf(intValue + i13));
            }
        }
    }

    public final void b(n surface, List adUnitIds) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(adUnitIds, "adUnitIds");
        this.f73740d.put(surface.name(), adUnitIds);
    }
}
