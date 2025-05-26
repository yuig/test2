package ft1;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements et1.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f62933a;

    /* renamed from: b, reason: collision with root package name */
    public final nt1.c f62934b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f62935c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f62936d;

    /* renamed from: e, reason: collision with root package name */
    public final long f62937e;

    public a(int i13, nt1.c format, ByteBuffer data, boolean z13, long j13) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f62933a = i13;
        this.f62934b = format;
        this.f62935c = data;
        this.f62936d = z13;
        this.f62937e = j13;
    }

    public static a b(a aVar, ByteBuffer byteBuffer, long j13, int i13) {
        int i14 = aVar.f62933a;
        nt1.c format = aVar.f62934b;
        if ((i13 & 4) != 0) {
            byteBuffer = aVar.f62935c;
        }
        ByteBuffer data = byteBuffer;
        boolean z13 = aVar.f62936d;
        if ((i13 & 16) != 0) {
            j13 = aVar.f62937e;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(data, "data");
        return new a(i14, format, data, z13, j13);
    }

    @Override // et1.a
    public final Object a() {
        if (this.f62933a < 0) {
            throw new RuntimeException("Invalid frame count");
        }
        ByteBuffer byteBuffer = this.f62935c;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        Intrinsics.checkNotNullExpressionValue(order, "order(...)");
        return b(this, order, 0L, 27);
    }

    public final long c() {
        long j13 = this.f62933a;
        Integer b13 = this.f62934b.b();
        Intrinsics.f(b13);
        nt1.e clockPeriod = new nt1.e(1, b13.intValue());
        Intrinsics.checkNotNullParameter(clockPeriod, "clockPeriod");
        return ml2.c.d(clockPeriod.a() * j13 * 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f62933a == aVar.f62933a && Intrinsics.d(this.f62934b, aVar.f62934b) && Intrinsics.d(this.f62935c, aVar.f62935c) && this.f62936d == aVar.f62936d && this.f62937e == aVar.f62937e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f62937e) + ep.b.e(this.f62936d, (this.f62935c.hashCode() + ((this.f62934b.hashCode() + (Integer.hashCode(this.f62933a) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AudioPacket(frameCount=");
        sb3.append(this.f62933a);
        sb3.append(", format=");
        sb3.append(this.f62934b);
        sb3.append(", data=");
        sb3.append(this.f62935c);
        sb3.append(", isKeyFrame=");
        sb3.append(this.f62936d);
        sb3.append(", presentationTimeUs=");
        return a.a.o(sb3, this.f62937e, ")");
    }
}
