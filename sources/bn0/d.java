package bn0;

import android.media.MediaCodec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends h {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f23566a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaCodec.CodecException f23567b;

    public d(MediaCodec codec, MediaCodec.CodecException e13) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f23566a = codec;
        this.f23567b = e13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f23566a, dVar.f23566a) && Intrinsics.d(this.f23567b, dVar.f23567b);
    }

    public final int hashCode() {
        return this.f23567b.hashCode() + (this.f23566a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(codec=" + this.f23566a + ", e=" + this.f23567b + ")";
    }
}
