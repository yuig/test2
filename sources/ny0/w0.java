package ny0;

import android.app.Application;
import com.pinterest.api.model.qz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lh0.a4;
import lh0.g1;
import lh0.j2;
import lh0.z3;
import o82.i2;
import o82.j3;
import o82.t1;

/* loaded from: classes5.dex */
public final class w0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final oy0.d f92642c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.d0 f92643d;

    /* renamed from: e, reason: collision with root package name */
    public final nu.b f92644e;

    /* renamed from: f, reason: collision with root package name */
    public final e f92645f;

    /* renamed from: g, reason: collision with root package name */
    public final nx.d1 f92646g;

    /* renamed from: h, reason: collision with root package name */
    public final qy0.b f92647h;

    /* renamed from: i, reason: collision with root package name */
    public final j2 f92648i;

    /* renamed from: j, reason: collision with root package name */
    public final o22.k f92649j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f92650k;

    /* renamed from: l, reason: collision with root package name */
    public final g01.a f92651l;

    /* renamed from: m, reason: collision with root package name */
    public final l82.y f92652m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    public w0(Application application, ao2.j0 scope, oy0.d featureSEP, zy.d0 pinalyticsSEP, nu.b impressionSEP, e nuxPinFeedCache, nx.d1 trackingParamAttacher, qy0.b nuxSharedStateRepository, j2 experiments, o22.k experimentSEP) {
        super(scope);
        int i13;
        boolean z13;
        qz qzVar;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(featureSEP, "featureSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(impressionSEP, "impressionSEP");
        Intrinsics.checkNotNullParameter(nuxPinFeedCache, "nuxPinFeedCache");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(nuxSharedStateRepository, "nuxSharedStateRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(experimentSEP, "experimentSEP");
        this.f92642c = featureSEP;
        this.f92643d = pinalyticsSEP;
        this.f92644e = impressionSEP;
        this.f92645f = nuxPinFeedCache;
        this.f92646g = trackingParamAttacher;
        this.f92647h = nuxSharedStateRepository;
        this.f92648i = experiments;
        this.f92649j = experimentSEP;
        ArrayList arrayList = nuxSharedStateRepository.a().f105344f;
        this.f92650k = arrayList;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new com.pinterest.boardAutoCollages.k0(20), new bt0.u(6), new j3(kotlin.collections.e0.b(z.f92657a)), false, k(), null, null, null, null, null, 1000);
        ?? r15 = 0;
        if (arrayList.size() == 1) {
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            h(pVar, (qz) CollectionsKt.S(arrayList), false);
        } else {
            Iterator it = arrayList.iterator();
            int i14 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                qz qzVar2 = (qz) next;
                com.pinterest.boardAutoCollages.k0 k0Var = new com.pinterest.boardAutoCollages.k0(19);
                u0 u0Var = new u0(qzVar2, r15);
                com.pinterest.boardAutoCollages.l0 k13 = k();
                j2 j2Var = this.f92648i;
                j2Var.getClass();
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) j2Var.f83397a;
                qz qzVar3 = qzVar2;
                int i16 = i14;
                boolean z14 = r15;
                kv0.p.b(pVar, k0Var, u0Var, new j3(kotlin.collections.e0.b(new d1(qy0.c.a(qzVar2, (g1Var.o("ap_android_short_use_case_names", "enabled", z3Var) || g1Var.l("ap_android_short_use_case_names")) ? true : r15)))), false, k13, null, null, null, null, null, 1000);
                for (?? r152 = z14; r152 < 3; r152++) {
                    if (r152 != 0) {
                        i13 = i16;
                        if (i13 != kotlin.collections.f0.i(this.f92650k)) {
                            qzVar = qzVar3;
                            z13 = true;
                            h(pVar, qzVar, z13);
                            i16 = i13;
                            qzVar3 = qzVar;
                        }
                    } else {
                        i13 = i16;
                    }
                    z13 = z14;
                    qzVar = qzVar3;
                    h(pVar, qzVar, z13);
                    i16 = i13;
                    qzVar3 = qzVar;
                }
                qz qzVar4 = qzVar3;
                boolean z15 = i16 == kotlin.collections.f0.i(this.f92650k) ? true : z14;
                com.pinterest.boardAutoCollages.k0 k0Var2 = new com.pinterest.boardAutoCollages.k0(22);
                u0 u0Var2 = new u0(qzVar4, 2);
                com.pinterest.boardAutoCollages.l0 k14 = k();
                String uid = qzVar4.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                kv0.p.b(pVar, k0Var2, u0Var2, new j3(kotlin.collections.e0.b(new b1(uid))), z15, k14, null, null, null, null, null, 992);
                it = it;
                i14 = i15;
                r15 = z14;
            }
        }
        int i17 = 2;
        g01.a d2 = pVar.d();
        this.f92651l = d2;
        l82.a0 a0Var = new l82.a0(scope);
        s0 stateTransformer = new s0((o82.i0) d2.f63224a, new lt.j(i17), new lt.j(1));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f92652m = a0Var.a();
    }

    public static i2 i(qz qzVar, int i13, int i14) {
        String uid = qzVar.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return new i2(new z0(uid, i13, i14), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f92652m.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f92652m.e();
    }

    public final void h(kv0.p pVar, qz qzVar, boolean z13) {
        com.pinterest.boardAutoCollages.k0 k0Var = new com.pinterest.boardAutoCollages.k0(21);
        u0 u0Var = new u0(qzVar, 1);
        com.pinterest.boardAutoCollages.l0 b13 = t1.b();
        kv0.p.b(pVar, k0Var, u0Var, new o82.h(new androidx.appcompat.widget.q(this, 2)), z13, b13, null, new gx.e(this.f92646g, new gv0.b(this, 4)), null, null, null, 928);
    }

    public final int j() {
        return this.f92647h.a().f105344f.size();
    }

    public final com.pinterest.boardAutoCollages.l0 k() {
        if (this.f92650k.size() != 1) {
            return new com.pinterest.boardAutoCollages.l0(5);
        }
        o82.j jVar = t1.f93713a;
        return new com.pinterest.boardAutoCollages.l0(17);
    }

    public final void l(h32.i0 pinalyticsContext) {
        List list;
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Object obj = null;
        int i13 = 3;
        i2 i2Var = new i2(obj, i13);
        ArrayList arrayList = this.f92650k;
        if (arrayList.size() == 1) {
            list = kotlin.collections.e0.b(i((qz) d7.b.F(arrayList), 0, Integer.MAX_VALUE));
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                qz qzVar = (qz) it.next();
                i2 i2Var2 = new i2(obj, i13);
                IntRange intRange = c0.f92562a;
                i2 i14 = i(qzVar, intRange.f80453a, intRange.f80454b);
                IntRange intRange2 = c0.f92563b;
                i2 i15 = i(qzVar, intRange2.f80453a, intRange2.f80454b);
                IntRange intRange3 = c0.f92564c;
                kotlin.collections.k0.u(kotlin.collections.f0.j(i2Var2, i14, i15, i(qzVar, intRange3.f80453a, intRange3.f80454b), new i2(obj, i13)), arrayList2);
            }
            list = arrayList2;
        }
        l82.y.i(this.f92652m, new t0(new o82.j0(CollectionsKt.l0(list, kotlin.collections.e0.b(i2Var))), new zy.l0(pinalyticsContext, CollectionsKt.Z(arrayList, ",", null, null, 0, null, d.f92570n, 30)), false, null, ((g1) this.f92648i.f83397a).j()), false, new dx0.d(this, 12), 2);
    }
}
