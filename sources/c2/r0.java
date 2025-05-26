package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function0 f25115i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f25116j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f25117k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o1.l f25118l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h1 f25119m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b3.x0 f25120n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k1.y f25121o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d1 f25122p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p1.x0 f25123q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kl2.l f25124r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f25125s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f25126t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Function0 function0, u2.q qVar, boolean z13, o1.l lVar, h1 h1Var, b3.x0 x0Var, k1.y yVar, d1 d1Var, p1.x0 x0Var2, kl2.l lVar2, int i13, int i14) {
        super(2);
        this.f25115i = function0;
        this.f25116j = qVar;
        this.f25117k = z13;
        this.f25118l = lVar;
        this.f25119m = h1Var;
        this.f25120n = x0Var;
        this.f25121o = yVar;
        this.f25122p = d1Var;
        this.f25123q = x0Var2;
        this.f25124r = lVar2;
        this.f25125s = i13;
        this.f25126t = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f25125s | 1);
        p1.x0 x0Var = this.f25123q;
        kl2.l lVar = this.f25124r;
        j1.a(this.f25115i, this.f25116j, this.f25117k, this.f25118l, this.f25119m, this.f25120n, this.f25121o, this.f25122p, x0Var, lVar, (i2.o) obj, p13, this.f25126t);
        return Unit.f80348a;
    }
}
