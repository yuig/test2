package ei2;

import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.g0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p implements nf2.l {

    /* renamed from: a, reason: collision with root package name */
    public final u f59028a;

    /* renamed from: b, reason: collision with root package name */
    public final n f59029b;

    /* renamed from: c, reason: collision with root package name */
    public final og2.a f59030c;

    public p(u spanRepository, n embraceTracer, og2.a clock) {
        Intrinsics.checkNotNullParameter(spanRepository, "spanRepository");
        Intrinsics.checkNotNullParameter(embraceTracer, "embraceTracer");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f59028a = spanRepository;
        this.f59029b = embraceTracer;
        this.f59030c = clock;
    }

    public final oi2.c a(Map map) {
        long now;
        Map map2;
        Object obj = map.get("name");
        Object obj2 = map.get("timestampMs");
        oi2.c cVar = null;
        Long l13 = obj2 instanceof Long ? (Long) obj2 : null;
        Object obj3 = map.get("timestampNanos");
        Long l14 = obj3 instanceof Long ? (Long) obj3 : null;
        Long valueOf = l14 != null ? Long.valueOf(TimeUnit.NANOSECONDS.toMillis(l14.longValue())) : null;
        Object obj4 = map.get("attributes");
        if (l13 == null && map.get("timestampMs") != null) {
            return null;
        }
        if (l13 != null) {
            now = l13.longValue();
        } else {
            if (valueOf == null) {
                if (map.get("timestampNanos") == null) {
                    now = this.f59030c.now();
                }
                return cVar;
            }
            now = valueOf.longValue();
        }
        if ((obj instanceof String) && (obj4 == null || (obj4 instanceof Map))) {
            String name = (String) obj;
            Map map3 = (Map) obj4;
            if (map3 != null) {
                Set entrySet = map3.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : entrySet) {
                    Map.Entry entry = (Map.Entry) obj5;
                    if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                        arrayList.add(obj5);
                    }
                }
                int a13 = y0.a(g0.q(arrayList, 10));
                if (a13 < 16) {
                    a13 = 16;
                }
                map2 = new LinkedHashMap(a13);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    map2.put(String.valueOf(entry2.getKey()), String.valueOf(entry2.getValue()));
                }
            } else {
                map2 = null;
            }
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(name, "name");
            if (name.length() <= 100 && (map2 == null || map2.size() <= 10)) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(now);
                if (map2 == null) {
                    map2 = z0.d();
                }
                cVar = new oi2.c(name, nanos, map2);
            }
        }
        return cVar;
    }

    @Override // nf2.l
    public final boolean addSpanAttribute(String spanId, String key, String value) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        oi2.b c13 = this.f59028a.c(spanId);
        if (c13 != null) {
            return ((k) c13).j(key, value);
        }
        return false;
    }

    @Override // nf2.l
    public final boolean addSpanEvent(String spanId, String name, Long l13, Map map) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(name, "name");
        oi2.b c13 = this.f59028a.c(spanId);
        if (c13 != null) {
            return ((k) c13).k(name, l13 != null ? Long.valueOf(kh2.w.q0(l13.longValue())) : null, map);
        }
        return false;
    }

    public final o b(String str) {
        oi2.b c13 = str != null ? this.f59028a.c(str) : null;
        return new o(c13, str == null || c13 != null);
    }

    @Override // nf2.l
    public final boolean recordCompletedSpan(String name, long j13, long j14, ErrorCode errorCode, String str, Map map, List list) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(name, "name");
        o b13 = b(str);
        if (!b13.f59026a) {
            return false;
        }
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                oi2.c a13 = a((Map) it.next());
                if (a13 != null) {
                    arrayList2.add(a13);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return this.f59029b.a(name, j13, j14, errorCode, b13.f59027b, map, arrayList);
    }

    @Override // nf2.l
    public final Object recordSpan(String name, String str, Map map, List list, Function0 code) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        o b13 = b(str);
        if (!b13.f59026a) {
            return code.invoke();
        }
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                oi2.c a13 = a((Map) it.next());
                if (a13 != null) {
                    arrayList.add(a13);
                }
            }
        } else {
            arrayList = null;
        }
        return this.f59029b.b(name, b13.f59027b, map, arrayList, oi2.a.NONE, code);
    }

    @Override // nf2.l
    public final String startSpan(String name, String str, Long l13) {
        Intrinsics.checkNotNullParameter(name, "name");
        o b13 = b(str);
        if (!b13.f59026a) {
            return null;
        }
        oi2.b c13 = this.f59029b.c(name, b13.f59027b, l13, oi2.a.NONE);
        if (c13 != null) {
            return ((k) c13).l();
        }
        return null;
    }

    @Override // nf2.l
    public final boolean stopSpan(String spanId, ErrorCode errorCode, Long l13) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        oi2.b c13 = this.f59028a.c(spanId);
        if (c13 != null) {
            return ((k) c13).s(errorCode, l13 != null ? Long.valueOf(kh2.w.q0(l13.longValue())) : null);
        }
        return false;
    }
}
