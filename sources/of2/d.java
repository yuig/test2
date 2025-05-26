package of2;

import io.embrace.android.embracesdk.internal.config.remote.AnrRemoteConfig;
import io.embrace.android.embracesdk.internal.payload.ThreadInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import mc2.k;

/* loaded from: classes4.dex */
public final class d implements e, yh2.b {

    /* renamed from: a, reason: collision with root package name */
    public final sg2.a f94419a;

    /* renamed from: b, reason: collision with root package name */
    public final og2.a f94420b;

    /* renamed from: c, reason: collision with root package name */
    public final ki2.a f94421c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f94422d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f94423e;

    /* renamed from: f, reason: collision with root package name */
    public long f94424f;

    /* renamed from: g, reason: collision with root package name */
    public final k f94425g;

    public d(sg2.a configService, og2.a clock, Thread targetThread, ki2.a anrMonitorWorker) {
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(targetThread, "targetThread");
        Intrinsics.checkNotNullParameter(anrMonitorWorker, "anrMonitorWorker");
        this.f94419a = configService;
        this.f94420b = clock;
        this.f94421c = anrMonitorWorker;
        this.f94422d = new CopyOnWriteArrayList();
        this.f94423e = new ArrayList();
        this.f94425g = new k(targetThread);
    }

    @Override // of2.e
    public final void a(Thread thread, long j13) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        ((Map) this.f94425g.f86945b).clear();
        this.f94424f = j13;
    }

    public final ArrayList b() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f94422d;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            th2.b bVar = (th2.b) next;
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            Integer num = bVar.f117653f;
            if (num == null || num.intValue() != 1) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @Override // yh2.b
    public final void c() {
        this.f94421c.b(new s81.g(this, 23));
    }

    @Override // of2.e
    public final void g(Thread thread, long j13) {
        th2.c cVar;
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(thread, "thread");
        sg2.a configService = this.f94419a;
        sg2.b bVar = (sg2.b) configService;
        AnrRemoteConfig anrRemoteConfig = bVar.f112881f.f117594c;
        int intValue = (anrRemoteConfig == null || (num2 = anrRemoteConfig.f72972c) == null) ? 80 : num2.intValue();
        ArrayList arrayList = this.f94423e;
        if (arrayList.size() >= intValue) {
            cVar = new th2.c(j13, null, 0L, 1);
        } else {
            og2.a aVar = this.f94420b;
            long now = aVar.now();
            k kVar = this.f94425g;
            kVar.getClass();
            Intrinsics.checkNotNullParameter(configService, "configService");
            Intrinsics.checkNotNullParameter(configService, "configService");
            Thread thread2 = (Thread) kVar.f86944a;
            StackTraceElement[] stackTraceElements = thread2.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTraceElements, "targetThread.stackTrace");
            AnrRemoteConfig anrRemoteConfig2 = bVar.f112881f.f117594c;
            int intValue2 = (anrRemoteConfig2 == null || (num = anrRemoteConfig2.f72973d) == null) ? 200 : num.intValue();
            Intrinsics.checkNotNullParameter(thread2, "thread");
            Intrinsics.checkNotNullParameter(stackTraceElements, "stackTraceElements");
            String name = thread2.getName();
            int priority = thread2.getPriority();
            int length = stackTraceElements.length;
            List U = c0.U(intValue2, stackTraceElements);
            ArrayList arrayList2 = new ArrayList(g0.q(U, 10));
            Iterator it = U.iterator();
            while (it.hasNext()) {
                arrayList2.add(((StackTraceElement) it.next()).toString());
            }
            ThreadInfo threadInfo = new ThreadInfo(thread2.getId(), thread2.getState(), name, priority, arrayList2, length);
            ArrayList arrayList3 = new ArrayList();
            Map map = (Map) kVar.f86945b;
            long j14 = threadInfo.f73264a;
            ThreadInfo threadInfo2 = (ThreadInfo) map.get(Long.valueOf(j14));
            if (threadInfo2 == null || !Intrinsics.d(threadInfo, threadInfo2)) {
                arrayList3.add(threadInfo);
                ((Map) kVar.f86945b).put(Long.valueOf(j14), threadInfo);
            }
            cVar = new th2.c(j13, arrayList3, Long.valueOf(aVar.now() - now), 0);
        }
        arrayList.add(cVar);
    }

    @Override // of2.e
    public final void h(Thread thread, long j13) {
        Object obj;
        Integer num;
        Intrinsics.checkNotNullParameter(thread, "thread");
        long j14 = this.f94424f;
        ArrayList arrayList = this.f94423e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            long j15 = ((th2.c) next).f117654a;
            if (j14 <= j15 && j15 <= j13) {
                arrayList2.add(next);
            }
        }
        th2.b bVar = new th2.b(j14, null, Long.valueOf(j13), th2.a.UI, new th2.d(arrayList2));
        synchronized (this.f94422d) {
            try {
                if (this.f94422d.size() < 100) {
                    this.f94422d.add(bVar);
                    while (true) {
                        AnrRemoteConfig anrRemoteConfig = ((sg2.b) this.f94419a).f112881f.f117594c;
                        if (b().size() <= ((anrRemoteConfig == null || (num = anrRemoteConfig.f72974e) == null) ? 5 : num.intValue())) {
                            break;
                        }
                        Iterator it2 = b().iterator();
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (it2.hasNext()) {
                                th2.b bVar2 = (th2.b) next2;
                                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                                Long l13 = bVar2.f117650c;
                                if (l13 == null) {
                                    l13 = bVar2.f117649b;
                                }
                                long longValue = l13 == null ? -1L : l13.longValue() - bVar2.f117648a;
                                do {
                                    Object next3 = it2.next();
                                    th2.b bVar3 = (th2.b) next3;
                                    Intrinsics.checkNotNullParameter(bVar3, "<this>");
                                    Long l14 = bVar3.f117650c;
                                    if (l14 == null) {
                                        l14 = bVar3.f117649b;
                                    }
                                    long longValue2 = l14 == null ? -1L : l14.longValue() - bVar3.f117648a;
                                    if (longValue > longValue2) {
                                        next2 = next3;
                                        longValue = longValue2;
                                    }
                                } while (it2.hasNext());
                            }
                            obj = next2;
                        } else {
                            obj = null;
                        }
                        th2.b bVar4 = (th2.b) obj;
                        if (bVar4 != null) {
                            int indexOf = this.f94422d.indexOf(bVar4);
                            this.f94422d.remove(bVar4);
                            CopyOnWriteArrayList copyOnWriteArrayList = this.f94422d;
                            Intrinsics.checkNotNullParameter(bVar4, "<this>");
                            long j16 = bVar4.f117648a;
                            Long l15 = bVar4.f117649b;
                            Long l16 = bVar4.f117650c;
                            th2.a type = bVar4.f117651d;
                            Intrinsics.checkNotNullParameter(type, "type");
                            copyOnWriteArrayList.add(indexOf, new th2.b(j16, l15, l16, type, null, 1));
                        }
                    }
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f94423e.clear();
        this.f94424f = j13;
        ((Map) this.f94425g.f86945b).clear();
    }
}
