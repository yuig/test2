package ads_mobile_sdk;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class e9 implements a.y9 {

    /* renamed from: f, reason: collision with root package name */
    public static final a.x0 f4755f = new a.x0();

    /* renamed from: g, reason: collision with root package name */
    public static final a.n1 f4756g = new a.n1();

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ boolean f4757h = true;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4758a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4759b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4760c;

    /* renamed from: d, reason: collision with root package name */
    public final SecretKeySpec f4761d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4762e;

    public e9(int i13, byte[] bArr, byte[] bArr2) {
        if (!l3.c.k()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i13 != 12 && i13 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f4762e = i13;
        kh2.b0.B(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f4761d = secretKeySpec;
        Cipher cipher = (Cipher) f4755f.get();
        cipher.init(1, secretKeySpec);
        byte[] a13 = a(cipher.doFinal(new byte[16]));
        this.f4758a = a13;
        this.f4759b = a(a13);
        this.f4760c = bArr2;
    }

    public static a.y9 a(i9 i9Var) {
        if (!l3.c.k()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i9Var.f6280a.f9185c == 16) {
            return new e9(i9Var.f6280a.f9184b, i9Var.f6281b.f7789a.a(), i9Var.f6282c.a());
        }
        throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + i9Var.f6280a.f9185c);
    }

    @Override // a.y9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f4760c;
        int length2 = ((length - bArr3.length) - this.f4762e) - 16;
        if (length2 >= 0) {
            if (sx2.a(bArr3, bArr)) {
                Cipher cipher = (Cipher) f4755f.get();
                cipher.init(1, this.f4761d);
                byte[] a13 = a(cipher, 0, bArr, this.f4760c.length, this.f4762e);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = bArr2;
                byte[] a14 = a(cipher, 1, bArr4, 0, bArr4.length);
                byte[] a15 = a(cipher, 2, bArr, this.f4760c.length + this.f4762e, length2);
                int length3 = bArr.length - 16;
                byte b13 = 0;
                for (int i13 = 0; i13 < 16; i13++) {
                    b13 = (byte) (b13 | (((bArr[length3 + i13] ^ a14[i13]) ^ a13[i13]) ^ a15[i13]));
                }
                if (b13 == 0) {
                    Cipher cipher2 = (Cipher) f4756g.get();
                    cipher2.init(1, this.f4761d, new IvParameterSpec(a13));
                    return cipher2.doFinal(bArr, this.f4760c.length + this.f4762e, length2);
                }
                throw new AEADBadTagException("tag mismatch");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i13 = 0;
        while (i13 < 15) {
            int i14 = i13 + 1;
            bArr2[i13] = (byte) (((bArr[i13] << 1) ^ ((bArr[i14] & 255) >>> 7)) & 255);
            i13 = i14;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL) ^ (bArr[15] << 1));
        return bArr2;
    }

    public final byte[] a(Cipher cipher, int i13, byte[] bArr, int i14, int i15) {
        boolean z13 = f4757h;
        if (!z13 && i15 < 0) {
            throw new AssertionError();
        }
        if (!z13 && (i13 < 0 || i13 > 3)) {
            throw new AssertionError();
        }
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i13;
        if (i15 == 0) {
            byte[] bArr3 = this.f4758a;
            for (int i16 = 0; i16 < 16; i16++) {
                bArr2[i16] = (byte) (bArr2[i16] ^ bArr3[i16]);
            }
            return cipher.doFinal(bArr2);
        }
        byte[] bArr4 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr4);
        int i17 = 0;
        while (i15 - i17 > 16) {
            for (int i18 = 0; i18 < 16; i18++) {
                bArr4[i18] = (byte) (bArr4[i18] ^ bArr[(i14 + i17) + i18]);
            }
            cipher.doFinal(bArr4, 0, 16, bArr2);
            i17 += 16;
            byte[] bArr5 = bArr4;
            bArr4 = bArr2;
            bArr2 = bArr5;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i17 + i14, i14 + i15);
        if (copyOfRange.length == 16) {
            byte[] bArr6 = this.f4758a;
            int length = copyOfRange.length;
            for (int i19 = 0; i19 < length; i19++) {
                copyOfRange[i19] = (byte) (copyOfRange[i19] ^ bArr6[i19]);
            }
        } else {
            byte[] copyOf = Arrays.copyOf(this.f4759b, 16);
            for (int i23 = 0; i23 < copyOfRange.length; i23++) {
                copyOf[i23] = (byte) (copyOf[i23] ^ copyOfRange[i23]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            copyOfRange = copyOf;
        }
        int length2 = bArr4.length;
        for (int i24 = 0; i24 < length2; i24++) {
            bArr4[i24] = (byte) (bArr4[i24] ^ copyOfRange[i24]);
        }
        cipher.doFinal(bArr4, 0, 16, bArr2);
        return bArr2;
    }
}
