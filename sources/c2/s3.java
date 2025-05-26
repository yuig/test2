package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class s3 extends kotlin.jvm.internal.s implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u2.q f25190i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a4 f25191j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f25192k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function2 f25193l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kl2.l f25194m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function2 f25195n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f25196o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f25197p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kl2.l f25198q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f25199r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b3.x0 f25200s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f25201t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f25202u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f25203v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f25204w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f25205x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f25206y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ kl2.l f25207z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(u2.q qVar, a4 a4Var, Function2 function2, Function2 function22, kl2.l lVar, Function2 function23, int i13, boolean z13, kl2.l lVar2, boolean z14, b3.x0 x0Var, float f13, long j13, long j14, long j15, long j16, long j17, kl2.l lVar3, int i14, int i15, int i16) {
        super(2);
        this.f25190i = qVar;
        this.f25191j = a4Var;
        this.f25192k = function2;
        this.f25193l = function22;
        this.f25194m = lVar;
        this.f25195n = function23;
        this.f25196o = i13;
        this.f25197p = z13;
        this.f25198q = lVar2;
        this.f25199r = z14;
        this.f25200s = x0Var;
        this.f25201t = f13;
        this.f25202u = j13;
        this.f25203v = j14;
        this.f25204w = j15;
        this.f25205x = j16;
        this.f25206y = j17;
        this.f25207z = lVar3;
        this.A = i14;
        this.B = i15;
        this.C = i16;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.A | 1);
        int p14 = i2.u.p(this.B);
        long j13 = this.f25206y;
        kl2.l lVar = this.f25207z;
        y3.a(this.f25190i, this.f25191j, this.f25192k, this.f25193l, this.f25194m, this.f25195n, this.f25196o, this.f25197p, this.f25198q, this.f25199r, this.f25200s, this.f25201t, this.f25202u, this.f25203v, this.f25204w, this.f25205x, j13, lVar, (i2.o) obj, p13, p14, this.C);
        return Unit.f80348a;
    }
}
