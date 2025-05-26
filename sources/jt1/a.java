package jt1;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements et1.b {

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f77585a;

    @Override // et1.b
    public final void a(int i13, ByteBuffer sourceBuffer, ByteBuffer codecInputBuffer) {
        Intrinsics.checkNotNullParameter(sourceBuffer, "sourceBuffer");
        Intrinsics.checkNotNullParameter(codecInputBuffer, "codecInputBuffer");
        if (this.f77585a.capacity() < sourceBuffer.remaining()) {
            this.f77585a = ByteBuffer.allocateDirect(sourceBuffer.remaining());
        }
        this.f77585a.clear();
        if (this.f77585a.remaining() < sourceBuffer.remaining()) {
            this.f77585a = ByteBuffer.allocateDirect(sourceBuffer.remaining());
        }
        ByteBuffer directByteBuffer = this.f77585a;
        Intrinsics.checkNotNullExpressionValue(directByteBuffer, "directByteBuffer");
        nt1.d.f(i13, directByteBuffer, sourceBuffer);
        this.f77585a.flip();
        codecInputBuffer.clear();
        codecInputBuffer.put(this.f77585a);
        codecInputBuffer.flip();
        codecInputBuffer.order(sourceBuffer.order());
    }
}
