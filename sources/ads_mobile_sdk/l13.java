package ads_mobile_sdk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class l13 implements a.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7617a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f7618b;

    public l13(byte[] bArr, byte[] bArr2) {
        if (!l3.c.k()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!a()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f7617a = bArr;
        this.f7618b = bArr2;
    }

    @Override // a.y9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f7618b;
        if (length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!sx2.a(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, this.f7618b.length, bArr4, 0, 24);
        int[] a13 = vm.a(vm.a(this.f7617a), vm.a(bArr4));
        ByteBuffer order = ByteBuffer.allocate(a13.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(a13);
        SecretKeySpec secretKeySpec = new SecretKeySpec(order.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        Cipher cipher = (Cipher) lm.f7884f.get();
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        byte[] bArr6 = this.f7618b;
        return cipher.doFinal(bArr, bArr6.length + 24, (bArr.length - bArr6.length) - 24);
    }

    public static boolean a() {
        return ((Cipher) lm.f7884f.get()) != null;
    }
}
