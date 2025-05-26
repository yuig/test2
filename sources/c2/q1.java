package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class q1 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u2.q f25083i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f25084j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f25085k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f25086l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f25087m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25088n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(u2.q qVar, long j13, float f13, float f14, int i13, int i14) {
        super(2);
        this.f25083i = qVar;
        this.f25084j = j13;
        this.f25085k = f13;
        this.f25086l = f14;
        this.f25087m = i13;
        this.f25088n = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f25087m | 1);
        float f13 = this.f25085k;
        float f14 = this.f25086l;
        j1.c(this.f25083i, this.f25084j, f13, f14, (i2.o) obj, p13, this.f25088n);
        return Unit.f80348a;
    }
}
