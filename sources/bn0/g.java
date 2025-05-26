package bn0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f23573a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaFormat f23574b;

    public g(MediaCodec codec, MediaFormat format) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f23573a = codec;
        this.f23574b = format;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f23573a, gVar.f23573a) && Intrinsics.d(this.f23574b, gVar.f23574b);
    }

    public final int hashCode() {
        return this.f23574b.hashCode() + (this.f23573a.hashCode() * 31);
    }

    public final String toString() {
        return "OutputFormatChanged(codec=" + this.f23573a + ", format=" + this.f23574b + ")";
    }
}
