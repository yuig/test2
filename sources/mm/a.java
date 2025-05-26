package mm;

import gi.l1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class a extends l1 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f87552c = new a();

    @Override // gi.l1
    public final ByteBuffer a(int i13) {
        return ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
    }
}
