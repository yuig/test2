package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class k4 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u2.q f24893i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f24894j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b3.x0 f24895k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f24896l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f24897m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f24898n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f24899o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f24900p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f24901q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(u2.q qVar, boolean z13, b3.x0 x0Var, long j13, long j14, long j15, float f13, int i13, int i14) {
        super(2);
        this.f24893i = qVar;
        this.f24894j = z13;
        this.f24895k = x0Var;
        this.f24896l = j13;
        this.f24897m = j14;
        this.f24898n = j15;
        this.f24899o = f13;
        this.f24900p = i13;
        this.f24901q = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f24900p | 1);
        long j13 = this.f24897m;
        o4.a(this.f24893i, this.f24894j, this.f24895k, this.f24896l, j13, this.f24898n, this.f24899o, (i2.o) obj, p13, this.f24901q);
        return Unit.f80348a;
    }
}
