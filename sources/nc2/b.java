package nc2;

import android.media.MediaCodecInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f90385a;

    /* renamed from: b, reason: collision with root package name */
    public final int f90386b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f90387c;

    /* renamed from: d, reason: collision with root package name */
    public final int f90388d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f90389e;

    public b(int i13, int i14, boolean z13, int i15, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        this.f90385a = i13;
        this.f90386b = i14;
        this.f90387c = z13;
        this.f90388d = i15;
        this.f90389e = codecCapabilities;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f90385a == bVar.f90385a && this.f90386b == bVar.f90386b && this.f90387c == bVar.f90387c && this.f90388d == bVar.f90388d && Intrinsics.d(this.f90389e, bVar.f90389e);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f90388d, ep.b.e(this.f90387c, ep.b.b(this.f90386b, Integer.hashCode(this.f90385a) * 31, 31), 31), 31);
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f90389e;
        return b13 + (codecCapabilities == null ? 0 : codecCapabilities.hashCode());
    }

    public final String toString() {
        return "Info(maxBitrateHardware=" + this.f90385a + ", maxBitrateSoftware=" + this.f90386b + ", hasHardwareDecoder=" + this.f90387c + ", maxCodecInstances=" + this.f90388d + ", codecCapabilities=" + this.f90389e + ")";
    }
}
