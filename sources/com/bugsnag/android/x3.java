package com.bugsnag.android;

import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x3 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f29690a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29691b;

    public x3(UUID uuid, long j13) {
        this.f29690a = uuid;
        this.f29691b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj;
        return Intrinsics.d(this.f29690a, x3Var.f29690a) && this.f29691b == x3Var.f29691b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f29691b) + (this.f29690a.hashCode() * 31);
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        o1Var.d();
        o1Var.K("traceId");
        UUID uuid = this.f29690a;
        String format = String.format("%016x%016x", Arrays.copyOf(new Object[]{Long.valueOf(uuid.getMostSignificantBits()), Long.valueOf(uuid.getLeastSignificantBits())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        o1Var.z(format);
        o1Var.K("spanId");
        String format2 = String.format("%016x", Arrays.copyOf(new Object[]{Long.valueOf(this.f29691b)}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(this, *args)");
        o1Var.z(format2);
        o1Var.g();
    }

    public final String toString() {
        return "TraceCorrelation(traceId=" + this.f29690a + ", spanId=" + this.f29691b + ')';
    }
}
