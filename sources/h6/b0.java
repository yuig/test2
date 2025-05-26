package h6;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class b0 implements wd.i, com.bumptech.glide.load.data.g {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f67701a;

    public b0(int i13, ByteBuffer byteBuffer) {
        if (i13 != 2) {
            this.f67701a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        } else {
            this.f67701a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }
    }

    @Override // wd.i
    public final int a() {
        return (e() << 8) | e();
    }

    @Override // com.bumptech.glide.load.data.g
    public final void b() {
    }

    @Override // com.bumptech.glide.load.data.g
    public final Object c() {
        ByteBuffer byteBuffer = this.f67701a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // wd.i
    public final int d(int i13, byte[] bArr) {
        ByteBuffer byteBuffer = this.f67701a;
        int min = Math.min(i13, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    @Override // wd.i
    public final short e() {
        ByteBuffer byteBuffer = this.f67701a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    public final short f(int i13) {
        ByteBuffer byteBuffer = this.f67701a;
        if (byteBuffer.remaining() - i13 >= 2) {
            return byteBuffer.getShort(i13);
        }
        return (short) -1;
    }

    @Override // wd.i
    public final long skip(long j13) {
        ByteBuffer byteBuffer = this.f67701a;
        int min = (int) Math.min(byteBuffer.remaining(), j13);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    public b0(byte[] bArr, int i13) {
        this.f67701a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i13);
    }
}
