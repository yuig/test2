package et1;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements a {

    /* renamed from: a, reason: collision with root package name */
    public final nt1.c f60037a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f60038b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f60039c;

    /* renamed from: d, reason: collision with root package name */
    public final long f60040d;

    public k(nt1.c format, ByteBuffer data, boolean z13, long j13) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f60037a = format;
        this.f60038b = data;
        this.f60039c = z13;
        this.f60040d = j13;
    }

    @Override // et1.a
    public final Object a() {
        ByteBuffer byteBuffer = this.f60038b;
        ByteBuffer data = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        Intrinsics.checkNotNullExpressionValue(data, "order(...)");
        nt1.c format = this.f60037a;
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(data, "data");
        return new k(format, data, this.f60039c, this.f60040d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f60037a, kVar.f60037a) && Intrinsics.d(this.f60038b, kVar.f60038b) && this.f60039c == kVar.f60039c && this.f60040d == kVar.f60040d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f60040d) + ep.b.e(this.f60039c, (this.f60038b.hashCode() + (this.f60037a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "MediaPacket(format=" + this.f60037a + ", data=" + this.f60038b + ", isKeyFrame=" + this.f60039c + ", presentationTimeUs=" + this.f60040d + ")";
    }
}
