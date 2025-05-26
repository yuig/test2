package wk;

import el.c1;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import vk.s0;

/* loaded from: classes3.dex */
public final class w implements uk.a {

    /* renamed from: c, reason: collision with root package name */
    public static final yk.d f130094c = yk.d.ALGORITHM_NOT_FIPS;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f130095a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f130096b;

    public w(byte[] bArr, byte[] bArr2) {
        if (!f130094c.isCompatible()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!d()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f130095a = bArr;
        this.f130096b = bArr2;
    }

    public static w c(s0 s0Var) {
        return new w(((ml.a) s0Var.f126040c.f83754b).b(), s0Var.f126041d.b());
    }

    public static boolean d() {
        return ((Cipher) k.f130069g.get()) != null;
    }

    @Override // uk.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] s13 = jk.r.s(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(n.a(this.f130095a, s13), "ChaCha20");
        byte[] bArr3 = new byte[12];
        System.arraycopy(s13, 16, bArr3, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        Cipher cipher = (Cipher) k.f130069g.get();
        cipher.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr4 = this.f130096b;
        if (outputSize > 2147483623 - bArr4.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + 24 + outputSize);
        System.arraycopy(s13, 0, copyOf, bArr4.length, 24);
        if (cipher.doFinal(bArr, 0, bArr.length, copyOf, bArr4.length + 24) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // uk.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f130096b;
        if (length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!c1.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(n.a(this.f130095a, bArr4), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        Cipher cipher = (Cipher) k.f130069g.get();
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 24, (bArr.length - bArr3.length) - 24);
    }
}
