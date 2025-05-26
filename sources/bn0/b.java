package bn0;

import android.util.Size;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f23562c;

    /* renamed from: a, reason: collision with root package name */
    public final Size f23563a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f23564b;

    static {
        ByteBuffer order = ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder());
        Intrinsics.checkNotNullExpressionValue(order, "order(...)");
        f23562c = new b(order, new Size(1, 1));
    }

    public b(ByteBuffer buffRGBA, Size size) {
        Intrinsics.checkNotNullParameter(buffRGBA, "buffRGBA");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f23563a = size;
        int height = size.getHeight() * size.getWidth() * 4;
        if (height != buffRGBA.remaining()) {
            throw new IllegalArgumentException(("Seems like buffer doesn't contain valid RGBA data corresponding to image size " + size + ". Expected capacity: " + height + ", got: " + buffRGBA.remaining()).toString());
        }
        int position = buffRGBA.position();
        int limit = buffRGBA.limit();
        ByteBuffer order = ByteBuffer.allocateDirect(buffRGBA.remaining()).order(ByteOrder.nativeOrder());
        order.put(buffRGBA);
        order.flip();
        Intrinsics.checkNotNullExpressionValue(order, "apply(...)");
        this.f23564b = order;
        buffRGBA.position(position);
        buffRGBA.limit(limit);
        order.rewind();
        buffRGBA.rewind();
    }
}
