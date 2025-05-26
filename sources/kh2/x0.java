package kh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79732i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ sg2.a f79733j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q2 f79734k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b1 f79735l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(b1 b1Var, q2 q2Var, sg2.a aVar) {
        super(0);
        this.f79732i = 2;
        this.f79735l = b1Var;
        this.f79734k = q2Var;
        this.f79733j = aVar;
    }

    public final uf2.d b() {
        int i13 = this.f79732i;
        int i14 = 7;
        q2 q2Var = this.f79734k;
        sg2.a aVar = this.f79733j;
        b1 b1Var = this.f79735l;
        switch (i13) {
            case 1:
                return new uf2.d(new x0(aVar, q2Var, b1Var, 0), null, 14);
            case 2:
                return new uf2.d(new fe2.a(15, b1Var, q2Var), new v0(aVar, 4), 12);
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            default:
                return new uf2.d(new x0(aVar, q2Var, b1Var, 13), new v0(aVar, 7), 12);
            case 4:
                return new uf2.d(new x0(aVar, b1Var, q2Var, 3), null, 14);
            case 6:
                return new uf2.d(new x0(aVar, q2Var, b1Var, 5), null, 14);
            case 8:
                return new uf2.d(new x0(aVar, q2Var, b1Var, i14), null, 14);
            case 10:
                return new uf2.d(new x0(aVar, b1Var, q2Var, 9), null, 14);
            case 12:
                return new uf2.d(new x0(aVar, q2Var, b1Var, 11), new v0(aVar, 6), 12);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79732i;
        b1 b1Var = this.f79735l;
        q2 q2Var = this.f79734k;
        sg2.a aVar = this.f79733j;
        switch (i13) {
            case 0:
                tg2.i breadcrumbBehavior = ((sg2.b) aVar).f112878c;
                ei2.a writer = ((s2) q2Var).a();
                lh2.b logger = ((d1) b1Var).f79456b;
                Intrinsics.checkNotNullParameter(breadcrumbBehavior, "breadcrumbBehavior");
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(logger, "logger");
                return new dg2.c(writer, logger, new wf2.c(new dg2.b(breadcrumbBehavior, 0)));
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                d1 d1Var = (d1) b1Var;
                return new dg2.e(((sg2.b) aVar).f112878c, d1Var.f79455a, ((s2) q2Var).a(), d1Var.f79456b);
            case 4:
                return b();
            case 5:
                tg2.i breadcrumbBehavior2 = ((sg2.b) aVar).f112878c;
                ei2.v spanService = ((s2) q2Var).e();
                lh2.b logger2 = ((d1) b1Var).f79456b;
                Intrinsics.checkNotNullParameter(breadcrumbBehavior2, "breadcrumbBehavior");
                Intrinsics.checkNotNullParameter(spanService, "spanService");
                Intrinsics.checkNotNullParameter(logger2, "logger");
                return new dg2.h(spanService, logger2, new wf2.c(new dg2.f(breadcrumbBehavior2, 0)));
            case 6:
                return b();
            case 7:
                return new dg2.j(((sg2.b) aVar).f112878c, ((s2) q2Var).a(), ((d1) b1Var).f79456b);
            case 8:
                return b();
            case 9:
                d1 d1Var2 = (d1) b1Var;
                return new dg2.l(((sg2.b) aVar).f112878c, d1Var2.f79455a, ((s2) q2Var).e(), d1Var2.f79456b);
            case 10:
                return b();
            case 11:
                d1 d1Var3 = (d1) b1Var;
                return new ng2.d(((sg2.b) aVar).f112887l, ((s2) q2Var).a(), d1Var3.f79456b, d1Var3.a());
            case 12:
                return b();
            case 13:
                return new dg2.m(((sg2.b) aVar).f112878c, ((s2) q2Var).a(), ((d1) b1Var).f79456b);
            default:
                return b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(sg2.a aVar, b1 b1Var, q2 q2Var, int i13) {
        super(0);
        this.f79732i = i13;
        this.f79733j = aVar;
        this.f79735l = b1Var;
        this.f79734k = q2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(sg2.a aVar, q2 q2Var, b1 b1Var, int i13) {
        super(0);
        this.f79732i = i13;
        this.f79733j = aVar;
        this.f79734k = q2Var;
        this.f79735l = b1Var;
    }
}
