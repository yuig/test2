package wk;

import el.c1;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class k implements uk.a {

    /* renamed from: c, reason: collision with root package name */
    public static final yk.d f130065c = yk.d.ALGORITHM_NOT_FIPS;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f130066d = l3.c.r("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f130067e = l3.c.r("070000004041424344454647");

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f130068f = l3.c.r("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* renamed from: g, reason: collision with root package name */
    public static final a.g f130069g = new a.g(9);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f130070a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f130071b;

    public k(byte[] bArr, byte[] bArr2) {
        if (!f130065c.isCompatible()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!e()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f130070a = new SecretKeySpec(bArr, "ChaCha20");
        this.f130071b = bArr2;
    }

    public static boolean c(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f130067e);
            byte[] bArr = f130066d;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f130068f;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static k d(vk.y yVar) {
        return new k(((ml.a) yVar.f126071c.f83754b).b(), yVar.f126072d.b());
    }

    public static boolean e() {
        return f130069g.get() != null;
    }

    @Override // uk.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] s13 = jk.r.s(12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(s13);
        Cipher cipher = (Cipher) f130069g.get();
        cipher.init(1, this.f130070a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr3 = this.f130071b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(s13, 0, copyOf, bArr3.length, 12);
        if (cipher.doFinal(bArr, 0, bArr.length, copyOf, bArr3.length + 12) == outputSize) {
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
        byte[] bArr3 = this.f130071b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!c1.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = (Cipher) f130069g.get();
        cipher.init(2, this.f130070a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }
}
