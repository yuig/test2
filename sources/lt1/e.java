package lt1;

import et1.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements mt1.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f84815a;

    /* renamed from: b, reason: collision with root package name */
    public Long f84816b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f84817c;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f84818d;

    public e(long j13) {
        this.f84815a = j13;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        k incomingPacket = (k) obj;
        Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
        if (this.f84816b == null) {
            this.f84816b = Long.valueOf(this.f84815a - incomingPacket.f60040d);
        }
        nt1.c cVar = incomingPacket.f60037a;
        Long l13 = this.f84816b;
        Intrinsics.f(l13);
        k kVar = new k(cVar, incomingPacket.f60038b, incomingPacket.f60039c, incomingPacket.f60040d + l13.longValue());
        Function1 function1 = this.f84817c;
        if (function1 != null) {
            function1.invoke(kVar);
        }
    }

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        this.f84817c = producePacketCallback;
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
        this.f84818d = doneProducingCallback;
    }

    @Override // mt1.a
    public final void g() {
        Function0 function0 = this.f84818d;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final String toString() {
        return "MediaPacketStartTimeSetterNode startTimeUs=[" + this.f84815a + "] timestampAdjustmentUs=[" + this.f84816b + "]";
    }
}
