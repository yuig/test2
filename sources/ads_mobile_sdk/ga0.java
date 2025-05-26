package ads_mobile_sdk;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class ga0 implements a.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final a.r9 f5483a;

    /* renamed from: b, reason: collision with root package name */
    public final a.a2 f5484b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5485c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5486d;

    public ga0(v8 v8Var, w02 w02Var, int i13, byte[] bArr) {
        this.f5483a = v8Var;
        this.f5484b = w02Var;
        this.f5485c = i13;
        this.f5486d = bArr;
    }

    @Override // a.y9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i13 = this.f5485c;
        byte[] bArr3 = this.f5486d;
        if (length < i13 + bArr3.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!sx2.a(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, this.f5486d.length, bArr.length - this.f5485c);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f5485c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f5484b.a(copyOfRange2, jk.r.d(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        v8 v8Var = (v8) this.f5483a;
        v8Var.getClass();
        int length2 = copyOfRange.length;
        int i14 = v8Var.f12392b;
        if (length2 < i14) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr4 = new byte[i14];
        System.arraycopy(copyOfRange, 0, bArr4, 0, i14);
        int length3 = copyOfRange.length;
        int i15 = v8Var.f12392b;
        byte[] bArr5 = new byte[length3 - i15];
        int length4 = copyOfRange.length - i15;
        Cipher cipher = (Cipher) v8.f12390d.get();
        byte[] bArr6 = new byte[v8Var.f12393c];
        System.arraycopy(bArr4, 0, bArr6, 0, v8Var.f12392b);
        cipher.init(2, v8Var.f12391a, new IvParameterSpec(bArr6));
        if (cipher.doFinal(copyOfRange, i15, length4, bArr5, 0) == length4) {
            return bArr5;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }

    public static a.y9 a(l8 l8Var) {
        return new ga0(new v8(l8Var.f7709a.f10996c, l8Var.f7710b.f7789a.a()), new w02(new v02("HMAC" + l8Var.f7709a.f10999f, new SecretKeySpec(l8Var.f7711c.f7789a.a(), "HMAC")), l8Var.f7709a.f10997d), l8Var.f7709a.f10997d, l8Var.f7712d.a());
    }
}
