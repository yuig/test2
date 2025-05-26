package c2;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class c6 extends kotlin.jvm.internal.s implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b4.g f24592i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f24593j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f24594k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f24595l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g4.j f24596m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g4.l f24597n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g4.e f24598o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f24599p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m4.k f24600q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m4.j f24601r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f24602s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f24603t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f24604u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f24605v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f24606w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Map f24607x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function1 f24608y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ b4.q0 f24609z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(b4.g gVar, u2.q qVar, long j13, long j14, g4.j jVar, g4.l lVar, g4.e eVar, long j15, m4.k kVar, m4.j jVar2, long j16, int i13, boolean z13, int i14, int i15, Map map, Function1 function1, b4.q0 q0Var, int i16, int i17, int i18) {
        super(2);
        this.f24592i = gVar;
        this.f24593j = qVar;
        this.f24594k = j13;
        this.f24595l = j14;
        this.f24596m = jVar;
        this.f24597n = lVar;
        this.f24598o = eVar;
        this.f24599p = j15;
        this.f24600q = kVar;
        this.f24601r = jVar2;
        this.f24602s = j16;
        this.f24603t = i13;
        this.f24604u = z13;
        this.f24605v = i14;
        this.f24606w = i15;
        this.f24607x = map;
        this.f24608y = function1;
        this.f24609z = q0Var;
        this.A = i16;
        this.B = i17;
        this.C = i18;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.A | 1);
        int p14 = i2.u.p(this.B);
        Function1 function1 = this.f24608y;
        b4.q0 q0Var = this.f24609z;
        d6.c(this.f24592i, this.f24593j, this.f24594k, this.f24595l, this.f24596m, this.f24597n, this.f24598o, this.f24599p, this.f24600q, this.f24601r, this.f24602s, this.f24603t, this.f24604u, this.f24605v, this.f24606w, this.f24607x, function1, q0Var, (i2.o) obj, p13, p14, this.C);
        return Unit.f80348a;
    }
}
