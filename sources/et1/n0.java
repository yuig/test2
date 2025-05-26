package et1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f60059a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f60060b;

    /* renamed from: c, reason: collision with root package name */
    public final MediaCodec.BufferInfo f60061c;

    public n0(j0 sampleType, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(sampleType, "sampleType");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        this.f60059a = sampleType;
        this.f60060b = byteBuffer;
        this.f60061c = bufferInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f60059a == n0Var.f60059a && Intrinsics.d(this.f60060b, n0Var.f60060b) && Intrinsics.d(this.f60061c, n0Var.f60061c);
    }

    public final int hashCode() {
        return this.f60061c.hashCode() + ((this.f60060b.hashCode() + (this.f60059a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MuxSample(sampleType=" + this.f60059a + ", byteBuffer=" + this.f60060b + ", bufferInfo=" + this.f60061c + ")";
    }
}
