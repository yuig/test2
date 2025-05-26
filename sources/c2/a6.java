package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class a6 extends kotlin.jvm.internal.s implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f24535i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f24536j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f24537k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f24538l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g4.j f24539m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g4.l f24540n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g4.e f24541o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f24542p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m4.k f24543q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m4.j f24544r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f24545s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f24546t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f24547u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f24548v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f24549w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function1 f24550x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b4.q0 f24551y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f24552z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(String str, u2.q qVar, long j13, long j14, g4.j jVar, g4.l lVar, g4.e eVar, long j15, m4.k kVar, m4.j jVar2, long j16, int i13, boolean z13, int i14, int i15, Function1 function1, b4.q0 q0Var, int i16, int i17, int i18) {
        super(2);
        this.f24535i = str;
        this.f24536j = qVar;
        this.f24537k = j13;
        this.f24538l = j14;
        this.f24539m = jVar;
        this.f24540n = lVar;
        this.f24541o = eVar;
        this.f24542p = j15;
        this.f24543q = kVar;
        this.f24544r = jVar2;
        this.f24545s = j16;
        this.f24546t = i13;
        this.f24547u = z13;
        this.f24548v = i14;
        this.f24549w = i15;
        this.f24550x = function1;
        this.f24551y = q0Var;
        this.f24552z = i16;
        this.A = i17;
        this.B = i18;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f24552z | 1);
        int p14 = i2.u.p(this.A);
        Function1 function1 = this.f24550x;
        b4.q0 q0Var = this.f24551y;
        d6.b(this.f24535i, this.f24536j, this.f24537k, this.f24538l, this.f24539m, this.f24540n, this.f24541o, this.f24542p, this.f24543q, this.f24544r, this.f24545s, this.f24546t, this.f24547u, this.f24548v, this.f24549w, function1, q0Var, (i2.o) obj, p13, p14, this.B);
        return Unit.f80348a;
    }
}
