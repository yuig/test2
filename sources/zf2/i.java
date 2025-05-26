package zf2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import ei2.k;
import ei2.q;
import ei2.v;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kg.p;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    public final v f141946a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f141947b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f141948c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f141949d;

    public i(v spanService, ii2.d versionChecker) {
        Intrinsics.checkNotNullParameter(spanService, "spanService");
        Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
        this.f141946a = spanService;
        this.f141947b = new ConcurrentHashMap();
        this.f141948c = new AtomicReference();
        Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
        Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
        this.f141949d = ((ii2.a) versionChecker).a(29);
    }

    public final void a(int i13, long j13, d dVar) {
        q qVar;
        h hVar = (h) this.f141947b.get(Integer.valueOf(i13));
        if (hVar == null || (qVar = (q) hVar.f141945d.get(dVar)) == null) {
            return;
        }
        ((k) qVar).s(null, Long.valueOf(j13));
    }

    public final void b(int i13, long j13, ErrorCode errorCode) {
        ConcurrentHashMap concurrentHashMap = this.f141947b;
        h hVar = (h) concurrentHashMap.get(Integer.valueOf(i13));
        if (hVar != null) {
            Collection values = hVar.f141945d.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : values) {
                if (((k) ((q) obj)).b()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((k) ((q) it.next())).s(errorCode, Long.valueOf(j13));
            }
            ((k) hVar.f141944c).s(errorCode, Long.valueOf(j13));
        }
    }

    public final void c(int i13, long j13, d dVar) {
        ConcurrentHashMap concurrentHashMap = this.f141947b;
        h hVar = (h) concurrentHashMap.get(Integer.valueOf(i13));
        if (hVar != null) {
            Map map = hVar.f141945d;
            if (map.containsKey(dVar)) {
                return;
            }
            String activityName = hVar.f141942a;
            String spanName = dVar.spanName(activityName);
            Long valueOf = Long.valueOf(j13);
            q c03 = p.c0(this.f141946a, spanName, null, hVar.f141944c, valueOf, null, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER);
            if (c03 != null) {
                Map children = z0.k(map, new Pair(dVar, c03));
                Integer valueOf2 = Integer.valueOf(i13);
                Intrinsics.checkNotNullParameter(activityName, "activityName");
                f traceCompleteTrigger = hVar.f141943b;
                Intrinsics.checkNotNullParameter(traceCompleteTrigger, "traceCompleteTrigger");
                q root = hVar.f141944c;
                Intrinsics.checkNotNullParameter(root, "root");
                Intrinsics.checkNotNullParameter(children, "children");
                concurrentHashMap.put(valueOf2, new h(activityName, traceCompleteTrigger, root, children));
            }
        }
    }

    public final void d(j jVar, int i13, String str, long j13, boolean z13) {
        ConcurrentHashMap concurrentHashMap = this.f141947b;
        if (concurrentHashMap.containsKey(Integer.valueOf(i13))) {
            return;
        }
        g gVar = (g) this.f141948c.getAndSet(new g(str, i13));
        if (gVar != null) {
            b(gVar.f141941b, j13, ErrorCode.USER_ABANDON);
        }
        q c03 = p.c0(this.f141946a, str + '-' + jVar.getTypeName() + "-time-to-initial-display", null, null, Long.valueOf(j13), xf2.g.f134861d, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE);
        if (c03 != null) {
            concurrentHashMap.put(Integer.valueOf(i13), new h(str, z13 ? f.MANUAL : f.RESUME, c03, new ConcurrentHashMap()));
        }
    }

    public final f e(int i13) {
        h hVar = (h) this.f141947b.get(Integer.valueOf(i13));
        if (hVar != null) {
            return hVar.f141943b;
        }
        return null;
    }
}
