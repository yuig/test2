package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f24909i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f24910j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f24911k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kl2.l f24912l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f24913m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(long j13, long j14, boolean z13, kl2.l lVar, int i13) {
        super(2);
        this.f24909i = j13;
        this.f24910j = j14;
        this.f24911k = z13;
        this.f24912l = lVar;
        this.f24913m = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f24913m | 1);
        boolean z13 = this.f24911k;
        kl2.l lVar = this.f24912l;
        o0.d(this.f24909i, this.f24910j, z13, lVar, (i2.o) obj, p13);
        return Unit.f80348a;
    }
}
