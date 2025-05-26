package jg1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec.BufferInfo f76074a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f76075b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76076c;

    public w(int i13, MediaCodec.BufferInfo bufferInfo, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f76074a = bufferInfo;
        this.f76075b = buffer;
        this.f76076c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f76074a, wVar.f76074a) && Intrinsics.d(this.f76075b, wVar.f76075b) && this.f76076c == wVar.f76076c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76076c) + ((this.f76075b.hashCode() + (this.f76074a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OutputPacket(bufferInfo=");
        sb3.append(this.f76074a);
        sb3.append(", buffer=");
        sb3.append(this.f76075b);
        sb3.append(", bufferIndex=");
        return a.a.n(sb3, this.f76076c, ")");
    }
}
