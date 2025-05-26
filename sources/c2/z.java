package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25432i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p1.m1 f25433j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f25434k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kl2.l f25435l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f25436m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f25437n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f25438o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f25439p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f25440q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f25441r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f25442s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(long j13, long j14, float f13, p1.x0 x0Var, b3.x0 x0Var2, p1.m1 m1Var, u2.q qVar, kl2.l lVar, int i13, int i14) {
        super(2);
        this.f25436m = j13;
        this.f25437n = j14;
        this.f25438o = f13;
        this.f25441r = x0Var;
        this.f25442s = x0Var2;
        this.f25433j = m1Var;
        this.f25434k = qVar;
        this.f25435l = lVar;
        this.f25439p = i13;
        this.f25440q = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f25432i;
        int i15 = this.f25439p;
        Object obj = this.f25442s;
        Object obj2 = this.f25441r;
        switch (i14) {
            case 0:
                b3.x0 x0Var = (b3.x0) obj;
                int p13 = i2.u.p(i15 | 1);
                p1.m1 m1Var = this.f25433j;
                u2.q qVar = this.f25434k;
                e0.a(this.f25436m, this.f25437n, this.f25438o, (p1.x0) obj2, x0Var, m1Var, qVar, this.f25435l, oVar, p13, this.f25440q);
                break;
            default:
                int p14 = i2.u.p(i15 | 1);
                long j13 = this.f25436m;
                int i16 = this.f25440q;
                e0.b((Function2) obj2, this.f25433j, this.f25434k, (Function2) obj, this.f25435l, j13, this.f25437n, this.f25438o, oVar, p14, i16);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f25432i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Function2 function2, p1.m1 m1Var, u2.q qVar, Function2 function22, kl2.l lVar, long j13, long j14, float f13, int i13, int i14) {
        super(2);
        this.f25441r = function2;
        this.f25433j = m1Var;
        this.f25434k = qVar;
        this.f25442s = function22;
        this.f25435l = lVar;
        this.f25436m = j13;
        this.f25437n = j14;
        this.f25438o = f13;
        this.f25439p = i13;
        this.f25440q = i14;
    }
}
