package ads_mobile_sdk;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class ku1 {

    /* renamed from: a, reason: collision with root package name */
    public static final jl f7535a = jl.a(new byte[0], 0);

    public static final jl a(int i13) {
        return jl.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i13).array());
    }

    public static final jl b(int i13) {
        return jl.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i13).array());
    }
}
