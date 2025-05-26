package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class e3 extends kotlin.jvm.internal.s implements Function2 {
    public final /* synthetic */ b3.x0 A;
    public final /* synthetic */ m1 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24665i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f24666j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f24667k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f24668l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f24669m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b4.q0 f24670n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function2 f24671o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Function2 f24672p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Function2 f24673q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function2 f24674r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f24675s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h4.p0 f24676t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w1.k1 f24677u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w1.j1 f24678v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f24679w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f24680x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f24681y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ o1.l f24682z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(Object obj, Function1 function1, u2.q qVar, boolean z13, boolean z14, b4.q0 q0Var, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z15, h4.p0 p0Var, w1.k1 k1Var, w1.j1 j1Var, boolean z16, int i13, int i14, o1.l lVar, b3.x0 x0Var, m1 m1Var, int i15, int i16, int i17, int i18) {
        super(2);
        this.f24665i = i18;
        this.F = obj;
        this.f24666j = function1;
        this.f24667k = qVar;
        this.f24668l = z13;
        this.f24669m = z14;
        this.f24670n = q0Var;
        this.f24671o = function2;
        this.f24672p = function22;
        this.f24673q = function23;
        this.f24674r = function24;
        this.f24675s = z15;
        this.f24676t = p0Var;
        this.f24677u = k1Var;
        this.f24678v = j1Var;
        this.f24679w = z16;
        this.f24680x = i13;
        this.f24681y = i14;
        this.f24682z = lVar;
        this.A = x0Var;
        this.B = m1Var;
        this.C = i15;
        this.D = i16;
        this.E = i17;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f24665i;
        int i15 = this.D;
        int i16 = this.C;
        Object obj = this.F;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i16 | 1);
                int p14 = i2.u.p(i15);
                j3.a((h4.f0) obj, this.f24666j, this.f24667k, this.f24668l, this.f24669m, this.f24670n, this.f24671o, this.f24672p, this.f24673q, this.f24674r, this.f24675s, this.f24676t, this.f24677u, this.f24678v, this.f24679w, this.f24680x, this.f24681y, this.f24682z, this.A, this.B, oVar, p13, p14, this.E);
                break;
            default:
                int p15 = i2.u.p(i16 | 1);
                int p16 = i2.u.p(i15);
                s5.a((String) obj, this.f24666j, this.f24667k, this.f24668l, this.f24669m, this.f24670n, this.f24671o, this.f24672p, this.f24673q, this.f24674r, this.f24675s, this.f24676t, this.f24677u, this.f24678v, this.f24679w, this.f24680x, this.f24681y, this.f24682z, this.A, this.B, oVar, p15, p16, this.E);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24665i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
