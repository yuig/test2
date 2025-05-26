package ei2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.k0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f59046a = new ConcurrentLinkedQueue();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f59047b = new AtomicReference(q0.f80391a);

    public final List a() {
        List list;
        synchronized (this.f59047b) {
            AtomicReference atomicReference = this.f59047b;
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f59046a;
            atomicReference.set(kg.n.i(concurrentLinkedQueue.size(), concurrentLinkedQueue));
            ConcurrentLinkedQueue concurrentLinkedQueue2 = this.f59046a;
            Object obj = this.f59047b.get();
            Intrinsics.checkNotNullExpressionValue(obj, "spansToFlush.get()");
            concurrentLinkedQueue2.removeAll(CollectionsKt.J0((Iterable) obj));
            Object obj2 = this.f59047b.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "spansToFlush.get()");
            list = (List) obj2;
        }
        return list;
    }

    public final zi2.c b(List spans) {
        Intrinsics.checkNotNullParameter(spans, "spans");
        try {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f59046a;
            List list = spans;
            ArrayList arrayList = new ArrayList(g0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kh2.n.k0((nj2.r) it.next()));
            }
            k0.u(arrayList, concurrentLinkedQueue);
            zi2.c cVar = zi2.c.f142036e;
            Intrinsics.checkNotNullExpressionValue(cVar, "ofSuccess()");
            return cVar;
        } catch (Throwable unused) {
            zi2.c cVar2 = zi2.c.f142037f;
            Intrinsics.checkNotNullExpressionValue(cVar2, "ofFailure()");
            return cVar2;
        }
    }
}
