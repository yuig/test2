package bn0;

import android.media.MediaCodec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends h {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f23568a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23569b;

    public e(MediaCodec codec, int i13) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f23568a = codec;
        this.f23569b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f23568a, eVar.f23568a) && this.f23569b == eVar.f23569b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23569b) + (this.f23568a.hashCode() * 31);
    }

    public final String toString() {
        return "InputBufferAvailable(codec=" + this.f23568a + ", index=" + this.f23569b + ")";
    }
}
