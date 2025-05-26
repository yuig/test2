package wk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;
import kh2.c3;

/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: c, reason: collision with root package name */
    public static final yk.d f130085c = yk.d.ALGORITHM_NOT_FIPS;

    /* renamed from: a, reason: collision with root package name */
    public final p f130086a;

    /* renamed from: b, reason: collision with root package name */
    public final p f130087b;

    public s(byte[] bArr) {
        p pVar;
        p pVar2;
        if (!f130085c.isCompatible()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        int i13 = ((r) this).f130084d;
        switch (i13) {
            case 0:
                pVar = new p(bArr, 1, 0);
                break;
            default:
                pVar = new p(bArr, 1, 1);
                break;
        }
        this.f130086a = pVar;
        switch (i13) {
            case 0:
                pVar2 = new p(bArr, 0, 0);
                break;
            default:
                pVar2 = new p(bArr, 0, 1);
                break;
        }
        this.f130087b = pVar2;
    }

    public static byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i13 = remaining % 16;
        int i14 = (i13 == 0 ? remaining : (remaining + 16) - i13) + length;
        ByteBuffer order = ByteBuffer.allocate(i14 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i14);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    public final byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.f130087b.a(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(c3.s(bArr4, c(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            p pVar = this.f130086a;
            pVar.getClass();
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            pVar.d(bArr, allocate, byteBuffer);
            return allocate.array();
        } catch (GeneralSecurityException e13) {
            throw new AEADBadTagException(e13.toString());
        }
    }

    public final void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = byteBuffer.position();
        p pVar = this.f130086a;
        pVar.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        pVar.d(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        this.f130087b.a(0, bArr).get(bArr4);
        byte[] s13 = c3.s(bArr4, c(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(s13);
    }
}
