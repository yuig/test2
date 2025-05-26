package ll;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import el.c1;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class b implements uk.a {

    /* renamed from: f, reason: collision with root package name */
    public static final yk.d f83681f = yk.d.ALGORITHM_NOT_FIPS;

    /* renamed from: g, reason: collision with root package name */
    public static final a.g f83682g = new a.g(13);

    /* renamed from: h, reason: collision with root package name */
    public static final a.g f83683h = new a.g(14);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f83684a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f83685b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f83686c;

    /* renamed from: d, reason: collision with root package name */
    public final SecretKeySpec f83687d;

    /* renamed from: e, reason: collision with root package name */
    public final int f83688e;

    public b(int i13, byte[] bArr, byte[] bArr2) {
        if (!f83681f.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i13 != 12 && i13 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f83688e = i13;
        j0.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f83687d = secretKeySpec;
        Cipher cipher = (Cipher) f83682g.get();
        cipher.init(1, secretKeySpec);
        byte[] c13 = c(cipher.doFinal(new byte[16]));
        this.f83684a = c13;
        this.f83685b = c(c13);
        this.f83686c = bArr2;
    }

    public static byte[] c(byte[] bArr) {
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

    public static void e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i13]);
        }
    }

    @Override // uk.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f83686c;
        int length2 = Integer.MAX_VALUE - bArr3.length;
        int i13 = this.f83688e;
        if (length > (length2 - i13) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i13 + bArr.length + 16);
        byte[] s13 = jk.r.s(i13);
        System.arraycopy(s13, 0, copyOf, bArr3.length, i13);
        Cipher cipher = (Cipher) f83682g.get();
        SecretKeySpec secretKeySpec = this.f83687d;
        cipher.init(1, secretKeySpec);
        byte[] d2 = d(cipher, 0, s13, 0, s13.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] d13 = d(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f83683h.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(d2));
        cipher2.doFinal(bArr, 0, bArr.length, copyOf, bArr3.length + i13);
        byte[] d14 = d(cipher, 2, copyOf, bArr3.length + i13, bArr.length);
        int length3 = bArr3.length + bArr.length + i13;
        for (int i14 = 0; i14 < 16; i14++) {
            copyOf[length3 + i14] = (byte) ((d13[i14] ^ d2[i14]) ^ d14[i14]);
        }
        return copyOf;
    }

    @Override // uk.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f83686c;
        int length2 = length - bArr3.length;
        int i13 = this.f83688e;
        int i14 = (length2 - i13) - 16;
        if (i14 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!c1.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) f83682g.get();
        SecretKeySpec secretKeySpec = this.f83687d;
        cipher.init(1, secretKeySpec);
        byte[] d2 = d(cipher, 0, bArr, bArr3.length, this.f83688e);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte b13 = 0;
        byte[] d13 = d(cipher, 1, bArr4, 0, bArr4.length);
        byte[] d14 = d(cipher, 2, bArr, bArr3.length + i13, i14);
        int length3 = bArr.length - 16;
        int i15 = 0;
        while (i15 < 16) {
            byte b14 = (byte) (b13 | (((bArr[length3 + i15] ^ d13[i15]) ^ d2[i15]) ^ d14[i15]));
            i15++;
            b13 = b14;
        }
        if (b13 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f83683h.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(d2));
        return cipher2.doFinal(bArr, bArr3.length + i13, i14);
    }

    public final byte[] d(Cipher cipher, int i13, byte[] bArr, int i14, int i15) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i13;
        byte[] bArr3 = this.f83684a;
        if (i15 == 0) {
            e(bArr2, bArr3);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr4 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr4);
        int i16 = 0;
        while (true) {
            byte[] bArr5 = bArr4;
            bArr4 = bArr2;
            bArr2 = bArr5;
            if (i15 - i16 <= 16) {
                break;
            }
            for (int i17 = 0; i17 < 16; i17++) {
                bArr2[i17] = (byte) (bArr2[i17] ^ bArr[(i14 + i16) + i17]);
            }
            cipher.doFinal(bArr2, 0, 16, bArr4);
            i16 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i16 + i14, i14 + i15);
        if (copyOfRange.length == 16) {
            e(copyOfRange, bArr3);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f83685b, 16);
            for (int i18 = 0; i18 < copyOfRange.length; i18++) {
                copyOf[i18] = (byte) (copyOf[i18] ^ copyOfRange[i18]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            copyOfRange = copyOf;
        }
        e(bArr2, copyOfRange);
        cipher.doFinal(bArr2, 0, 16, bArr4);
        return bArr4;
    }
}
