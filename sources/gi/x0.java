package gi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class x0 extends l1 {

    /* renamed from: c, reason: collision with root package name */
    public final MessageDigest f65129c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65130d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65131e;

    public x0(MessageDigest messageDigest, int i13) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f65129c = messageDigest;
        this.f65130d = i13;
    }
}
