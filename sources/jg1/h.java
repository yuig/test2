package jg1;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f75997a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75998b;

    public h(int i13, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f75997a = buffer;
        this.f75998b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f75997a, hVar.f75997a) && this.f75998b == hVar.f75998b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f75998b) + (this.f75997a.hashCode() * 31);
    }

    public final String toString() {
        return "InputPacket(buffer=" + this.f75997a + ", bufferIndex=" + this.f75998b + ")";
    }
}
