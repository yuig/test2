package w80;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k1 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b1 f128329i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f128330j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f128331k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c1 f128332l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f128333m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f128334n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f128335o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u2.q f128336p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f128337q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f128338r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(b1 b1Var, long j13, int i13, c1 c1Var, float f13, long j14, String str, u2.q qVar, int i14, int i15) {
        super(2);
        this.f128329i = b1Var;
        this.f128330j = j13;
        this.f128331k = i13;
        this.f128332l = c1Var;
        this.f128333m = f13;
        this.f128334n = j14;
        this.f128335o = str;
        this.f128336p = qVar;
        this.f128337q = i14;
        this.f128338r = i15;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f128337q | 1);
        u2.q qVar = this.f128336p;
        gh0.b.c(this.f128329i, this.f128330j, this.f128331k, this.f128332l, this.f128333m, this.f128334n, this.f128335o, qVar, (i2.o) obj, p13, this.f128338r);
        return Unit.f80348a;
    }
}
