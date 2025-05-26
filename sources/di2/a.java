package di2;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final yh2.a f55072a;

    /* renamed from: b, reason: collision with root package name */
    public final mg2.b f55073b;

    /* renamed from: c, reason: collision with root package name */
    public final ig2.b f55074c;

    public a(yh2.a memoryCleanerService, mg2.b userService, ig2.b sessionPropertiesService) {
        Intrinsics.checkNotNullParameter(memoryCleanerService, "memoryCleanerService");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(sessionPropertiesService, "sessionPropertiesService");
        this.f55072a = memoryCleanerService;
        this.f55073b = userService;
        this.f55074c = sessionPropertiesService;
    }

    public final void a(boolean z13) {
        yh2.a aVar = this.f55072a;
        Iterator it = CollectionsKt.F0(aVar.f139053b).iterator();
        while (it.hasNext()) {
            try {
                ((yh2.b) it.next()).c();
            } catch (Exception e13) {
                ((lh2.e) aVar.f139052a).b(lh2.g.MEMORY_CLEAN_LISTENER_FAIL, e13);
            }
        }
        ig2.a aVar2 = ((ig2.c) this.f55074c).f72250b;
        synchronized (aVar2.f72247e) {
            aVar2.f72246d.clear();
            Unit unit = Unit.f80348a;
        }
        if (z13) {
            mg2.a aVar3 = (mg2.a) this.f55073b;
            aVar3.d(null);
            aVar3.c(null);
            aVar3.e(null);
            aVar3.a();
        }
    }

    public final void b() {
        ig2.a aVar = ((ig2.c) this.f55074c).f72250b;
        for (Map.Entry entry : aVar.b().entrySet()) {
            ((ei2.a) aVar.f72245c).j(new vf2.d(ig1.b.m1((String) entry.getKey()), (String) entry.getValue()));
        }
    }
}
