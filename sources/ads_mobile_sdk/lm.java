package ads_mobile_sdk;

import a.b7;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kh2.m0;

/* loaded from: classes2.dex */
public final class lm implements a.y9 {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f7881c = m0.d("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f7882d = m0.d("070000004041424344454647");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f7883e = m0.d("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* renamed from: f, reason: collision with root package name */
    public static final b7 f7884f = new b7();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f7885a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f7886b;

    public lm(byte[] bArr, byte[] bArr2) {
        if (!l3.c.k()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!a()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f7885a = new SecretKeySpec(bArr, "ChaCha20");
        this.f7886b = bArr2;
    }

    @Override // a.y9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f7886b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!sx2.a(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, this.f7886b.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = (Cipher) f7884f.get();
        cipher.init(2, this.f7885a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        byte[] bArr5 = this.f7886b;
        return cipher.doFinal(bArr, bArr5.length + 12, (bArr.length - bArr5.length) - 12);
    }

    public static boolean a(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f7882d);
            byte[] bArr = f7881c;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f7883e;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static boolean a() {
        return f7884f.get() != null;
    }
}
