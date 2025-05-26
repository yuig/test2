package kb;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m0 extends x0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Class workerClass, TimeUnit repeatIntervalTimeUnit) {
        super(workerClass);
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        tb.s sVar = this.f79051c;
        long millis = repeatIntervalTimeUnit.toMillis(1L);
        sVar.getClass();
        String str = tb.s.f117014y;
        if (millis < 900000) {
            b0.e().i(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long b13 = ql2.s.b(millis, 900000L);
        long b14 = ql2.s.b(millis, 900000L);
        if (b13 < 900000) {
            b0.e().i(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        sVar.f117023h = ql2.s.b(b13, 900000L);
        if (b14 < 300000) {
            b0.e().i(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (b14 > sVar.f117023h) {
            b0.e().i(str, "Flex duration greater than interval duration; Changed to " + b13);
        }
        sVar.f117024i = ql2.s.i(b14, 300000L, sVar.f117023h);
    }

    @Override // kb.x0
    public final y0 c() {
        if (this.f79049a && this.f79051c.f117025j.f78992d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }
        if (!(!this.f79051c.f117032q)) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
        }
        Intrinsics.checkNotNullParameter(this, "builder");
        return new n0(this.f79050b, this.f79051c, this.f79052d);
    }

    @Override // kb.x0
    public final x0 d() {
        return this;
    }
}
