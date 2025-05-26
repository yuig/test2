package el;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ml.a f59494a = ml.a.a(new byte[0]);

    public static final ml.a a(int i13) {
        return ml.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i13).array());
    }

    public static final ml.a b(int i13) {
        return ml.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i13).array());
    }
}
