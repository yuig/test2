package o7;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f93107d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f93108e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f93109a;

    /* renamed from: b, reason: collision with root package name */
    public int f93110b;

    /* renamed from: c, reason: collision with root package name */
    public int f93111c;

    public static void b(ByteBuffer byteBuffer, long j13, int i13, int i14, boolean z13) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z13 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j13);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i13);
        byteBuffer.putInt(0);
        byteBuffer.put(e0.t.l(i14));
    }

    public final void a() {
        this.f93109a = b7.f.f22042a;
        this.f93111c = 0;
        this.f93110b = 2;
    }
}
