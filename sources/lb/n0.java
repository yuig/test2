package lb;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82632i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f82633j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f82634k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kb.y0 f82635l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(kb.y0 y0Var, j0 j0Var, String str) {
        super(0);
        this.f82635l = y0Var;
        this.f82633j = j0Var;
        this.f82634k = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f82632i) {
            case 0:
                m177invoke();
                break;
            default:
                m177invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(j0 j0Var, String str, kb.y0 y0Var) {
        super(0);
        this.f82633j = j0Var;
        this.f82634k = str;
        this.f82635l = y0Var;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m177invoke() {
        int i13 = this.f82632i;
        kb.y0 y0Var = this.f82635l;
        switch (i13) {
            case 0:
                List b13 = kotlin.collections.e0.b(y0Var);
                ub.b.a(new b0(this.f82633j, this.f82634k, kb.q.KEEP, b13, null));
                return;
            default:
                j0 j0Var = this.f82633j;
                String str = this.f82634k;
                n0 n0Var = new n0(y0Var, j0Var, str);
                tb.y y13 = j0Var.f82607d.y();
                ArrayList k13 = y13.k(str);
                if (k13.size() <= 1) {
                    tb.q qVar = (tb.q) CollectionsKt.firstOrNull(k13);
                    if (qVar == null) {
                        n0Var.invoke();
                        return;
                    }
                    String str2 = qVar.f116995a;
                    tb.s j13 = y13.j(str2);
                    if (j13 != null) {
                        if (j13.f()) {
                            if (qVar.f116996b == kb.s0.CANCELLED) {
                                y13.c(str2);
                                n0Var.invoke();
                                return;
                            }
                            final tb.s spec = tb.s.b(y0Var.f79055b, qVar.f116995a, null, null, null, 0, 0L, 0, 0, 0L, 0, 16777214);
                            o processor = j0Var.f82610g;
                            Intrinsics.checkNotNullExpressionValue(processor, "processor");
                            final WorkDatabase workDatabase = j0Var.f82607d;
                            Intrinsics.checkNotNullExpressionValue(workDatabase, "workDatabase");
                            kb.d configuration = j0Var.f82606c;
                            Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
                            final List schedulers = j0Var.f82609f;
                            Intrinsics.checkNotNullExpressionValue(schedulers, "schedulers");
                            tb.y y14 = workDatabase.y();
                            final String str3 = spec.f117016a;
                            final tb.s spec2 = y14.j(str3);
                            if (spec2 != null) {
                                if (spec2.f117017b.isFinished()) {
                                    kb.v0 v0Var = kb.v0.NOT_APPLIED;
                                    return;
                                }
                                if (!(spec2.f() ^ spec.f())) {
                                    final boolean e13 = processor.e(str3);
                                    if (!e13) {
                                        Iterator it = schedulers.iterator();
                                        while (it.hasNext()) {
                                            ((q) it.next()).a(str3);
                                        }
                                    }
                                    final Set set = y0Var.f79056c;
                                    workDatabase.q(new Runnable() { // from class: lb.m0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            WorkDatabase workDatabase2 = WorkDatabase.this;
                                            tb.y y15 = workDatabase2.y();
                                            tb.a0 z13 = workDatabase2.z();
                                            tb.s sVar = spec2;
                                            kb.s0 s0Var = sVar.f117017b;
                                            long j14 = sVar.f117029n;
                                            int i14 = sVar.f117035t + 1;
                                            long j15 = sVar.f117036u;
                                            int i15 = sVar.f117037v;
                                            int i16 = sVar.f117026k;
                                            int i17 = sVar.f117034s;
                                            tb.s sVar2 = spec;
                                            tb.s b14 = tb.s.b(sVar2, null, s0Var, null, null, i16, j14, i17, i14, j15, i15, 12835837);
                                            if (sVar2.f117037v == 1) {
                                                b14.f117036u = sVar2.f117036u;
                                                b14.f117037v++;
                                            }
                                            tb.s F1 = l0.F1(schedulers, b14);
                                            ja.d0 d0Var = y15.f117050a;
                                            d0Var.b();
                                            d0Var.c();
                                            try {
                                                y15.f117052c.m(F1);
                                                d0Var.r();
                                                d0Var.m();
                                                ja.d0 d0Var2 = z13.f116950a;
                                                d0Var2.b();
                                                tb.h hVar = z13.f116952c;
                                                oa.i a13 = hVar.a();
                                                String str4 = str3;
                                                a13.c1(1, str4);
                                                try {
                                                    d0Var2.c();
                                                    try {
                                                        a13.G();
                                                        d0Var2.r();
                                                        hVar.j(a13);
                                                        z13.a(str4, set);
                                                        if (e13) {
                                                            return;
                                                        }
                                                        y15.l(-1L, str4);
                                                        workDatabase2.x().a(str4);
                                                    } finally {
                                                        d0Var2.m();
                                                    }
                                                } catch (Throwable th3) {
                                                    hVar.j(a13);
                                                    throw th3;
                                                }
                                            } catch (Throwable th4) {
                                                d0Var.m();
                                                throw th4;
                                            }
                                        }
                                    });
                                    if (!e13) {
                                        s.b(configuration, workDatabase, schedulers);
                                    }
                                    kb.v0 v0Var2 = kb.v0.NOT_APPLIED;
                                    return;
                                }
                                StringBuilder sb3 = new StringBuilder("Can't update ");
                                Intrinsics.checkNotNullParameter(spec2, "spec");
                                sb3.append(spec2.f() ? "Periodic" : "OneTime");
                                sb3.append(" Worker to ");
                                Intrinsics.checkNotNullParameter(spec, "spec");
                                throw new UnsupportedOperationException(a.a.p(sb3, spec.f() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
                            }
                            throw new IllegalArgumentException(a.a.k("Worker with ", str3, " doesn't exist"));
                        }
                        throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                    }
                    throw new IllegalStateException(a.a.m("WorkSpec with ", str2, ", that matches a name \"", str, "\", wasn't found"));
                }
                throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
    }
}
