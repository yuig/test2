package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24616i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f24617j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f24618k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f24619l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f24620m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function2 f24621n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f24622o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f24623p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f24624q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f24625r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Function2 function2, u2.q qVar, Function2 function22, kl2.l lVar, long j13, long j14, float f13, int i13, int i14) {
        super(2);
        this.f24621n = function2;
        this.f24617j = qVar;
        this.f24624q = function22;
        this.f24625r = lVar;
        this.f24618k = j13;
        this.f24619l = j14;
        this.f24620m = f13;
        this.f24622o = i13;
        this.f24623p = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f24616i;
        int i15 = this.f24622o;
        Object obj = this.f24625r;
        Object obj2 = this.f24624q;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                e0.c(this.f24621n, this.f24617j, (Function2) obj2, (kl2.l) obj, this.f24618k, this.f24619l, this.f24620m, oVar, p13, this.f24623p);
                break;
            default:
                int p14 = i2.u.p(i15 | 1);
                long j13 = this.f24619l;
                int i16 = this.f24623p;
                j1.h(this.f24617j, (b3.x0) obj2, this.f24618k, j13, (k1.y) obj, this.f24620m, this.f24621n, oVar, p14, i16);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24616i) {
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
    public d0(u2.q qVar, b3.x0 x0Var, long j13, long j14, k1.y yVar, float f13, Function2 function2, int i13, int i14) {
        super(2);
        this.f24617j = qVar;
        this.f24624q = x0Var;
        this.f24618k = j13;
        this.f24619l = j14;
        this.f24625r = yVar;
        this.f24620m = f13;
        this.f24621n = function2;
        this.f24622o = i13;
        this.f24623p = i14;
    }
}
