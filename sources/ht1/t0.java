package ht1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t0 implements mt1.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f70352a;

    /* renamed from: b, reason: collision with root package name */
    public final long f70353b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f70354c;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f70355d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f70356e;

    public t0(long j13, long j14) {
        this.f70352a = j13;
        this.f70353b = j14;
    }

    @Override // mt1.a
    public final void a(Object obj) {
        Function1 function1;
        et1.k incomingPacket = (et1.k) obj;
        Intrinsics.checkNotNullParameter(incomingPacket, "incomingPacket");
        long j13 = incomingPacket.f60040d;
        boolean z13 = j13 < this.f70352a;
        if (j13 < this.f70353b) {
            if (z13 || (function1 = this.f70354c) == null) {
                return;
            }
            function1.invoke(incomingPacket);
            return;
        }
        if (this.f70356e) {
            return;
        }
        this.f70356e = true;
        Function0 function0 = this.f70355d;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        this.f70354c = producePacketCallback;
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
        this.f70355d = doneProducingCallback;
    }

    @Override // mt1.a
    public final void g() {
        if (this.f70356e) {
            return;
        }
        this.f70356e = true;
        Function0 function0 = this.f70355d;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TimeRangeTrimmer startTimeUs [");
        sb3.append(this.f70352a);
        sb3.append("] endTimeUs [");
        return a.a.o(sb3, this.f70353b, "]");
    }
}
