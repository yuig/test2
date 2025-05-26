package lw;

import android.content.Context;
import ao2.f0;
import ao2.j0;
import ao2.k2;
import ao2.o1;
import ao2.v0;
import ew.l;
import gw.f;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import ko2.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import pb0.g;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f85046a;

    /* renamed from: b, reason: collision with root package name */
    public final pb0.a f85047b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f85048c;

    /* renamed from: d, reason: collision with root package name */
    public final ix.d f85049d;

    /* renamed from: e, reason: collision with root package name */
    public final f f85050e;

    /* renamed from: f, reason: collision with root package name */
    public final l f85051f;

    /* renamed from: g, reason: collision with root package name */
    public final iw.a f85052g;

    /* renamed from: h, reason: collision with root package name */
    public final f0 f85053h;

    /* renamed from: i, reason: collision with root package name */
    public long f85054i;

    /* renamed from: j, reason: collision with root package name */
    public k2 f85055j;

    /* renamed from: k, reason: collision with root package name */
    public final ConcurrentHashMap f85056k;

    /* renamed from: l, reason: collision with root package name */
    public long f85057l;

    public c(Context context, pb0.a clock, j0 applicationScope, ix.d adsGmaConfigManager, f adsGmaSdkDecorator, l adsGmaHeaderManager, iw.a queryInfoCache) {
        ko2.f fVar = v0.f20219a;
        e ioDispatcher = e.f80326c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        Intrinsics.checkNotNullParameter(adsGmaConfigManager, "adsGmaConfigManager");
        Intrinsics.checkNotNullParameter(adsGmaSdkDecorator, "adsGmaSdkDecorator");
        Intrinsics.checkNotNullParameter(adsGmaHeaderManager, "adsGmaHeaderManager");
        Intrinsics.checkNotNullParameter(queryInfoCache, "queryInfoCache");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f85046a = context;
        this.f85047b = clock;
        this.f85048c = applicationScope;
        this.f85049d = adsGmaConfigManager;
        this.f85050e = adsGmaSdkDecorator;
        this.f85051f = adsGmaHeaderManager;
        this.f85052g = queryInfoCache;
        this.f85053h = ioDispatcher;
        this.f85054i = 870000L;
        this.f85056k = new ConcurrentHashMap();
        this.f85057l = this.f85054i;
    }

    public final void a() {
        b(true);
    }

    public final void b(boolean z13) {
        k2 k2Var = this.f85055j;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        Iterator it = this.f85056k.entrySet().iterator();
        while (it.hasNext()) {
            ((o1) ((Map.Entry) it.next()).getValue()).cancel((CancellationException) null);
        }
        ((g) this.f85047b).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it2 = this.f85052g.f73738b.entrySet().iterator();
        while (it2.hasNext()) {
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ((Map.Entry) it2.next()).getValue();
            while (!concurrentLinkedQueue.isEmpty()) {
                iw.b bVar = (iw.b) concurrentLinkedQueue.peek();
                if (currentTimeMillis >= (bVar != null ? bVar.b() : 0L)) {
                    concurrentLinkedQueue.poll();
                }
            }
        }
        this.f85055j = j.z(this.f85048c, this.f85053h, null, new a(this, currentTimeMillis, z13, null), 2);
    }

    public final void c(String str, long j13, Integer num, Integer num2, int i13) {
        b bVar = new b(this, str, num, i13, j13, num2, null);
        this.f85056k.put(str, j.z(this.f85048c, this.f85053h, null, bVar, 2));
    }
}
