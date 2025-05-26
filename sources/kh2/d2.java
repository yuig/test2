package kh2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79462i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ vh2.d f79463j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j2 f79464k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(j2 j2Var, vh2.d dVar, int i13) {
        super(0);
        this.f79462i = i13;
        this.f79464k = j2Var;
        this.f79463j = dVar;
    }

    public final Unit b() {
        int i13 = 0;
        int i14 = this.f79462i;
        vh2.d dVar = this.f79463j;
        j2 j2Var = this.f79464k;
        switch (i14) {
            case 2:
                dVar.d(xk2.m.b(new e2(j2Var, 9)));
                of2.b a13 = ((i) j2Var.b()).a();
                if (a13 == null) {
                    return null;
                }
                of2.h hVar = (of2.h) a13;
                hVar.f94431b.b(new of2.f(hVar, 3));
                return Unit.f80348a;
            default:
                k2 k2Var = j2Var.G;
                if (k2Var == null) {
                    Intrinsics.r("nativeCoreModule");
                    throw null;
                }
                ((l2) k2Var).a().a();
                dVar.d(xk2.m.b(new e2(j2Var, 16)));
                k2 k2Var2 = j2Var.G;
                if (k2Var2 == null) {
                    Intrinsics.r("nativeCoreModule");
                    throw null;
                }
                l2 l2Var = (l2) k2Var2;
                oh2.d dVar2 = (oh2.d) l2Var.f79605f.a(l2Var, l2.f79599h[3]);
                if (dVar2 == null) {
                    return null;
                }
                dVar2.f94612e.b(new oh2.c(dVar2, i13));
                return Unit.f80348a;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = 2;
        switch (this.f79462i) {
            case 0:
                j2 j2Var = this.f79464k;
                o0 g13 = j2Var.g();
                this.f79463j.d(xk2.m.b(new sf2.a(j2Var, 27)), xk2.m.b(new c2(g13, 0)), xk2.m.b(new c2(g13, 1)));
                tg2.m mVar = ((sg2.b) ((m) j2Var.c()).b()).f112883h;
                if (mVar.f117614a.getEnabledFeatures().isHttpUrlConnectionCaptureEnabled()) {
                    try {
                        c0.d.M2("network-monitoring-installation");
                        qh2.j.c(mVar.f117614a.getEnabledFeatures().isRequestContentLengthCaptureEnabled());
                        Unit unit = Unit.f80348a;
                    } finally {
                    }
                }
                return ((m3) j2Var.m()).a(ki2.g.f79814f).b(new qg2.f(i13, j2Var, g13));
            case 1:
                m173invoke();
                return Unit.f80348a;
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                m173invoke();
                return Unit.f80348a;
            case 5:
                m173invoke();
                return Unit.f80348a;
            default:
                m173invoke();
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(vh2.d dVar, j2 j2Var, int i13) {
        super(0);
        this.f79462i = i13;
        this.f79463j = dVar;
        this.f79464k = j2Var;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m173invoke() {
        int i13 = 4;
        int i14 = 3;
        int i15 = this.f79462i;
        vh2.d dVar = this.f79463j;
        j2 j2Var = this.f79464k;
        switch (i15) {
            case 1:
                dVar.d(xk2.m.b(new e2(j2Var, i14)), xk2.m.b(new e2(j2Var, i13)), xk2.m.b(new e2(j2Var, 5)), xk2.m.b(new e2(j2Var, 6)));
                return;
            case 2:
            case 3:
            default:
                dVar.c(xk2.m.b(new i2(j2Var, 1)));
                dVar.c(xk2.m.b(new i2(j2Var, 2)));
                q2 q2Var = j2Var.f79551c;
                tg2.q sensitiveKeysBehavior = ((sg2.b) ((m) j2Var.c()).b()).f112879d;
                s2 s2Var = (s2) q2Var;
                s2Var.getClass();
                Intrinsics.checkNotNullParameter(sensitiveKeysBehavior, "sensitiveKeysBehavior");
                s2Var.f79694h = sensitiveKeysBehavior;
                ei2.i iVar = (ei2.i) s2Var.b();
                iVar.getClass();
                Intrinsics.checkNotNullParameter(sensitiveKeysBehavior, "sensitiveKeysBehavior");
                iVar.f58993d = sensitiveKeysBehavior;
                return;
            case 4:
                dVar.c(xk2.m.b(new e2(j2Var, 18)));
                dVar.c(xk2.m.b(new e2(j2Var, 19)));
                mh2.n nVar = (mh2.n) ((s2) j2Var.f79551c).f79701o.getValue();
                e2 onLogsStored = new e2(j2Var, 20);
                nVar.getClass();
                Intrinsics.checkNotNullParameter(onLogsStored, "onLogsStored");
                nVar.f87195c = onLogsStored;
                return;
            case 5:
                dVar.c(xk2.m.b(new e2(j2Var, 25)));
                s sVar = j2Var.L;
                if (sVar != null) {
                    v vVar = (v) sVar;
                    cg2.c cVar = (cg2.c) ((cg2.a) vVar.f79721b.a(vVar, v.f79719d[1]));
                    cVar.g(xk2.m.b(new e2(j2Var, 26)));
                    cVar.g(xk2.m.b(new e2(j2Var, 27)));
                    cVar.g(xk2.m.b(new e2(j2Var, 28)));
                    cVar.g(xk2.m.b(new e2(j2Var, 29)));
                    return;
                }
                Intrinsics.r("crashModule");
                throw null;
        }
    }
}
