package ac2;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1967i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f1968j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f1969k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(long j13, long j14, TimeUnit timeUnit) {
        super(1);
        this.f1967i = j13;
        this.f1968j = j14;
        this.f1969k = timeUnit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            int i13 = uj2.h.f122339a;
            return gk2.g1.f65417b;
        }
        uj2.a0 a0Var = tk2.e.f118016b;
        int i14 = uj2.h.f122339a;
        TimeUnit timeUnit = this.f1969k;
        ck2.i.b(timeUnit, "unit is null");
        ck2.i.b(a0Var, "scheduler is null");
        return new gk2.f1(new gk2.a1(Math.max(0L, this.f1967i), Math.max(0L, this.f1968j), timeUnit, a0Var), new r42.k(12, g0.f1956j), 0);
    }
}
