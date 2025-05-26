package s3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class p1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110866i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q1 f110867j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.p f110868k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m1 f110869l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f110870m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f110871n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f110872o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f110873p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f110874q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(q1 q1Var, u2.p pVar, m1 m1Var, long j13, v vVar, boolean z13, boolean z14, float f13, int i13) {
        super(0);
        this.f110866i = i13;
        this.f110867j = q1Var;
        this.f110868k = pVar;
        this.f110869l = m1Var;
        this.f110870m = j13;
        this.f110871n = vVar;
        this.f110872o = z13;
        this.f110873p = z14;
        this.f110874q = f13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f110866i) {
            case 0:
                m252invoke();
                break;
            default:
                m252invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m252invoke() {
        int i13 = 16;
        int i14 = this.f110866i;
        u2.p pVar = this.f110868k;
        m1 m1Var = this.f110869l;
        switch (i14) {
            case 0:
                switch (((vb0.i) m1Var).f125465a) {
                    case 0:
                        break;
                    default:
                        i13 = 8;
                        break;
                }
                u2.p h10 = kh2.r.h(pVar, i13);
                boolean z13 = this.f110873p;
                q1 q1Var = this.f110867j;
                m1 m1Var2 = this.f110869l;
                long j13 = this.f110870m;
                v vVar = this.f110871n;
                boolean z14 = this.f110872o;
                if (h10 == null) {
                    q1Var.c1(m1Var2, j13, vVar, z14, z13);
                    break;
                } else {
                    q1Var.getClass();
                    float f13 = this.f110874q;
                    vVar.c(h10, f13, z13, new p1(q1Var, h10, m1Var2, j13, vVar, z14, z13, f13, 0));
                    break;
                }
            default:
                switch (((vb0.i) m1Var).f125465a) {
                    case 0:
                        break;
                    default:
                        i13 = 8;
                        break;
                }
                this.f110867j.o1(kh2.r.h(pVar, i13), this.f110869l, this.f110870m, this.f110871n, this.f110872o, this.f110873p, this.f110874q);
                break;
        }
    }
}
