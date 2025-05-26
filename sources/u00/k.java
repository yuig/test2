package u00;

import a.cb;
import ao2.f0;
import ao2.h1;
import ao2.j0;
import ao2.u0;
import dl1.b0;
import dl1.g0;
import dl1.q0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import jk2.j1;
import jk2.l1;
import jk2.x;
import k1.s2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pc.v;
import uj2.a0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final p f119847a;

    /* renamed from: b, reason: collision with root package name */
    public final wc.d f119848b;

    /* renamed from: c, reason: collision with root package name */
    public final wc.e f119849c;

    /* renamed from: d, reason: collision with root package name */
    public final v f119850d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f119851e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f119852f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f119853g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f119854h;

    /* renamed from: i, reason: collision with root package name */
    public final xj2.b f119855i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f119856j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f119857k;

    /* renamed from: l, reason: collision with root package name */
    public final uk2.f f119858l;

    public k(p apolloStore, m60.f0 cacheKeyGenerator, y00.a fieldCacheResolver, v customScalarAdapters, f0 dispatcher, ho2.c coroutineScope) {
        h1 h1Var = dispatcher instanceof h1 ? (h1) dispatcher : null;
        Executor u0Var = (h1Var == null || (u0Var = h1Var.o()) == null) ? new u0(dispatcher) : u0Var;
        a0 a0Var = tk2.e.f118015a;
        mk2.k repositoryScheduler = new mk2.k(u0Var);
        Intrinsics.checkNotNullExpressionValue(repositoryScheduler, "from(...)");
        com.google.firebase.messaging.a0 queueProcessingPolicy = new com.google.firebase.messaging.a0(repositoryScheduler, 9);
        Intrinsics.checkNotNullParameter(apolloStore, "apolloStore");
        Intrinsics.checkNotNullParameter(cacheKeyGenerator, "cacheKeyGenerator");
        Intrinsics.checkNotNullParameter(fieldCacheResolver, "fieldCacheResolver");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(repositoryScheduler, "repositoryScheduler");
        Intrinsics.checkNotNullParameter(queueProcessingPolicy, "queueProcessingPolicy");
        this.f119847a = apolloStore;
        this.f119848b = cacheKeyGenerator;
        this.f119849c = fieldCacheResolver;
        this.f119850d = customScalarAdapters;
        this.f119851e = dispatcher;
        this.f119852f = coroutineScope;
        this.f119853g = repositoryScheduler;
        this.f119854h = new LinkedHashMap();
        xj2.b bVar = new xj2.b();
        this.f119855i = bVar;
        this.f119856j = new LinkedHashMap();
        this.f119857k = new LinkedHashMap();
        uk2.f r13 = cb.r("create(...)");
        this.f119858l = r13;
        bVar.a(r13.i(queueProcessingPolicy).F(new mc.h(20, new s2(this, 29)), new mc.h(21, c.f119824j), ck2.i.f27923c, ck2.i.f27924d));
    }

    public final void a(d connection, rl2.d clazz) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        synchronized (this) {
            this.f119854h.put(connection.f119828b, connection);
            this.f119856j.put(connection, new ArrayList());
            this.f119857k.put(connection, new LinkedHashSet());
            Unit unit = Unit.f80348a;
        }
        p pVar = this.f119847a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        pVar.f119871c.add(this);
        q0 q0Var = (q0) connection.f119827a;
        q0Var.getClass();
        a0 scheduler = this.f119853g;
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        b0 b0Var = new b0(1, g0.f55227n);
        uk2.p pVar2 = q0Var.f55277j;
        pVar2.getClass();
        l1 A = new j1(pVar2, b0Var, 0).B(l0.t0(clazz)).A(scheduler);
        int i13 = 2;
        x xVar = new x(A, new b0(6, new dl1.l0(q0Var, i13)), i13);
        Intrinsics.checkNotNullExpressionValue(xVar, "filter(...)");
        this.f119855i.a(xVar.F(new mc.h(18, new i2.i(15, this, connection)), new mc.h(19, c.f119825k), ck2.i.f27923c, ck2.i.f27924d));
    }
}
