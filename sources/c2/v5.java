package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class v5 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x5 f25317i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v2 f25318j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f25319k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f25320l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kl2.l f25321m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f25322n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kl2.o f25323o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f25324p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(x5 x5Var, v2 v2Var, long j13, long j14, kl2.l lVar, boolean z13, kl2.o oVar, int i13) {
        super(2);
        this.f25317i = x5Var;
        this.f25318j = v2Var;
        this.f25319k = j13;
        this.f25320l = j14;
        this.f25321m = lVar;
        this.f25322n = z13;
        this.f25323o = oVar;
        this.f25324p = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f25324p | 1);
        boolean z13 = this.f25322n;
        kl2.o oVar = this.f25323o;
        this.f25317i.a(this.f25318j, this.f25319k, this.f25320l, this.f25321m, z13, oVar, (i2.o) obj, p13);
        return Unit.f80348a;
    }
}
