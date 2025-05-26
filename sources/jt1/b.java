package jt1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements et1.b {
    @Override // et1.b
    public final void a(int i13, ByteBuffer sourceBuffer, ByteBuffer codecInputBuffer) {
        Intrinsics.checkNotNullParameter(sourceBuffer, "sourceBuffer");
        Intrinsics.checkNotNullParameter(codecInputBuffer, "codecInputBuffer");
        if (!sourceBuffer.isDirect() && !sourceBuffer.isReadOnly()) {
            ByteOrder newByteOrder = codecInputBuffer.order();
            Intrinsics.checkNotNullExpressionValue(newByteOrder, "order(...)");
            Intrinsics.checkNotNullParameter(sourceBuffer, "<this>");
            Intrinsics.checkNotNullParameter(newByteOrder, "newByteOrder");
            if (i13 > 1 && !Intrinsics.d(sourceBuffer.order(), newByteOrder)) {
                sourceBuffer.order(newByteOrder);
                int position = sourceBuffer.position();
                int limit = sourceBuffer.limit();
                while (sourceBuffer.remaining() >= i13) {
                    int position2 = sourceBuffer.position();
                    int i14 = i13 / 2;
                    for (int i15 = 0; i15 < i14; i15++) {
                        int i16 = position2 + i15;
                        int i17 = ((i13 - 1) - i15) + position2;
                        byte b13 = sourceBuffer.get(i16);
                        sourceBuffer.put(i16, sourceBuffer.get(i17));
                        sourceBuffer.put(i17, b13);
                    }
                    sourceBuffer.position(position2 + i13);
                }
                sourceBuffer.position(position);
                sourceBuffer.limit(limit);
            }
        }
        codecInputBuffer.clear();
        nt1.d.f(i13, codecInputBuffer, sourceBuffer);
        codecInputBuffer.flip();
    }
}
