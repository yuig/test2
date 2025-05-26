package bn0;

import android.media.MediaCodec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends h {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f23570a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23571b;

    /* renamed from: c, reason: collision with root package name */
    public final MediaCodec.BufferInfo f23572c;

    public f(MediaCodec codec, int i13, MediaCodec.BufferInfo info2) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(info2, "info");
        this.f23570a = codec;
        this.f23571b = i13;
        this.f23572c = info2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f23570a, fVar.f23570a) && this.f23571b == fVar.f23571b && Intrinsics.d(this.f23572c, fVar.f23572c);
    }

    public final int hashCode() {
        return this.f23572c.hashCode() + ep.b.b(this.f23571b, this.f23570a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "OutputBufferAvailable(codec=" + this.f23570a + ", index=" + this.f23571b + ", info=" + this.f23572c + ")";
    }
}
