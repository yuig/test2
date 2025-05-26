package dl1;

import com.pinterest.api.model.v7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeoutException;
import jk2.i2;
import jk2.j1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x02.a2;

/* loaded from: classes2.dex */
public abstract class l extends q0 implements t {

    /* renamed from: q, reason: collision with root package name */
    public final p f55244q;

    /* renamed from: r, reason: collision with root package name */
    public final z f55245r;

    /* renamed from: s, reason: collision with root package name */
    public final gl1.d f55246s;

    /* renamed from: t, reason: collision with root package name */
    public final r0 f55247t;

    /* renamed from: u, reason: collision with root package name */
    public final fl1.e f55248u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(dl1.p r24, dl1.a0 r25, dl1.z r26, gl1.d r27, dl1.r0 r28, fl1.e r29, dl1.r r30, uk2.p r31, uk2.p r32, uk2.p r33, uk2.p r34, java.util.concurrent.atomic.AtomicInteger r35, uk2.l r36, java.util.Map r37, int r38) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dl1.l.<init>(dl1.p, dl1.a0, dl1.z, gl1.d, dl1.r0, fl1.e, dl1.r, uk2.p, uk2.p, uk2.p, uk2.p, java.util.concurrent.atomic.AtomicInteger, uk2.l, java.util.Map, int):void");
    }

    public static ol1.d K(l lVar, u uVar) {
        ol1.d dVar = new ol1.d(new e(uVar, true, lVar, lVar.f55245r, lVar, 1), 3);
        Intrinsics.checkNotNullExpressionValue(dVar, "defer(...)");
        return dVar;
    }

    public static void U(InterruptedException interruptedException) {
        HashSet hashSet = tb0.h.f117076w;
        tb0.h hVar = tb0.g.f117075a;
        tb0.k kVar = new tb0.k();
        String simpleName = interruptedException.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        kVar.c("ErrorType", simpleName);
        hVar.k("InterruptedException", kVar.f117102a);
    }

    public final ol1.d J(u uVar) {
        ol1.d dVar = new ol1.d(new e(uVar, true, this, this.f55245r, this, 0), 3);
        Intrinsics.checkNotNullExpressionValue(dVar, "defer(...)");
        return dVar;
    }

    public final uj2.q L(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        u uVar = new u(modelId);
        uj2.q i13 = uj2.q.j(new j1(r(uVar), new com.pinterest.framework.multisection.datasource.pagedlist.h(6, new f(this, uVar, 0)), 1), x(uVar)).i(new b22.f(8, new g(this.f55246s, 0)));
        Intrinsics.checkNotNullExpressionValue(i13, "compose(...)");
        return i13;
    }

    public final jk2.e0 M(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        u uVar = new u(modelId);
        jk2.e0 e0Var = new jk2.e0(new i2(J(uVar), K(this, uVar), 0).i(new b22.f(7, new g(this.f55246s, 3))));
        Intrinsics.checkNotNullExpressionValue(e0Var, "firstElement(...)");
        return e0Var;
    }

    public final uj2.b0 N(List modelIds) {
        Intrinsics.checkNotNullParameter(modelIds, "modelIds");
        List<String> list = modelIds;
        ArrayList paramsList = new ArrayList(kotlin.collections.g0.q(list, 10));
        for (String uid : list) {
            Intrinsics.checkNotNullParameter(uid, "uid");
            paramsList.add(new u(uid));
        }
        Intrinsics.checkNotNullParameter(paramsList, "paramsList");
        uj2.b0 e13 = this.f55268a.i(paramsList).e(new b22.f(3, new g(this.f55271d, 12)));
        Intrinsics.checkNotNullExpressionValue(e13, "compose(...)");
        return e13;
    }

    public final s O(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        u uVar = new u(modelId);
        try {
            ol1.d J2 = J(uVar);
            ol1.d dVar = new ol1.d(new e(uVar, false, this, this.f55245r, this, 1), 3);
            Intrinsics.checkNotNullExpressionValue(dVar, "defer(...)");
            uj2.q i13 = new i2(J2, dVar, 0).i(new com.google.firebase.messaging.a0(new h(this.f55246s, 0), 0 == true ? 1 : 0));
            ek2.d dVar2 = new ek2.d(1);
            i13.d(dVar2);
            Object d2 = dVar2.d();
            if (d2 == null) {
                d2 = null;
            }
            return (s) d2;
        } catch (Exception e13) {
            Intrinsics.checkNotNullParameter(e13, "<this>");
            int i14 = 5;
            Throwable th3 = e13;
            while (true) {
                if ((th3 != null ? th3.getCause() : null) == null || i14 <= 0) {
                    break;
                }
                th3 = th3.getCause();
                i14--;
            }
            if (th3 == null) {
                th3 = e13;
            }
            if (th3 instanceof InterruptedException) {
                U((InterruptedException) th3);
                return null;
            }
            if (th3 instanceof TimeoutException) {
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.k("Timeout while getLocalBlocking", kotlin.collections.q0.f80391a);
                return null;
            }
            HashSet hashSet2 = tb0.h.f117076w;
            tb0.g.f117075a.o("Failed to get model locally.", e13);
            return null;
        }
    }

    public final uj2.q P(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        u uVar = new u(modelId);
        int i13 = 0;
        uj2.q i14 = new i2(new i2(J(uVar), K(this, uVar), i13), r(uVar), i13).i(new b22.f(5, new g(this.f55246s, 4)));
        Intrinsics.checkNotNullExpressionValue(i14, "compose(...)");
        return i14;
    }

    public final uj2.q Q(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        u uVar = new u(modelId);
        uj2.q i13 = uj2.q.j(r(uVar), x(uVar)).i(new com.google.firebase.messaging.a0(new h(this.f55246s, 1), 1));
        Intrinsics.checkNotNullExpressionValue(i13, "compose(...)");
        return i13;
    }

    public final uj2.q R(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        uj2.q i13 = r(new u(modelId)).i(new b22.f(9, new g(this.f55246s, 5)));
        Intrinsics.checkNotNullExpressionValue(i13, "compose(...)");
        return i13;
    }

    public final jk2.m S(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        jk2.m j13 = uj2.q.j(P(modelId), x(new u(modelId)).i(new b22.f(4, new g(this.f55246s, 6))));
        Intrinsics.checkNotNullExpressionValue(j13, "concatWith(...)");
        return j13;
    }

    public final uj2.q T(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        u uVar = new u(modelId);
        uj2.q i13 = uj2.q.j(new i2(J(uVar), K(this, uVar), 0), r(uVar)).i(new b22.f(6, new g(this.f55246s, 7)));
        Intrinsics.checkNotNullExpressionValue(i13, "compose(...)");
        return i13;
    }

    public final uj2.b0 V(v7 model, k1.q remoteUpdate) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(remoteUpdate, "remoteUpdate");
        String id3 = model.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        u uVar = new u(id3);
        int i13 = 1;
        jk2.n0 n0Var = new jk2.n0(new i2(new j1(new i2(J(uVar), K(this, uVar), 0), new com.pinterest.framework.multisection.datasource.pagedlist.h(8, new j(this, model, 0 == true ? 1 : 0)), 0 == true ? 1 : 0), uj2.q.y(model), 0 == true ? 1 : 0), new com.pinterest.framework.multisection.datasource.pagedlist.h(9, new oh1.u(28, remoteUpdate, this)), 0 == true ? 1 : 0, i13);
        int i14 = 2;
        jk2.g0 s13 = new jk2.a0(n0Var, new c(5, new j(this, model, i14)), ck2.i.f27924d, ck2.i.f27923c).s();
        gl1.d dVar = this.f55246s;
        uj2.b0 e13 = s13.e(new b22.f(i13, new g(dVar, 8))).e(new b22.f(i14, new g(dVar, 9)));
        Intrinsics.checkNotNullExpressionValue(e13, "compose(...)");
        return e13;
    }

    public final void W(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        X(model, true);
    }

    public final void X(s sVar, boolean z13) {
        if (this.f55247t.b(sVar) && sVar.getId() != null) {
            String id3 = sVar.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
            u uVar = new u(id3);
            int i13 = 0;
            i2 i2Var = new i2(new j1(new i2(J(uVar), K(this, uVar), i13), new com.pinterest.framework.multisection.datasource.pagedlist.h(7, new j(this, sVar, 3)), i13), new fs0.v(2, sVar), i13);
            c cVar = new c(2, new qf1.f0(this, z13, 6));
            a2 a2Var = ck2.i.f27924d;
            ck2.c cVar2 = ck2.i.f27923c;
            new jk2.a0(i2Var, cVar, a2Var, cVar2).F(new c(3, k.f55239j), new c(4, k.f55240k), cVar2, a2Var);
        }
    }

    public final void Y(String modelId, Function1 update) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        Intrinsics.checkNotNullParameter(update, "update");
        try {
            s(new u(modelId), false).d(new jk2.d0(new hk2.b(new c(0, new oh1.u(update, this, 29)), new c(1, new qf1.z(modelId, 28)), ck2.i.f27923c), 0L));
        } catch (NullPointerException e13) {
            throw e13;
        } catch (Throwable th3) {
            throw n60.o.g(th3, "subscribeActual failed", th3);
        }
    }

    public final void Z(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        r0 r0Var = this.f55247t;
        if (r0Var.b(model) && model.getId() != null) {
            X(model, false);
            if (r0Var.b(model)) {
                String id3 = model.getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                h(new u(id3), model);
            }
        }
    }

    @Override // dl1.t
    public uj2.b d(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String id3 = model.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        uj2.b a13 = this.f55246s.a(m(new u(id3), model));
        ck2.i.b(a13, "source is null");
        Intrinsics.checkNotNullExpressionValue(a13, "compose(...)");
        return a13;
    }

    @Override // dl1.q0
    public final m l(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        return new u(uid);
    }
}
