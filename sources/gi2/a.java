package gi2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kh2.g2;
import kotlin.collections.g0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import nf2.o;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final o f65162a;

    /* renamed from: b, reason: collision with root package name */
    public final b f65163b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f65164c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f65165d;

    /* renamed from: e, reason: collision with root package name */
    public final v f65166e;

    public a(o systemInfo) {
        Intrinsics.checkNotNullParameter(systemInfo, "systemInfo");
        this.f65162a = systemInfo;
        this.f65163b = new b();
        this.f65164c = new ConcurrentHashMap();
        this.f65165d = new ConcurrentHashMap();
        this.f65166e = m.b(new g2(this, 6));
    }

    public final LinkedHashMap a() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f65164c) {
            try {
                Set entrySet = this.f65164c.entrySet();
                Intrinsics.checkNotNullExpressionValue(entrySet, "usageCountMap.entries");
                Set<Map.Entry> set = entrySet;
                int a13 = y0.a(g0.q(set, 10));
                if (a13 < 16) {
                    a13 = 16;
                }
                linkedHashMap = new LinkedHashMap(a13);
                for (Map.Entry entry : set) {
                    Object key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "it.key");
                    String str = (String) key;
                    Intrinsics.checkNotNullParameter(str, "<this>");
                    linkedHashMap.put("emb.usage." + str, String.valueOf(((Number) entry.getValue()).intValue()));
                }
                this.f65164c.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ConcurrentHashMap concurrentHashMap = this.f65165d;
        Map n13 = z0.n(concurrentHashMap);
        concurrentHashMap.clear();
        return z0.j(z0.j(linkedHashMap, n13), (Map) this.f65166e.getValue());
    }
}
