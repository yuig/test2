package dl1;

import i1.a1;
import i1.e1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import jk2.i2;
import jk2.j1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m7.g1;
import t3.s1;
import x02.a2;

/* loaded from: classes2.dex */
public abstract class q0 implements y, w, v, el1.a {

    /* renamed from: a, reason: collision with root package name */
    public final p f55268a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f55269b;

    /* renamed from: c, reason: collision with root package name */
    public final z f55270c;

    /* renamed from: d, reason: collision with root package name */
    public final gl1.d f55271d;

    /* renamed from: e, reason: collision with root package name */
    public final r0 f55272e;

    /* renamed from: f, reason: collision with root package name */
    public final fl1.e f55273f;

    /* renamed from: g, reason: collision with root package name */
    public final r f55274g;

    /* renamed from: h, reason: collision with root package name */
    public final uk2.p f55275h;

    /* renamed from: i, reason: collision with root package name */
    public final uk2.p f55276i;

    /* renamed from: j, reason: collision with root package name */
    public final uk2.p f55277j;

    /* renamed from: k, reason: collision with root package name */
    public final uk2.p f55278k;

    /* renamed from: l, reason: collision with root package name */
    public final uk2.p f55279l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicInteger f55280m;

    /* renamed from: n, reason: collision with root package name */
    public final uk2.l f55281n;

    /* renamed from: o, reason: collision with root package name */
    public final Map f55282o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f55283p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q0(dl1.p r18, dl1.a0 r19, dl1.z r20, gl1.d r21) {
        /*
            r17 = this;
            java.lang.String r0 = "localDataSource"
            r2 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "remoteDataSource"
            r3 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "persistencePolicy"
            r4 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "repositorySchedulerPolicy"
            r5 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            dl1.o r6 = new dl1.o
            r6.<init>()
            fl1.c r7 = new fl1.c
            r7.<init>()
            dl1.r r8 = new dl1.r
            r8.<init>()
            java.lang.String r0 = "create(...)"
            uk2.f r9 = a.cb.r(r0)
            uk2.f r10 = a.cb.r(r0)
            uk2.f r11 = gl1.a.f65738a
            java.lang.String r1 = "null cannot be cast to non-null type io.reactivex.subjects.Subject<kotlin.Pair<P of com.pinterest.framework.repository.reactive.ApolloUpdateStream.create, Model of com.pinterest.framework.repository.reactive.ApolloUpdateStream.create>>"
            kotlin.jvm.internal.Intrinsics.g(r11, r1)
            uk2.f r12 = new uk2.f
            r12.<init>()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            uk2.f r13 = a.cb.r(r0)
            java.util.concurrent.atomic.AtomicInteger r14 = new java.util.concurrent.atomic.AtomicInteger
            r14.<init>()
            uk2.l r15 = uk2.l.R()
            java.lang.String r0 = "createWithSize(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r0)
            java.util.HashMap r16 = new java.util.HashMap
            r16.<init>()
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dl1.q0.<init>(dl1.p, dl1.a0, dl1.z, gl1.d):void");
    }

    public final uj2.q A(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        b22.f fVar = new b22.f(1, new qf1.z(uid, 29));
        uk2.p pVar = this.f55279l;
        pVar.getClass();
        uj2.q i13 = new jk2.x(pVar, fVar, 2).i(new b22.f(10, new g(this.f55271d, 14)));
        Intrinsics.checkNotNullExpressionValue(i13, "compose(...)");
        return i13;
    }

    public final uj2.q B() {
        ir.j jVar = new ir.j(27, new kotlin.jvm.internal.d0() { // from class: dl1.k0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((Pair) obj).f80347b;
            }
        });
        uk2.p pVar = this.f55275h;
        pVar.getClass();
        int i13 = 0;
        uj2.q i14 = new jk2.x(new j1(pVar, jVar, i13), new b0(3, new l0(this, i13)), 2).i(new com.google.firebase.messaging.a0(new h(this.f55271d, 6), 5));
        Intrinsics.checkNotNullExpressionValue(i14, "compose(...)");
        return i14;
    }

    public final uj2.q C(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        int i13 = 0;
        int i14 = 2;
        b22.f fVar = new b22.f(i14, new i0(uid, i13));
        uk2.p pVar = this.f55275h;
        pVar.getClass();
        uj2.q i15 = new jk2.x(new j1(new jk2.x(pVar, fVar, i14), new com.pinterest.framework.multisection.datasource.pagedlist.h(11, new kotlin.jvm.internal.d0() { // from class: dl1.j0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((Pair) obj).f80347b;
            }
        }), i13), new b22.f(3, new bi1.a0(this, 24)), i14).i(new b22.f(12, new g(this.f55271d, 15)));
        Intrinsics.checkNotNullExpressionValue(i15, "compose(...)");
        return i15;
    }

    public final uj2.q D() {
        xk2.w wVar = new xk2.w(new LinkedHashMap(), null, null);
        int i13 = 1;
        b0 b0Var = new b0(i13, new l0(this, i13));
        uk2.p pVar = this.f55276i;
        pVar.getClass();
        int i14 = 2;
        jk2.x xVar = new jk2.x(pVar, b0Var, i14);
        int i15 = 0;
        uj2.q i16 = new j1(new jk2.x(new jk2.v(xVar, new ck2.f(wVar), new u20.c(i14, new m0(this, i15))), new b0(i14, g0.f55225l), i14), new ir.j(26, g0.f55226m), i15).i(new com.google.firebase.messaging.a0(new h(this.f55271d, 7), 3));
        Intrinsics.checkNotNullExpressionValue(i16, "compose(...)");
        return i16;
    }

    public final uj2.q E(int i13) {
        uk2.l lVar = this.f55281n;
        this.f55283p = true;
        try {
            s0[] s0VarArr = (s0[]) lVar.f122430a.c(new s0[0]);
            if (s0VarArr.length < 20 || s0VarArr[0].a() <= i13 + 1) {
                return s1.f(new jk2.x(lVar, new b22.f(4, new zx0.d(i13, 27)), 2), "observeOn(...)");
            }
            cl1.e r13 = uj2.q.r(new IllegalStateException("Unable to replay updates from the requested sequenceId. Too many updates have occurred since then."));
            Intrinsics.checkNotNullExpressionValue(r13, "error(...)");
            return r13;
        } catch (Throwable unused) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.h hVar = tb0.g.f117075a;
            tb0.k kVar = new tb0.k();
            kVar.c("method", "observeModelUpdatesAfterSequenceId");
            hVar.k("Repository ReplaySubject Error", kVar.f117102a);
            jk2.h0 h0Var = jk2.h0.f76488a;
            Intrinsics.checkNotNullExpressionValue(h0Var, "empty(...)");
            return h0Var;
        }
    }

    public final void F(m mVar, s sVar) {
        if (this.f55272e.b(sVar)) {
            if (this.f55270c.b(mVar, a.WRITE)) {
                this.f55274g.a(mVar, sVar);
            }
            this.f55271d.k(new g1(this, mVar, mVar, sVar, 2));
        }
    }

    public final uj2.l G(u params, s sVar) {
        Intrinsics.checkNotNullParameter(params, "params");
        uj2.l c13 = this.f55269b.c(params, sVar);
        gl1.d dVar = this.f55271d;
        uj2.l b13 = c13.b(new b22.f(0, new g(dVar, 16)));
        int i13 = 1;
        int i14 = 15;
        com.pinterest.framework.multisection.datasource.pagedlist.h hVar = new com.pinterest.framework.multisection.datasource.pagedlist.h(i14, new d0(this, params, i13));
        b13.getClass();
        hk2.k i15 = new hk2.k(b13, hVar, i13).i(sVar != null ? uj2.l.d(sVar) : hk2.i.f69412a);
        c cVar = new c(9, new d0(this, params, 2));
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar2 = ck2.i.f27923c;
        uj2.l b14 = new hk2.z(new hk2.z(new hk2.z(i15, a2Var, cVar, a2Var, cVar2), a2Var, a2Var, a2Var, new xo.c(sVar, this, params, i14)), a2Var, a2Var, new c(10, new bi1.a0(null, 25)), cVar2).b(new b22.f(i13, new g(dVar, 17)));
        Intrinsics.checkNotNullExpressionValue(b14, "compose(...)");
        return b14;
    }

    public final void H(m params, s model, boolean z13) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        if (this.f55272e.b(model)) {
            if (z13) {
                w(params, model, true);
            }
            F(params, model);
        }
    }

    public final uj2.q I(u params, Function1 update, Function1 rollback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(rollback, "rollback");
        int i13 = 0;
        int i14 = 13;
        uj2.q i15 = new jk2.a0(new i2(new j1(new j1(p(params, true), new com.pinterest.framework.multisection.datasource.pagedlist.h(12, update), i13), new com.pinterest.framework.multisection.datasource.pagedlist.h(i14, k.f55241l), i13), uj2.q.y(new lb0.i(null)), i13).C(uj2.q.y(new lb0.i(null))).t(new com.pinterest.framework.multisection.datasource.pagedlist.h(14, new p0(this, params, rollback, 1))), new c(7, new d0(this, params, 4)), ck2.i.f27924d, ck2.i.f27923c).i(new b22.f(i14, new g(this.f55271d, 19)));
        Intrinsics.checkNotNullExpressionValue(i15, "compose(...)");
        return i15;
    }

    @Override // dl1.y
    public final uj2.q b(m params) {
        Intrinsics.checkNotNullParameter(params, "params");
        jk2.m j13 = uj2.q.j(n(params), x(params).i(new com.google.firebase.messaging.a0(new h(this.f55271d, 3), 2)));
        Intrinsics.checkNotNullExpressionValue(j13, "concat(...)");
        return j13;
    }

    @Override // el1.a
    public final void h(m params, s model) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55277j.c(new Pair(params, model));
    }

    public final void j(u params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f55274g.f55284a.remove(params);
        this.f55268a.g(params);
    }

    public final uj2.q k(m params) {
        Intrinsics.checkNotNullParameter(params, "params");
        uj2.b0 e13 = this.f55269b.e(params);
        gl1.d dVar = this.f55271d;
        uj2.q i13 = new kk2.g(e13.e(new b22.f(4, new g(dVar, 10))), new c(8, new d0(this, params, 0)), 3).u().i(new b22.f(14, new g(dVar, 11)));
        Intrinsics.checkNotNullExpressionValue(i13, "compose(...)");
        return i13;
    }

    public m l(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        throw new UnsupportedOperationException(getClass().getName().concat(" createRequestParamsForBulkOperation is not implemented"));
    }

    public final uj2.b m(m params, s sVar) {
        Intrinsics.checkNotNullParameter(params, "params");
        uj2.b a13 = this.f55269b.a(params);
        a13.getClass();
        gl1.d dVar = this.f55271d;
        uj2.b e13 = dVar.e(a13);
        ck2.i.b(e13, "source is null");
        uj2.b a14 = dVar.a(new fk2.g(new kk2.g(e13.e(new qb1.a(3, this, params)).q(Unit.f80348a), new c(6, new e0(sVar, this)), 0), 4));
        ck2.i.b(a14, "source is null");
        Intrinsics.checkNotNullExpressionValue(a14, "compose(...)");
        return a14;
    }

    public final uj2.q n(m params) {
        uj2.q u13;
        Intrinsics.checkNotNullParameter(params, "params");
        int i13 = 1;
        if (params.f55251a) {
            u13 = new j1(r(params), new ir.j(29, new f0(this, params, 0)), i13);
            Intrinsics.checkNotNullExpressionValue(u13, "publish(...)");
        } else {
            jk2.g0 s13 = s(params, true).s();
            Intrinsics.checkNotNullExpressionValue(s13, "firstOrError(...)");
            u13 = s13.u();
        }
        uj2.q i14 = u13.i(new com.google.firebase.messaging.a0(new h(this.f55271d, 2), 4));
        Intrinsics.checkNotNullExpressionValue(i14, "compose(...)");
        return i14;
    }

    public m o(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    public final jk2.a0 p(m params, boolean z13) {
        Intrinsics.checkNotNullParameter(params, "params");
        jk2.a0 a0Var = new jk2.a0(this.f55268a.b(params).i(new com.google.firebase.messaging.a0(new e1(z13, this, 3), 7)), new com.pinterest.feature.home.model.h(12, new a1(this, params, params, 13)), ck2.i.f27924d, ck2.i.f27923c);
        Intrinsics.checkNotNullExpressionValue(a0Var, "let(...)");
        return a0Var;
    }

    public final i2 q(m params) {
        Intrinsics.checkNotNullParameter(params, "params");
        r rVar = this.f55274g;
        rVar.getClass();
        jk2.x xVar = new jk2.x(new ol1.d(new lb.u0(6, rVar, params), 3), new b0(4, g0.f55223j), 2);
        ir.j jVar = new ir.j(28, g0.f55224k);
        int i13 = 0;
        i2 i2Var = new i2(new j1(xVar, jVar, i13), new ol1.d(new lb.u0(7, this, params), 3), i13);
        Intrinsics.checkNotNullExpressionValue(i2Var, "let(...)");
        return i2Var;
    }

    public final ol1.d r(m params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ol1.d dVar = new ol1.d(new lb.n(this, params, null, 1), 3);
        Intrinsics.checkNotNullExpressionValue(dVar, "defer(...)");
        return dVar;
    }

    public final uj2.q s(m params, boolean z13) {
        Intrinsics.checkNotNullParameter(params, "params");
        ArrayList arrayList = new ArrayList();
        a aVar = a.READ;
        z zVar = this.f55270c;
        if (zVar.b(params, aVar)) {
            arrayList.add(q(params));
        }
        if (zVar.a(params, aVar)) {
            arrayList.add(p(params, true));
        }
        if (z13) {
            arrayList.add(r(params));
        }
        uj2.q k13 = uj2.q.k(arrayList);
        Intrinsics.checkNotNullExpressionValue(k13, "concat(...)");
        return k13;
    }

    public final int t() {
        this.f55283p = true;
        return this.f55280m.get();
    }

    public final void u(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55279l.c(model);
        if (this.f55283p) {
            v(new s0(u0.DELETE, model, this.f55280m.incrementAndGet()));
        }
    }

    public final void v(s0 s0Var) {
        try {
            this.f55281n.c(s0Var);
        } catch (Throwable unused) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.h hVar = tb0.g.f117075a;
            tb0.k kVar = new tb0.k();
            kVar.c("method", "notifySequencedUpdate");
            hVar.k("Repository ReplaySubject Error", kVar.f117102a);
        }
    }

    public final void w(m params, s model, boolean z13) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55275h.c(new Pair(params, model));
        if (this.f55276i.Q()) {
            this.f55271d.k(new h6.o(this, params, model, 13));
        }
        if (z13) {
            h(params, model);
        }
        if (this.f55283p) {
            v(new s0(u0.UPDATE, model, this.f55280m.incrementAndGet()));
        }
    }

    public final j1 x(m params) {
        Intrinsics.checkNotNullParameter(params, "params");
        b0 b0Var = new b0(5, new hk1.t(params, 3));
        uk2.p pVar = this.f55275h;
        pVar.getClass();
        int i13 = 0;
        j1 j1Var = new j1(new jk2.x(pVar, b0Var, 2), new b0(i13, new kotlin.jvm.internal.d0() { // from class: dl1.h0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((Pair) obj).f80347b;
            }
        }), i13);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        return j1Var;
    }

    public final uj2.q y() {
        uj2.q i13 = this.f55278k.i(new b22.f(11, new g(this.f55271d, 13)));
        Intrinsics.checkNotNullExpressionValue(i13, "compose(...)");
        return i13;
    }

    public final uj2.q z() {
        uj2.q i13 = this.f55279l.i(new com.google.firebase.messaging.a0(new h(this.f55271d, 5), 6));
        Intrinsics.checkNotNullExpressionValue(i13, "compose(...)");
        return i13;
    }

    public q0(p localDataSource, a0 remoteDataSource, z persistencePolicy, gl1.d repositorySchedulerPolicy, r0 repositoryModelValidator, fl1.e modelMerger, r memoryCache, uk2.p updateSubject, uk2.p updateSubjectForComparison, uk2.p updateStreamForApollo, uk2.p createSubject, uk2.p deleteSubject, AtomicInteger modelUpdatesSequenceId, uk2.l sequencedReplaySubject, Map requestObservableMap) {
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
        Intrinsics.checkNotNullParameter(repositoryModelValidator, "repositoryModelValidator");
        Intrinsics.checkNotNullParameter(modelMerger, "modelMerger");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(updateSubject, "updateSubject");
        Intrinsics.checkNotNullParameter(updateSubjectForComparison, "updateSubjectForComparison");
        Intrinsics.checkNotNullParameter(updateStreamForApollo, "updateStreamForApollo");
        Intrinsics.checkNotNullParameter(createSubject, "createSubject");
        Intrinsics.checkNotNullParameter(deleteSubject, "deleteSubject");
        Intrinsics.checkNotNullParameter(modelUpdatesSequenceId, "modelUpdatesSequenceId");
        Intrinsics.checkNotNullParameter(sequencedReplaySubject, "sequencedReplaySubject");
        Intrinsics.checkNotNullParameter(requestObservableMap, "requestObservableMap");
        this.f55268a = localDataSource;
        this.f55269b = remoteDataSource;
        this.f55270c = persistencePolicy;
        this.f55271d = repositorySchedulerPolicy;
        this.f55272e = repositoryModelValidator;
        this.f55273f = modelMerger;
        this.f55274g = memoryCache;
        this.f55275h = updateSubject;
        this.f55276i = updateSubjectForComparison;
        this.f55277j = updateStreamForApollo;
        this.f55278k = createSubject;
        this.f55279l = deleteSubject;
        this.f55280m = modelUpdatesSequenceId;
        this.f55281n = sequencedReplaySubject;
        this.f55282o = requestObservableMap;
    }
}
