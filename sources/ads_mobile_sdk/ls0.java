package ads_mobile_sdk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* loaded from: classes2.dex */
public abstract class ls0 {

    /* renamed from: a, reason: collision with root package name */
    public final js0 f7941a;

    /* renamed from: b, reason: collision with root package name */
    public final js0 f7942b;

    public ls0(byte[] bArr) {
        if (!l3.c.k()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f7941a = a(1, bArr);
        this.f7942b = a(0, bArr);
    }

    public abstract js0 a(int i13, byte[] bArr);

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
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        try {
            js0 js0Var = this.f7942b;
            js0Var.getClass();
            int[] a13 = js0Var.a(vm.a(bArr), 0);
            int[] iArr = (int[]) a13.clone();
            vm.a(iArr);
            for (int i13 = 0; i13 < a13.length; i13++) {
                a13[i13] = a13[i13] + iArr[i13];
            }
            ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
            order.asIntBuffer().put(a13, 0, 16);
            byte[] bArr5 = new byte[32];
            order.get(bArr5);
            kh2.b0.D(bArr5, a(bArr4, byteBuffer), bArr3);
            byteBuffer.position(position);
            js0 js0Var2 = this.f7941a;
            js0Var2.getClass();
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != js0Var2.a()) {
                throw new GeneralSecurityException("The nonce length (in bytes) must be " + js0Var2.a());
            }
            int remaining = byteBuffer.remaining();
            int i14 = remaining / 64;
            int i15 = i14 + 1;
            for (int i16 = 0; i16 < i15; i16++) {
                int[] a14 = js0Var2.a(vm.a(bArr), js0Var2.f6937b + i16);
                int[] iArr2 = (int[]) a14.clone();
                vm.a(iArr2);
                for (int i17 = 0; i17 < a14.length; i17++) {
                    a14[i17] = a14[i17] + iArr2[i17];
                }
                ByteBuffer order2 = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
                order2.asIntBuffer().put(a14, 0, 16);
                if (i16 == i14) {
                    int i18 = remaining % 64;
                    if (i18 < 0 || byteBuffer.remaining() < i18 || order2.remaining() < i18 || allocate.remaining() < i18) {
                        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
                    }
                    for (int i19 = 0; i19 < i18; i19++) {
                        allocate.put((byte) (byteBuffer.get() ^ order2.get()));
                    }
                } else {
                    if (byteBuffer.remaining() < 64 || order2.remaining() < 64 || allocate.remaining() < 64) {
                        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
                    }
                    for (int i23 = 0; i23 < 64; i23++) {
                        allocate.put((byte) (byteBuffer.get() ^ order2.get()));
                    }
                }
            }
            return allocate.array();
        } catch (GeneralSecurityException e13) {
            throw new AEADBadTagException(e13.toString());
        }
    }

    public static byte[] a(byte[] bArr, ByteBuffer byteBuffer) {
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
}
